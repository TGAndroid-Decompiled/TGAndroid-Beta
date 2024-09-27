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
import org.telegram.ui.Components.CircularViewPager;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;

public class ProfileGalleryView extends CircularViewPager implements NotificationCenter.NotificationCenterDelegate {
    private ViewPagerAdapter adapter;
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

    public class AvatarImageView extends BackupImageView {
        private long firstDrawTime;
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

        @Override
        public void onDraw(Canvas canvas) {
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
                        long j2 = this.firstDrawTime;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (j2 < 0) {
                            this.firstDrawTime = currentTimeMillis;
                        } else {
                            long j3 = currentTimeMillis - this.firstDrawTime;
                            long j4 = this.isVideo ? 250L : 750L;
                            if (j3 <= 250 + j4 && j3 > j4) {
                                this.radialProgress.setOverrideAlpha(CubicBezierInterpolator.DEFAULT.getInterpolation(((float) (j3 - j4)) / 250.0f));
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
                        canvas.drawRoundRect(ProfileGalleryView.this.rect, r0.roundTopRadius, ProfileGalleryView.this.roundTopRadius, this.placeholderPaint);
                    } else {
                        ProfileGalleryView.this.path.reset();
                        ProfileGalleryView.this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i = 0; i < 4; i++) {
                            ProfileGalleryView.this.radii[i] = r4.roundTopRadius;
                            ProfileGalleryView.this.radii[i + 4] = r4.roundBottomRadius;
                        }
                        ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
                        profileGalleryView.path.addRoundRect(profileGalleryView.rect, profileGalleryView.radii, Path.Direction.CW);
                        canvas.drawPath(ProfileGalleryView.this.path, this.placeholderPaint);
                    }
                }
                super.onDraw(canvas);
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 == null || radialProgress2.getOverrideAlpha() <= 0.0f) {
                    return;
                }
                this.radialProgress.draw(canvas);
            }
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.radialProgress != null) {
                int currentActionBarHeight = (ProfileGalleryView.this.parentActionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp2(80.0f);
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i5 = this.radialProgressSize;
                int i6 = (i2 - currentActionBarHeight) - dp2;
                radialProgress2.setProgressRect((i - i5) / 2, ((i6 - i5) / 2) + currentActionBarHeight, (i + i5) / 2, currentActionBarHeight + ((i6 + i5) / 2));
            }
        }
    }

    public interface Callback {
        void onDown(boolean z);

        void onPhotosLoaded();

        void onRelease();

        void onVideoSet();
    }

    public static class Item {
        private AvatarImageView imageView;
        boolean isActiveVideo;
        private View textureViewStubView;

        private Item() {
        }
    }

    public class TextureStubView extends View {
        public TextureStubView(Context context) {
            super(context);
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
        public int getCount() {
            return this.objects.size();
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

        @Override
        public int getItemPosition(Object obj) {
            int indexOf = this.objects.indexOf((Item) obj);
            if (indexOf == -1) {
                return -2;
            }
            return indexOf;
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
        public Item instantiateItem(ViewGroup viewGroup, int i) {
            ImageLocation imageLocation;
            boolean z;
            String str;
            String str2;
            AvatarImageView avatarImageView;
            VectorAvatarThumbDrawable vectorAvatarThumbDrawable;
            ImageLocation imageLocation2;
            ImageLocation imageLocation3;
            int intValue;
            String str3;
            int i2;
            String str4;
            String str5;
            Item item = (Item) this.objects.get(i);
            int realPosition = getRealPosition(i);
            if (ProfileGalleryView.this.hasActiveVideo && realPosition == 0) {
                item.isActiveVideo = true;
                if (item.textureViewStubView == null) {
                    item.textureViewStubView = new TextureStubView(this.context);
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
                item.imageView = new AvatarImageView(this.context, i, this.placeholderPaint);
                this.imageViews.set(i, item.imageView);
            }
            if (item.imageView.getParent() == null) {
                viewGroup.addView(item.imageView);
            }
            item.imageView.getImageReceiver().setAllowDecodeSingleFrame(true);
            int i3 = ProfileGalleryView.this.hasActiveVideo ? realPosition - 1 : realPosition;
            if (i3 == 0) {
                BackupImageView backupImageView = this.parentAvatarImageView;
                Drawable drawable = backupImageView == null ? null : backupImageView.getImageReceiver().getDrawable();
                if (drawable instanceof AnimatedFileDrawable) {
                    AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                    if (animatedFileDrawable.hasBitmap()) {
                        item.imageView.setImageDrawable(drawable);
                        animatedFileDrawable.addSecondParentView(item.imageView);
                        animatedFileDrawable.setInvalidateParentViewWithSecond(true);
                        z = false;
                    }
                }
                if (i3 >= 0 && i3 < ProfileGalleryView.this.videoLocations.size()) {
                    imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(i3);
                    item.imageView.isVideo = imageLocation != null;
                    z = ProfileGalleryView.this.vectorAvatars.get(i3) == null;
                    String str6 = (ProfileGalleryView.this.isProfileFragment && imageLocation != null && imageLocation.imageType == 2) ? "avatar" : null;
                    ImageLocation imageLocation4 = (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i3);
                    Bitmap bitmap = (this.parentAvatarImageView == null || !ProfileGalleryView.this.createThumbFromParent) ? null : this.parentAvatarImageView.getImageReceiver().getBitmap();
                    String str7 = "avatar_" + ProfileGalleryView.this.dialogId;
                    if (bitmap != null && ProfileGalleryView.this.vectorAvatars.get(i3) == null) {
                        item.imageView.setImageMedia((ImageLocation) ProfileGalleryView.this.videoLocations.get(i3), str6, (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i3), null, bitmap, ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i3)).intValue(), 1, str7);
                    } else if (ProfileGalleryView.this.uploadingImageLocation != null) {
                        item.imageView.setImageMedia((VectorAvatarThumbDrawable) ProfileGalleryView.this.vectorAvatars.get(i3), (ImageLocation) ProfileGalleryView.this.videoLocations.get(i3), str6, (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i3), null, ProfileGalleryView.this.uploadingImageLocation, null, null, ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i3)).intValue(), 1, str7);
                    } else {
                        str = (imageLocation4 == null || !(imageLocation4.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                        avatarImageView = item.imageView;
                        vectorAvatarThumbDrawable = (VectorAvatarThumbDrawable) ProfileGalleryView.this.vectorAvatars.get(i3);
                        imageLocation2 = (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i3);
                        imageLocation3 = (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i3);
                        intValue = ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i3)).intValue();
                        str3 = null;
                        i2 = 1;
                        str4 = null;
                        str5 = null;
                        str2 = str7;
                        avatarImageView.setImageMedia(vectorAvatarThumbDrawable, imageLocation, str4, imageLocation2, str5, imageLocation3, str, str3, intValue, i2, str2);
                    }
                }
                z = false;
            } else {
                if (i3 >= 0 && i3 < ProfileGalleryView.this.videoLocations.size()) {
                    imageLocation = (ImageLocation) ProfileGalleryView.this.videoLocations.get(i3);
                    item.imageView.isVideo = imageLocation != null;
                    z = ProfileGalleryView.this.vectorAvatars.get(i3) == null;
                    ImageLocation imageLocation5 = (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i3);
                    str = (imageLocation5 == null || !(imageLocation5.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                    str2 = "avatar_" + ProfileGalleryView.this.dialogId;
                    avatarImageView = item.imageView;
                    vectorAvatarThumbDrawable = (VectorAvatarThumbDrawable) ProfileGalleryView.this.vectorAvatars.get(i3);
                    imageLocation2 = (ImageLocation) ProfileGalleryView.this.imagesLocations.get(i3);
                    imageLocation3 = (ImageLocation) ProfileGalleryView.this.thumbsLocations.get(i3);
                    intValue = ((Integer) ProfileGalleryView.this.imagesLocationsSizes.get(i3)).intValue();
                    str3 = null;
                    i2 = 1;
                    str4 = null;
                    str5 = null;
                    avatarImageView.setImageMedia(vectorAvatarThumbDrawable, imageLocation, str4, imageLocation2, str5, imageLocation3, str, str3, intValue, i2, str2);
                }
                z = false;
            }
            if ((i3 < 0 || i3 >= ProfileGalleryView.this.imagesUploadProgress.size() || ProfileGalleryView.this.imagesUploadProgress.get(i3) == null) ? z : true) {
                item.imageView.radialProgress = (RadialProgress2) ProfileGalleryView.this.radialProgresses.get(i3);
                if (item.imageView.radialProgress == null) {
                    item.imageView.radialProgress = new RadialProgress2(item.imageView);
                    item.imageView.radialProgress.setOverrideAlpha(0.0f);
                    item.imageView.radialProgress.setIcon(10, false, false);
                    item.imageView.radialProgress.setColors(1107296256, 1107296256, -1, -1);
                    ProfileGalleryView.this.radialProgresses.append(i3, item.imageView.radialProgress);
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
                public void didSetImageBitmap(int i4, String str8, Drawable drawable2) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i4, str8, drawable2);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver) {
                    ProfileGalleryView.this.callback.onVideoSet();
                }
            });
            item.imageView.getImageReceiver().setCrossfadeAlpha((byte) 2);
            item.imageView.setRoundRadius(ProfileGalleryView.this.roundTopRadius, ProfileGalleryView.this.roundTopRadius, ProfileGalleryView.this.roundBottomRadius, ProfileGalleryView.this.roundBottomRadius);
            item.imageView.setTag(Integer.valueOf(realPosition));
            return item;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            Item item = (Item) obj;
            return item.isActiveVideo ? view == item.textureViewStubView : view == item.imageView;
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
            int max = Math.max(ProfileGalleryView.this.dialogPhotos == null ? 0 : ProfileGalleryView.this.dialogPhotos.getCount(), size) + (getExtraCount() * 2);
            for (int i2 = 0; i2 < max; i2++) {
                this.objects.add(new Item());
                this.imageViews.add(null);
            }
            super.notifyDataSetChanged();
        }
    }

    public ProfileGalleryView(Context context, long j, ActionBar actionBar, RecyclerListView recyclerListView, ProfileActivity.AvatarImageView avatarImageView, int i, Callback callback) {
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
        int i2 = this.customAvatarIndex;
        float f2 = 0.0f;
        if (i2 >= 0 || this.fallbackPhotoIndex >= 0) {
            if (i2 < 0) {
                i2 = this.fallbackPhotoIndex;
            }
            int realPosition = this.adapter.getRealPosition(i);
            if (this.hasActiveVideo) {
                realPosition--;
            }
            float f3 = realPosition == i2 ? 1.0f - f : (getRealCount() <= 0 || (realPosition + (-1)) % getRealCount() != i2) ? (getRealCount() <= 0 || (realPosition + 1) % getRealCount() != i2) ? 0.0f : (1.0f - f) + 1.0f : (1.0f - f) - 1.0f;
            if (f3 > 1.0f) {
                f3 = 2.0f - f3;
            }
            f2 = Utilities.clamp(f3, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f2);
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

    public void commitMoveToBegin() {
        this.adapter.notifyDataSetChanged();
        resetCurrentItem();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList arrayList2;
        Object obj;
        ArrayList arrayList3;
        TLRPC.Photo photo;
        if (i != NotificationCenter.dialogPhotosUpdate) {
            if (i == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                while (r5 < this.thumbsFileNames.size()) {
                    String str2 = (String) this.videoFileNames.get(r5);
                    if (str2 == null) {
                        str2 = (String) this.thumbsFileNames.get(r5);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) this.radialProgresses.get(r5);
                        if (radialProgress2 != null) {
                            radialProgress2.setProgress(1.0f, true);
                        }
                        invalidate();
                    }
                    r5++;
                }
                return;
            }
            if (i != NotificationCenter.fileLoadProgressChanged) {
                if (i == NotificationCenter.reloadDialogPhotos && this.settingMainPhoto == 0 && (dialogPhotos = this.dialogPhotos) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos2 = this.dialogPhotos;
                    int currentItem = getCurrentItem();
                    ViewPagerAdapter viewPagerAdapter = this.adapter;
                    dialogPhotos2.loadAfter(currentItem - (viewPagerAdapter != null ? viewPagerAdapter.getExtraCount() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            while (r5 < this.thumbsFileNames.size()) {
                String str4 = (String) this.videoFileNames.get(r5);
                if (str4 == null) {
                    str4 = (String) this.thumbsFileNames.get(r5);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) this.radialProgresses.get(r5);
                    if (radialProgress22 != null) {
                        radialProgress22.setProgress(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
                    }
                    invalidate();
                }
                r5++;
            }
            return;
        }
        MessagesController.DialogPhotos dialogPhotos3 = (MessagesController.DialogPhotos) objArr[0];
        if (this.dialogPhotos == dialogPhotos3) {
            ArrayList arrayList4 = new ArrayList(dialogPhotos3.photos);
            if (arrayList4.isEmpty() && dialogPhotos3.fromCache) {
                return;
            }
            this.customAvatarIndex = -1;
            this.fallbackPhotoIndex = -1;
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
            if (userFull != null && (photo = userFull.personal_photo) != null) {
                arrayList4.add(0, photo);
                this.customAvatarIndex = 0;
            }
            if (user != null && user.self && UserObject.hasFallbackPhoto(userFull)) {
                arrayList4.add(userFull.fallback_photo);
                this.fallbackPhotoIndex = arrayList4.size() - 1;
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
            Object obj2 = null;
            if (DialogObject.isChatDialog(this.dialogId)) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                imageLocation = ImageLocation.getForUserOrChat(chat, 0);
                if (imageLocation != null) {
                    this.imagesLocations.add(imageLocation);
                    this.thumbsLocations.add(ImageLocation.getForUserOrChat(chat, 1));
                    this.vectorAvatars.add(null);
                    this.thumbsFileNames.add(null);
                    TLRPC.ChatFull chatFull = this.chatInfo;
                    if (chatFull == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                        this.photos.add(null);
                        this.videoFileNames.add(null);
                        arrayList3 = this.videoLocations;
                    } else {
                        this.photos.add(this.chatInfo.chat_photo);
                        if (this.chatInfo.chat_photo.video_sizes.isEmpty()) {
                            this.videoLocations.add(null);
                            arrayList3 = this.videoFileNames;
                        } else {
                            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.chatInfo.chat_photo.video_sizes, 1000);
                            this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, this.chatInfo.chat_photo));
                            this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                            this.imagesLocationsSizes.add(-1);
                            this.imagesUploadProgress.add(null);
                        }
                    }
                    arrayList3.add(null);
                    this.imagesLocationsSizes.add(-1);
                    this.imagesUploadProgress.add(null);
                }
            } else {
                imageLocation = null;
            }
            int i3 = 0;
            while (i3 < arrayList4.size()) {
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList4.get(i3);
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList = photo2.sizes) == null) {
                    imageLocation2 = imageLocation;
                    this.photos.add(obj2);
                    this.imagesLocations.add(obj2);
                    this.thumbsLocations.add(obj2);
                    this.vectorAvatars.add(obj2);
                    this.thumbsFileNames.add(obj2);
                    this.videoLocations.add(obj2);
                    this.videoFileNames.add(obj2);
                    this.imagesLocationsSizes.add(-1);
                    this.imagesUploadProgress.add(obj2);
                } else {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 50);
                    int size = photo2.sizes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = photo2.sizes.get(i4);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            closestPhotoSizeWithSize = photoSize;
                            break;
                        }
                        i4++;
                    }
                    if (imageLocation != null) {
                        int size2 = photo2.sizes.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i5).location;
                            if (fileLocation != null) {
                                int i6 = fileLocation.local_id;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                                if (i6 == tL_fileLocationToBeDeprecated.local_id) {
                                    imageLocation2 = imageLocation;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        this.photos.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            this.videoLocations.set(0, ImageLocation.getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000), photo2));
                                        }
                                        obj2 = null;
                                    } else {
                                        i5++;
                                        imageLocation = imageLocation2;
                                    }
                                }
                            }
                            imageLocation2 = imageLocation;
                            i5++;
                            imageLocation = imageLocation2;
                        }
                    }
                    imageLocation2 = imageLocation;
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                    if (closestPhotoSizeWithSize2 != null) {
                        int i7 = photo2.dc_id;
                        if (i7 != 0) {
                            TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                            fileLocation2.dc_id = i7;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                        if (forPhoto != null) {
                            ImageLocation imageLocation3 = this.prevImageLocation;
                            if (imageLocation3 == null || imageLocation3.photoId != forPhoto.photoId || this.isProfileFragment || this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                this.imagesLocations.add(forPhoto);
                                this.thumbsFileNames.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? closestPhotoSizeWithSize2 : closestPhotoSizeWithSize));
                                this.thumbsLocations.add(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    obj2 = null;
                                    this.videoLocations.add(null);
                                    this.videoFileNames.add(null);
                                    arrayList2 = this.vectorAvatars;
                                } else {
                                    TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                    TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                    if (vectorMarkupVideoSize != null) {
                                        this.vectorAvatars.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize, user != null && user.premium, 2));
                                        obj2 = null;
                                        this.videoLocations.add(null);
                                        arrayList2 = this.videoFileNames;
                                    } else {
                                        obj2 = null;
                                        this.vectorAvatars.add(null);
                                        this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize2, photo2));
                                        this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize2));
                                        this.photos.add(photo2);
                                        this.imagesLocationsSizes.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                        this.imagesUploadProgress.add(obj2);
                                    }
                                }
                                arrayList2.add(obj2);
                                this.photos.add(photo2);
                                this.imagesLocationsSizes.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                this.imagesUploadProgress.add(obj2);
                            } else {
                                this.thumbsFileNames.add(null);
                                this.imagesLocations.add(this.prevImageLocation);
                                ImageLocation imageLocation4 = this.prevThumbLocation;
                                if (imageLocation4 == null) {
                                    imageLocation4 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo2);
                                }
                                this.thumbsLocations.add(imageLocation4);
                                if (photo2.video_sizes.isEmpty()) {
                                    this.vectorAvatars.add(this.prevVectorAvatarThumbDrawable);
                                } else {
                                    TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                    TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                    if (vectorMarkupVideoSize2 != null) {
                                        this.vectorAvatars.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize2, user != null && user.premium, 2));
                                    } else {
                                        this.vectorAvatars.add(null);
                                        this.videoLocations.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                        this.videoFileNames.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                        obj = null;
                                        this.photos.add(obj);
                                        this.imagesLocationsSizes.add(-1);
                                        this.imagesUploadProgress.add(obj);
                                        obj2 = obj;
                                    }
                                }
                                obj = null;
                                this.videoLocations.add(null);
                                this.videoFileNames.add(null);
                                this.photos.add(obj);
                                this.imagesLocationsSizes.add(-1);
                                this.imagesUploadProgress.add(obj);
                                obj2 = obj;
                            }
                        }
                    }
                    obj2 = null;
                }
                i3++;
                imageLocation = imageLocation2;
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
            if (this.fallbackPhotoIndex < 0 && this.customAvatarIndex < 0) {
                checkCustomAvatar(0, 0.0f);
            }
            this.forceResetPosition = false;
            Callback callback = this.callback;
            if (callback != null) {
                callback.onPhotosLoaded();
            }
            ImageLocation imageLocation5 = this.currentUploadingImageLocation;
            if (imageLocation5 != null) {
                addUploadingImage(imageLocation5, this.curreantUploadingThumbLocation);
            }
        }
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

    public void finishSettingMainPhoto() {
        this.settingMainPhoto--;
    }

    public float getCurrentItemProgress() {
        AnimatedFileDrawable animation;
        BackupImageView currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.getCurrentProgress();
    }

    public BackupImageView getCurrentItemView() {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter == null || viewPagerAdapter.objects.isEmpty()) {
            return null;
        }
        return ((Item) this.adapter.objects.get(getCurrentItem())).imageView;
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
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (ImageLocation) this.videoLocations.get(i2);
                        }
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

    public long getDialogId() {
        return this.dialogId;
    }

    public ImageLocation getImageLocation(int i) {
        if (i < 0 || i >= this.imagesLocations.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.videoLocations.get(i);
        return imageLocation != null ? imageLocation : (ImageLocation) this.imagesLocations.get(i);
    }

    public TLRPC.Photo getPhoto(int i) {
        if (i < 0 || i >= this.photos.size()) {
            return null;
        }
        return (TLRPC.Photo) this.photos.get(i);
    }

    public int getRealCount() {
        int size = this.photos.size();
        return this.hasActiveVideo ? size + 1 : size;
    }

    public ImageLocation getRealImageLocation(int i) {
        if (i < 0 || i >= this.imagesLocations.size()) {
            return null;
        }
        return (ImageLocation) this.imagesLocations.get(i);
    }

    public int getRealPosition() {
        return this.adapter.getRealPosition(getCurrentItem());
    }

    public int getRealPosition(int i) {
        return this.adapter.getRealPosition(i);
    }

    public boolean hasImages() {
        return !this.imagesLocations.isEmpty();
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

    public boolean isLoadingCurrentVideo() {
        BackupImageView currentItemView;
        if (this.videoLocations.get(this.hasActiveVideo ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        AnimatedFileDrawable animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.hasBitmap();
    }

    public void onDestroy() {
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

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ProfileGalleryView.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void removeUploadingImage(ImageLocation imageLocation) {
        this.uploadingImageLocation = imageLocation;
        this.currentUploadingImageLocation = null;
        this.curreantUploadingThumbLocation = null;
    }

    public void replaceFirstPhoto(TLRPC.Photo photo, TLRPC.Photo photo2) {
        int indexOf;
        if (!this.photos.isEmpty() && (indexOf = this.photos.indexOf(photo)) >= 0) {
            this.photos.set(indexOf, photo2);
        }
    }

    public void resetCurrentItem() {
        setCurrentItem(this.adapter.getExtraCount(), false);
    }

    public void scrollToLastItem() {
        int i = 0;
        while (getRealPosition(i) != getRealCount() - 1) {
            i++;
        }
        setCurrentItem(i, true);
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

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.chatInfo = chatFull;
        if (this.photos.isEmpty() || this.photos.get(0) != null || this.chatInfo == null || this.imagesLocations.get(0) == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) this.imagesLocations.get(0)).location, this.chatInfo.chat_photo)) {
            return;
        }
        this.photos.set(0, this.chatInfo.chat_photo);
        if (this.chatInfo.chat_photo.video_sizes.isEmpty()) {
            this.videoLocations.set(0, null);
            this.videoFileNames.add(0, null);
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.chatInfo.chat_photo.video_sizes, 1000);
            this.videoLocations.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.chatInfo.chat_photo));
            this.videoFileNames.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
            this.callback.onPhotosLoaded();
        }
        this.imagesUploadProgress.set(0, null);
        this.adapter.notifyDataSetChanged();
    }

    public void setCreateThumbFromParent(boolean z) {
        this.createThumbFromParent = z;
    }

    protected void setCustomAvatarProgress(float f) {
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

    public void setHasActiveVideo(boolean z) {
        this.hasActiveVideo = z;
    }

    public void setImagesLayerNum(int i) {
        this.imagesLayerNum = i;
    }

    public void setInvalidateWithParent(boolean z) {
        this.invalidateWithParent = z;
    }

    public void setParentAvatarImage(BackupImageView backupImageView) {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter != null) {
            viewPagerAdapter.parentAvatarImageView = backupImageView;
        }
    }

    public void setPinchToZoomHelper(PinchToZoomHelper pinchToZoomHelper) {
        this.pinchToZoomHelper = pinchToZoomHelper;
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

    public void setUploadProgress(ImageLocation imageLocation, float f) {
        if (imageLocation == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.imagesLocations.size()) {
                break;
            }
            if (this.imagesLocations.get(i) == imageLocation) {
                this.imagesUploadProgress.set(i, Float.valueOf(f));
                if (this.radialProgresses.get(i) != null) {
                    ((RadialProgress2) this.radialProgresses.get(i)).setProgress(f, true);
                }
            } else {
                i++;
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).invalidate();
        }
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
}
