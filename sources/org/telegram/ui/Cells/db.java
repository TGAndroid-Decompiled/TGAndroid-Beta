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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.gj1;
import org.telegram.ui.hj1;
public final class db extends FrameLayout {
    public final bi.i5 f21832a;
    public final ImageView f21833b;
    public final CheckBox f21834c;
    public final View d;
    public boolean f21835e;
    public AnimatorSet f21836f;
    public Object h;
    public final eb f21837n;

    public db(eb ebVar, Context context) {
        super(context);
        this.f21837n = ebVar;
        setWillNotDraw(false);
        bi.i5 i5Var = new bi.i5(this, context, 4);
        this.f21832a = i5Var;
        addView(i5Var, w7.x5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f21833b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.x5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f21834c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20782i7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20820k7, false));
        addView(checkBox, w7.x5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j3;
        long j10;
        int patternColor2;
        org.telegram.ui.Components.x9 x9Var;
        this.h = obj;
        org.telegram.ui.Components.x9 x9Var2 = this.f21832a;
        x9Var2.setVisibility(0);
        this.f21833b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        x9Var2.setBackgroundDrawable(null);
        x9Var2.getImageReceiver().setColorFilter(null);
        x9Var2.getImageReceiver().setAlpha(1.0f);
        x9Var2.getImageReceiver().setBlendMode(null);
        x9Var2.getImageReceiver().setGradientBitmap(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21835e = z10;
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
                    dc0 dc0Var = new dc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.j6.I.q()) {
                        x9Var2.getImageReceiver().setGradientBitmap(dc0Var.f25381k);
                    } else {
                        x9Var2.setBackground(dc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            x9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = dc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    x9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    x9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    x9Var = x9Var2;
                    x9Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    x9Var = x9Var2;
                    x9Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
                }
                x9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                x9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            } else {
                x9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof gj1) {
            gj1 gj1Var = (gj1) obj;
            File file = gj1Var.f36731i;
            int i11 = gj1Var.d;
            int i12 = gj1Var.f36727c;
            int i13 = gj1Var.f36726b;
            if (file == null && gj1Var.f36730g == null && !"d".equals(gj1Var.f36725a)) {
                x9Var2.setImageBitmap(null);
                if (gj1Var.f36733k) {
                    x9Var2.setBackground(new dc0(true, gj1Var.f36726b, gj1Var.f36727c, gj1Var.d, gj1Var.f36728e));
                    return;
                } else if (i12 != 0) {
                    x9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    x9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                dc0 dc0Var2 = new dc0(true, gj1Var.f36726b, gj1Var.f36727c, gj1Var.d, gj1Var.f36728e);
                if (gj1Var.h >= 0.0f) {
                    x9Var2.setBackground(new dc0(true, gj1Var.f36726b, gj1Var.f36727c, gj1Var.d, gj1Var.f36728e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        x9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    x9Var2.getImageReceiver().setGradientBitmap(dc0Var2.f25381k);
                }
                patternColor = dc0.g(i13, i12, i11, gj1Var.f36728e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(gj1Var.f36725a)) {
                if (gj1Var.f36735m == null) {
                    gj1Var.f36735m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                x9Var2.setImageBitmap(gj1Var.f36735m);
                x9Var2.getImageReceiver().setAlpha(Math.abs(gj1Var.h));
            } else if (file != null) {
                x9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(gj1Var.f36730g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j3 = closestPhotoSizeWithSize3.size;
                } else {
                    j3 = gj1Var.f36730g.document.size;
                }
                x9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, gj1Var.f36730g.document), "180_180", null, null, j3, "jpg", gj1Var.f36730g, 1);
                x9Var2.getImageReceiver().setAlpha(Math.abs(gj1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                x9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof hj1) {
            hj1 hj1Var = (hj1) obj;
            File file2 = hj1Var.f37082e;
            if (file2 != null) {
                x9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = hj1Var.d;
            if (file3 != null) {
                x9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(hj1Var.f37079a)) {
                x9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(x9Var2, true));
            } else {
                x9Var2.setImageResource(hj1Var.f37081c);
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
                x9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            x9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.f21835e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f21836f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21836f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f21832a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eb ebVar = this.f21837n;
        if (!ebVar.f21914b || !this.f21834c.f23919x) {
            bi.i5 i5Var = this.f21832a;
            if (i5Var.getImageReceiver().hasBitmapImage() && i5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ebVar.f21920s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
