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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.oj1;
import org.telegram.ui.pj1;
public final class bb extends FrameLayout {
    public final bi.k5 f20691a;
    public final ImageView f20692b;
    public final CheckBox f20693c;
    public final View d;
    public boolean e;
    public AnimatorSet f20694f;
    public Object h;
    public final cb f20695n;

    public bb(cb cbVar, Context context) {
        super(context);
        this.f20695n = cbVar;
        setWillNotDraw(false);
        bi.k5 k5Var = new bi.k5(this, context, 4);
        this.f20691a = k5Var;
        addView(k5Var, w7.z5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f20692b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
        addView(view, w7.z5.d(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f20693c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19691i7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19729k7, false));
        addView(checkBox, w7.z5.a(22.0f, 0.0f, 2.0f, 2.0f, 0.0f, 22, 53));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j10;
        long j11;
        int patternColor2;
        org.telegram.ui.Components.z9 z9Var;
        this.h = obj;
        org.telegram.ui.Components.z9 z9Var2 = this.f20691a;
        z9Var2.setVisibility(0);
        this.f20692b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        z9Var2.setBackgroundDrawable(null);
        z9Var2.getImageReceiver().setColorFilter(null);
        z9Var2.getImageReceiver().setAlpha(1.0f);
        z9Var2.getImageReceiver().setBlendMode(null);
        z9Var2.getImageReceiver().setGradientBitmap(null);
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
                    cd0 cd0Var = new cd0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.g6.I.q()) {
                        z9Var2.getImageReceiver().setGradientBitmap(cd0Var.f23700k);
                    } else {
                        z9Var2.setBackground(cd0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            z9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = cd0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    z9Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.Y0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    z9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    z9Var = z9Var2;
                    z9Var.k(forDocument, "180_180", forDocument2, null, j11, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    z9Var = z9Var2;
                    z9Var.k(forDocument3, "180_180", null, null, j11, "jpg", tL_wallPaper, 1);
                }
                z9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                z9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            } else {
                z9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof oj1) {
            oj1 oj1Var = (oj1) obj;
            File file = oj1Var.f38692i;
            int i11 = oj1Var.d;
            int i12 = oj1Var.f38689c;
            int i13 = oj1Var.f38688b;
            if (file == null && oj1Var.f38691g == null && !"d".equals(oj1Var.f38687a)) {
                z9Var2.setImageBitmap(null);
                if (oj1Var.f38694k) {
                    z9Var2.setBackground(new cd0(true, oj1Var.f38688b, oj1Var.f38689c, oj1Var.d, oj1Var.e));
                    return;
                } else if (i12 != 0) {
                    z9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    z9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                cd0 cd0Var2 = new cd0(true, oj1Var.f38688b, oj1Var.f38689c, oj1Var.d, oj1Var.e);
                if (oj1Var.h >= 0.0f) {
                    z9Var2.setBackground(new cd0(true, oj1Var.f38688b, oj1Var.f38689c, oj1Var.d, oj1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        z9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    z9Var2.getImageReceiver().setGradientBitmap(cd0Var2.f23700k);
                }
                patternColor = cd0.g(i13, i12, i11, oj1Var.e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(oj1Var.f38687a)) {
                if (oj1Var.f38696m == null) {
                    oj1Var.f38696m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                z9Var2.setImageBitmap(oj1Var.f38696m);
                z9Var2.getImageReceiver().setAlpha(Math.abs(oj1Var.h));
            } else if (file != null) {
                z9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(oj1Var.f38691g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = oj1Var.f38691g.document.size;
                }
                z9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, oj1Var.f38691g.document), "180_180", null, null, j10, "jpg", oj1Var.f38691g, 1);
                z9Var2.getImageReceiver().setAlpha(Math.abs(oj1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                z9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof pj1) {
            pj1 pj1Var = (pj1) obj;
            File file2 = pj1Var.e;
            if (file2 != null) {
                z9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = pj1Var.d;
            if (file3 != null) {
                z9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(pj1Var.f38961a)) {
                z9Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.X0(z9Var2, true));
            } else {
                z9Var2.setImageResource(pj1Var.f38963c);
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
                z9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            z9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f20694f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20694f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f20691a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cb cbVar = this.f20695n;
        if (!cbVar.f20744b || !this.f20693c.f22777x) {
            bi.k5 k5Var = this.f20691a;
            if (k5Var.getImageReceiver().hasBitmapImage() && k5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), cbVar.f20749s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
