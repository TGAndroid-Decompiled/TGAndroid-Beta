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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.xh1;
import org.telegram.ui.yh1;
public final class ya extends FrameLayout {
    public final ih.d4 f26000a;
    public final ImageView f26001b;
    public final CheckBox f26002c;
    public final View d;
    public boolean f26003e;
    public AnimatorSet f26004f;
    public Object h;
    public final za f26005n;

    public ya(za zaVar, Context context) {
        super(context);
        this.f26005n = zaVar;
        setWillNotDraw(false);
        ih.d4 d4Var = new ih.d4(this, context, 3);
        this.f26000a = d4Var;
        addView(d4Var, g7.e6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f26001b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
        addView(view, g7.e6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f26002c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23093i7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23128k7, false));
        addView(checkBox, g7.e6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i9;
        int patternColor;
        long j10;
        long j11;
        int patternColor2;
        org.telegram.ui.Components.o9 o9Var;
        this.h = obj;
        org.telegram.ui.Components.o9 o9Var2 = this.f26000a;
        o9Var2.setVisibility(0);
        this.f26001b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        o9Var2.setBackgroundDrawable(null);
        o9Var2.getImageReceiver().setColorFilter(null);
        o9Var2.getImageReceiver().setAlpha(1.0f);
        o9Var2.getImageReceiver().setBlendMode(null);
        o9Var2.getImageReceiver().setGradientBitmap(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26003e = z10;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                photoSize = closestPhotoSizeWithSize2;
            }
            if (photoSize != null) {
                j11 = photoSize.size;
            } else {
                j11 = tL_wallPaper.document.size;
            }
            if (tL_wallPaper.pattern) {
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings.third_background_color != 0) {
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    jb0 jb0Var = new jb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.f6.I.q()) {
                        o9Var2.getImageReceiver().setGradientBitmap(jb0Var.f29698k);
                    } else {
                        o9Var2.setBackground(jb0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            o9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = jb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    o9Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.X0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    o9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    o9Var = o9Var2;
                    o9Var.k(forDocument, "180_180", forDocument2, null, j11, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    o9Var = o9Var2;
                    o9Var.k(forDocument3, "180_180", null, null, j11, "jpg", tL_wallPaper, 1);
                }
                o9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                o9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            } else {
                o9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof xh1) {
            xh1 xh1Var = (xh1) obj;
            File file = xh1Var.f44526i;
            int i10 = xh1Var.d;
            int i11 = xh1Var.f44522c;
            int i12 = xh1Var.f44521b;
            if (file == null && xh1Var.f44525g == null && !"d".equals(xh1Var.f44520a)) {
                o9Var2.setImageBitmap(null);
                if (xh1Var.f44528k) {
                    o9Var2.setBackground(new jb0(true, xh1Var.f44521b, xh1Var.f44522c, xh1Var.d, xh1Var.f44523e));
                    return;
                } else if (i11 != 0) {
                    o9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                    return;
                } else {
                    o9Var2.setBackgroundColor(i12 | (-16777216));
                    return;
                }
            }
            if (i10 != 0) {
                jb0 jb0Var2 = new jb0(true, xh1Var.f44521b, xh1Var.f44522c, xh1Var.d, xh1Var.f44523e);
                if (xh1Var.h >= 0.0f) {
                    o9Var2.setBackground(new jb0(true, xh1Var.f44521b, xh1Var.f44522c, xh1Var.d, xh1Var.f44523e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        o9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    o9Var2.getImageReceiver().setGradientBitmap(jb0Var2.f29698k);
                }
                patternColor = jb0.g(i12, i11, i10, xh1Var.f44523e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i12);
            }
            int i13 = patternColor;
            if ("d".equals(xh1Var.f44520a)) {
                if (xh1Var.f44530m == null) {
                    xh1Var.f44530m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                o9Var2.setImageBitmap(xh1Var.f44530m);
                o9Var2.getImageReceiver().setAlpha(Math.abs(xh1Var.h));
            } else if (file != null) {
                o9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(xh1Var.f44525g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = xh1Var.f44525g.document.size;
                }
                o9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, xh1Var.f44525g.document), "180_180", null, null, j10, "jpg", xh1Var.f44525g, 1);
                o9Var2.getImageReceiver().setAlpha(Math.abs(xh1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i10 != 0) {
                    return;
                }
                o9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof yh1) {
            yh1 yh1Var = (yh1) obj;
            File file2 = yh1Var.f44880e;
            if (file2 != null) {
                o9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = yh1Var.d;
            if (file3 != null) {
                o9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(yh1Var.f44877a)) {
                o9Var2.setImageDrawable(org.telegram.ui.ActionBar.f6.W0(o9Var2, true));
            } else {
                o9Var2.setImageResource(yh1Var.f44879c);
            }
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
                TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
                if (closestPhotoSizeWithSize5 == closestPhotoSizeWithSize4) {
                    closestPhotoSizeWithSize5 = null;
                }
                if (closestPhotoSizeWithSize5 != null) {
                    i9 = closestPhotoSizeWithSize5.size;
                } else {
                    i9 = 0;
                }
                o9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i9, "jpg", searchImage, 1);
                return;
            }
            o9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.f26003e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f26004f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26004f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26000a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        za zaVar = this.f26005n;
        if (!zaVar.f26049b || !this.f26002c.f26297x) {
            ih.d4 d4Var = this.f26000a;
            if (d4Var.getImageReceiver().hasBitmapImage() && d4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zaVar.f26055s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
