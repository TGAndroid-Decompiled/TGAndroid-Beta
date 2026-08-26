package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.AvatarPreviewPagerIndicator;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;

public class ProfileGalleryView extends CircularViewPager implements NotificationCenter.NotificationCenterDelegate {
    public final ViewPagerAdapter adapter;
    public ProfileGalleryBlurView blurView;
    public final Callback callback;
    public TLRPC.ChatFull chatInfo;
    public boolean createThumbFromParent;
    public ImageLocation curreantUploadingThumbLocation;
    public final int currentAccount;
    public ImageLocation currentUploadingImageLocation;
    public int customAvatarIndex;
    public long dialogId;
    public MessagesController.DialogPhotos dialogPhotos;
    public final PointF downPoint;
    public int fallbackPhotoIndex;
    public boolean forceResetPosition;
    public boolean hasActiveVideo;
    public int imagesLayerNum;
    public final ArrayList imagesLocations;
    public final ArrayList imagesLocationsSizes;
    public final ArrayList imagesUploadProgress;
    public boolean invalidateWithParent;
    public boolean isDownReleased;
    public final boolean isProfileFragment;
    public boolean isScrollingListView;
    public boolean isSwipingViewPager;
    public final ActionBar parentActionBar;
    public final RecyclerListView parentListView;
    public final Path path;
    public final ArrayList photos;
    public PinchToZoomHelper pinchToZoomHelper;
    public ImageLocation prevImageLocation;
    public ImageLocation prevThumbLocation;
    public VectorAvatarThumbDrawable prevVectorAvatarThumbDrawable;
    public final SparseArray radialProgresses;
    public final float[] radii;
    public final RectF rect;
    public int roundBottomRadius;
    public int roundTopRadius;
    public boolean scrolledByUser;
    public int selectedPage;
    public int settingMainPhoto;
    public final ArrayList thumbsFileNames;
    public final ArrayList thumbsLocations;
    public final int touchSlop;
    public ImageLocation uploadingImageLocation;
    public final ArrayList vectorAvatars;
    public final ArrayList videoFileNames;
    public final ArrayList videoLocations;

    public interface Callback {
        void onDown(boolean z);

        void onPhotosLoaded();

        void onRelease();

        void onVideoSet();
    }

    public final class Item {
        public AvatarImageView imageView;
        public boolean isActiveVideo;
        public TextureStubView textureViewStubView;
    }

    public final class TextureStubView extends View {
    }

    public final class ViewPagerAdapter extends CircularViewPager.Adapter {
        public final Context context;
        public BackupImageView parentAvatarImageView;
        public final Paint placeholderPaint;
        public final ArrayList objects = new ArrayList();
        public final ArrayList imageViews = new ArrayList();

        public ViewPagerAdapter(Context context, ProfileActivity.AnonymousClass21 anonymousClass21) {
            this.context = context;
            this.parentAvatarImageView = anonymousClass21;
            Paint paint = new Paint(1);
            this.placeholderPaint = paint;
            paint.setColor(-16777216);
        }

        @Override
        public final void destroyItem(ViewPager viewPager, Object obj) {
            Item item = (Item) obj;
            View view = item.textureViewStubView;
            if (view != null) {
                viewPager.removeView(view);
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
            viewPager.removeView(avatarImageView);
            avatarImageView.getImageReceiver().cancelLoadImage();
        }

        @Override
        public final int getCount() {
            return this.objects.size();
        }

        @Override
        public final int getExtraCount() {
            ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
            int size = profileGalleryView.imagesLocations.size();
            if (profileGalleryView.hasActiveVideo) {
                size++;
            }
            if (size >= 2) {
                return profileGalleryView.getOffscreenPageLimit();
            }
            return 0;
        }

        @Override
        public final int getItemPosition(Object obj) {
            int iIndexOf = this.objects.indexOf((Item) obj);
            if (iIndexOf == -1) {
                return -2;
            }
            return iIndexOf;
        }

        @Override
        public final CharSequence getPageTitle(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(getRealPosition(i) + 1);
            sb.append("/");
            MessagesController.DialogPhotos dialogPhotos = ProfileGalleryView.this.dialogPhotos;
            sb.append(dialogPhotos == null ? 0 : dialogPhotos.getCount());
            return sb.toString();
        }

        @Override
        public final Object instantiateItem(ViewPager viewPager, int i) {
            int i2;
            boolean z;
            Item item = (Item) this.objects.get(i);
            int realPosition = getRealPosition(i);
            ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
            boolean z2 = profileGalleryView.hasActiveVideo;
            Context context = this.context;
            if (z2 && realPosition == 0) {
                item.isActiveVideo = true;
                if (item.textureViewStubView == null) {
                    item.textureViewStubView = new TextureStubView(context);
                }
                if (item.textureViewStubView.getParent() == null) {
                    viewPager.addView(item.textureViewStubView);
                }
                return item;
            }
            item.isActiveVideo = false;
            TextureStubView textureStubView = item.textureViewStubView;
            if (textureStubView != null && textureStubView.getParent() != null) {
                viewPager.removeView(item.textureViewStubView);
            }
            if (item.imageView == null) {
                AvatarImageView avatarImageView = profileGalleryView.new AvatarImageView(context, i, this.placeholderPaint);
                item.imageView = avatarImageView;
                this.imageViews.set(i, avatarImageView);
            }
            if (item.imageView.getParent() == null) {
                viewPager.addView(item.imageView);
            }
            item.imageView.getImageReceiver().setAllowDecodeSingleFrame(true);
            int i3 = profileGalleryView.hasActiveVideo ? realPosition - 1 : realPosition;
            ArrayList arrayList = profileGalleryView.imagesLocationsSizes;
            ArrayList arrayList2 = profileGalleryView.imagesLocations;
            ArrayList arrayList3 = profileGalleryView.thumbsLocations;
            ArrayList arrayList4 = profileGalleryView.vectorAvatars;
            ArrayList arrayList5 = profileGalleryView.videoLocations;
            if (i3 == 0) {
                BackupImageView backupImageView = this.parentAvatarImageView;
                Drawable drawable = backupImageView == null ? null : backupImageView.getImageReceiver().getDrawable();
                if (drawable instanceof AnimatedFileDrawable) {
                    AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                    if (animatedFileDrawable.hasBitmap()) {
                        item.imageView.setImageDrawable(drawable);
                        animatedFileDrawable.addSecondParentView(item.imageView);
                        animatedFileDrawable.invalidateParentViewWithSecond = true;
                    } else if (i3 < 0 && i3 < arrayList5.size()) {
                        ImageLocation imageLocation = (ImageLocation) arrayList5.get(i3);
                        item.imageView.isVideo = imageLocation != null;
                        z = arrayList4.get(i3) == null;
                        String str = (profileGalleryView.isProfileFragment && imageLocation != null && imageLocation.imageType == 2) ? "avatar" : null;
                        ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i3);
                        BackupImageView backupImageView2 = this.parentAvatarImageView;
                        i2 = realPosition;
                        Bitmap bitmap = (backupImageView2 == null || !profileGalleryView.createThumbFromParent) ? null : backupImageView2.getImageReceiver().getBitmap();
                        String str2 = "avatar_" + profileGalleryView.dialogId;
                        if (bitmap != null && arrayList4.get(i3) == null) {
                            AvatarImageView avatarImageView2 = item.imageView;
                            ImageLocation imageLocation3 = (ImageLocation) arrayList5.get(i3);
                            ImageLocation imageLocation4 = (ImageLocation) arrayList2.get(i3);
                            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                            avatarImageView2.getClass();
                            avatarImageView2.imageReceiver.setImage(imageLocation3, str, imageLocation4, null, null, null, new BitmapDrawable((Resources) null, bitmap), iIntValue, null, str2, 1);
                            avatarImageView2.onNewImageSet();
                        } else if (profileGalleryView.uploadingImageLocation != null) {
                            AvatarImageView avatarImageView3 = item.imageView;
                            VectorAvatarThumbDrawable vectorAvatarThumbDrawable = (VectorAvatarThumbDrawable) arrayList4.get(i3);
                            ImageLocation imageLocation5 = (ImageLocation) arrayList5.get(i3);
                            ImageLocation imageLocation6 = (ImageLocation) arrayList2.get(i3);
                            ImageLocation imageLocation7 = profileGalleryView.uploadingImageLocation;
                            int iIntValue2 = ((Integer) arrayList.get(i3)).intValue();
                            if (vectorAvatarThumbDrawable != null) {
                                avatarImageView3.imageReceiver.setImageBitmap(vectorAvatarThumbDrawable);
                            } else {
                                avatarImageView3.imageReceiver.setImage(imageLocation5, str, imageLocation6, null, imageLocation7, null, null, iIntValue2, null, str2, 1);
                            }
                            avatarImageView3.onNewImageSet();
                        } else {
                            String str3 = (imageLocation2 == null || !(imageLocation2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                            AvatarImageView avatarImageView4 = item.imageView;
                            VectorAvatarThumbDrawable vectorAvatarThumbDrawable2 = (VectorAvatarThumbDrawable) arrayList4.get(i3);
                            ImageLocation imageLocation8 = (ImageLocation) arrayList2.get(i3);
                            ImageLocation imageLocation9 = (ImageLocation) arrayList3.get(i3);
                            int iIntValue3 = ((Integer) arrayList.get(i3)).intValue();
                            if (vectorAvatarThumbDrawable2 != null) {
                                avatarImageView4.imageReceiver.setImageBitmap(vectorAvatarThumbDrawable2);
                            } else {
                                avatarImageView4.imageReceiver.setImage(imageLocation, null, imageLocation8, null, imageLocation9, str3, null, iIntValue3, null, str2, 1);
                            }
                            avatarImageView4.onNewImageSet();
                        }
                    }
                    i2 = realPosition;
                    z = false;
                } else {
                    if (i3 < 0) {
                    }
                    i2 = realPosition;
                    z = false;
                }
            } else {
                i2 = realPosition;
                if (i3 < 0 || i3 >= arrayList5.size()) {
                    z = false;
                } else {
                    ImageLocation imageLocation10 = (ImageLocation) arrayList5.get(i3);
                    item.imageView.isVideo = imageLocation10 != null;
                    z = arrayList4.get(i3) == null;
                    ImageLocation imageLocation11 = (ImageLocation) arrayList3.get(i3);
                    String str4 = (imageLocation11 == null || !(imageLocation11.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                    String str5 = "avatar_" + profileGalleryView.dialogId;
                    AvatarImageView avatarImageView5 = item.imageView;
                    VectorAvatarThumbDrawable vectorAvatarThumbDrawable3 = (VectorAvatarThumbDrawable) arrayList4.get(i3);
                    ImageLocation imageLocation12 = (ImageLocation) arrayList2.get(i3);
                    ImageLocation imageLocation13 = (ImageLocation) arrayList3.get(i3);
                    int iIntValue4 = ((Integer) arrayList.get(i3)).intValue();
                    if (vectorAvatarThumbDrawable3 != null) {
                        avatarImageView5.imageReceiver.setImageBitmap(vectorAvatarThumbDrawable3);
                    } else {
                        avatarImageView5.imageReceiver.setImage(imageLocation10, null, imageLocation12, null, imageLocation13, str4, null, iIntValue4, null, str5, 1);
                    }
                    avatarImageView5.onNewImageSet();
                }
            }
            if (i3 >= 0) {
                ArrayList arrayList6 = profileGalleryView.imagesUploadProgress;
                if (i3 < arrayList6.size() && arrayList6.get(i3) != null) {
                    z = true;
                }
            }
            if (z) {
                AvatarImageView avatarImageView6 = item.imageView;
                SparseArray sparseArray = profileGalleryView.radialProgresses;
                avatarImageView6.radialProgress = (RadialProgress2) sparseArray.get(i3);
                AvatarImageView avatarImageView7 = item.imageView;
                if (avatarImageView7.radialProgress == null) {
                    avatarImageView7.radialProgress = new RadialProgress2(null, avatarImageView7);
                    RadialProgress2 radialProgress2 = item.imageView.radialProgress;
                    radialProgress2.overrideAlpha = 0.0f;
                    radialProgress2.setIcon(10, false, false);
                    item.imageView.radialProgress.setColors(1107296256, 1107296256, -1, -1);
                    sparseArray.append(i3, item.imageView.radialProgress);
                }
                if (profileGalleryView.invalidateWithParent) {
                    profileGalleryView.invalidate();
                } else {
                    profileGalleryView.postInvalidateOnAnimation();
                }
            }
            item.imageView.getImageReceiver().setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public final void didSetImage(ImageReceiver imageReceiver, boolean z3, boolean z4, boolean z5) {
                }

                @Override
                public final void didSetImageBitmap(int i4, String str6, Drawable drawable2) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i4, str6, drawable2);
                }

                @Override
                public final void onAnimationReady(ImageReceiver imageReceiver) {
                    Callback callback = ProfileGalleryView.this.callback;
                    if (callback != null) {
                        callback.onVideoSet();
                    }
                }
            });
            item.imageView.getImageReceiver().setCrossfadeAlpha((byte) 2);
            AvatarImageView avatarImageView8 = item.imageView;
            int i4 = profileGalleryView.roundTopRadius;
            int i5 = profileGalleryView.roundBottomRadius;
            avatarImageView8.imageReceiver.setRoundRadius(i4, i4, i5, i5);
            if (avatarImageView8.blurAllowed) {
                avatarImageView8.blurImageReceiver.setRoundRadius(i4, i4, i5, i5);
            }
            avatarImageView8.invalidate();
            item.imageView.setTag(Integer.valueOf(i2));
            return item;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            Item item = (Item) obj;
            if (item.isActiveVideo) {
                return view == item.textureViewStubView;
            }
            return view == item.imageView;
        }

        @Override
        public final void notifyDataSetChanged() {
            ArrayList arrayList;
            int i = 0;
            while (true) {
                arrayList = this.imageViews;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((BackupImageView) arrayList.get(i)).getImageReceiver().cancelLoadImage();
                }
                i++;
            }
            ArrayList arrayList2 = this.objects;
            arrayList2.clear();
            arrayList.clear();
            ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
            int size = profileGalleryView.imagesLocations.size();
            if (profileGalleryView.hasActiveVideo) {
                size++;
            }
            MessagesController.DialogPhotos dialogPhotos = profileGalleryView.dialogPhotos;
            int extraCount = (getExtraCount() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
            for (int i2 = 0; i2 < extraCount; i2++) {
                arrayList2.add(new Item());
                arrayList.add(null);
            }
            super.notifyDataSetChanged();
        }
    }

    public ProfileGalleryView(Activity activity, ActionBar actionBar, RecyclerListView recyclerListView, AvatarPreviewPagerIndicator avatarPreviewPagerIndicator) {
        super(activity);
        this.downPoint = new PointF();
        this.isScrollingListView = true;
        this.isSwipingViewPager = true;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
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
        ConnectionsManager.generateClassGuid();
        this.parentActionBar = actionBar;
        this.touchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.callback = avatarPreviewPagerIndicator;
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override
            public final void onPageScrolled(float f, int i2, int i3) {
                ImageLocation imageLocation;
                ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
                profileGalleryView.checkCustomAvatar(f, i2);
                if (i3 == 0) {
                    int realPosition = profileGalleryView.adapter.getRealPosition(i2);
                    if (profileGalleryView.hasActiveVideo) {
                        realPosition--;
                    }
                    profileGalleryView.getCurrentItemView();
                    int childCount = profileGalleryView.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = profileGalleryView.getChildAt(i4);
                        if (childAt instanceof BackupImageView) {
                            ViewPagerAdapter viewPagerAdapter = profileGalleryView.adapter;
                            int realPosition2 = viewPagerAdapter.getRealPosition(viewPagerAdapter.imageViews.indexOf(childAt));
                            if (profileGalleryView.hasActiveVideo) {
                                realPosition2--;
                            }
                            ImageReceiver imageReceiver = ((BackupImageView) childAt).getImageReceiver();
                            boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                            if (realPosition2 >= 0 && realPosition2 < profileGalleryView.videoLocations.size()) {
                                if (realPosition2 == realPosition) {
                                    if (!allowStartAnimation) {
                                        imageReceiver.setAllowStartAnimation(true);
                                        imageReceiver.startAnimation();
                                    }
                                    ImageLocation imageLocation2 = (ImageLocation) profileGalleryView.videoLocations.get(realPosition2);
                                    if (imageLocation2 != null) {
                                        FileLoader.getInstance(profileGalleryView.currentAccount).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                                    }
                                } else if (allowStartAnimation) {
                                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                                    if (animation != null && (imageLocation = (ImageLocation) profileGalleryView.videoLocations.get(realPosition2)) != null) {
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
            public final void onPageSelected(int i2) {
                ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
                int i3 = profileGalleryView.selectedPage;
                boolean z = i2 >= i3;
                if (i2 != i3) {
                    profileGalleryView.selectedPage = i2;
                }
                MessagesController.DialogPhotos dialogPhotos = profileGalleryView.dialogPhotos;
                if (dialogPhotos != null) {
                    ViewPagerAdapter viewPagerAdapter = profileGalleryView.adapter;
                    dialogPhotos.loadAfter(i2 - (viewPagerAdapter != null ? viewPagerAdapter.getExtraCount() : 0), z);
                }
            }
        });
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext(), null);
        this.adapter = viewPagerAdapter;
        setAdapter((CircularViewPager.Adapter) viewPagerAdapter);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.dialogPhotos = null;
    }

    public final void addUploadingImage(ImageLocation imageLocation, ImageLocation imageLocation2) {
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
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        viewPagerAdapter.notifyDataSetChanged();
        setCurrentItem(viewPagerAdapter.getExtraCount(), false);
        this.currentUploadingImageLocation = imageLocation;
        this.curreantUploadingThumbLocation = imageLocation2;
    }

    public final void checkCustomAvatar(float f, int i) {
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        ViewPagerAdapter viewPagerAdapter;
        ImageLocation forUserOrChat;
        int i3;
        boolean z;
        ?? r4;
        ArrayList arrayList;
        ImageLocation imageLocation;
        int i4;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList3;
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        TLRPC.Photo photo;
        int i6 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList4 = this.thumbsFileNames;
        ArrayList arrayList5 = this.videoFileNames;
        ViewPagerAdapter viewPagerAdapter2 = this.adapter;
        if (i != i6) {
            int i7 = NotificationCenter.fileLoaded;
            SparseArray sparseArray = this.radialProgresses;
            if (i == i7) {
                String str = (String) objArr[0];
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    String str2 = (String) arrayList5.get(i8);
                    if (str2 == null) {
                        str2 = (String) arrayList4.get(i8);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i8);
                        if (radialProgress2 != null) {
                            radialProgress2.setProgress(1.0f, true);
                        }
                        invalidate();
                    }
                }
                return;
            }
            if (i != NotificationCenter.fileLoadProgressChanged) {
                if (i == NotificationCenter.reloadDialogPhotos && this.settingMainPhoto == 0 && (dialogPhotos = this.dialogPhotos) != null) {
                    dialogPhotos.reset();
                    this.dialogPhotos.loadAfter(getCurrentItem() - (viewPagerAdapter2 != null ? viewPagerAdapter2.getExtraCount() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                String str4 = (String) arrayList5.get(i9);
                if (str4 == null) {
                    str4 = (String) arrayList4.get(i9);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress3 = (RadialProgress2) sparseArray.get(i9);
                    if (radialProgress3 != null) {
                        radialProgress3.setProgress(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
                    }
                    invalidate();
                }
            }
            return;
        }
        MessagesController.DialogPhotos dialogPhotos2 = (MessagesController.DialogPhotos) objArr[0];
        if (this.dialogPhotos == dialogPhotos2) {
            ArrayList arrayList6 = new ArrayList(dialogPhotos2.photos);
            if (arrayList6.isEmpty() && dialogPhotos2.fromCache) {
                return;
            }
            this.customAvatarIndex = -1;
            this.fallbackPhotoIndex = -1;
            int i10 = this.currentAccount;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.dialogId));
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(this.dialogId);
            if (userFull != null && (photo = userFull.personal_photo) != null) {
                arrayList6.add(0, photo);
                this.customAvatarIndex = 0;
            }
            if (user != null && user.self && UserObject.hasFallbackPhoto(userFull)) {
                arrayList6.add(userFull.fallback_photo);
                this.fallbackPhotoIndex = arrayList6.size() - 1;
            }
            arrayList4.clear();
            arrayList5.clear();
            ArrayList arrayList7 = this.imagesLocations;
            arrayList7.clear();
            ArrayList arrayList8 = this.videoLocations;
            arrayList8.clear();
            ArrayList arrayList9 = this.thumbsLocations;
            arrayList9.clear();
            ArrayList arrayList10 = this.vectorAvatars;
            arrayList10.clear();
            ArrayList arrayList11 = this.photos;
            arrayList11.clear();
            ArrayList arrayList12 = this.imagesLocationsSizes;
            arrayList12.clear();
            ArrayList arrayList13 = this.imagesUploadProgress;
            arrayList13.clear();
            if (DialogObject.isChatDialog(this.dialogId)) {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-this.dialogId));
                viewPagerAdapter = viewPagerAdapter2;
                forUserOrChat = ImageLocation.getForUserOrChat(i10, chat, 0);
                if (forUserOrChat != null) {
                    arrayList7.add(forUserOrChat);
                    arrayList9.add(ImageLocation.getForUserOrChat(i10, chat, 1));
                    arrayList10.add(null);
                    arrayList4.add(null);
                    TLRPC.ChatFull chatFull = this.chatInfo;
                    if (chatFull == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) forUserOrChat.location, chatFull.chat_photo)) {
                        i10 = i10;
                        i10 = i10;
                        z4 = false;
                        arrayList11.add(null);
                        arrayList5.add(null);
                        arrayList8.add(null);
                    } else {
                        arrayList11.add(this.chatInfo.chat_photo);
                        if (this.chatInfo.chat_photo.video_sizes.isEmpty()) {
                            i10 = i10;
                            z4 = false;
                            arrayList8.add(null);
                            arrayList5.add(null);
                        } else {
                            i10 = i10;
                            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.chatInfo.chat_photo.video_sizes, 1000);
                            arrayList8.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, this.chatInfo.chat_photo));
                            arrayList5.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                            z4 = false;
                        }
                    }
                    arrayList12.add(-1);
                    arrayList13.add(z4);
                }
            } else {
                viewPagerAdapter = viewPagerAdapter2;
                forUserOrChat = null;
            }
            i10 = i10;
            int i11 = 0;
            while (true) {
                int size = arrayList6.size();
                i3 = i10;
                z = this.isProfileFragment;
                if (i11 >= size) {
                    break;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList6.get(i11);
                ArrayList arrayList14 = arrayList6;
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList2 = photo2.sizes) == null) {
                    arrayList = arrayList5;
                    imageLocation = forUserOrChat;
                    i4 = i11;
                    user = user;
                    arrayList11.add(null);
                    arrayList7.add(null);
                    arrayList9.add(null);
                    arrayList10.add(null);
                    arrayList4.add(null);
                    arrayList8.add(null);
                    arrayList.add(null);
                    arrayList12.add(-1);
                    arrayList13.add(null);
                } else {
                    i4 = i11;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList2, 50);
                    int size2 = photo2.sizes.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            photoSize = closestPhotoSizeWithSize;
                            break;
                        }
                        int i13 = size2;
                        TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i12);
                        int i14 = i12;
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = photoSize2;
                            break;
                        } else {
                            i12 = i14 + 1;
                            size2 = i13;
                        }
                    }
                    if (forUserOrChat != null) {
                        int size3 = photo2.sizes.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size3) {
                                int i16 = size3;
                                TLRPC.FileLocation fileLocation = photo2.sizes.get(i15).location;
                                if (fileLocation != null) {
                                    i5 = i15;
                                    int i17 = fileLocation.local_id;
                                    arrayList3 = arrayList13;
                                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = forUserOrChat.location;
                                    imageLocation = forUserOrChat;
                                    if (i17 == tL_fileLocationToBeDeprecated.local_id) {
                                        arrayList = arrayList5;
                                        if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                            arrayList11.set(0, photo2);
                                            if (!photo2.video_sizes.isEmpty()) {
                                                arrayList8.set(0, ImageLocation.getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000), photo2));
                                            }
                                        }
                                    }
                                    ArrayList arrayList15 = arrayList;
                                    i15 = i5 + 1;
                                    arrayList5 = arrayList15;
                                    size3 = i16;
                                    arrayList13 = arrayList3;
                                    forUserOrChat = imageLocation;
                                } else {
                                    imageLocation = forUserOrChat;
                                    arrayList3 = arrayList13;
                                    i5 = i15;
                                }
                                arrayList = arrayList5;
                                ArrayList arrayList16 = arrayList;
                                i15 = i5 + 1;
                                arrayList5 = arrayList16;
                                size3 = i16;
                                arrayList13 = arrayList3;
                                forUserOrChat = imageLocation;
                            } else {
                                arrayList = arrayList5;
                                imageLocation = forUserOrChat;
                                arrayList3 = arrayList13;
                            }
                            user = user;
                            arrayList13 = arrayList3;
                        }
                    } else {
                        imageLocation = forUserOrChat;
                        arrayList3 = arrayList13;
                        arrayList = arrayList5;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                    if (closestPhotoSizeWithSize2 == null) {
                        user = user;
                        arrayList13 = arrayList3;
                    } else {
                        int i18 = photo2.dc_id;
                        if (i18 != 0) {
                            TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                            fileLocation2.dc_id = i18;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                        if (forPhoto != null) {
                            ImageLocation imageLocation2 = this.prevImageLocation;
                            if (imageLocation2 == null || imageLocation2.photoId != forPhoto.photoId || z || this.dialogId == UserConfig.getInstance(i3).getClientUserId()) {
                                arrayList13 = arrayList3;
                                arrayList7.add(forPhoto);
                                arrayList4.add(FileLoader.getAttachFileName(photoSize instanceof TLRPC.TL_photoStrippedSize ? closestPhotoSizeWithSize2 : photoSize));
                                arrayList9.add(ImageLocation.getForPhoto(photoSize, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    z2 = false;
                                    arrayList8.add(null);
                                    arrayList.add(null);
                                    arrayList10.add(null);
                                } else {
                                    TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                    TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                    if (vectorMarkupVideoSize != null) {
                                        arrayList10.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize, user != null && user.premium, 2));
                                        z2 = false;
                                        arrayList8.add(null);
                                        arrayList.add(null);
                                    } else {
                                        z2 = false;
                                        arrayList10.add(null);
                                        arrayList8.add(ImageLocation.getForPhoto(closestVideoSizeWithSize2, photo2));
                                        arrayList.add(FileLoader.getAttachFileName(closestVideoSizeWithSize2));
                                    }
                                }
                                arrayList11.add(photo2);
                                arrayList12.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                arrayList13.add(z2);
                            } else {
                                arrayList4.add(null);
                                arrayList7.add(this.prevImageLocation);
                                ImageLocation forPhoto2 = this.prevThumbLocation;
                                if (forPhoto2 == null) {
                                    forPhoto2 = ImageLocation.getForPhoto(photoSize, photo2);
                                }
                                arrayList9.add(forPhoto2);
                                if (photo2.video_sizes.isEmpty()) {
                                    z3 = false;
                                    arrayList10.add(this.prevVectorAvatarThumbDrawable);
                                    arrayList8.add(null);
                                    arrayList.add(null);
                                } else {
                                    TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                    TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                    if (vectorMarkupVideoSize2 != null) {
                                        arrayList10.add(new VectorAvatarThumbDrawable(vectorMarkupVideoSize2, user != null && user.premium, 2));
                                        z3 = false;
                                        arrayList8.add(null);
                                        arrayList.add(null);
                                    } else {
                                        z3 = false;
                                        arrayList10.add(null);
                                        arrayList8.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                        arrayList.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                    }
                                }
                                arrayList11.add(z3);
                                arrayList12.add(-1);
                                arrayList13 = arrayList3;
                                arrayList13.add(z3);
                                user = user;
                            }
                        } else {
                            user = user;
                            arrayList13 = arrayList3;
                        }
                    }
                }
                i11 = i4 + 1;
                arrayList5 = arrayList;
                i10 = i3;
                arrayList6 = arrayList14;
                user = user;
                forUserOrChat = imageLocation;
            }
            int size4 = arrayList9.size();
            if (size4 > 1) {
                int i19 = 0;
                while (true) {
                    if (i19 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    FileLoader.getInstance(i3).loadFile((ImageLocation) arrayList9.get(i19 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                    i19++;
                }
            }
            getAdapter().notifyDataSetChanged();
            if (!z) {
                r4 = 0;
                r4 = 0;
                if (!this.scrolledByUser || this.forceResetPosition) {
                    setCurrentItem(viewPagerAdapter.getExtraCount(), false);
                    getAdapter().notifyDataSetChanged();
                    checkCustomAvatar(0.0f, getRealPosition());
                }
            } else if (!this.scrolledByUser || this.forceResetPosition) {
                r4 = 0;
                setCurrentItem(viewPagerAdapter.getExtraCount(), false);
            } else {
                r4 = 0;
            }
            if (this.fallbackPhotoIndex < 0 && this.customAvatarIndex < 0) {
                checkCustomAvatar(0.0f, r4);
            }
            this.forceResetPosition = r4;
            Callback callback = this.callback;
            if (callback != null) {
                callback.onPhotosLoaded();
            }
            ImageLocation imageLocation3 = this.currentUploadingImageLocation;
            if (imageLocation3 != null) {
                addUploadingImage(imageLocation3, this.curreantUploadingThumbLocation);
            }
        }
    }

    public ProfileGalleryBlurView getBlurDrawer() {
        return this.blurView;
    }

    public float getCurrentItemProgress() {
        AnimatedFileDrawable animation;
        float f;
        int i;
        BackupImageView currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null || animation.metaData[4] == 0) {
            return 0.0f;
        }
        if (animation.pendingSeekToUI >= 0) {
            f = animation.pendingSeekToUI;
            i = animation.metaData[4];
        } else {
            int[] iArr = animation.metaData;
            f = iArr[3];
            i = iArr[4];
        }
        return f / i;
    }

    public BackupImageView getCurrentItemView() {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter == null || viewPagerAdapter.objects.isEmpty()) {
            return null;
        }
        return ((Item) viewPagerAdapter.objects.get(getCurrentItem())).imageView;
    }

    public final ImageLocation getCurrentVideoLocation(ImageLocation imageLocation, ImageLocation imageLocation2) {
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

    public long getDialogId() {
        return this.dialogId;
    }

    public final ImageLocation getImageLocation(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.imagesLocations;
        if (i >= arrayList.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.videoLocations.get(i);
        return imageLocation != null ? imageLocation : (ImageLocation) arrayList.get(i);
    }

    public final View getItemViewAt(int i) {
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter == null || viewPagerAdapter.objects.size() <= i || i < 0) {
            return null;
        }
        Item item = (Item) viewPagerAdapter.objects.get(i);
        TextureStubView textureStubView = item.textureViewStubView;
        return textureStubView == null ? item.imageView : textureStubView;
    }

    public int getRealCount() {
        int size = this.photos.size();
        return this.hasActiveVideo ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.adapter.getRealPosition(getCurrentItem());
    }

    public final boolean initIfEmpty(VectorAvatarThumbDrawable vectorAvatarThumbDrawable, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z) {
        MessagesController.DialogPhotos dialogPhotos;
        MessagesController.DialogPhotos dialogPhotos2;
        if (imageLocation != null && imageLocation2 != null && this.settingMainPhoto == 0) {
            ImageLocation imageLocation3 = this.prevImageLocation;
            ArrayList arrayList = this.imagesLocations;
            ViewPagerAdapter viewPagerAdapter = this.adapter;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                if (!arrayList.isEmpty()) {
                    this.prevImageLocation = imageLocation;
                    if (z && (dialogPhotos2 = this.dialogPhotos) != null) {
                        dialogPhotos2.reset();
                        this.dialogPhotos.loadAfter(getCurrentItem() - (viewPagerAdapter != null ? viewPagerAdapter.getExtraCount() : 0), true);
                    }
                    return true;
                }
                if (z && (dialogPhotos = this.dialogPhotos) != null) {
                    dialogPhotos.reset();
                    this.dialogPhotos.loadAfter(getCurrentItem() - (viewPagerAdapter != null ? viewPagerAdapter.getExtraCount() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.prevImageLocation = imageLocation;
                this.prevThumbLocation = imageLocation2;
                this.prevVectorAvatarThumbDrawable = vectorAvatarThumbDrawable;
                this.thumbsFileNames.add(null);
                this.videoFileNames.add(null);
                arrayList.add(imageLocation);
                this.thumbsLocations.add(imageLocation2);
                this.vectorAvatars.add(vectorAvatarThumbDrawable);
                this.videoLocations.add(null);
                this.photos.add(null);
                this.imagesLocationsSizes.add(-1);
                this.imagesUploadProgress.add(null);
                getAdapter().notifyDataSetChanged();
                setCurrentItem(viewPagerAdapter.getExtraCount(), false);
                return true;
            }
        }
        return false;
    }

    public final boolean isLoadingCurrentVideo() {
        BackupImageView currentItemView;
        if (this.videoLocations.get(this.hasActiveVideo ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        AnimatedFileDrawable animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.hasBitmap();
    }

    public final void onDestroy() {
        this.blurView = null;
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
        int i2 = NotificationCenter.fileLoadProgressChanged;
        notificationCenter.removeObserver(this, i2);
        NotificationCenter.getInstance(i).removeObserver(this, i2);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
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
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.parentListView.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setTranslationY(getHeight() - this.blurView.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.sizeChanged = true;
            profileGalleryBlurView.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ProfileGalleryView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setAlpha(f);
        }
    }

    public void setAnimatedFileMaybe(AnimatedFileDrawable animatedFileDrawable) {
        ViewPagerAdapter viewPagerAdapter;
        if (animatedFileDrawable == null || (viewPagerAdapter = this.adapter) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof BackupImageView) && viewPagerAdapter.getRealPosition(viewPagerAdapter.imageViews.indexOf(childAt)) == 0) {
                BackupImageView backupImageView = (BackupImageView) childAt;
                AnimatedFileDrawable animation = backupImageView.getImageReceiver().getAnimation();
                if (animation != animatedFileDrawable) {
                    if (animation != null) {
                        animation.removeSecondParentView(backupImageView);
                    }
                    backupImageView.setImageDrawable(animatedFileDrawable);
                    animatedFileDrawable.addSecondParentView(this);
                    animatedFileDrawable.invalidateParentViewWithSecond = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.chatInfo = chatFull;
        ArrayList arrayList = this.photos;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.chatInfo == null) {
            return;
        }
        ArrayList arrayList2 = this.imagesLocations;
        if (arrayList2.get(0) == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.chatInfo.chat_photo)) {
            return;
        }
        arrayList.set(0, this.chatInfo.chat_photo);
        boolean zIsEmpty = this.chatInfo.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.videoFileNames;
        ArrayList arrayList4 = this.videoLocations;
        if (zIsEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.chatInfo.chat_photo.video_sizes, 1000);
            arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.chatInfo.chat_photo));
            arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
            Callback callback = this.callback;
            if (callback != null) {
                callback.onPhotosLoaded();
            }
        }
        this.imagesUploadProgress.set(0, null);
        this.adapter.notifyDataSetChanged();
    }

    public void setCreateThumbFromParent(boolean z) {
        this.createThumbFromParent = z;
    }

    public void setCustomAvatarProgress(float f) {
    }

    public void setData(long j) {
        setData(j, false);
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

    public final void setRoundRadius(int i, int i2) {
        this.roundTopRadius = i;
        this.roundBottomRadius = i2;
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (viewPagerAdapter != null) {
            for (int i3 = 0; i3 < viewPagerAdapter.objects.size(); i3++) {
                if (((Item) viewPagerAdapter.objects.get(i3)).imageView != null) {
                    AvatarImageView avatarImageView = ((Item) viewPagerAdapter.objects.get(i3)).imageView;
                    int i4 = this.roundTopRadius;
                    int i5 = this.roundBottomRadius;
                    avatarImageView.imageReceiver.setRoundRadius(i4, i4, i5, i5);
                    if (avatarImageView.blurAllowed) {
                        avatarImageView.blurImageReceiver.setRoundRadius(i4, i4, i5, i5);
                    }
                    avatarImageView.invalidate();
                }
            }
        }
    }

    public final void setUploadProgress(ImageLocation imageLocation, float f) {
        if (imageLocation == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.imagesLocations;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == imageLocation) {
                this.imagesUploadProgress.set(i, Float.valueOf(f));
                SparseArray sparseArray = this.radialProgresses;
                if (sparseArray.get(i) == null) {
                    break;
                }
                ((RadialProgress2) sparseArray.get(i)).setProgress(f, true);
                break;
            }
            i++;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).invalidate();
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        ProfileGalleryBlurView profileGalleryBlurView = this.blurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.setVisibility(i);
        }
    }

    public final void setData(long j, boolean z) {
        long j2 = this.dialogId;
        ViewPagerAdapter viewPagerAdapter = this.adapter;
        if (j2 == j && !z) {
            setCurrentItem(viewPagerAdapter.getExtraCount(), false);
            return;
        }
        this.forceResetPosition = true;
        this.videoFileNames.clear();
        this.thumbsFileNames.clear();
        this.photos.clear();
        this.videoLocations.clear();
        this.imagesLocations.clear();
        this.thumbsLocations.clear();
        this.imagesLocationsSizes.clear();
        this.imagesUploadProgress.clear();
        viewPagerAdapter.notifyDataSetChanged();
        setCurrentItem(0, false);
        this.selectedPage = 0;
        this.uploadingImageLocation = null;
        this.prevImageLocation = null;
        this.dialogId = j;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.currentAccount).getDialogPhotos(j);
        this.dialogPhotos = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final class AvatarImageView extends BackupImageView implements SizeNotifierFrameLayout.IViewWithInvalidateCallback {
        public long firstDrawTime;
        public Runnable invalidateCallback;
        public boolean isVideo;
        public final Paint placeholderPaint;
        public final int position;
        public RadialProgress2 radialProgress;
        public ValueAnimator radialProgressHideAnimator;
        public float radialProgressHideAnimatorStartValue;
        public final int radialProgressSize;

        public AvatarImageView(Context context, int i, Paint paint) {
            super(context);
            this.radialProgressSize = AndroidUtilities.dp(64.0f);
            this.firstDrawTime = -1L;
            this.position = i;
            this.placeholderPaint = paint;
            setLayerNum(ProfileGalleryView.this.imagesLayerNum);
        }

        @Override
        public final void invalidate(int i, int i2, int i3, int i4) {
            super.invalidate(i, i2, i3, i4);
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public final void listenInvalidate(Runnable runnable) {
            this.invalidateCallback = runnable;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            float[] fArr;
            ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
            PinchToZoomHelper pinchToZoomHelper = profileGalleryView.pinchToZoomHelper;
            if (pinchToZoomHelper == null || !pinchToZoomHelper.inOverlayMode) {
                if (this.radialProgress != null) {
                    int realPosition = profileGalleryView.adapter.getRealPosition(this.position);
                    if (profileGalleryView.hasActiveVideo) {
                        realPosition--;
                    }
                    Drawable drawable = getImageReceiver().getDrawable();
                    ArrayList arrayList = profileGalleryView.imagesUploadProgress;
                    long j = 0;
                    if (realPosition >= arrayList.size() || arrayList.get(realPosition) == null ? drawable == null || (this.isVideo && (!(drawable instanceof AnimatedFileDrawable) || ((AnimatedFileDrawable) drawable).metaData[4] <= 0)) : ((Float) arrayList.get(realPosition)).floatValue() < 1.0f) {
                        if (this.firstDrawTime < 0) {
                            this.firstDrawTime = System.currentTimeMillis();
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.firstDrawTime;
                            long j2 = this.isVideo ? 250L : 750L;
                            if (jCurrentTimeMillis <= 250 + j2 && jCurrentTimeMillis > j2) {
                                this.radialProgress.overrideAlpha = CubicBezierInterpolator.DEFAULT.getInterpolation((jCurrentTimeMillis - j2) / 250.0f);
                            }
                        }
                        if (profileGalleryView.invalidateWithParent) {
                            invalidate();
                        } else {
                            postInvalidateOnAnimation();
                        }
                        invalidate();
                    } else if (this.radialProgressHideAnimator == null) {
                        RadialProgress2 radialProgress2 = this.radialProgress;
                        if ((radialProgress2.drawMiniIcon ? radialProgress2.miniMediaActionDrawable : radialProgress2.mediaActionDrawable).downloadProgress < 1.0f) {
                            radialProgress2.setProgress(1.0f, true);
                            j = 100;
                        }
                        this.radialProgressHideAnimatorStartValue = this.radialProgress.overrideAlpha;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.radialProgressHideAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.setStartDelay(j);
                        this.radialProgressHideAnimator.setDuration((long) (this.radialProgressHideAnimatorStartValue * 250.0f));
                        this.radialProgressHideAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.radialProgressHideAnimator.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 3));
                        this.radialProgressHideAnimator.addListener(new ArticleViewer.AnonymousClass3(this, realPosition, 6));
                        this.radialProgressHideAnimator.start();
                    }
                    int i = profileGalleryView.roundTopRadius;
                    Paint paint = this.placeholderPaint;
                    if (i == 0 && profileGalleryView.roundBottomRadius == 0) {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                    } else {
                        canvas2 = canvas;
                        int i2 = profileGalleryView.roundBottomRadius;
                        RectF rectF = profileGalleryView.rect;
                        if (i == i2) {
                            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                            float f = profileGalleryView.roundTopRadius;
                            canvas2.drawRoundRect(rectF, f, f, paint);
                        } else {
                            Path path = profileGalleryView.path;
                            path.reset();
                            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                            int i3 = 0;
                            while (true) {
                                fArr = profileGalleryView.radii;
                                if (i3 >= 4) {
                                    break;
                                }
                                fArr[i3] = profileGalleryView.roundTopRadius;
                                fArr[i3 + 4] = profileGalleryView.roundBottomRadius;
                                i3++;
                            }
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            canvas2.drawPath(path, paint);
                        }
                    }
                } else {
                    canvas2 = canvas;
                }
                super.onDraw(canvas2);
                RadialProgress2 radialProgress3 = this.radialProgress;
                if (radialProgress3 == null || radialProgress3.overrideAlpha <= 0.0f) {
                    return;
                }
                radialProgress3.draw(canvas2);
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.radialProgress != null) {
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (ProfileGalleryView.this.parentActionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int iDp2 = AndroidUtilities.dp2(80.0f);
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i5 = this.radialProgressSize;
                int i6 = (i2 - currentActionBarHeight) - iDp2;
                radialProgress2.setProgressRect((i - i5) / 2, RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i6, i5, 2, currentActionBarHeight), (i + i5) / 2, ((i6 + i5) / 2) + currentActionBarHeight);
            }
        }

        @Override
        public final void invalidate(Rect rect) {
            super.invalidate(rect);
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ProfileGalleryView profileGalleryView = ProfileGalleryView.this;
            if (profileGalleryView.invalidateWithParent) {
                profileGalleryView.invalidate();
            }
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ProfileGalleryView(Context context, long j, ActionBar actionBar, ProfileActivity.AnonymousClass12 anonymousClass12, ProfileActivity.AnonymousClass21 anonymousClass21, Callback callback, ProfileGalleryBlurView profileGalleryBlurView) {
        super(context);
        this.downPoint = new PointF();
        this.isScrollingListView = true;
        this.isSwipingViewPager = true;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
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
        this.parentListView = anonymousClass12;
        this.parentActionBar = actionBar;
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext(), anonymousClass21);
        this.adapter = viewPagerAdapter;
        setAdapter((CircularViewPager.Adapter) viewPagerAdapter);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.callback = callback;
        final ProfileActivity.AnonymousClass23 anonymousClass23 = (ProfileActivity.AnonymousClass23) this;
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override
            public final void onPageScrolled(float f, int i2, int i3) {
                ImageLocation imageLocation;
                ProfileActivity.AnonymousClass23 anonymousClass24 = anonymousClass23;
                anonymousClass24.checkCustomAvatar(f, i2);
                if (i3 == 0) {
                    int realPosition = ((ProfileGalleryView) anonymousClass24).adapter.getRealPosition(i2);
                    anonymousClass24.getCurrentItemView();
                    int childCount = anonymousClass24.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = anonymousClass24.getChildAt(i4);
                        if (childAt instanceof BackupImageView) {
                            ViewPagerAdapter viewPagerAdapter2 = ((ProfileGalleryView) anonymousClass24).adapter;
                            int realPosition2 = viewPagerAdapter2.getRealPosition(viewPagerAdapter2.imageViews.indexOf(childAt));
                            ImageReceiver imageReceiver = ((BackupImageView) childAt).getImageReceiver();
                            boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                            if (realPosition2 >= 0 && realPosition2 < anonymousClass24.videoLocations.size()) {
                                if (realPosition2 == realPosition) {
                                    if (!allowStartAnimation) {
                                        imageReceiver.setAllowStartAnimation(true);
                                        imageReceiver.startAnimation();
                                    }
                                    ImageLocation imageLocation2 = (ImageLocation) anonymousClass24.videoLocations.get(realPosition2);
                                    if (imageLocation2 != null) {
                                        FileLoader.getInstance(anonymousClass24.currentAccount).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                                    }
                                } else if (allowStartAnimation) {
                                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                                    if (animation != null && (imageLocation = (ImageLocation) anonymousClass24.videoLocations.get(realPosition2)) != null) {
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
            public final void onPageSelected(int i2) {
                ProfileActivity.AnonymousClass23 anonymousClass24 = anonymousClass23;
                int i3 = anonymousClass24.selectedPage;
                boolean z = i2 >= i3;
                if (i2 != i3) {
                    anonymousClass24.selectedPage = i2;
                }
                MessagesController.DialogPhotos dialogPhotos = anonymousClass24.dialogPhotos;
                if (dialogPhotos != null) {
                    ViewPagerAdapter viewPagerAdapter2 = ((ProfileGalleryView) anonymousClass24).adapter;
                    dialogPhotos.loadAfter(i2 - (viewPagerAdapter2 != null ? viewPagerAdapter2.getExtraCount() : 0), z);
                }
            }
        });
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i).getDialogPhotos(j);
        this.dialogPhotos = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
