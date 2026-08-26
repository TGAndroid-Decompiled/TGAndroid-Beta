package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;

public abstract class WallpaperCell extends FrameLayout {
    public final Paint backgroundPaint;
    public final Drawable checkDrawable;
    public final Paint circlePaint;
    public int currentType;
    public boolean drawStubBackground;
    public final Paint framePaint;
    public boolean isBottom;
    public boolean isTop;
    public int size;
    public int spanCount;
    public final WallpaperView[] wallpaperViews;

    public final class WallpaperView extends FrameLayout {
        public AnimatorSet animator;
        public final CheckBox checkBox;
        public Object currentWallpaper;
        public final UserCell.AnonymousClass2 imageView;
        public final ImageView imageView2;
        public boolean isSelected;
        public final View selector;

        public WallpaperView(Context context) {
            super(context);
            setWillNotDraw(false);
            UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context, 3);
            this.imageView = anonymousClass2;
            addView(anonymousClass2, LayoutHelper.createFrame(-1, -1, 51));
            ImageView imageView = new ImageView(context);
            this.imageView2 = imageView;
            imageView.setImageResource(R.drawable.ic_gallery_background);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(-1, -1, 51));
            View view = new View(context);
            this.selector = view;
            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
            CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
            this.checkBox = checkBox;
            checkBox.setVisibility(4);
            int color = Theme.getColor(null, Theme.key_checkbox, false);
            int color2 = Theme.getColor(null, Theme.key_checkboxCheck, false);
            checkBox.color = color;
            checkBox.checkDrawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
            checkBox.textPaint.setColor(color2);
            checkBox.invalidate();
            addView(checkBox, LayoutHelper.createFrame(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
        }

        @Override
        public final void clearAnimation() {
            super.clearAnimation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            this.imageView.invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            WallpaperCell wallpaperCell = WallpaperCell.this;
            if (!wallpaperCell.drawStubBackground || !this.checkBox.isChecked) {
                UserCell.AnonymousClass2 anonymousClass2 = this.imageView;
                if (anonymousClass2.getImageReceiver().hasBitmapImage() && anonymousClass2.getImageReceiver().getCurrentAlpha() == 1.0f) {
                    return;
                }
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), wallpaperCell.backgroundPaint);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            this.selector.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
            return super.onTouchEvent(motionEvent);
        }

        public final void setChecked(boolean z, boolean z2) {
            CheckBox checkBox = this.checkBox;
            if (checkBox.getVisibility() != 0) {
                checkBox.setVisibility(0);
            }
            checkBox.setChecked(z, z2);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
            UserCell.AnonymousClass2 anonymousClass2 = this.imageView;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animator = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass2, "scaleX", z ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(anonymousClass2, "scaleY", z ? 0.8875f : 1.0f));
                this.animator.setDuration(200L);
                this.animator.addListener(new ChatActivity.AnonymousClass77(9, this, z));
                this.animator.start();
            } else {
                anonymousClass2.setScaleX(z ? 0.8875f : 1.0f);
                anonymousClass2.setScaleY(z ? 0.8875f : 1.0f);
            }
            super.invalidate();
            anonymousClass2.invalidate();
        }
    }

    public WallpaperCell(Context context, int i) {
        super(context);
        this.drawStubBackground = true;
        this.spanCount = 3;
        this.wallpaperViews = new WallpaperView[i];
        int i2 = 0;
        while (true) {
            WallpaperView[] wallpaperViewArr = this.wallpaperViews;
            if (i2 >= wallpaperViewArr.length) {
                Paint paint = new Paint();
                this.framePaint = paint;
                paint.setColor(855638016);
                this.circlePaint = new Paint(1);
                this.checkDrawable = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.backgroundPaint = paint2;
                paint2.setColor(Theme.getColor(null, Theme.key_sharedMedia_photoPlaceholder, false));
                return;
            }
            WallpaperView wallpaperView = new WallpaperView(context);
            wallpaperViewArr[i2] = wallpaperView;
            addView(wallpaperView);
            wallpaperView.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(this, wallpaperView, i2, 2));
            wallpaperView.setOnLongClickListener(new WallpaperCell$$ExternalSyntheticLambda1(this, wallpaperView, i2));
            i2++;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i = 0; i < this.spanCount; i++) {
            this.wallpaperViews[i].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.spanCount == 1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int iDp = AndroidUtilities.dp(14.0f);
        int iDp2 = this.isTop ? AndroidUtilities.dp(14.0f) : 0;
        for (int i5 = 0; i5 < this.spanCount; i5++) {
            WallpaperView[] wallpaperViewArr = this.wallpaperViews;
            int measuredWidth = wallpaperViewArr[i5].getMeasuredWidth();
            WallpaperView wallpaperView = wallpaperViewArr[i5];
            wallpaperView.layout(iDp, iDp2, iDp + measuredWidth, wallpaperView.getMeasuredHeight() + iDp2);
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(measuredWidth, 6.0f, iDp);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (this.spanCount == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.size, 1073741824), zzkm.m(6.0f, this.size));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int iDp = size - AndroidUtilities.dp(zzkv.m(this.spanCount, 1, 6, 28));
        int i4 = iDp / this.spanCount;
        int i5 = this.currentType;
        int iDp2 = (i5 == 0 || i5 == 2 || i5 == 3) ? AndroidUtilities.dp(180.0f) : i4;
        setMeasuredDimension(size, AndroidUtilities.dp(this.isBottom ? 14.0f : 6.0f) + (this.isTop ? AndroidUtilities.dp(14.0f) : 0) + iDp2);
        while (true) {
            int i6 = this.spanCount;
            if (i3 >= i6) {
                return;
            }
            this.wallpaperViews[i3].measure(View.MeasureSpec.makeMeasureSpec(i3 == i6 + (-1) ? iDp : i4, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824));
            iDp -= i4;
            i3++;
        }
    }

    public abstract void onWallpaperClick(int i, Object obj);

    public boolean onWallpaperLongClick(int i, Object obj) {
        return false;
    }

    public final void setParams(int i, boolean z, boolean z2) {
        this.spanCount = i;
        this.isTop = z;
        this.isBottom = z2;
        int i2 = 0;
        while (true) {
            WallpaperView[] wallpaperViewArr = this.wallpaperViews;
            if (i2 >= wallpaperViewArr.length) {
                return;
            }
            wallpaperViewArr[i2].setVisibility(i2 < i ? 0 : 8);
            wallpaperViewArr[i2].clearAnimation();
            i2++;
        }
    }

    public void setSize(int i) {
        if (this.size != i) {
            this.size = i;
            requestLayout();
        }
    }

    public final void setWallpaper(int i, Object obj, Object obj2, int i2) {
        int patternColor;
        int patternColor2;
        this.currentType = i;
        WallpaperView[] wallpaperViewArr = this.wallpaperViews;
        if (obj == null) {
            wallpaperViewArr[i2].setVisibility(8);
            wallpaperViewArr[i2].clearAnimation();
            return;
        }
        wallpaperViewArr[i2].setVisibility(0);
        WallpaperView wallpaperView = wallpaperViewArr[i2];
        wallpaperView.currentWallpaper = obj;
        UserCell.AnonymousClass2 anonymousClass2 = wallpaperView.imageView;
        anonymousClass2.setVisibility(0);
        wallpaperView.imageView2.setVisibility(4);
        anonymousClass2.setBackgroundDrawable(null);
        anonymousClass2.getImageReceiver().setColorFilter(null);
        anonymousClass2.getImageReceiver().setAlpha(1.0f);
        anonymousClass2.getImageReceiver().setBlendMode(null);
        anonymousClass2.getImageReceiver().setGradientBitmap(null);
        wallpaperView.isSelected = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", null, j, "jpg", tL_wallPaper, 1);
                    anonymousClass2.onNewImageSet();
                    return;
                } else {
                    anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", null, j, "jpg", tL_wallPaper, 1);
                    anonymousClass2.onNewImageSet();
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true, 0, false);
                if (tL_wallPaper.settings.intensity >= 0 || !Theme.currentTheme.isDark()) {
                    anonymousClass2.setBackground(motionBackgroundDrawable);
                    if (Build.VERSION.SDK_INT >= 29) {
                        anonymousClass2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    anonymousClass2.getImageReceiver().setGradientBitmap(motionBackgroundDrawable.currentBitmap);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = MotionBackgroundDrawable.getPatternColor(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                anonymousClass2.setBackgroundColor(Theme.getWallpaperColor(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                anonymousClass2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), null, null, j, "jpg", tL_wallPaper, 1);
                anonymousClass2.onNewImageSet();
            } else {
                anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "180_180", null, null, null, j, "jpg", tL_wallPaper, 1);
                anonymousClass2.onNewImageSet();
            }
            anonymousClass2.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof WallpapersListActivity.ColorWallpaper)) {
            if (obj instanceof WallpapersListActivity.FileWallpaper) {
                WallpapersListActivity.FileWallpaper fileWallpaper = (WallpapersListActivity.FileWallpaper) obj;
                File file = fileWallpaper.originalPath;
                if (file != null) {
                    anonymousClass2.setImage(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = fileWallpaper.path;
                if (file2 != null) {
                    anonymousClass2.setImage(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(fileWallpaper.slug)) {
                    anonymousClass2.setImageDrawable(Theme.getThemedWallpaper(anonymousClass2, true));
                    return;
                } else {
                    anonymousClass2.setImageResource(fileWallpaper.thumbResId);
                    return;
                }
            }
            if (!(obj instanceof MediaController.SearchImage)) {
                wallpaperView.isSelected = false;
                return;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo == null) {
                anonymousClass2.setImage(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            anonymousClass2.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", null, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            anonymousClass2.onNewImageSet();
            return;
        }
        WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj;
        File file3 = colorWallpaper.path;
        int i3 = colorWallpaper.gradientColor1;
        int i4 = colorWallpaper.color;
        if (file3 == null && colorWallpaper.pattern == null && !"d".equals(colorWallpaper.slug)) {
            anonymousClass2.setImageBitmap(null);
            if (colorWallpaper.isGradient) {
                anonymousClass2.setBackground(new MotionBackgroundDrawable(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3, true, 0, false));
                return;
            } else if (i3 != 0) {
                anonymousClass2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i4 | (-16777216), i3 | (-16777216)}));
                return;
            } else {
                anonymousClass2.setBackgroundColor(i4 | (-16777216));
                return;
            }
        }
        int i5 = colorWallpaper.gradientColor2;
        if (i5 != 0) {
            MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3, true, 0, false);
            if (colorWallpaper.intensity >= 0.0f) {
                anonymousClass2.setBackground(new MotionBackgroundDrawable(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3, true, 0, false));
                if (Build.VERSION.SDK_INT >= 29) {
                    anonymousClass2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                anonymousClass2.getImageReceiver().setGradientBitmap(motionBackgroundDrawable2.currentBitmap);
            }
            patternColor = MotionBackgroundDrawable.getPatternColor(i4, i3, i5, colorWallpaper.gradientColor3);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i4);
        }
        if ("d".equals(colorWallpaper.slug)) {
            if (colorWallpaper.defaultCache == null) {
                colorWallpaper.defaultCache = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            anonymousClass2.setImageBitmap(colorWallpaper.defaultCache);
            anonymousClass2.getImageReceiver().setAlpha(Math.abs(colorWallpaper.intensity));
            return;
        }
        if (file3 != null) {
            anonymousClass2.setImage(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(colorWallpaper.pattern.document.thumbs, 100);
        anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize5, colorWallpaper.pattern.document), "180_180", null, null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : colorWallpaper.pattern.document.size, "jpg", colorWallpaper.pattern, 1);
        anonymousClass2.onNewImageSet();
        anonymousClass2.getImageReceiver().setAlpha(Math.abs(colorWallpaper.intensity));
        if (Build.VERSION.SDK_INT < 29 || i5 == 0) {
            anonymousClass2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor), PorterDuff.Mode.SRC_IN));
        }
    }
}
