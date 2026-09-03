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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.ui1;
import org.telegram.ui.vi1;
public final class xa extends FrameLayout {
    public final nh.y3 f22563a;
    public final ImageView f22564b;
    public final CheckBox f22565c;
    public final View d;
    public boolean e;
    public AnimatorSet f22566f;
    public Object h;
    public final ya f22567n;

    public xa(ya yaVar, Context context) {
        super(context);
        this.f22567n = yaVar;
        setWillNotDraw(false);
        nh.y3 y3Var = new nh.y3(this, context, 3);
        this.f22563a = y3Var;
        addView(y3Var, k7.b6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f22564b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, k7.b6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f22565c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19972i7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20007k7, false));
        addView(checkBox, k7.b6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z4;
        int i10;
        int patternColor;
        long j10;
        long j11;
        int patternColor2;
        org.telegram.ui.Components.p9 p9Var;
        this.h = obj;
        org.telegram.ui.Components.p9 p9Var2 = this.f22563a;
        p9Var2.setVisibility(0);
        this.f22564b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        p9Var2.setBackgroundDrawable(null);
        p9Var2.getImageReceiver().setColorFilter(null);
        p9Var2.getImageReceiver().setAlpha(1.0f);
        p9Var2.getImageReceiver().setBlendMode(null);
        p9Var2.getImageReceiver().setGradientBitmap(null);
        if (obj == obj2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e = z4;
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
                    ec0 ec0Var = new ec0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.j6.I.q()) {
                        p9Var2.getImageReceiver().setGradientBitmap(ec0Var.f24580k);
                    } else {
                        p9Var2.setBackground(ec0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = ec0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    p9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    p9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    p9Var = p9Var2;
                    p9Var.k(forDocument, "180_180", forDocument2, null, j11, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    p9Var = p9Var2;
                    p9Var.k(forDocument3, "180_180", null, null, j11, "jpg", tL_wallPaper, 1);
                }
                p9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                p9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            } else {
                p9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof ui1) {
            ui1 ui1Var = (ui1) obj;
            File file = ui1Var.f38862i;
            int i11 = ui1Var.d;
            int i12 = ui1Var.f38859c;
            int i13 = ui1Var.f38858b;
            if (file == null && ui1Var.f38861g == null && !"d".equals(ui1Var.f38857a)) {
                p9Var2.setImageBitmap(null);
                if (ui1Var.f38864k) {
                    p9Var2.setBackground(new ec0(true, ui1Var.f38858b, ui1Var.f38859c, ui1Var.d, ui1Var.e));
                    return;
                } else if (i12 != 0) {
                    p9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    p9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                ec0 ec0Var2 = new ec0(true, ui1Var.f38858b, ui1Var.f38859c, ui1Var.d, ui1Var.e);
                if (ui1Var.h >= 0.0f) {
                    p9Var2.setBackground(new ec0(true, ui1Var.f38858b, ui1Var.f38859c, ui1Var.d, ui1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    p9Var2.getImageReceiver().setGradientBitmap(ec0Var2.f24580k);
                }
                patternColor = ec0.g(i13, i12, i11, ui1Var.e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(ui1Var.f38857a)) {
                if (ui1Var.f38866m == null) {
                    ui1Var.f38866m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                p9Var2.setImageBitmap(ui1Var.f38866m);
                p9Var2.getImageReceiver().setAlpha(Math.abs(ui1Var.h));
            } else if (file != null) {
                p9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(ui1Var.f38861g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = ui1Var.f38861g.document.size;
                }
                p9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, ui1Var.f38861g.document), "180_180", null, null, j10, "jpg", ui1Var.f38861g, 1);
                p9Var2.getImageReceiver().setAlpha(Math.abs(ui1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                p9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof vi1) {
            vi1 vi1Var = (vi1) obj;
            File file2 = vi1Var.e;
            if (file2 != null) {
                p9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = vi1Var.d;
            if (file3 != null) {
                p9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(vi1Var.f39120a)) {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(p9Var2, true));
            } else {
                p9Var2.setImageResource(vi1Var.f39122c);
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
                p9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            p9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f22566f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22566f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22563a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ya yaVar = this.f22567n;
        if (!yaVar.f22643b || !this.f22565c.f22923x) {
            nh.y3 y3Var = this.f22563a;
            if (y3Var.getImageReceiver().hasBitmapImage() && y3Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yaVar.f22648s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
