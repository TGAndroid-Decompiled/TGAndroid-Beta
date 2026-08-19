package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;

public class ProfileGalleryView extends CircularViewPager implements NotificationCenter.NotificationCenterDelegate {
    private ViewPagerAdapter adapter;
    private ProfileGalleryBlurView blurView;
    private final Callback callback;
    private TLRPC.ChatFull chatInfo;
    private boolean createThumbFromParent;
    ImageLocation curreantUploadingThumbLocation;
    private int currentAccount;
    ImageLocation currentUploadingImageLocation;
    private int customAvatarIndex;
    private long dialogId;
    private MessagesController.DialogPhotos dialogPhotos;
    private final PointF downPoint;
    private int fallbackPhotoIndex;
    private boolean forceResetPosition;
    private boolean hasActiveVideo;
    private int imagesLayerNum;
    private ArrayList imagesLocations;
    private ArrayList imagesLocationsSizes;
    private ArrayList imagesUploadProgress;
    private boolean invalidateWithParent;
    private boolean isDownReleased;
    private final boolean isProfileFragment;
    private boolean isScrollingListView;
    private boolean isSwipingViewPager;
    private final ActionBar parentActionBar;
    private final int parentClassGuid;
    private final RecyclerListView parentListView;
    Path path;
    private ArrayList photos;
    PinchToZoomHelper pinchToZoomHelper;
    private ImageLocation prevImageLocation;
    int prevPage;
    private ImageLocation prevThumbLocation;
    private VectorAvatarThumbDrawable prevVectorAvatarThumbDrawable;
    private final SparseArray radialProgresses;
    float[] radii;
    RectF rect;
    private int roundBottomRadius;
    private int roundTopRadius;
    public boolean scrolledByUser;
    int selectedPage;
    private int settingMainPhoto;
    private ArrayList thumbsFileNames;
    private ArrayList thumbsLocations;
    private final int touchSlop;
    private ImageLocation uploadingImageLocation;
    private ArrayList vectorAvatars;
    private ArrayList videoFileNames;
    private ArrayList videoLocations;

    public interface Callback {
        void onDown(boolean z);

        void onPhotosLoaded();

        void onRelease();

        void onVideoSet();
    }

    protected void setCustomAvatarProgress(float f) {
    }

    public void setHasActiveVideo(boolean z) {
        this.hasActiveVideo = z;
    }

    public View findVideoActiveView() {
        if (!this.hasActiveVideo) {
            return null;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextureStubView) {
                return childAt;
            }
        }
        return null;
    }

    private static class Item {
        private AvatarImageView imageView;
        boolean isActiveVideo;
        private View textureViewStubView;

        private Item() {
        }
    }

    public ProfileGalleryView(Context context, ActionBar actionBar, RecyclerListView recyclerListView, Callback callback) {
        super(context);
        this.downPoint = new PointF();
        this.isScrollingListView = true;
        this.isSwipingViewPager = true;
        this.currentAccount = UserConfig.selectedAccount;
        this.path = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.videoFileNames = new ArrayList();
        this.thumbsFileNames = new ArrayList();
        this.photos = new ArrayList();
        this.videoLocations = new ArrayList();
        this.imagesLocations = new ArrayList();
        this.thumbsLocations = new ArrayList();
        this.vectorAvatars = new ArrayList();
        this.imagesLocationsSizes = new ArrayList();
        this.imagesUploadProgress = new ArrayList();
        this.radialProgresses = new SparseArray();
        this.createThumbFromParent = true;
        this.customAvatarIndex = -1;
        this.fallbackPhotoIndex = -1;
        setOffscreenPageLimit(2);
        this.blurView = null;
        this.isProfileFragment = false;
        this.parentListView = recyclerListView;
        this.parentClassGuid = ConnectionsManager.generateClassGuid();
        this.parentActionBar = actionBar;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.callback = callback;
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i) {
            }

            @Override
            public void onPageScrolled(int i, float f, int i2) {
                ImageLocation imageLocation;
                ProfileGalleryView.this.checkCustomAvatar(i, f);
                if (i2 == 0) {
                    int realPosition = ProfileGalleryView.this.adapter.getRealPosition(i);
                    if (ProfileGalleryView.this.hasActiveVideo) {
                        realPosition--;
                    }
                    ProfileGalleryView.this.getCurrentItemView();
                    int childCount = ProfileGalleryView.this.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = ProfileGalleryView.this.getChildAt(i3);
                        if (childAt instanceof BackupImageView) {
                            int realPosition2 = ProfileGalleryView.this.adapter.getRealPosition(ProfileGalleryView.this.adapter.imageViews.indexOf(childAt));
                            if (ProfileGalleryView.this.hasActiveVideo) {
                                realPosition2--;
                            }
                            ImageReceiver imageReceiver = ((BackupImageView) childAt).getImageReceiver();
                            boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                            if (realPosition2 >= 0 && realPosition2 < ProfileGalleryView.this.videoLocations.size()) {
                                if (realPosition2 == realPosition) {
                                    if (!allowStartAnimation) {
                                        imageReceiver.setAllowStartAnimation(true);
                                        imageReceiver.startAnimation();
                                    }
                                    ImageLocation imageLocation2 = (ImageLocation) ProfileGalleryView.this.videoLocations.get(realPosition2);
                                    if (imageLocation2 != null) {
                                        FileLoader.getInstance(ProfileGalleryView.this.currentAccount).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                                    }
                                } else if (allowStartAnimation) {
                                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                                    if (animation != null && (imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(realPosition2)) != null) {
                                        animation.seekTo(imageLocation.videoSeekTo, false, true);
                                    }
                                    imageReceiver.setAllowStartAnimation(false);
                                    imageReceiver.stopAnimation();
                                }
                            }
                        }
                    }
                }
            }

            @Override
            public void onPageSelected(int i) {
                ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
                int i2 = profileGalleryView.selectedPage;
                boolean z = i >= i2;
                if (i != i2) {
                    profileGalleryView.prevPage = i2;
                    profileGalleryView.selectedPage = i;
                }
                if (profileGalleryView.dialogPhotos != null) {
                    ProfileGalleryView.this.dialogPhotos.loadAfter(i - (ProfileGalleryView.this.adapter != null ? ProfileGalleryView.this.adapter.getExtraCount() : 0), z);
                }
            }
        });
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext(), null, actionBar);
        this.adapter = viewPagerAdapter;
        setAdapter((CircularViewPager.Adapter) viewPagerAdapter);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.dialogPhotos = null;
    }

    public void checkCustomAvatar(int i, float f) {
        float f2;
        int i2 = this.customAvatarIndex;
        float fClamp = 0.0f;
        if (i2 >= 0 || this.fallbackPhotoIndex >= 0) {
            if (i2 < 0) {
                i2 = this.fallbackPhotoIndex;
            }
            int realPosition = this.adapter.getRealPosition(i);
            if (this.hasActiveVideo) {
                realPosition--;
            }
            if (realPosition == i2) {
                f2 = 1.0f - f;
            } else if (getRealCount() <= 0 || (realPosition - 1) % getRealCount() != i2) {
                f2 = (getRealCount() <= 0 || (realPosition + 1) % getRealCount() != i2) ? 0.0f : (1.0f - f) + 1.0f;
            } else {
                f2 = (1.0f - f) - 1.0f;
            }
            if (f2 > 1.0f) {
                f2 = 2.0f - f2;
            }
            fClamp = Utilities.clamp(f2, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(fClamp);
    }

    public void setImagesLayerNum(int i) {
        this.imagesLayerNum = i;
    }

    public ProfileGalleryView(Context context, long j, ActionBar actionBar, RecyclerListView recyclerListView, ProfileActivity.AvatarImageView avatarImageView, int i, Callback callback, ProfileGalleryBlurView profileGalleryBlurView) {
        super(context);
        this.downPoint = new PointF();
        this.isScrollingListView = true;
        this.isSwipingViewPager = true;
        this.currentAccount = UserConfig.selectedAccount;
        this.path = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.videoFileNames = new ArrayList();
        this.thumbsFileNames = new ArrayList();
        this.photos = new ArrayList();
        this.videoLocations = new ArrayList();
        this.imagesLocations = new ArrayList();
        this.thumbsLocations = new ArrayList();
        this.vectorAvatars = new ArrayList();
        this.imagesLocationsSizes = new ArrayList();
        this.imagesUploadProgress = new ArrayList();
        this.radialProgresses = new SparseArray();
        this.createThumbFromParent = true;
        this.customAvatarIndex = -1;
        this.fallbackPhotoIndex = -1;
        this.blurView = profileGalleryBlurView;
        setPadding(0, 0, 0, profileGalleryBlurView == null ? 0 : profileGalleryBlurView.actionSize);
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.isProfileFragment = true;
        this.dialogId = j;
        this.parentListView = recyclerListView;
        this.parentClassGuid = i;
        this.parentActionBar = actionBar;
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext(), avatarImageView, actionBar);
        this.adapter = viewPagerAdapter;
        setAdapter((CircularViewPager.Adapter) viewPagerAdapter);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.callback = callback;
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i2) {
            }

            @Override
            public void onPageScrolled(int i2, float f, int i3) {
                ImageLocation imageLocation;
                ProfileGalleryView.this.checkCustomAvatar(i2, f);
                if (i3 == 0) {
                    int realPosition = ProfileGalleryView.this.adapter.getRealPosition(i2);
                    ProfileGalleryView.this.getCurrentItemView();
                    int childCount = ProfileGalleryView.this.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = ProfileGalleryView.this.getChildAt(i4);
                        if (childAt instanceof BackupImageView) {
                            int realPosition2 = ProfileGalleryView.this.adapter.getRealPosition(ProfileGalleryView.this.adapter.imageViews.indexOf(childAt));
                            ImageReceiver imageReceiver = ((BackupImageView) childAt).getImageReceiver();
                            boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                            if (realPosition2 >= 0 && realPosition2 < ProfileGalleryView.this.videoLocations.size()) {
                                if (realPosition2 == realPosition) {
                                    if (!allowStartAnimation) {
                                        imageReceiver.setAllowStartAnimation(true);
                                        imageReceiver.startAnimation();
                                    }
                                    ImageLocation imageLocation2 = (ImageLocation) ProfileGalleryView.this.videoLocations.get(realPosition2);
                                    if (imageLocation2 != null) {
                                        FileLoader.getInstance(ProfileGalleryView.this.currentAccount).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                                    }
                                } else if (allowStartAnimation) {
                                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                                    if (animation != null && (imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(realPosition2)) != null) {
                                        animation.seekTo(imageLocation.videoSeekTo, false, true);
                                    }
                                    imageReceiver.setAllowStartAnimation(false);
                                    imageReceiver.stopAnimation();
                                }
                            }
                        }
                    }
                }
            }

            @Override
            public void onPageSelected(int i2) {
                ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
                int i3 = profileGalleryView.selectedPage;
                boolean z = i2 >= i3;
                if (i2 != i3) {
                    profileGalleryView.prevPage = i3;
                    profileGalleryView.selectedPage = i2;
                }
                if (profileGalleryView.dialogPhotos != null) {
                    ProfileGalleryView.this.dialogPhotos.loadAfter(i2 - (ProfileGalleryView.this.adapter != null ? ProfileGalleryView.this.adapter.getExtraCount() : 0), z);
                }
            }
        });
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.currentAccount).getDialogPhotos(j);
        this.dialogPhotos = dialogPhotos;
        dialogPhotos.loadCache();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setVisibility(i);
        }
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setAlpha(f);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setTranslationY(getHeight() - this.blurView.getMeasuredHeight());
        }
    }

    public ProfileGalleryBlurView getBlurDrawer() {
        return this.blurView;
    }

    public void onDestroy() {
        this.blurView = null;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i = NotificationCenter.fileLoadProgressChanged;
        notificationCenter.removeObserver(this, i);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof BackupImageView) {
                BackupImageView backupImageView = (BackupImageView) childAt;
                if (backupImageView.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = backupImageView.getImageReceiver().getDrawable();
                    if (drawable instanceof AnimatedFileDrawable) {
                        ((AnimatedFileDrawable) drawable).removeSecondParentView(backupImageView);
                    }
                }
            }
        }
    }

    public void setAnimatedFileMaybe(AnimatedFileDrawable animatedFileDrawable) {
        if (animatedFileDrawable == null || this.adapter == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof BackupImageView) {
                ViewPagerAdapter viewPagerAdapter = this.adapter;
                if (viewPagerAdapter.getRealPosition(viewPagerAdapter.imageViews.indexOf(childAt)) == 0) {
                    BackupImageView backupImageView = (BackupImageView) childAt;
                    AnimatedFileDrawable animation = backupImageView.getImageReceiver().getAnimation();
                    if (animation != animatedFileDrawable) {
                        if (animation != null) {
                            animation.removeSecondParentView(backupImageView);
                        }
                        backupImageView.setImageDrawable(animatedFileDrawable);
                        animatedFileDrawable.addSecondParentView(this);
                        animatedFileDrawable.setInvalidateParentViewWithSecond(true);
                    }
                }
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int extraCount;
        Callback callback;
        if (this.adapter == null) {
            return false;
        }
        if (this.parentListView.getScrollState() != 0 && !this.isScrollingListView && this.isSwipingViewPager) {
            this.isSwipingViewPager = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return false;
        }
        int action = motionEvent.getAction();
        if (this.pinchToZoomHelper != null && getCurrentItemView() != null) {
            if (action != 0 && this.isDownReleased && !this.pinchToZoomHelper.isInOverlayMode()) {
                this.pinchToZoomHelper.checkPinchToZoom(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, null, null);
            } else if (this.pinchToZoomHelper.checkPinchToZoom(motionEvent, this, getCurrentItemView().getImageReceiver(), null, null, null)) {
                if (!this.isDownReleased) {
                    this.isDownReleased = true;
                    Callback callback2 = this.callback;
                    if (callback2 != null) {
                        callback2.onRelease();
                    }
                }
                return true;
            }
        }
        if (action == 0) {
            this.isScrollingListView = true;
            this.isSwipingViewPager = true;
            this.scrolledByUser = true;
            this.downPoint.set(motionEvent.getX(), motionEvent.getY());
            if (this.adapter.getCount() > 1 && (callback = this.callback) != null) {
                callback.onDown(motionEvent.getX() < ((float) getWidth()) / 3.0f);
            }
            this.isDownReleased = false;
        } else if (action == 1) {
            if (!this.isDownReleased) {
                int realCount = getRealCount();
                int currentItem = getCurrentItem();
                if (realCount > 1) {
                    if (motionEvent.getX() > getWidth() / 3.0f) {
                        extraCount = this.adapter.getExtraCount();
                        i = currentItem + 1;
                        if (i < realCount + extraCount) {
                            extraCount = i;
                        }
                    } else {
                        int extraCount2 = this.adapter.getExtraCount();
                        i = currentItem - 1;
                        if (i < extraCount2) {
                            extraCount = (realCount + extraCount2) - 1;
                        } else {
                            extraCount = i;
                        }
                    }
                    Callback callback3 = this.callback;
                    if (callback3 != null) {
                        callback3.onRelease();
                    }
                    setCurrentItem(extraCount, false);
                }
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.downPoint.x;
            float y = motionEvent.getY() - this.downPoint.y;
            boolean z = Math.abs(y) >= ((float) this.touchSlop) || Math.abs(x) >= ((float) this.touchSlop);
            if (z) {
                this.isDownReleased = true;
                Callback callback4 = this.callback;
                if (callback4 != null) {
                    callback4.onRelease();
                }
            }
            boolean z2 = this.isSwipingViewPager;
            if (z2 && this.isScrollingListView) {
                if (z) {
                    if (Math.abs(y) > Math.abs(x)) {
                        this.isSwipingViewPager = false;
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                        motionEventObtain2.setAction(3);
                        super.onTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                    } else {
                        this.isScrollingListView = false;
                        MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                        motionEventObtain3.setAction(3);
                        this.parentListView.onTouchEvent(motionEventObtain3);
                        motionEventObtain3.recycle();
                    }
                }
            } else if (z2 && !canScrollHorizontally(-1) && x > this.touchSlop) {
                return false;
            }
        }
        boolean zOnTouchEvent = this.isScrollingListView ? this.parentListView.onTouchEvent(motionEvent) : false;
        if (this.isSwipingViewPager) {
            try {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (action == 1 || action == 3) {
            this.isScrollingListView = false;
            this.isSwipingViewPager = false;
        }
        return zOnTouchEvent;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.chatInfo = chatFull;
        if (this.photos.isEmpty() || this.photos.get(0) != null || this.chatInfo == null || this.imagesLocations.get(0) == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) this.imagesLocations.get(0)).location, this.chatInfo.chat_photo)) {
            return;
        }
        this.photos.set(0, this.chatInfo.chat_photo);
        if (!this.chatInfo.chat_photo.video_sizes.isEmpty()) {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.chatInfo.chat_photo.video_sizes, 1000);
            this.videoLocations.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.chatInfo.chat_photo));
            this.videoFileNames.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
            Callback callback = this.callback;
            if (callback != null) {
                callback.onPhotosLoaded();
            }
        } else {
            this.videoLocations.set(0, null);
            this.videoFileNames.add(0, null);
        }
        this.imagesUploadProgress.set(0, null);
        this.adapter.notifyDataSetChanged();
    }

    public boolean initIfEmpty(VectorAvatarThumbDrawable vectorAvatarThumbDrawable, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z) {
        MessagesController.DialogPhotos dialogPhotos;
        MessagesController.DialogPhotos dialogPhotos2;
        if (imageLocation == null || imageLocation2 == null || this.settingMainPhoto != 0) {
            return false;
        }
        ImageLocation imageLocation3 = this.prevImageLocation;
        if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
            if (!this.imagesLocations.isEmpty()) {
                this.prevImageLocation = imageLocation;
                if (z && (dialogPhotos2 = this.dialogPhotos) != null) {
                    dialogPhotos2.reset();
                    MessagesController.DialogPhotos dialogPhotos3 = this.dialogPhotos;
                    int currentItem = getCurrentItem();
                    ViewPagerAdapter viewPagerAdapter = this.adapter;
                    dialogPhotos3.loadAfter(currentItem - (viewPagerAdapter != null ? viewPagerAdapter.getExtraCount() : 0), true);
                }
                return true;
            }
            if (z && (dialogPhotos = this.dialogPhotos) != null) {
                dialogPhotos.reset();
                MessagesController.DialogPhotos dialogPhotos4 = this.dialogPhotos;
                int currentItem2 = getCurrentItem();
                ViewPagerAdapter viewPagerAdapter2 = this.adapter;
                dialogPhotos4.loadAfter(currentItem2 - (viewPagerAdapter2 != null ? viewPagerAdapter2.getExtraCount() : 0), true);
            }
        }
        if (!this.imagesLocations.isEmpty()) {
            return false;
        }
        this.prevImageLocation = imageLocation;
        this.prevThumbLocation = imageLocation2;
        this.prevVectorAvatarThumbDrawable = vectorAvatarThumbDrawable;
        this.thumbsFileNames.add(null);
        this.videoFileNames.add(null);
        this.imagesLocations.add(imageLocation);
        this.thumbsLocations.add(imageLocation2);
        this.vectorAvatars.add(vectorAvatarThumbDrawable);
        this.videoLocations.add(null);
        this.photos.add(null);
        this.imagesLocationsSizes.add(-1);
        this.imagesUploadProgress.add(null);
        getAdapter().notifyDataSetChanged();
        resetCurrentItem();
        return true;
    }

    public void addUploadingImage(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.prevImageLocation = imageLocation;
        this.thumbsFileNames.add(0, null);
        this.videoFileNames.add(0, null);
        this.imagesLocations.add(0, imageLocation);
        this.thumbsLocations.add(0, imageLocation2);
        this.vectorAvatars.add(0, null);
        this.videoLocations.add(0, null);
        this.photos.add(0, null);
        this.imagesLocationsSizes.add(0, -1);
        this.imagesUploadProgress.add(0, Float.valueOf(0.0f));
        this.adapter.notifyDataSetChanged();
        resetCurrentItem();
        this.currentUploadingImageLocation = imageLocation;
        this.curreantUploadingThumbLocation = imageLocation2;
    }

    public void removeUploadingImage(ImageLocation imageLocation) {
        this.uploadingImageLocation = imageLocation;
        this.currentUploadingImageLocation = null;
        this.curreantUploadingThumbLocation = null;
    }

    public ImageLocation getImageLocation(int i) {
        if (i < 0 || i >= this.imagesLocations.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.videoLocations.get(i);
        return imageLocation != null ? imageLocation : (ImageLocation) this.imagesLocations.get(i);
    }

    public ImageLocation getRealImageLocation(int i) {
        if (i < 0 || i >= this.imagesLocations.size()) {
            return null;
        }
        return (ImageLocation) this.imagesLocations.get(i);
    }

    public boolean hasImages() {
        return !this.imagesLocations.isEmpty();
    }

    public BackupImageView getCurrentItemView() {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter == null || viewPagerAdapter.objects.isEmpty()) {
            return null;
        }
        return ((Item) this.adapter.objects.get(getCurrentItem())).imageView;
    }

    public View getItemViewAt(int i) {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter == null || viewPagerAdapter.objects.size() <= i || i < 0) {
            return null;
        }
        Item item = (Item) this.adapter.objects.get(i);
        View view = item.textureViewStubView;
        return view == null ? item.imageView : view;
    }

    public boolean isLoadingCurrentVideo() {
        BackupImageView currentItemView;
        if (this.videoLocations.get(this.hasActiveVideo ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        AnimatedFileDrawable animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.hasBitmap();
    }

    public float getCurrentItemProgress() {
        AnimatedFileDrawable animation;
        BackupImageView currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.getCurrentProgress();
    }

    public boolean isCurrentItemVideo() {
        int realPosition = getRealPosition();
        if (this.hasActiveVideo) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        return realPosition >= 0 && realPosition < this.videoLocations.size() && this.videoLocations.get(realPosition) != null;
    }

    public ImageLocation getCurrentVideoLocation(ImageLocation imageLocation, ImageLocation imageLocation2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        int i = 0;
        while (i < 2) {
            ArrayList arrayList = i == 0 ? this.thumbsLocations : this.imagesLocations;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i2);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i3 = imageLocation3.dc_id;
                    if (i3 == imageLocation.dc_id) {
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i4 != tL_fileLocationToBeDeprecated2.local_id || tL_fileLocationToBeDeprecated.volume_id != tL_fileLocationToBeDeprecated2.volume_id) {
                        }
                        return (ImageLocation) this.videoLocations.get(i2);
                    }
                    if (i3 == imageLocation2.dc_id) {
                        int i5 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i5 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.videoLocations.get(i2);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
        return null;
    }

    public void resetCurrentItem() {
        setCurrentItem(this.adapter.getExtraCount(), false);
    }

    public void setCurrentRealPosition(int i, boolean z) {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter == null) {
            return;
        }
        setCurrentItem(i + viewPagerAdapter.getExtraCount(), z);
    }

    public int getRealCount() {
        int size = this.photos.size();
        return this.hasActiveVideo ? size + 1 : size;
    }

    public int getRealPosition(int i) {
        return this.adapter.getRealPosition(i);
    }

    public int getRealPosition() {
        return this.adapter.getRealPosition(getCurrentItem());
    }

    public TLRPC.Photo getPhoto(int i) {
        if (i < 0 || i >= this.photos.size()) {
            return null;
        }
        return (TLRPC.Photo) this.photos.get(i);
    }

    public void replaceFirstPhoto(TLRPC.Photo photo, TLRPC.Photo photo2) {
        int iIndexOf;
        if (!this.photos.isEmpty() && (iIndexOf = this.photos.indexOf(photo)) >= 0) {
            this.photos.set(iIndexOf, photo2);
        }
    }

    public void finishSettingMainPhoto() {
        this.settingMainPhoto--;
    }

    public void startMovePhotoToBegin(int i) {
        MessagesController.DialogPhotos dialogPhotos = this.dialogPhotos;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(i);
            return;
        }
        if (i <= 0 || i >= this.photos.size()) {
            return;
        }
        this.settingMainPhoto++;
        TLRPC.Photo photo = (TLRPC.Photo) this.photos.get(i);
        this.photos.remove(i);
        this.photos.add(0, photo);
        String str = (String) this.thumbsFileNames.get(i);
        this.thumbsFileNames.remove(i);
        this.thumbsFileNames.add(0, str);
        ArrayList arrayList = this.videoFileNames;
        arrayList.add(0, (String) arrayList.remove(i));
        ImageLocation imageLocation = (ImageLocation) this.videoLocations.get(i);
        this.videoLocations.remove(i);
        this.videoLocations.add(0, imageLocation);
        ImageLocation imageLocation2 = (ImageLocation) this.imagesLocations.get(i);
        this.imagesLocations.remove(i);
        this.imagesLocations.add(0, imageLocation2);
        ImageLocation imageLocation3 = (ImageLocation) this.thumbsLocations.get(i);
        this.thumbsLocations.remove(i);
        this.thumbsLocations.add(0, imageLocation3);
        VectorAvatarThumbDrawable vectorAvatarThumbDrawable = (VectorAvatarThumbDrawable) this.vectorAvatars.get(i);
        this.vectorAvatars.remove(i);
        this.vectorAvatars.add(0, vectorAvatarThumbDrawable);
        Integer num = (Integer) this.imagesLocationsSizes.get(i);
        this.imagesLocationsSizes.remove(i);
        this.imagesLocationsSizes.add(0, num);
        Float f = (Float) this.imagesUploadProgress.get(i);
        this.imagesUploadProgress.remove(i);
        this.imagesUploadProgress.add(0, f);
        this.prevImageLocation = (ImageLocation) this.imagesLocations.get(0);
    }

    public void commitMoveToBegin() {
        this.adapter.notifyDataSetChanged();
        resetCurrentItem();
    }

    public boolean removePhotoAtIndex(int i) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i < 0 || i >= this.photos.size()) {
            return false;
        }
        TLRPC.Photo photo = (TLRPC.Photo) this.photos.get(i);
        if (photo != null && (dialogPhotos = this.dialogPhotos) != null) {
            dialogPhotos.removePhoto(photo.id);
            return true;
        }
        this.photos.remove(i);
        this.thumbsFileNames.remove(i);
        this.videoFileNames.remove(i);
        this.videoLocations.remove(i);
        this.imagesLocations.remove(i);
        this.thumbsLocations.remove(i);
        this.vectorAvatars.remove(i);
        this.imagesLocationsSizes.remove(i);
        this.radialProgresses.delete(i);
        this.imagesUploadProgress.remove(i);
        if (i == 0 && !this.imagesLocations.isEmpty()) {
            this.prevImageLocation = (ImageLocation) this.imagesLocations.get(0);
            this.prevThumbLocation = null;
            this.prevVectorAvatarThumbDrawable = null;
        }
        this.adapter.notifyDataSetChanged();
        return this.photos.isEmpty();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.parentListView.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void loadNeighboringThumbs() {
        int size = this.thumbsLocations.size();
        if (size <= 1) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= (size <= 2 ? 1 : 2)) {
                return;
            }
            FileLoader.getInstance(this.currentAccount).loadFile((ImageLocation) this.thumbsLocations.get(i == 0 ? 1 : size - 1), null, null, 0, 1);
            i++;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        ImageLocation forUserOrChat;
        boolean z;
        ArrayList<TLRPC.PhotoSize> arrayList;
        int i3;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i4;
        ImageLocation forPhoto;
        ImageLocation imageLocation;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.VideoSize vectorMarkupVideoSize;
        boolean z2;
        TLRPC.User user;
        TLRPC.Photo photo;
        int i5 = 0;
        if (i == NotificationCenter.dialogPhotosUpdate) {
            MessagesController.DialogPhotos dialogPhotos2 = (MessagesController.DialogPhotos) objArr[0];
            if (this.dialogPhotos == dialogPhotos2) {
                ArrayList arrayList2 = new ArrayList(dialogPhotos2.photos);
                if (arrayList2.isEmpty() && dialogPhotos2.fromCache) {
                    return;
                }
                this.customAvatarIndex = -1;
                this.fallbackPhotoIndex = -1;
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                if (userFull != null && (photo = userFull.personal_photo) != null) {
                    arrayList2.add(0, photo);
                    this.customAvatarIndex = 0;
                }
                if (user2 != null && user2.self && UserObject.hasFallbackPhoto(userFull)) {
                    arrayList2.add(userFull.fallback_photo);
                    this.fallbackPhotoIndex = arrayList2.size() - 1;
                }
                this.thumbsFileNames.clear();
                this.videoFileNames.clear();
                this.imagesLocations.clear();
                this.videoLocations.clear();
                this.thumbsLocations.clear();
                this.vectorAvatars.clear();
                this.photos.clear();
                this.imagesLocationsSizes.clear();
                this.imagesUploadProgress.clear();
                if (DialogObject.isChatDialog(this.dialogId)) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat, 0);
                    if (forUserOrChat != null) {
                        this.imagesLocations.add(forUserOrChat);
                        this.thumbsLocations.add(ImageLocation.getForUserOrChat(this.currentAccount, chat, 1));
                        this.vectorAvatars.add(null);
                        this.thumbsFileNames.add(null);
                        TLRPC.ChatFull chatFull = this.chatInfo;
                        if (chatFull != null && FileLoader.isSamePhoto((TLRPC.FileLocation) forUserOrChat.location, chatFull.chat_photo)) {
                            this.photos.add(this.chatInfo.chat_photo);
                            if (!this.chatInfo.chat_photo.video_sizes.isEmpty()) {
                                TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(this.chatInfo.chat_photo.video_sizes, 1000);
                                this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize2, this.chatInfo.chat_photo));
                                this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize2));
                            } else {
                                this.videoLocations.add(null);
                                this.videoFileNames.add(null);
                            }
                        } else {
                            this.photos.add(null);
                            this.videoFileNames.add(null);
                            this.videoLocations.add(null);
                        }
                        this.imagesLocationsSizes.add(-1);
                        this.imagesUploadProgress.add(null);
                    }
                } else {
                    forUserOrChat = null;
                }
                int i6 = 0;
                while (i6 < arrayList2.size()) {
                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList2.get(i6);
                    if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList = photo2.sizes) == null) {
                        this.photos.add(null);
                        this.imagesLocations.add(null);
                        this.thumbsLocations.add(null);
                        this.vectorAvatars.add(null);
                        this.thumbsFileNames.add(null);
                        this.videoLocations.add(null);
                        this.videoFileNames.add(null);
                        this.imagesLocationsSizes.add(-1);
                        this.imagesUploadProgress.add(null);
                    } else {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 50);
                        int size = photo2.sizes.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                i3 = -1;
                                break;
                            }
                            TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i7);
                            i3 = -1;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                closestPhotoSizeWithSize2 = photoSize2;
                                break;
                            }
                            i7++;
                        }
                        if (forUserOrChat != null) {
                            int size2 = photo2.sizes.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 < size2) {
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i8).location;
                                    if (fileLocation != null) {
                                        int i9 = fileLocation.local_id;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = forUserOrChat.location;
                                        if (i9 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                            this.photos.set(i5, photo2);
                                            if (!photo2.video_sizes.isEmpty()) {
                                                this.videoLocations.set(i5, ImageLocation.getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000), photo2));
                                            }
                                        }
                                    }
                                    i8++;
                                } else {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                                    if (closestPhotoSizeWithSize == null) {
                                        i4 = photo2.dc_id;
                                        if (i4 != 0) {
                                            TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize.location;
                                            fileLocation2.dc_id = i4;
                                            fileLocation2.file_reference = photo2.file_reference;
                                        }
                                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo2);
                                        if (forPhoto == null) {
                                            imageLocation = this.prevImageLocation;
                                            if (imageLocation != null) {
                                                user = user2;
                                                if (imageLocation.photoId != forPhoto.photoId && !this.isProfileFragment && this.dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                    this.thumbsFileNames.add(null);
                                                    this.imagesLocations.add(this.prevImageLocation);
                                                    ImageLocation forPhoto2 = this.prevThumbLocation;
                                                    if (forPhoto2 == null) {
                                                        forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                                                    }
                                                    this.thumbsLocations.add(forPhoto2);
                                                    if (!photo2.video_sizes.isEmpty()) {
                                                        TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                                        TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                                        if (vectorMarkupVideoSize2 != null) {
                                                            user2 = user;
                                                            this.vectorAvatars.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize2, user != null && user2.premium, 2));
                                                            this.videoLocations.add(null);
                                                            this.videoFileNames.add(null);
                                                        } else {
                                                            user2 = user;
                                                            this.vectorAvatars.add(null);
                                                            this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                                            this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                                        }
                                                    } else {
                                                        user2 = user;
                                                        this.vectorAvatars.add(this.prevVectorAvatarThumbDrawable);
                                                        this.videoLocations.add(null);
                                                        this.videoFileNames.add(null);
                                                    }
                                                    this.photos.add(null);
                                                    this.imagesLocationsSizes.add(Integer.valueOf(i3));
                                                    this.imagesUploadProgress.add(null);
                                                } else {
                                                    user2 = user;
                                                    this.imagesLocations.add(forPhoto);
                                                    ArrayList arrayList3 = this.thumbsFileNames;
                                                    if (closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                                        photoSize = closestPhotoSizeWithSize;
                                                    } else {
                                                        photoSize = closestPhotoSizeWithSize2;
                                                    }
                                                    arrayList3.add(FileLoader.getAttachFileName(photoSize));
                                                    this.thumbsLocations.add(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2));
                                                    if (!photo2.video_sizes.isEmpty()) {
                                                        closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                                        vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                                        if (vectorMarkupVideoSize != null) {
                                                            ArrayList arrayList4 = this.vectorAvatars;
                                                            if (user2 == null && user2.premium) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            arrayList4.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize, z2, 2));
                                                            this.videoLocations.add(null);
                                                            this.videoFileNames.add(null);
                                                        } else {
                                                            this.vectorAvatars.add(null);
                                                            this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2));
                                                            this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                                        }
                                                    } else {
                                                        this.videoLocations.add(null);
                                                        this.videoFileNames.add(null);
                                                        this.vectorAvatars.add(null);
                                                    }
                                                    this.photos.add(photo2);
                                                    this.imagesLocationsSizes.add(Integer.valueOf(closestPhotoSizeWithSize.size));
                                                    this.imagesUploadProgress.add(null);
                                                }
                                            } else {
                                                this.imagesLocations.add(forPhoto);
                                                ArrayList arrayList5 = this.thumbsFileNames;
                                                if (closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                                    photoSize = closestPhotoSizeWithSize;
                                                } else {
                                                    photoSize = closestPhotoSizeWithSize2;
                                                }
                                                arrayList5.add(FileLoader.getAttachFileName(photoSize));
                                                this.thumbsLocations.add(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2));
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                                    vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                                    if (vectorMarkupVideoSize != null) {
                                                        ArrayList arrayList6 = this.vectorAvatars;
                                                        if (user2 == null) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        arrayList6.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize, z2, 2));
                                                        this.videoLocations.add(null);
                                                        this.videoFileNames.add(null);
                                                    } else {
                                                        this.vectorAvatars.add(null);
                                                        this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2));
                                                        this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                                    }
                                                } else {
                                                    this.videoLocations.add(null);
                                                    this.videoFileNames.add(null);
                                                    this.vectorAvatars.add(null);
                                                }
                                                this.photos.add(photo2);
                                                this.imagesLocationsSizes.add(Integer.valueOf(closestPhotoSizeWithSize.size));
                                                this.imagesUploadProgress.add(null);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                            if (closestPhotoSizeWithSize == null) {
                                i4 = photo2.dc_id;
                                if (i4 != 0) {
                                    TLRPC.FileLocation fileLocation3 = closestPhotoSizeWithSize.location;
                                    fileLocation3.dc_id = i4;
                                    fileLocation3.file_reference = photo2.file_reference;
                                }
                                forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo2);
                                if (forPhoto == null) {
                                    imageLocation = this.prevImageLocation;
                                    if (imageLocation != null) {
                                        user = user2;
                                        if (imageLocation.photoId != forPhoto.photoId) {
                                        }
                                        user2 = user;
                                        this.imagesLocations.add(forPhoto);
                                        ArrayList arrayList7 = this.thumbsFileNames;
                                        if (closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                            photoSize = closestPhotoSizeWithSize;
                                        } else {
                                            photoSize = closestPhotoSizeWithSize2;
                                        }
                                        arrayList7.add(FileLoader.getAttachFileName(photoSize));
                                        this.thumbsLocations.add(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2));
                                        if (!photo2.video_sizes.isEmpty()) {
                                            closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                            vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                            if (vectorMarkupVideoSize != null) {
                                                ArrayList arrayList8 = this.vectorAvatars;
                                                if (user2 == null) {
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                }
                                                arrayList8.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize, z2, 2));
                                                this.videoLocations.add(null);
                                                this.videoFileNames.add(null);
                                            } else {
                                                this.vectorAvatars.add(null);
                                                this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2));
                                                this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                            }
                                        } else {
                                            this.videoLocations.add(null);
                                            this.videoFileNames.add(null);
                                            this.vectorAvatars.add(null);
                                        }
                                        this.photos.add(photo2);
                                        this.imagesLocationsSizes.add(Integer.valueOf(closestPhotoSizeWithSize.size));
                                        this.imagesUploadProgress.add(null);
                                    } else {
                                        this.imagesLocations.add(forPhoto);
                                        ArrayList arrayList9 = this.thumbsFileNames;
                                        if (closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                            photoSize = closestPhotoSizeWithSize;
                                        } else {
                                            photoSize = closestPhotoSizeWithSize2;
                                        }
                                        arrayList9.add(FileLoader.getAttachFileName(photoSize));
                                        this.thumbsLocations.add(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2));
                                        if (!photo2.video_sizes.isEmpty()) {
                                            closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                            vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                            if (vectorMarkupVideoSize != null) {
                                                ArrayList arrayList10 = this.vectorAvatars;
                                                if (user2 == null) {
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                }
                                                arrayList10.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize, z2, 2));
                                                this.videoLocations.add(null);
                                                this.videoFileNames.add(null);
                                            } else {
                                                this.vectorAvatars.add(null);
                                                this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2));
                                                this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                            }
                                        } else {
                                            this.videoLocations.add(null);
                                            this.videoFileNames.add(null);
                                            this.vectorAvatars.add(null);
                                        }
                                        this.photos.add(photo2);
                                        this.imagesLocationsSizes.add(Integer.valueOf(closestPhotoSizeWithSize.size));
                                        this.imagesUploadProgress.add(null);
                                    }
                                }
                            }
                        }
                    }
                    i6++;
                    i5 = 0;
                }
                loadNeighboringThumbs();
                getAdapter().notifyDataSetChanged();
                if (this.isProfileFragment) {
                    if (!this.scrolledByUser || this.forceResetPosition) {
                        resetCurrentItem();
                    }
                } else if (!this.scrolledByUser || this.forceResetPosition) {
                    resetCurrentItem();
                    getAdapter().notifyDataSetChanged();
                    checkCustomAvatar(getRealPosition(), 0.0f);
                }
                if (this.fallbackPhotoIndex >= 0 || this.customAvatarIndex >= 0) {
                    z = false;
                } else {
                    z = false;
                    checkCustomAvatar(0, 0.0f);
                }
                this.forceResetPosition = z;
                Callback callback = this.callback;
                if (callback != null) {
                    callback.onPhotosLoaded();
                }
                ImageLocation imageLocation2 = this.currentUploadingImageLocation;
                if (imageLocation2 != null) {
                    addUploadingImage(imageLocation2, this.curreantUploadingThumbLocation);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            for (int i10 = 0; i10 < this.thumbsFileNames.size(); i10++) {
                String str2 = (String) this.videoFileNames.get(i10);
                if (str2 == null) {
                    str2 = (String) this.thumbsFileNames.get(i10);
                }
                if (str2 != null && TextUtils.equals(str, str2)) {
                    RadialProgress2 radialProgress2 = (RadialProgress2) this.radialProgresses.get(i10);
                    if (radialProgress2 != null) {
                        radialProgress2.setProgress(1.0f, true);
                    }
                    invalidate();
                }
            }
            return;
        }
        if (i == NotificationCenter.fileLoadProgressChanged) {
            String str3 = (String) objArr[0];
            for (int i11 = 0; i11 < this.thumbsFileNames.size(); i11++) {
                String str4 = (String) this.videoFileNames.get(i11);
                if (str4 == null) {
                    str4 = (String) this.thumbsFileNames.get(i11);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress3 = (RadialProgress2) this.radialProgresses.get(i11);
                    if (radialProgress3 != null) {
                        radialProgress3.setProgress(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
                    }
                    invalidate();
                }
            }
            return;
        }
        if (i == NotificationCenter.reloadDialogPhotos && this.settingMainPhoto == 0 && (dialogPhotos = this.dialogPhotos) != null) {
            dialogPhotos.reset();
            MessagesController.DialogPhotos dialogPhotos3 = this.dialogPhotos;
            int currentItem = getCurrentItem();
            ViewPagerAdapter viewPagerAdapter = this.adapter;
            dialogPhotos3.loadAfter(currentItem - (viewPagerAdapter != null ? viewPagerAdapter.getExtraCount() : 0), true);
        }
    }

    public class ViewPagerAdapter extends CircularViewPager.Adapter {
        private final Context context;
        private final ActionBar parentActionBar;
        private BackupImageView parentAvatarImageView;
        private final Paint placeholderPaint;
        private final ArrayList objects = new ArrayList();
        private final ArrayList imageViews = new ArrayList();

        public ViewPagerAdapter(Context context, ProfileActivity.AvatarImageView avatarImageView, ActionBar actionBar) {
            this.context = context;
            this.parentAvatarImageView = avatarImageView;
            this.parentActionBar = actionBar;
            Paint paint = new Paint(1);
            this.placeholderPaint = paint;
            paint.setColor(-16777216);
        }

        @Override
        public int getCount() {
            return this.objects.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            Item item = (Item) obj;
            if (item.isActiveVideo) {
                return view == item.textureViewStubView;
            }
            return view == item.imageView;
        }

        @Override
        public int getItemPosition(Object obj) {
            int iIndexOf = this.objects.indexOf((Item) obj);
            if (iIndexOf == -1) {
                return -2;
            }
            return iIndexOf;
        }

        @Override
        public Item instantiateItem(ViewGroup viewGroup, int i) {
            boolean z;
            Item item = (Item) this.objects.get(i);
            int realPosition = getRealPosition(i);
            if (ProfileGalleryView.this.hasActiveVideo && realPosition == 0) {
                item.isActiveVideo = true;
                if (item.textureViewStubView == null) {
                    item.textureViewStubView = ProfileGalleryView.this.new TextureStubView(this.context);
                }
                if (item.textureViewStubView.getParent() == null) {
                    viewGroup.addView(item.textureViewStubView);
                }
                return item;
            }
            item.isActiveVideo = false;
            if (item.textureViewStubView != null && item.textureViewStubView.getParent() != null) {
                viewGroup.removeView(item.textureViewStubView);
            }
            if (item.imageView == null) {
                item.imageView = ProfileGalleryView.this.new AvatarImageView(this.context, i, this.placeholderPaint);
                this.imageViews.set(i, item.imageView);
            }
            if (item.imageView.getParent() == null) {
                viewGroup.addView(item.imageView);
            }
            item.imageView.getImageReceiver().setAllowDecodeSingleFrame(true);
            int i2 = ProfileGalleryView.this.hasActiveVideo ? realPosition - 1 : realPosition;
            if (i2 != 0) {
                if (i2 < 0 || i2 >= ProfileGalleryView.this.videoLocations.size()) {
                    z = false;
                } else {
                    ImageLocation imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(i2);
                    item.imageView.isVideo = imageLocation != null;
                    z = ProfileGalleryView.this.vectorAvatars.get(i2) == null;
                    ImageLocation imageLocation2 = (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i2);
                    item.imageView.setImageMedia((VectorAvatarThumbDrawable) ProfileGalleryView.this.vectorAvatars.get(i2), imageLocation, null, (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i2), null, (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i2), (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", null, ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i2)).intValue(), 1, "avatar_" + ProfileGalleryView.this.dialogId);
                }
            } else {
                BackupImageView backupImageView = this.parentAvatarImageView;
                Drawable drawable = backupImageView == null ? null : backupImageView.getImageReceiver().getDrawable();
                if (drawable instanceof AnimatedFileDrawable) {
                    AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                    if (!animatedFileDrawable.hasBitmap()) {
                        if (i2 < 0 && i2 < ProfileGalleryView.this.videoLocations.size()) {
                            ImageLocation imageLocation3 = (ImageLocation) ProfileGalleryView.this.videoLocations.get(i2);
                            item.imageView.isVideo = imageLocation3 != null;
                            z = ProfileGalleryView.this.vectorAvatars.get(i2) == null;
                            String str = (ProfileGalleryView.this.isProfileFragment && imageLocation3 != null && imageLocation3.imageType == 2) ? "avatar" : null;
                            ImageLocation imageLocation4 = (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i2);
                            Bitmap bitmap = (this.parentAvatarImageView == null || !ProfileGalleryView.this.createThumbFromParent) ? null : this.parentAvatarImageView.getImageReceiver().getBitmap();
                            String str2 = "avatar_" + ProfileGalleryView.this.dialogId;
                            if (bitmap == null || ProfileGalleryView.this.vectorAvatars.get(i2) != null) {
                                if (ProfileGalleryView.this.uploadingImageLocation != null) {
                                    item.imageView.setImageMedia((VectorAvatarThumbDrawable) ProfileGalleryView.this.vectorAvatars.get(i2), (ImageLocation) ProfileGalleryView.this.videoLocations.get(i2), str, (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i2), null, ProfileGalleryView.this.uploadingImageLocation, null, null, ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i2)).intValue(), 1, str2);
                                } else {
                                    item.imageView.setImageMedia((VectorAvatarThumbDrawable) ProfileGalleryView.this.vectorAvatars.get(i2), imageLocation3, null, (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i2), null, (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i2), (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", null, ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i2)).intValue(), 1, str2);
                                }
                            } else {
                                item.imageView.setImageMedia((ImageLocation) ProfileGalleryView.this.videoLocations.get(i2), str, (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i2), null, bitmap, ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i2)).intValue(), 1, str2);
                            }
                        }
                    } else {
                        item.imageView.setImageDrawable(drawable);
                        animatedFileDrawable.addSecondParentView(item.imageView);
                        animatedFileDrawable.setInvalidateParentViewWithSecond(true);
                    }
                    z = false;
                } else if (i2 < 0) {
                    z = false;
                } else {
                    z = false;
                }
            }
            if ((i2 < 0 || i2 >= ProfileGalleryView.this.imagesUploadProgress.size() || ProfileGalleryView.this.imagesUploadProgress.get(i2) == null) ? z : true) {
                item.imageView.radialProgress = (RadialProgress2) ProfileGalleryView.this.radialProgresses.get(i2);
                if (item.imageView.radialProgress == null) {
                    item.imageView.radialProgress = new RadialProgress2(item.imageView);
                    item.imageView.radialProgress.setOverrideAlpha(0.0f);
                    item.imageView.radialProgress.setIcon(10, false, false);
                    item.imageView.radialProgress.setColors(1107296256, 1107296256, -1, -1);
                    ProfileGalleryView.this.radialProgresses.append(i2, item.imageView.radialProgress);
                }
                if (ProfileGalleryView.this.invalidateWithParent) {
                    ProfileGalleryView.this.invalidate();
                } else {
                    ProfileGalleryView.this.postInvalidateOnAnimation();
                }
            }
            item.imageView.getImageReceiver().setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                }

                @Override
                public void didSetImageBitmap(int i3, String str3, Drawable drawable2) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i3, str3, drawable2);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver) {
                    if (ProfileGalleryView.this.callback != null) {
                        ProfileGalleryView.this.callback.onVideoSet();
                    }
                }
            });
            item.imageView.getImageReceiver().setCrossfadeAlpha((byte) 2);
            item.imageView.setRoundRadius(ProfileGalleryView.this.roundTopRadius, ProfileGalleryView.this.roundTopRadius, ProfileGalleryView.this.roundBottomRadius, ProfileGalleryView.this.roundBottomRadius);
            item.imageView.setTag(Integer.valueOf(realPosition));
            return item;
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Item item = (Item) obj;
            if (item.textureViewStubView != null) {
                viewGroup.removeView(item.textureViewStubView);
            }
            if (item.isActiveVideo) {
                return;
            }
            AvatarImageView avatarImageView = item.imageView;
            if (avatarImageView.getImageReceiver().hasStaticThumb()) {
                Drawable drawable = avatarImageView.getImageReceiver().getDrawable();
                if (drawable instanceof AnimatedFileDrawable) {
                    ((AnimatedFileDrawable) drawable).removeSecondParentView(avatarImageView);
                }
            }
            avatarImageView.setRoundRadius(0);
            viewGroup.removeView(avatarImageView);
            avatarImageView.getImageReceiver().cancelLoadImage();
        }

        @Override
        public CharSequence getPageTitle(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(getRealPosition(i) + 1);
            sb.append("/");
            sb.append(ProfileGalleryView.this.dialogPhotos == null ? 0 : ProfileGalleryView.this.dialogPhotos.getCount());
            return sb.toString();
        }

        @Override
        public void notifyDataSetChanged() {
            for (int i = 0; i < this.imageViews.size(); i++) {
                if (this.imageViews.get(i) != null) {
                    ((BackupImageView) this.imageViews.get(i)).getImageReceiver().cancelLoadImage();
                }
            }
            this.objects.clear();
            this.imageViews.clear();
            int size = ProfileGalleryView.this.imagesLocations.size();
            if (ProfileGalleryView.this.hasActiveVideo) {
                size++;
            }
            int iMax = Math.max(ProfileGalleryView.this.dialogPhotos == null ? 0 : ProfileGalleryView.this.dialogPhotos.getCount(), size) + (getExtraCount() * 2);
            for (int i2 = 0; i2 < iMax; i2++) {
                this.objects.add(new Item());
                this.imageViews.add(null);
            }
            super.notifyDataSetChanged();
        }

        @Override
        public int getExtraCount() {
            int size = ProfileGalleryView.this.imagesLocations.size();
            if (ProfileGalleryView.this.hasActiveVideo) {
                size++;
            }
            if (size >= 2) {
                return ProfileGalleryView.this.getOffscreenPageLimit();
            }
            return 0;
        }
    }

    public void setData(long j) {
        setData(j, false);
    }

    public void setData(long j, boolean z) {
        if (this.dialogId == j && !z) {
            resetCurrentItem();
            return;
        }
        this.forceResetPosition = true;
        reset();
        this.dialogId = j;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.currentAccount).getDialogPhotos(j);
        this.dialogPhotos = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public long getDialogId() {
        return this.dialogId;
    }

    private void reset() {
        this.videoFileNames.clear();
        this.thumbsFileNames.clear();
        this.photos.clear();
        this.videoLocations.clear();
        this.imagesLocations.clear();
        this.thumbsLocations.clear();
        this.imagesLocationsSizes.clear();
        this.imagesUploadProgress.clear();
        this.adapter.notifyDataSetChanged();
        setCurrentItem(0, false);
        this.selectedPage = 0;
        this.uploadingImageLocation = null;
        this.prevImageLocation = null;
    }

    public void setRoundRadius(int i, int i2) {
        this.roundTopRadius = i;
        this.roundBottomRadius = i2;
        if (this.adapter != null) {
            for (int i3 = 0; i3 < this.adapter.objects.size(); i3++) {
                if (((Item) this.adapter.objects.get(i3)).imageView != null) {
                    AvatarImageView avatarImageView = ((Item) this.adapter.objects.get(i3)).imageView;
                    int i4 = this.roundTopRadius;
                    int i5 = this.roundBottomRadius;
                    avatarImageView.setRoundRadius(i4, i4, i5, i5);
                }
            }
        }
    }

    public void setParentAvatarImage(BackupImageView backupImageView) {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter != null) {
            viewPagerAdapter.parentAvatarImageView = backupImageView;
        }
    }

    public void setUploadProgress(ImageLocation imageLocation, float f) {
        if (imageLocation == null) {
            return;
        }
        for (int i = 0; i < this.imagesLocations.size(); i++) {
            if (this.imagesLocations.get(i) == imageLocation) {
                this.imagesUploadProgress.set(i, Float.valueOf(f));
                if (this.radialProgresses.get(i) == null) {
                    break;
                }
                ((RadialProgress2) this.radialProgresses.get(i)).setProgress(f, true);
                break;
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).invalidate();
        }
    }

    public void setCreateThumbFromParent(boolean z) {
        this.createThumbFromParent = z;
    }

    public boolean isZooming() {
        PinchToZoomHelper pinchToZoomHelper = this.pinchToZoomHelper;
        return pinchToZoomHelper != null && pinchToZoomHelper.isInOverlayMode();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.notifyUpdateSize();
        }
    }

    class AvatarImageView extends BackupImageView implements SizeNotifierFrameLayout.IViewWithInvalidateCallback {
        private long firstDrawTime;
        Runnable invalidateCallback;
        public boolean isVideo;
        private final Paint placeholderPaint;
        private final int position;
        private RadialProgress2 radialProgress;
        private ValueAnimator radialProgressHideAnimator;
        private float radialProgressHideAnimatorStartValue;
        private final int radialProgressSize;

        public AvatarImageView(Context context, int i, Paint paint) {
            super(context);
            this.radialProgressSize = AndroidUtilities.dp(64.0f);
            this.firstDrawTime = -1L;
            this.position = i;
            this.placeholderPaint = paint;
            setLayerNum(ProfileGalleryView.this.imagesLayerNum);
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.radialProgress != null) {
                int currentActionBarHeight = (ProfileGalleryView.this.parentActionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight();
                int iDp2 = AndroidUtilities.dp2(80.0f);
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i5 = this.radialProgressSize;
                int i6 = (i2 - currentActionBarHeight) - iDp2;
                radialProgress2.setProgressRect((i - i5) / 2, ((i6 - i5) / 2) + currentActionBarHeight, (i + i5) / 2, currentActionBarHeight + ((i6 + i5) / 2));
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            PinchToZoomHelper pinchToZoomHelper = ProfileGalleryView.this.pinchToZoomHelper;
            if (pinchToZoomHelper == null || !pinchToZoomHelper.isInOverlayMode()) {
                if (this.radialProgress != null) {
                    final int realPosition = ProfileGalleryView.this.getRealPosition(this.position);
                    if (ProfileGalleryView.this.hasActiveVideo) {
                        realPosition--;
                    }
                    Drawable drawable = getImageReceiver().getDrawable();
                    long j = 0;
                    if (realPosition >= ProfileGalleryView.this.imagesUploadProgress.size() || ProfileGalleryView.this.imagesUploadProgress.get(realPosition) == null ? drawable == null || (this.isVideo && (!(drawable instanceof AnimatedFileDrawable) || ((AnimatedFileDrawable) drawable).getDurationMs() <= 0)) : ((Float) ProfileGalleryView.this.imagesUploadProgress.get(realPosition)).floatValue() < 1.0f) {
                        if (this.firstDrawTime < 0) {
                            this.firstDrawTime = System.currentTimeMillis();
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.firstDrawTime;
                            long j2 = this.isVideo ? 250L : 750L;
                            if (jCurrentTimeMillis <= 250 + j2 && jCurrentTimeMillis > j2) {
                                this.radialProgress.setOverrideAlpha(CubicBezierInterpolator.DEFAULT.getInterpolation((jCurrentTimeMillis - j2) / 250.0f));
                            }
                        }
                        if (ProfileGalleryView.this.invalidateWithParent) {
                            invalidate();
                        } else {
                            postInvalidateOnAnimation();
                        }
                        invalidate();
                    } else if (this.radialProgressHideAnimator == null) {
                        if (this.radialProgress.getProgress() < 1.0f) {
                            this.radialProgress.setProgress(1.0f, true);
                            j = 100;
                        }
                        this.radialProgressHideAnimatorStartValue = this.radialProgress.getOverrideAlpha();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.radialProgressHideAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.setStartDelay(j);
                        this.radialProgressHideAnimator.setDuration((long) (this.radialProgressHideAnimatorStartValue * 250.0f));
                        this.radialProgressHideAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.radialProgressHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ProfileGalleryView.AvatarImageView avatarImageView = this.f$0;
                                avatarImageView.radialProgress.setOverrideAlpha(AndroidUtilities.lerp(avatarImageView.radialProgressHideAnimatorStartValue, 0.0f, valueAnimator.getAnimatedFraction()));
                            }
                        });
                        this.radialProgressHideAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                AvatarImageView.this.radialProgress = null;
                                ProfileGalleryView.this.radialProgresses.delete(realPosition);
                            }
                        });
                        this.radialProgressHideAnimator.start();
                    }
                    if (ProfileGalleryView.this.roundTopRadius != 0 || ProfileGalleryView.this.roundBottomRadius != 0) {
                        canvas2 = canvas;
                        if (ProfileGalleryView.this.roundTopRadius == ProfileGalleryView.this.roundBottomRadius) {
                            ProfileGalleryView.this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                            ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
                            canvas2.drawRoundRect(profileGalleryView.rect, profileGalleryView.roundTopRadius, ProfileGalleryView.this.roundTopRadius, this.placeholderPaint);
                        } else {
                            ProfileGalleryView.this.path.reset();
                            ProfileGalleryView.this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                            for (int i = 0; i < 4; i++) {
                                ProfileGalleryView profileGalleryView2 = ProfileGalleryView.this;
                                profileGalleryView2.radii[i] = profileGalleryView2.roundTopRadius;
                                ProfileGalleryView profileGalleryView3 = ProfileGalleryView.this;
                                profileGalleryView3.radii[i + 4] = profileGalleryView3.roundBottomRadius;
                            }
                            ProfileGalleryView profileGalleryView4 = ProfileGalleryView.this;
                            profileGalleryView4.path.addRoundRect(profileGalleryView4.rect, profileGalleryView4.radii, Path.Direction.CW);
                            canvas2.drawPath(ProfileGalleryView.this.path, this.placeholderPaint);
                        }
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.placeholderPaint);
                    }
                } else {
                    canvas2 = canvas;
                }
                super.onDraw(canvas2);
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 == null || radialProgress2.getOverrideAlpha() <= 0.0f) {
                    return;
                }
                this.radialProgress.draw(canvas2);
            }
        }

        @Override
        public void listenInvalidate(Runnable runnable) {
            this.invalidateCallback = runnable;
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            super.invalidate(i, i2, i3, i4);
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void invalidate(Rect rect) {
            super.invalidate(rect);
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            if (ProfileGalleryView.this.invalidateWithParent) {
                ProfileGalleryView.this.invalidate();
            }
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setPinchToZoomHelper(PinchToZoomHelper pinchToZoomHelper) {
        this.pinchToZoomHelper = pinchToZoomHelper;
    }

    public void setInvalidateWithParent(boolean z) {
        this.invalidateWithParent = z;
    }

    private class TextureStubView extends View {
        public TextureStubView(Context context) {
            super(context);
        }
    }

    public void scrollToLastItem() {
        int i = 0;
        while (getRealPosition(i) != getRealCount() - 1) {
            i++;
        }
        setCurrentItem(i, true);
    }
}
