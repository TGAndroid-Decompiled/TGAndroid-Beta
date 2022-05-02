package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.Components.CircularViewPager;
import org.telegram.p009ui.Components.ProfileGalleryView;
import org.telegram.p009ui.PinchToZoomHelper;
import org.telegram.p009ui.ProfileActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated;
import org.telegram.tgnet.TLRPC$VideoSize;

public class ProfileGalleryView extends CircularViewPager implements NotificationCenter.NotificationCenterDelegate {
    private ViewPagerAdapter adapter;
    private final Callback callback;
    private TLRPC$ChatFull chatInfo;
    private boolean createThumbFromParent;
    ImageLocation curreantUploadingThumbLocation;
    private int currentAccount;
    ImageLocation currentUploadingImageLocation;
    private long dialogId;
    private final PointF downPoint;
    private boolean forceResetPosition;
    private boolean hasActiveVideo;
    private int imagesLayerNum;
    private ArrayList<ImageLocation> imagesLocations;
    private ArrayList<Integer> imagesLocationsSizes;
    private ArrayList<Float> imagesUploadProgress;
    private boolean invalidateWithParent;
    private boolean isDownReleased;
    private final boolean isProfileFragment;
    private boolean isScrollingListView;
    private boolean isSwipingViewPager;
    private final C1006ActionBar parentActionBar;
    private final int parentClassGuid;
    private final RecyclerListView parentListView;
    Path path;
    private ArrayList<TLRPC$Photo> photos;
    PinchToZoomHelper pinchToZoomHelper;
    private ImageLocation prevImageLocation;
    private final SparseArray<RadialProgress2> radialProgresses;
    float[] radii;
    RectF rect;
    private int roundBottomRadius;
    private int roundTopRadius;
    private boolean scrolledByUser;
    private int settingMainPhoto;
    private ArrayList<String> thumbsFileNames;
    private ArrayList<ImageLocation> thumbsLocations;
    private final int touchSlop;
    private ImageLocation uploadingImageLocation;
    private ArrayList<String> videoFileNames;
    private ArrayList<ImageLocation> videoLocations;

    public interface Callback {
        void onDown(boolean z);

        void onPhotosLoaded();

        void onRelease();

        void onVideoSet();
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

    public static class Item {
        private AvatarImageView imageView;
        boolean isActiveVideo;
        private View textureViewStubView;

        private Item() {
        }
    }

    public ProfileGalleryView(Context context, C1006ActionBar actionBar, RecyclerListView recyclerListView, Callback callback) {
        super(context);
        this.downPoint = new PointF();
        this.isScrollingListView = true;
        this.isSwipingViewPager = true;
        this.currentAccount = UserConfig.selectedAccount;
        this.path = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.videoFileNames = new ArrayList<>();
        this.thumbsFileNames = new ArrayList<>();
        this.photos = new ArrayList<>();
        this.videoLocations = new ArrayList<>();
        this.imagesLocations = new ArrayList<>();
        this.thumbsLocations = new ArrayList<>();
        this.imagesLocationsSizes = new ArrayList<>();
        this.imagesUploadProgress = new ArrayList<>();
        this.radialProgresses = new SparseArray<>();
        this.createThumbFromParent = true;
        setOffscreenPageLimit(2);
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
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrolled(int i, float f, int i2) {
                ImageLocation imageLocation;
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
                                if (!(animation == null || (imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(realPosition2)) == null)) {
                                    animation.seekTo(imageLocation.videoSeekTo, false, true);
                                }
                                imageReceiver.setAllowStartAnimation(false);
                                imageReceiver.stopAnimation();
                            }
                        }
                    }
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
    }

    public void setImagesLayerNum(int i) {
        this.imagesLayerNum = i;
    }

    public ProfileGalleryView(Context context, long j, C1006ActionBar actionBar, RecyclerListView recyclerListView, ProfileActivity.AvatarImageView avatarImageView, int i, Callback callback) {
        super(context);
        this.downPoint = new PointF();
        this.isScrollingListView = true;
        this.isSwipingViewPager = true;
        this.currentAccount = UserConfig.selectedAccount;
        this.path = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.videoFileNames = new ArrayList<>();
        this.thumbsFileNames = new ArrayList<>();
        this.photos = new ArrayList<>();
        this.videoLocations = new ArrayList<>();
        this.imagesLocations = new ArrayList<>();
        this.thumbsLocations = new ArrayList<>();
        this.imagesLocationsSizes = new ArrayList<>();
        this.imagesUploadProgress = new ArrayList<>();
        this.radialProgresses = new SparseArray<>();
        this.createThumbFromParent = true;
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
            public void onPageSelected(int i2) {
            }

            @Override
            public void onPageScrolled(int i2, float f, int i3) {
                ImageLocation imageLocation;
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
                                if (!(animation == null || (imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(realPosition2)) == null)) {
                                    animation.seekTo(imageLocation.videoSeekTo, false, true);
                                }
                                imageReceiver.setAllowStartAnimation(false);
                                imageReceiver.stopAnimation();
                            }
                        }
                    }
                }
            }
        });
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadDialogPhotos);
        MessagesController.getInstance(this.currentAccount).loadDialogPhotos(j, 80, 0, true, i);
    }

    public void onDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
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
        if (!(animatedFileDrawable == null || this.adapter == null)) {
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
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.adapter == null) {
            return false;
        }
        if (this.parentListView.getScrollState() == 0 || this.isScrollingListView || !this.isSwipingViewPager) {
            int action = motionEvent.getAction();
            if (!(this.pinchToZoomHelper == null || getCurrentItemView() == null)) {
                if (action != 0 && this.isDownReleased && !this.pinchToZoomHelper.isInOverlayMode()) {
                    this.pinchToZoomHelper.checkPinchToZoom(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null);
                } else if (this.pinchToZoomHelper.checkPinchToZoom(motionEvent, this, getCurrentItemView().getImageReceiver(), null)) {
                    if (!this.isDownReleased) {
                        this.isDownReleased = true;
                        this.callback.onRelease();
                    }
                    return true;
                }
            }
            if (action == 0) {
                this.isScrollingListView = true;
                this.isSwipingViewPager = true;
                this.scrolledByUser = true;
                this.downPoint.set(motionEvent.getX(), motionEvent.getY());
                if (this.adapter.getCount() > 1) {
                    this.callback.onDown(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.isDownReleased = false;
            } else if (action == 1) {
                if (!this.isDownReleased) {
                    int count = this.adapter.getCount();
                    int currentItem = getCurrentItem();
                    if (count > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i = this.adapter.getExtraCount();
                            int i2 = currentItem + 1;
                            if (i2 < count - i) {
                                i = i2;
                            }
                        } else {
                            int extraCount = this.adapter.getExtraCount();
                            int i3 = (-1) + currentItem;
                            i = i3 < extraCount ? (count - extraCount) - 1 : i3;
                        }
                        this.callback.onRelease();
                        setCurrentItem(i, false);
                    }
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - this.downPoint.x;
                float y = motionEvent.getY() - this.downPoint.y;
                boolean z = Math.abs(y) >= ((float) this.touchSlop) || Math.abs(x) >= ((float) this.touchSlop);
                if (z) {
                    this.isDownReleased = true;
                    this.callback.onRelease();
                }
                boolean z2 = this.isSwipingViewPager;
                if (!z2 || !this.isScrollingListView) {
                    if (z2 && !canScrollHorizontally(-1) && x > this.touchSlop) {
                        return false;
                    }
                } else if (z) {
                    if (Math.abs(y) > Math.abs(x)) {
                        this.isSwipingViewPager = false;
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        super.onTouchEvent(obtain);
                        obtain.recycle();
                    } else {
                        this.isScrollingListView = false;
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                        obtain2.setAction(3);
                        this.parentListView.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                }
            }
            boolean onTouchEvent = this.isScrollingListView ? this.parentListView.onTouchEvent(motionEvent) : false;
            if (this.isSwipingViewPager) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            }
            if (action == 1 || action == 3) {
                this.isScrollingListView = false;
                this.isSwipingViewPager = false;
            }
            return onTouchEvent;
        }
        this.isSwipingViewPager = false;
        MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
        obtain3.setAction(3);
        super.onTouchEvent(obtain3);
        obtain3.recycle();
        return false;
    }

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.chatInfo = tLRPC$ChatFull;
        if (!this.photos.isEmpty() && this.photos.get(0) == null && this.chatInfo != null && FileLoader.isSamePhoto((TLRPC$FileLocation) this.imagesLocations.get(0).location, this.chatInfo.chat_photo)) {
            this.photos.set(0, this.chatInfo.chat_photo);
            if (!this.chatInfo.chat_photo.video_sizes.isEmpty()) {
                TLRPC$VideoSize tLRPC$VideoSize = this.chatInfo.chat_photo.video_sizes.get(0);
                this.videoLocations.set(0, ImageLocation.getForPhoto(tLRPC$VideoSize, this.chatInfo.chat_photo));
                this.videoFileNames.set(0, FileLoader.getAttachFileName(tLRPC$VideoSize));
                this.callback.onPhotosLoaded();
            } else {
                this.videoLocations.set(0, null);
                this.videoFileNames.add(0, null);
            }
            this.imagesUploadProgress.set(0, null);
            this.adapter.notifyDataSetChanged();
        }
    }

    public boolean initIfEmpty(ImageLocation imageLocation, ImageLocation imageLocation2) {
        if (imageLocation == null || imageLocation2 == null || this.settingMainPhoto != 0) {
            return false;
        }
        ImageLocation imageLocation3 = this.prevImageLocation;
        if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
            if (!this.imagesLocations.isEmpty()) {
                this.prevImageLocation = imageLocation;
                MessagesController.getInstance(this.currentAccount).loadDialogPhotos(this.dialogId, 80, 0, true, this.parentClassGuid);
                return true;
            }
            MessagesController.getInstance(this.currentAccount).loadDialogPhotos(this.dialogId, 80, 0, true, this.parentClassGuid);
        }
        if (!this.imagesLocations.isEmpty()) {
            return false;
        }
        this.prevImageLocation = imageLocation;
        this.thumbsFileNames.add(null);
        this.videoFileNames.add(null);
        this.imagesLocations.add(imageLocation);
        this.thumbsLocations.add(imageLocation2);
        this.videoLocations.add(null);
        this.photos.add(null);
        this.imagesLocationsSizes.add(-1);
        this.imagesUploadProgress.add(null);
        getAdapter().notifyDataSetChanged();
        return true;
    }

    public void addUploadingImage(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.prevImageLocation = imageLocation;
        this.thumbsFileNames.add(0, null);
        this.videoFileNames.add(0, null);
        this.imagesLocations.add(0, imageLocation);
        this.thumbsLocations.add(0, imageLocation2);
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
        ImageLocation imageLocation = this.videoLocations.get(i);
        return imageLocation != null ? imageLocation : this.imagesLocations.get(i);
    }

    public ImageLocation getRealImageLocation(int i) {
        if (i < 0 || i >= this.imagesLocations.size()) {
            return null;
        }
        return this.imagesLocations.get(i);
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
        return this.videoLocations.get(realPosition) != null;
    }

    public ImageLocation getCurrentVideoLocation(ImageLocation imageLocation, ImageLocation imageLocation2) {
        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        int i = 0;
        while (i < 2) {
            ArrayList<ImageLocation> arrayList = i == 0 ? this.thumbsLocations : this.imagesLocations;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ImageLocation imageLocation3 = arrayList.get(i2);
                if (!(imageLocation3 == null || (tLRPC$TL_fileLocationToBeDeprecated = imageLocation3.location) == null)) {
                    int i3 = imageLocation3.dc_id;
                    if (i3 == imageLocation.dc_id) {
                        int i4 = tLRPC$TL_fileLocationToBeDeprecated.local_id;
                        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i4 == tLRPC$TL_fileLocationToBeDeprecated2.local_id && tLRPC$TL_fileLocationToBeDeprecated.volume_id == tLRPC$TL_fileLocationToBeDeprecated2.volume_id) {
                            return this.videoLocations.get(i2);
                        }
                    }
                    if (i3 == imageLocation2.dc_id) {
                        int i5 = tLRPC$TL_fileLocationToBeDeprecated.local_id;
                        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i5 == tLRPC$TL_fileLocationToBeDeprecated3.local_id && tLRPC$TL_fileLocationToBeDeprecated.volume_id == tLRPC$TL_fileLocationToBeDeprecated3.volume_id) {
                            return this.videoLocations.get(i2);
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

    public TLRPC$Photo getPhoto(int i) {
        if (i < 0 || i >= this.photos.size()) {
            return null;
        }
        return this.photos.get(i);
    }

    public void replaceFirstPhoto(TLRPC$Photo tLRPC$Photo, TLRPC$Photo tLRPC$Photo2) {
        int indexOf;
        if (!this.photos.isEmpty() && (indexOf = this.photos.indexOf(tLRPC$Photo)) >= 0) {
            this.photos.set(indexOf, tLRPC$Photo2);
        }
    }

    public void finishSettingMainPhoto() {
        this.settingMainPhoto--;
    }

    public void startMovePhotoToBegin(int i) {
        if (i > 0 && i < this.photos.size()) {
            this.settingMainPhoto++;
            this.photos.remove(i);
            this.photos.add(0, this.photos.get(i));
            this.thumbsFileNames.remove(i);
            this.thumbsFileNames.add(0, this.thumbsFileNames.get(i));
            ArrayList<String> arrayList = this.videoFileNames;
            arrayList.add(0, arrayList.remove(i));
            this.videoLocations.remove(i);
            this.videoLocations.add(0, this.videoLocations.get(i));
            this.imagesLocations.remove(i);
            this.imagesLocations.add(0, this.imagesLocations.get(i));
            this.thumbsLocations.remove(i);
            this.thumbsLocations.add(0, this.thumbsLocations.get(i));
            this.imagesLocationsSizes.remove(i);
            this.imagesLocationsSizes.add(0, this.imagesLocationsSizes.get(i));
            this.imagesUploadProgress.remove(i);
            this.imagesUploadProgress.add(0, this.imagesUploadProgress.get(i));
            this.prevImageLocation = this.imagesLocations.get(0);
        }
    }

    public void commitMoveToBegin() {
        this.adapter.notifyDataSetChanged();
        resetCurrentItem();
    }

    public boolean removePhotoAtIndex(int i) {
        if (i < 0 || i >= this.photos.size()) {
            return false;
        }
        this.photos.remove(i);
        this.thumbsFileNames.remove(i);
        this.videoFileNames.remove(i);
        this.videoLocations.remove(i);
        this.imagesLocations.remove(i);
        this.thumbsLocations.remove(i);
        this.imagesLocationsSizes.remove(i);
        this.radialProgresses.delete(i);
        this.imagesUploadProgress.remove(i);
        if (i == 0 && !this.imagesLocations.isEmpty()) {
            this.prevImageLocation = this.imagesLocations.get(0);
        }
        this.adapter.notifyDataSetChanged();
        return this.photos.isEmpty();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.parentListView.getScrollState() != 0) {
            return false;
        }
        if (!(getParent() == null || getParent().getParent() == null)) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void loadNeighboringThumbs() {
        int size = this.thumbsLocations.size();
        if (size > 1) {
            int i = 0;
            while (true) {
                int i2 = 2;
                if (size <= 2) {
                    i2 = 1;
                }
                if (i < i2) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.thumbsLocations.get(i == 0 ? 1 : size - 1), null, null, 0, 1);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void didReceivedNotification(int r17, int r18, java.lang.Object... r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.ProfileGalleryView.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public class ViewPagerAdapter extends CircularViewPager.Adapter {
        private final Context context;
        private BackupImageView parentAvatarImageView;
        private final Paint placeholderPaint;
        private final ArrayList<Item> objects = new ArrayList<>();
        private final ArrayList<BackupImageView> imageViews = new ArrayList<>();

        public ViewPagerAdapter(Context context, ProfileActivity.AvatarImageView avatarImageView, C1006ActionBar actionBar) {
            this.context = context;
            this.parentAvatarImageView = avatarImageView;
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
            return item.isActiveVideo ? view == item.textureViewStubView : view == item.imageView;
        }

        @Override
        public int getItemPosition(Object obj) {
            int indexOf = this.objects.indexOf((Item) obj);
            if (indexOf == -1) {
                return -2;
            }
            return indexOf;
        }

        @Override
        public org.telegram.p009ui.Components.ProfileGalleryView.Item instantiateItem(android.view.ViewGroup r24, int r25) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.ProfileGalleryView.ViewPagerAdapter.instantiateItem(android.view.ViewGroup, int):org.telegram.ui.Components.ProfileGalleryView$Item");
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Item item = (Item) obj;
            if (item.textureViewStubView != null) {
                viewGroup.removeView(item.textureViewStubView);
            }
            if (!item.isActiveVideo) {
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
        }

        @Override
        public CharSequence getPageTitle(int i) {
            return (getRealPosition(i) + 1) + "/" + (getCount() - (getExtraCount() * 2));
        }

        @Override
        public void notifyDataSetChanged() {
            for (int i = 0; i < this.imageViews.size(); i++) {
                if (this.imageViews.get(i) != null) {
                    this.imageViews.get(i).getImageReceiver().cancelLoadImage();
                }
            }
            this.objects.clear();
            this.imageViews.clear();
            int size = ProfileGalleryView.this.imagesLocations.size();
            if (ProfileGalleryView.this.hasActiveVideo) {
                size++;
            }
            int extraCount = size + (getExtraCount() * 2);
            for (int i2 = 0; i2 < extraCount; i2++) {
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
        if (this.dialogId != j || z) {
            this.forceResetPosition = true;
            this.adapter.notifyDataSetChanged();
            reset();
            this.dialogId = j;
            if (j != 0) {
                MessagesController.getInstance(this.currentAccount).loadDialogPhotos(j, 80, 0, true, this.parentClassGuid);
                return;
            }
            return;
        }
        resetCurrentItem();
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
        this.uploadingImageLocation = null;
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
        if (imageLocation != null) {
            int i = 0;
            while (true) {
                if (i >= this.imagesLocations.size()) {
                    break;
                } else if (this.imagesLocations.get(i) == imageLocation) {
                    this.imagesUploadProgress.set(i, Float.valueOf(f));
                    if (this.radialProgresses.get(i) != null) {
                        this.radialProgresses.get(i).setProgress(f, true);
                    }
                } else {
                    i++;
                }
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z) {
        this.createThumbFromParent = z;
    }

    public class AvatarImageView extends BackupImageView {
        public boolean isVideo;
        private final Paint placeholderPaint;
        private final int position;
        private RadialProgress2 radialProgress;
        private ValueAnimator radialProgressHideAnimator;
        private float radialProgressHideAnimatorStartValue;
        private final int radialProgressSize = AndroidUtilities.m34dp(64.0f);
        private long firstDrawTime = -1;

        public AvatarImageView(Context context, int i, Paint paint) {
            super(context);
            this.position = i;
            this.placeholderPaint = paint;
            setLayerNum(ProfileGalleryView.this.imagesLayerNum);
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.radialProgress != null) {
                int currentActionBarHeight = (ProfileGalleryView.this.parentActionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + C1006ActionBar.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp2(80.0f);
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i5 = this.radialProgressSize;
                int i6 = (i2 - currentActionBarHeight) - dp2;
                radialProgress2.setProgressRect((i - i5) / 2, ((i6 - i5) / 2) + currentActionBarHeight, (i + i5) / 2, currentActionBarHeight + ((i6 + i5) / 2));
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            ProfileGalleryView profileGalleryView;
            ProfileGalleryView profileGalleryView2;
            ProfileGalleryView profileGalleryView3;
            PinchToZoomHelper pinchToZoomHelper = ProfileGalleryView.this.pinchToZoomHelper;
            if (pinchToZoomHelper == null || !pinchToZoomHelper.isInOverlayMode()) {
                if (this.radialProgress != null) {
                    final int realPosition = ProfileGalleryView.this.getRealPosition(this.position);
                    if (ProfileGalleryView.this.hasActiveVideo) {
                        realPosition--;
                    }
                    Drawable drawable = getImageReceiver().getDrawable();
                    long j = 0;
                    if (!(realPosition >= ProfileGalleryView.this.imagesUploadProgress.size() || ProfileGalleryView.this.imagesUploadProgress.get(realPosition) == null ? !(drawable == null || (this.isVideo && (!(drawable instanceof AnimatedFileDrawable) || ((AnimatedFileDrawable) drawable).getDurationMs() <= 0))) : ((Float) ProfileGalleryView.this.imagesUploadProgress.get(realPosition)).floatValue() >= 1.0f)) {
                        if (this.firstDrawTime < 0) {
                            this.firstDrawTime = System.currentTimeMillis();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis() - this.firstDrawTime;
                            long j2 = this.isVideo ? 250L : 750L;
                            if (currentTimeMillis <= 250 + j2 && currentTimeMillis > j2) {
                                this.radialProgress.setOverrideAlpha(CubicBezierInterpolator.DEFAULT.getInterpolation(((float) (currentTimeMillis - j2)) / 250.0f));
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
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.radialProgressHideAnimator = ofFloat;
                        ofFloat.setStartDelay(j);
                        this.radialProgressHideAnimator.setDuration(this.radialProgressHideAnimatorStartValue * 250.0f);
                        this.radialProgressHideAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.radialProgressHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ProfileGalleryView.AvatarImageView.this.lambda$onDraw$0(valueAnimator);
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
                    if (ProfileGalleryView.this.roundTopRadius == 0 && ProfileGalleryView.this.roundBottomRadius == 0) {
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.placeholderPaint);
                    } else if (ProfileGalleryView.this.roundTopRadius == ProfileGalleryView.this.roundBottomRadius) {
                        ProfileGalleryView.this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                        canvas.drawRoundRect(ProfileGalleryView.this.rect, profileGalleryView3.roundTopRadius, ProfileGalleryView.this.roundTopRadius, this.placeholderPaint);
                    } else {
                        ProfileGalleryView.this.path.reset();
                        ProfileGalleryView.this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i = 0; i < 4; i++) {
                            ProfileGalleryView.this.radii[i] = profileGalleryView.roundTopRadius;
                            ProfileGalleryView.this.radii[i + 4] = profileGalleryView2.roundBottomRadius;
                        }
                        ProfileGalleryView profileGalleryView4 = ProfileGalleryView.this;
                        profileGalleryView4.path.addRoundRect(profileGalleryView4.rect, profileGalleryView4.radii, Path.Direction.CW);
                        canvas.drawPath(ProfileGalleryView.this.path, this.placeholderPaint);
                    }
                }
                super.onDraw(canvas);
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null && radialProgress2.getOverrideAlpha() > 0.0f) {
                    this.radialProgress.draw(canvas);
                }
            }
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            this.radialProgress.setOverrideAlpha(AndroidUtilities.lerp(this.radialProgressHideAnimatorStartValue, 0.0f, valueAnimator.getAnimatedFraction()));
        }

        @Override
        public void invalidate() {
            super.invalidate();
            if (ProfileGalleryView.this.invalidateWithParent) {
                ProfileGalleryView.this.invalidate();
            }
        }
    }

    public void setPinchToZoomHelper(PinchToZoomHelper pinchToZoomHelper) {
        this.pinchToZoomHelper = pinchToZoomHelper;
    }

    public void setInvalidateWithParent(boolean z) {
        this.invalidateWithParent = z;
    }

    public class TextureStubView extends View {
        public TextureStubView(ProfileGalleryView profileGalleryView, Context context) {
            super(context);
        }
    }
}
