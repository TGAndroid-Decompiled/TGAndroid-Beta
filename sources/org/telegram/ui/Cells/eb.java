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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.fj1;
import org.telegram.ui.gj1;
public final class eb extends FrameLayout {
    public final ai.z5 f20064a;
    public final ImageView f20065b;
    public final CheckBox f20066c;
    public final View d;
    public boolean e;
    public AnimatorSet f20067f;
    public Object h;
    public final fb f20068n;

    public eb(fb fbVar, Context context) {
        super(context);
        this.f20068n = fbVar;
        setWillNotDraw(false);
        ai.z5 z5Var = new ai.z5(this, context, 4);
        this.f20064a = z5Var;
        addView(z5Var, w7.x5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f20065b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.x5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f20066c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18954i7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18992k7, false));
        addView(checkBox, w7.x5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j3;
        long j10;
        int patternColor2;
        org.telegram.ui.Components.u9 u9Var;
        this.h = obj;
        org.telegram.ui.Components.u9 u9Var2 = this.f20064a;
        u9Var2.setVisibility(0);
        this.f20065b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        u9Var2.setBackgroundDrawable(null);
        u9Var2.getImageReceiver().setColorFilter(null);
        u9Var2.getImageReceiver().setAlpha(1.0f);
        u9Var2.getImageReceiver().setBlendMode(null);
        u9Var2.getImageReceiver().setGradientBitmap(null);
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
                j10 = photoSize.size;
            } else {
                j10 = tL_wallPaper.document.size;
            }
            if (tL_wallPaper.pattern) {
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings.third_background_color != 0) {
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    cc0 cc0Var = new cc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.j6.I.q()) {
                        u9Var2.getImageReceiver().setGradientBitmap(cc0Var.f23009k);
                    } else {
                        u9Var2.setBackground(cc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            u9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = cc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    u9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    u9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    u9Var = u9Var2;
                    u9Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    u9Var = u9Var2;
                    u9Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
                }
                u9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                u9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            } else {
                u9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof fj1) {
            fj1 fj1Var = (fj1) obj;
            File file = fj1Var.f33713i;
            int i11 = fj1Var.d;
            int i12 = fj1Var.f33710c;
            int i13 = fj1Var.f33709b;
            if (file == null && fj1Var.f33712g == null && !"d".equals(fj1Var.f33708a)) {
                u9Var2.setImageBitmap(null);
                if (fj1Var.f33715k) {
                    u9Var2.setBackground(new cc0(true, fj1Var.f33709b, fj1Var.f33710c, fj1Var.d, fj1Var.e));
                    return;
                } else if (i12 != 0) {
                    u9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    u9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                cc0 cc0Var2 = new cc0(true, fj1Var.f33709b, fj1Var.f33710c, fj1Var.d, fj1Var.e);
                if (fj1Var.h >= 0.0f) {
                    u9Var2.setBackground(new cc0(true, fj1Var.f33709b, fj1Var.f33710c, fj1Var.d, fj1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        u9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    u9Var2.getImageReceiver().setGradientBitmap(cc0Var2.f23009k);
                }
                patternColor = cc0.g(i13, i12, i11, fj1Var.e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(fj1Var.f33708a)) {
                if (fj1Var.f33717m == null) {
                    fj1Var.f33717m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                u9Var2.setImageBitmap(fj1Var.f33717m);
                u9Var2.getImageReceiver().setAlpha(Math.abs(fj1Var.h));
            } else if (file != null) {
                u9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(fj1Var.f33712g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j3 = closestPhotoSizeWithSize3.size;
                } else {
                    j3 = fj1Var.f33712g.document.size;
                }
                u9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, fj1Var.f33712g.document), "180_180", null, null, j3, "jpg", fj1Var.f33712g, 1);
                u9Var2.getImageReceiver().setAlpha(Math.abs(fj1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                u9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof gj1) {
            gj1 gj1Var = (gj1) obj;
            File file2 = gj1Var.e;
            if (file2 != null) {
                u9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = gj1Var.d;
            if (file3 != null) {
                u9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(gj1Var.f34006a)) {
                u9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(u9Var2, true));
            } else {
                u9Var2.setImageResource(gj1Var.f34008c);
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
                u9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            u9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f20067f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20067f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f20064a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fb fbVar = this.f20068n;
        if (!fbVar.f20126b || !this.f20066c.f21970x) {
            ai.z5 z5Var = this.f20064a;
            if (z5Var.getImageReceiver().hasBitmapImage() && z5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), fbVar.f20131s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
