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
import org.telegram.ui.ArticleViewer$10$$ExternalSyntheticOutline0;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.WallpapersListActivity;

public abstract class WallpaperCell extends FrameLayout {
    private Paint backgroundPaint;
    private Drawable checkDrawable;
    private Paint circlePaint;
    private int currentType;
    public boolean drawStubBackground;
    private Paint framePaint;
    private boolean isBottom;
    private boolean isTop;
    int size;
    private int spanCount;
    private WallpaperView[] wallpaperViews;

    public final class WallpaperView extends FrameLayout {
        public AnimatorSet animator;
        public final CheckBox checkBox;
        public Object currentWallpaper;
        public final AnonymousClass1 imageView;
        public final ImageView imageView2;
        public boolean isSelected;
        public final View selector;

        public WallpaperView(Context context) {
            super(context);
            setWillNotDraw(false);
            ?? r0 = new BackupImageView(context) {
                @Override
                public final void onDraw(Canvas canvas) {
                    Canvas canvas2;
                    super.onDraw(canvas);
                    WallpaperView wallpaperView = WallpaperView.this;
                    Object obj = wallpaperView.currentWallpaper;
                    if ((obj instanceof WallpapersListActivity.ColorWallpaper) || (obj instanceof WallpapersListActivity.FileWallpaper)) {
                        canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, WallpaperCell.this.framePaint);
                        canvas2 = canvas;
                        canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), WallpaperCell.this.framePaint);
                        canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), WallpaperCell.this.framePaint);
                        canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, WallpaperCell.this.framePaint);
                    } else {
                        canvas2 = canvas;
                    }
                    if (wallpaperView.isSelected) {
                        WallpaperCell.this.circlePaint.setColor(Theme.serviceMessageColorBackup);
                        int measuredWidth = getMeasuredWidth() / 2;
                        int measuredHeight = getMeasuredHeight() / 2;
                        canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), WallpaperCell.this.circlePaint);
                        WallpaperCell.this.checkDrawable.setBounds(measuredWidth - (WallpaperCell.this.checkDrawable.getIntrinsicWidth() / 2), measuredHeight - (WallpaperCell.this.checkDrawable.getIntrinsicHeight() / 2), (WallpaperCell.this.checkDrawable.getIntrinsicWidth() / 2) + measuredWidth, (WallpaperCell.this.checkDrawable.getIntrinsicHeight() / 2) + measuredHeight);
                        WallpaperCell.this.checkDrawable.draw(canvas2);
                    }
                }
            };
            this.imageView = r0;
            addView((View) r0, LayoutHelper.createFrame(-1, -1, 51));
            ImageView imageView = new ImageView(context);
            this.imageView2 = imageView;
            imageView.setImageResource(R.drawable.ic_gallery_background);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(-1, -1, 51));
            View view = new View(context);
            this.selector = view;
            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            addView(view, LayoutHelper.createFrame(-1, -1.0f));
            CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
            this.checkBox = checkBox;
            checkBox.setVisibility(4);
            checkBox.setColor(Theme.getColor(null, Theme.key_checkbox, false), Theme.getColor(null, Theme.key_checkboxCheck, false));
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
            invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            WallpaperCell wallpaperCell = WallpaperCell.this;
            if (!wallpaperCell.drawStubBackground || !this.checkBox.isChecked()) {
                AnonymousClass1 anonymousClass1 = this.imageView;
                if (anonymousClass1.getImageReceiver().hasBitmapImage() && anonymousClass1.getImageReceiver().getCurrentAlpha() == 1.0f) {
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
            AnonymousClass1 anonymousClass1 = this.imageView;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animator = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, "scaleX", z ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(anonymousClass1, "scaleY", z ? 0.8875f : 1.0f));
                this.animator.setDuration(200L);
                this.animator.addListener(new ContextLinkCell.AnonymousClass3(this, z, 4));
                this.animator.start();
            } else {
                anonymousClass1.setScaleX(z ? 0.8875f : 1.0f);
                anonymousClass1.setScaleY(z ? 0.8875f : 1.0f);
            }
            super.invalidate();
            anonymousClass1.invalidate();
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
            wallpaperView.setOnClickListener(new WallpaperCell$$ExternalSyntheticLambda0(this, wallpaperView, i2, 0));
            wallpaperView.setOnLongClickListener(new WallpaperCell$$ExternalSyntheticLambda1(this, wallpaperView, i2));
            i2++;
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
        for (int i = 0; i < this.spanCount; i++) {
            this.wallpaperViews[i].invalidate();
        }
    }

    public final void lambda$new$0(WallpaperView wallpaperView, int i, View view) {
        onWallpaperClick(wallpaperView.currentWallpaper, i);
    }

    public final boolean lambda$new$1(WallpaperView wallpaperView, int i, View view) {
        return onWallpaperLongClick(wallpaperView.currentWallpaper, i);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.spanCount == 1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int iDp = AndroidUtilities.dp(14.0f);
        int iDp2 = this.isTop ? AndroidUtilities.dp(14.0f) : 0;
        for (int i5 = 0; i5 < this.spanCount; i5++) {
            int measuredWidth = this.wallpaperViews[i5].getMeasuredWidth();
            WallpaperView wallpaperView = this.wallpaperViews[i5];
            wallpaperView.layout(iDp, iDp2, iDp + measuredWidth, wallpaperView.getMeasuredHeight() + iDp2);
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(6.0f, measuredWidth, iDp);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (this.spanCount == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.size, 1073741824), ArticleViewer$10$$ExternalSyntheticOutline0.m(6.0f, this.size, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int iDp = size - AndroidUtilities.dp(CalendarActivity$$ExternalSyntheticOutline0.m(this.spanCount, 1, 6, 28));
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

    public abstract void onWallpaperClick(Object obj, int i);

    public boolean onWallpaperLongClick(Object obj, int i) {
        return false;
    }

    public void setChecked(int i, boolean z, boolean z2) {
        this.wallpaperViews[i].setChecked(z, z2);
    }

    public void setParams(int i, boolean z, boolean z2) {
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
            this.wallpaperViews[i2].clearAnimation();
            i2++;
        }
    }

    public void setSize(int i) {
        if (this.size != i) {
            this.size = i;
            requestLayout();
        }
    }

    public void setWallpaper(int i, int i2, Object obj, Object obj2, Drawable drawable, boolean z) {
        TLRPC.PhotoSize photoSize;
        int patternColor;
        int patternColor2;
        this.currentType = i;
        if (obj == null) {
            this.wallpaperViews[i2].setVisibility(8);
            this.wallpaperViews[i2].clearAnimation();
            return;
        }
        this.wallpaperViews[i2].setVisibility(0);
        WallpaperView wallpaperView = this.wallpaperViews[i2];
        wallpaperView.currentWallpaper = obj;
        WallpaperView.AnonymousClass1 anonymousClass1 = wallpaperView.imageView;
        anonymousClass1.setVisibility(0);
        wallpaperView.imageView2.setVisibility(4);
        anonymousClass1.setBackgroundDrawable(null);
        anonymousClass1.getImageReceiver().setColorFilter(null);
        anonymousClass1.getImageReceiver().setAlpha(1.0f);
        anonymousClass1.getImageReceiver().setBlendMode(null);
        anonymousClass1.getImageReceiver().setGradientBitmap(null);
        wallpaperView.isSelected = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    wallpaperView.imageView.setImage(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", "jpg", j, 1, tL_wallPaper);
                    return;
                } else {
                    wallpaperView.imageView.setImage(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", "jpg", j, 1, tL_wallPaper);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true);
                if (tL_wallPaper.settings.intensity >= 0 || !Theme.currentTheme.isDark()) {
                    anonymousClass1.setBackground(motionBackgroundDrawable);
                    if (Build.VERSION.SDK_INT >= 29) {
                        anonymousClass1.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    anonymousClass1.getImageReceiver().setGradientBitmap(motionBackgroundDrawable.getBitmap());
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = MotionBackgroundDrawable.getPatternColor(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                anonymousClass1.setBackgroundColor(Theme.getWallpaperColor(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                anonymousClass1.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                wallpaperView.imageView.setImage(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), (String) null, "jpg", j, 1, tL_wallPaper);
            } else {
                wallpaperView.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "180_180", (ImageLocation) null, (String) null, "jpg", j, 1, tL_wallPaper);
            }
            anonymousClass1.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof WallpapersListActivity.ColorWallpaper)) {
            if (!(obj instanceof WallpapersListActivity.FileWallpaper)) {
                if (!(obj instanceof MediaController.SearchImage)) {
                    wallpaperView.isSelected = false;
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo == null) {
                    anonymousClass1.setImage(searchImage.thumbUrl, "180_180", null);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
                photoSize = closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3 ? closestPhotoSizeWithSize4 : null;
                wallpaperView.imageView.setImage(ImageLocation.getForPhoto(photoSize, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", "jpg", photoSize != null ? photoSize.size : 0, 1, searchImage);
                return;
            }
            WallpapersListActivity.FileWallpaper fileWallpaper = (WallpapersListActivity.FileWallpaper) obj;
            File file = fileWallpaper.originalPath;
            if (file != null) {
                anonymousClass1.setImage(file.getAbsolutePath(), "180_180", null);
                return;
            }
            File file2 = fileWallpaper.path;
            if (file2 != null) {
                anonymousClass1.setImage(file2.getAbsolutePath(), "180_180", null);
                return;
            } else if ("t".equals(fileWallpaper.slug)) {
                anonymousClass1.setImageDrawable(Theme.getThemedWallpaper(anonymousClass1, true));
                return;
            } else {
                anonymousClass1.setImageResource(fileWallpaper.thumbResId);
                return;
            }
        }
        WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj;
        if (colorWallpaper.path == null && colorWallpaper.pattern == null && !"d".equals(colorWallpaper.slug)) {
            anonymousClass1.setImageBitmap(null);
            if (colorWallpaper.isGradient) {
                anonymousClass1.setBackground(new MotionBackgroundDrawable(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3, true));
                return;
            } else if (colorWallpaper.gradientColor1 != 0) {
                anonymousClass1.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{colorWallpaper.color | (-16777216), colorWallpaper.gradientColor1 | (-16777216)}));
                return;
            } else {
                anonymousClass1.setBackgroundColor(colorWallpaper.color | (-16777216));
                return;
            }
        }
        if (colorWallpaper.gradientColor2 != 0) {
            MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3, true);
            if (colorWallpaper.intensity >= 0.0f) {
                anonymousClass1.setBackground(new MotionBackgroundDrawable(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3, true));
                if (Build.VERSION.SDK_INT >= 29) {
                    anonymousClass1.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                anonymousClass1.getImageReceiver().setGradientBitmap(motionBackgroundDrawable2.getBitmap());
            }
            patternColor = MotionBackgroundDrawable.getPatternColor(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3);
        } else {
            patternColor = AndroidUtilities.getPatternColor(colorWallpaper.color);
        }
        if ("d".equals(colorWallpaper.slug)) {
            if (colorWallpaper.defaultCache == null) {
                colorWallpaper.defaultCache = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            anonymousClass1.setImageBitmap(colorWallpaper.defaultCache);
            anonymousClass1.getImageReceiver().setAlpha(Math.abs(colorWallpaper.intensity));
            return;
        }
        File file3 = colorWallpaper.path;
        if (file3 != null) {
            anonymousClass1.setImage(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(colorWallpaper.pattern.document.thumbs, 100);
        wallpaperView.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize5, colorWallpaper.pattern.document), "180_180", (ImageLocation) null, (String) null, "jpg", closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : colorWallpaper.pattern.document.size, 1, colorWallpaper.pattern);
        anonymousClass1.getImageReceiver().setAlpha(Math.abs(colorWallpaper.intensity));
        if (Build.VERSION.SDK_INT < 29 || colorWallpaper.gradientColor2 == 0) {
            anonymousClass1.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor), PorterDuff.Mode.SRC_IN));
        }
    }
}
