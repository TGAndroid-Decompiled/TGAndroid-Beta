package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.wh1;
import org.telegram.ui.xh1;

public final class va extends FrameLayout {

    public final jh.z3 f25827a;

    public final ImageView f25828b;

    public final CheckBox f25829c;
    public final View d;

    public boolean f25830e;

    public AnimatorSet f25831f;
    public Object h;

    public final wa f25832n;

    public va(wa waVar, Context context) {
        super(context);
        this.f25832n = waVar;
        setWillNotDraw(false);
        jh.z3 z3Var = new jh.z3(this, context, 3);
        this.f25827a = z3Var;
        addView(z3Var, h7.z5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f25828b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, h7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, h7.z5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f25829c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23145i7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23182k7, false));
        addView(checkBox, h7.z5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        jh.z3 z3Var;
        this.h = obj;
        jh.z3 z3Var2 = this.f25827a;
        z3Var2.setVisibility(0);
        this.f25828b.setVisibility(4);
        z3Var2.setBackgroundDrawable(null);
        z3Var2.getImageReceiver().setColorFilter(null);
        z3Var2.getImageReceiver().setAlpha(1.0f);
        z3Var2.getImageReceiver().setBlendMode(null);
        z3Var2.getImageReceiver().setGradientBitmap(null);
        this.f25830e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    z3Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    z3Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                nb0 nb0Var = new nb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.g6.I.q()) {
                    z3Var2.setBackground(nb0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        z3Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    z3Var2.getImageReceiver().setGradientBitmap(nb0Var.f30929k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = nb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                z3Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                z3Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                z3Var = z3Var2;
                z3Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                z3Var = z3Var2;
                z3Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
            }
            z3Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof wh1)) {
            if (obj instanceof xh1) {
                xh1 xh1Var = (xh1) obj;
                File file = xh1Var.f44470e;
                if (file != null) {
                    z3Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = xh1Var.d;
                if (file2 != null) {
                    z3Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(xh1Var.f44467a)) {
                    z3Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.W0(z3Var2, true));
                    return;
                } else {
                    z3Var2.setImageResource(xh1Var.f44469c);
                    return;
                }
            }
            if (!(obj instanceof MediaController.SearchImage)) {
                this.f25830e = false;
                return;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo == null) {
                z3Var2.f(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            z3Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        wh1 wh1Var = (wh1) obj;
        File file3 = wh1Var.f44126i;
        int i10 = wh1Var.d;
        int i11 = wh1Var.f44122c;
        int i12 = wh1Var.f44121b;
        if (file3 == null && wh1Var.f44125g == null && !"d".equals(wh1Var.f44120a)) {
            z3Var2.setImageBitmap(null);
            if (wh1Var.f44128k) {
                z3Var2.setBackground(new nb0(true, wh1Var.f44121b, wh1Var.f44122c, wh1Var.d, wh1Var.f44123e));
                return;
            } else if (i11 != 0) {
                z3Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                z3Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            nb0 nb0Var2 = new nb0(true, wh1Var.f44121b, wh1Var.f44122c, wh1Var.d, wh1Var.f44123e);
            if (wh1Var.h >= 0.0f) {
                z3Var2.setBackground(new nb0(true, wh1Var.f44121b, wh1Var.f44122c, wh1Var.d, wh1Var.f44123e));
                if (Build.VERSION.SDK_INT >= 29) {
                    z3Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                z3Var2.getImageReceiver().setGradientBitmap(nb0Var2.f30929k);
            }
            patternColor = nb0.g(i12, i11, i10, wh1Var.f44123e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(wh1Var.f44120a)) {
            if (wh1Var.f44130m == null) {
                wh1Var.f44130m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            z3Var2.setImageBitmap(wh1Var.f44130m);
            z3Var2.getImageReceiver().setAlpha(Math.abs(wh1Var.h));
            return;
        }
        if (file3 != null) {
            z3Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(wh1Var.f44125g.document.thumbs, 100);
        z3Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, wh1Var.f44125g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : wh1Var.f44125g.document.size, "jpg", wh1Var.f44125g, 1);
        z3Var2.getImageReceiver().setAlpha(Math.abs(wh1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            z3Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f25831f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f25831f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25827a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wa waVar = this.f25832n;
        if (!waVar.f25901b || !this.f25829c.f26293x) {
            jh.z3 z3Var = this.f25827a;
            if (z3Var.getImageReceiver().hasBitmapImage() && z3Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), waVar.f25907s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
