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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
public final class eb extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final di.k4 f24044a;
    public final ImageView f24045b;
    public final CheckBox f24046c;
    public final View d;
    public boolean e;
    public AnimatorSet f24047f;
    public Object h;
    public int f24048n;
    public int f24049r;
    public final fb f24050s;

    public eb(fb fbVar, Context context) {
        super(context);
        this.f24050s = fbVar;
        setWillNotDraw(false);
        di.k4 k4Var = new di.k4(this, context, 4);
        this.f24044a = k4Var;
        addView(k4Var, gb1.i(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f24045b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, gb1.i(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
        addView(view, gb1.g(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f24046c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23485k7, false));
        addView(checkBox, gb1.h(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j10;
        long j11;
        int patternColor2;
        org.telegram.ui.Components.y9 y9Var;
        this.h = obj;
        org.telegram.ui.Components.y9 y9Var2 = this.f24044a;
        y9Var2.setVisibility(0);
        this.f24045b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        y9Var2.setBackgroundDrawable(null);
        y9Var2.getImageReceiver().setColorFilter(null);
        y9Var2.getImageReceiver().setAlpha(1.0f);
        y9Var2.getImageReceiver().setBlendMode(null);
        y9Var2.getImageReceiver().setGradientBitmap(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
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
                    uc0 uc0Var = new uc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.y6.I.q()) {
                        y9Var2.getImageReceiver().setGradientBitmap(uc0Var.f33364k);
                    } else {
                        y9Var2.setBackground(uc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            y9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = uc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    y9Var2.setBackgroundColor(org.telegram.ui.ActionBar.y6.Z0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    y9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    y9Var = y9Var2;
                    y9Var.k(forDocument, "180_180", forDocument2, null, j11, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    y9Var = y9Var2;
                    y9Var.k(forDocument3, "180_180", null, null, j11, "jpg", tL_wallPaper, 1);
                }
                y9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                y9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            } else {
                y9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof bi1) {
            bi1 bi1Var = (bi1) obj;
            File file = bi1Var.f38108i;
            int i11 = bi1Var.d;
            int i12 = bi1Var.f38105c;
            int i13 = bi1Var.f38104b;
            if (file == null && bi1Var.f38107g == null && !"d".equals(bi1Var.f38103a)) {
                y9Var2.setImageBitmap(null);
                if (bi1Var.f38110k) {
                    y9Var2.setBackground(new uc0(true, bi1Var.f38104b, bi1Var.f38105c, bi1Var.d, bi1Var.e));
                    return;
                } else if (i12 != 0) {
                    y9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    y9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                uc0 uc0Var2 = new uc0(true, bi1Var.f38104b, bi1Var.f38105c, bi1Var.d, bi1Var.e);
                if (bi1Var.h >= 0.0f) {
                    y9Var2.setBackground(new uc0(true, bi1Var.f38104b, bi1Var.f38105c, bi1Var.d, bi1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        y9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    y9Var2.getImageReceiver().setGradientBitmap(uc0Var2.f33364k);
                }
                patternColor = uc0.g(i13, i12, i11, bi1Var.e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(bi1Var.f38103a)) {
                if (bi1Var.f38112m == null) {
                    bi1Var.f38112m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                y9Var2.setImageBitmap(bi1Var.f38112m);
                y9Var2.getImageReceiver().setAlpha(Math.abs(bi1Var.h));
            } else if (file != null) {
                y9Var2.g(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(bi1Var.f38107g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = bi1Var.f38107g.document.size;
                }
                y9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, bi1Var.f38107g.document), "180_180", null, null, j10, "jpg", bi1Var.f38107g, 1);
                y9Var2.getImageReceiver().setAlpha(Math.abs(bi1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                y9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof ci1) {
            ci1 ci1Var = (ci1) obj;
            File file2 = ci1Var.e;
            if (file2 != null) {
                y9Var2.g(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = ci1Var.d;
            if (file3 != null) {
                y9Var2.g(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(ci1Var.f38469a)) {
                y9Var2.setImageDrawable(org.telegram.ui.ActionBar.y6.Y0(y9Var2, true));
            } else {
                y9Var2.setImageResource(ci1Var.f38471c);
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
                    i10 = closestPhotoSizeWithSize5.size;
                } else {
                    i10 = 0;
                }
                y9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            y9Var2.g(searchImage.thumbUrl, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f24047f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24047f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24044a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fb fbVar = this.f24050s;
        if (!fbVar.f24124b || !this.f24046c.f26074x) {
            di.k4 k4Var = this.f24044a;
            if (k4Var.getImageReceiver().hasBitmapImage() && k4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), fbVar.f24129s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i7, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23485k7, false);
            CheckBox checkBox = this.f24046c;
            if (checkBox != null) {
                if (x02 == this.f24048n) {
                    if (x03 != this.f24049r) {
                    }
                }
                this.f24048n = x02;
                this.f24049r = x03;
                checkBox.c(x02, x03);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
