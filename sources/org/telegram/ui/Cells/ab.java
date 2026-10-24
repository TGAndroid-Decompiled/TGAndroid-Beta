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
import org.telegram.ui.Components.wc0;
import org.telegram.ui.yh1;
import org.telegram.ui.zh1;
public final class ab extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ci.j4 f22109a;
    public final ImageView f22110b;
    public final CheckBox f22111c;
    public final View d;
    public boolean e;
    public AnimatorSet f22112f;
    public Object h;
    public int f22113n;
    public int f22114r;
    public final bb f22115s;

    public ab(bb bbVar, Context context) {
        super(context);
        this.f22115s = bbVar;
        setWillNotDraw(false);
        ci.j4 j4Var = new ci.j4(this, context, 4);
        this.f22109a = j4Var;
        addView(j4Var, w7.z5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f22110b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
        addView(view, w7.z5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f22111c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21274i7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21312k7, false));
        addView(checkBox, w7.z5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j10;
        long j11;
        int patternColor2;
        org.telegram.ui.Components.u9 u9Var;
        this.h = obj;
        org.telegram.ui.Components.u9 u9Var2 = this.f22109a;
        u9Var2.setVisibility(0);
        this.f22110b.setVisibility(4);
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
                j11 = photoSize.size;
            } else {
                j11 = tL_wallPaper.document.size;
            }
            if (tL_wallPaper.pattern) {
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings.third_background_color != 0) {
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    wc0 wc0Var = new wc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.k6.I.q()) {
                        u9Var2.getImageReceiver().setGradientBitmap(wc0Var.f32200k);
                    } else {
                        u9Var2.setBackground(wc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            u9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = wc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    u9Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.Z0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    u9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    u9Var = u9Var2;
                    u9Var.k(forDocument, "180_180", forDocument2, null, j11, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    u9Var = u9Var2;
                    u9Var.k(forDocument3, "180_180", null, null, j11, "jpg", tL_wallPaper, 1);
                }
                u9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                u9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            } else {
                u9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof yh1) {
            yh1 yh1Var = (yh1) obj;
            File file = yh1Var.f43868i;
            int i11 = yh1Var.d;
            int i12 = yh1Var.f43865c;
            int i13 = yh1Var.f43864b;
            if (file == null && yh1Var.f43867g == null && !"d".equals(yh1Var.f43863a)) {
                u9Var2.setImageBitmap(null);
                if (yh1Var.f43870k) {
                    u9Var2.setBackground(new wc0(true, yh1Var.f43864b, yh1Var.f43865c, yh1Var.d, yh1Var.e));
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
                wc0 wc0Var2 = new wc0(true, yh1Var.f43864b, yh1Var.f43865c, yh1Var.d, yh1Var.e);
                if (yh1Var.h >= 0.0f) {
                    u9Var2.setBackground(new wc0(true, yh1Var.f43864b, yh1Var.f43865c, yh1Var.d, yh1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        u9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    u9Var2.getImageReceiver().setGradientBitmap(wc0Var2.f32200k);
                }
                patternColor = wc0.g(i13, i12, i11, yh1Var.e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(yh1Var.f43863a)) {
                if (yh1Var.f43872m == null) {
                    yh1Var.f43872m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                u9Var2.setImageBitmap(yh1Var.f43872m);
                u9Var2.getImageReceiver().setAlpha(Math.abs(yh1Var.h));
            } else if (file != null) {
                u9Var2.g(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(yh1Var.f43867g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = yh1Var.f43867g.document.size;
                }
                u9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, yh1Var.f43867g.document), "180_180", null, null, j10, "jpg", yh1Var.f43867g, 1);
                u9Var2.getImageReceiver().setAlpha(Math.abs(yh1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                u9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof zh1) {
            zh1 zh1Var = (zh1) obj;
            File file2 = zh1Var.e;
            if (file2 != null) {
                u9Var2.g(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = zh1Var.d;
            if (file3 != null) {
                u9Var2.g(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(zh1Var.f44110a)) {
                u9Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.Y0(u9Var2, true));
            } else {
                u9Var2.setImageResource(zh1Var.f44112c);
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
            u9Var2.g(searchImage.thumbUrl, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f22112f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22112f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22109a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bb bbVar = this.f22115s;
        if (!bbVar.f22191b || !this.f22111c.f24282x) {
            ci.j4 j4Var = this.f22109a;
            if (j4Var.getImageReceiver().hasBitmapImage() && j4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), bbVar.f22196s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21274i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21312k7, false);
            CheckBox checkBox = this.f22111c;
            if (checkBox != null) {
                if (x02 == this.f22113n) {
                    if (x03 != this.f22114r) {
                    }
                }
                this.f22113n = x02;
                this.f22114r = x03;
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
