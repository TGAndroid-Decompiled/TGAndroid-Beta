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
import org.telegram.ui.ij1;
import org.telegram.ui.jj1;
public final class bb extends FrameLayout {
    public final ai.z5 f21889a;
    public final ImageView f21890b;
    public final CheckBox f21891c;
    public final View d;
    public boolean f21892e;
    public AnimatorSet f21893f;
    public Object h;
    public final cb f21894n;

    public bb(cb cbVar, Context context) {
        super(context);
        this.f21894n = cbVar;
        setWillNotDraw(false);
        ai.z5 z5Var = new ai.z5(this, context, 4);
        this.f21889a = z5Var;
        addView(z5Var, w7.x5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f21890b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
        addView(view, w7.x5.d(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f21891c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20889i7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20926k7, false));
        addView(checkBox, w7.x5.a(22.0f, 0.0f, 2.0f, 2.0f, 0.0f, 22, 53));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j3;
        long j10;
        int patternColor2;
        org.telegram.ui.Components.y9 y9Var;
        this.h = obj;
        org.telegram.ui.Components.y9 y9Var2 = this.f21889a;
        y9Var2.setVisibility(0);
        this.f21890b.setVisibility(4);
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
        this.f21892e = z10;
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
                    cd0 cd0Var = new cd0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.i6.I.q()) {
                        y9Var2.getImageReceiver().setGradientBitmap(cd0Var.f25341k);
                    } else {
                        y9Var2.setBackground(cd0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            y9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = cd0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    y9Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.Y0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    y9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    y9Var = y9Var2;
                    y9Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    y9Var = y9Var2;
                    y9Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
                }
                y9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                y9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            } else {
                y9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof ij1) {
            ij1 ij1Var = (ij1) obj;
            File file = ij1Var.f38679i;
            int i11 = ij1Var.d;
            int i12 = ij1Var.f38675c;
            int i13 = ij1Var.f38674b;
            if (file == null && ij1Var.f38678g == null && !"d".equals(ij1Var.f38673a)) {
                y9Var2.setImageBitmap(null);
                if (ij1Var.f38681k) {
                    y9Var2.setBackground(new cd0(true, ij1Var.f38674b, ij1Var.f38675c, ij1Var.d, ij1Var.f38676e));
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
                cd0 cd0Var2 = new cd0(true, ij1Var.f38674b, ij1Var.f38675c, ij1Var.d, ij1Var.f38676e);
                if (ij1Var.h >= 0.0f) {
                    y9Var2.setBackground(new cd0(true, ij1Var.f38674b, ij1Var.f38675c, ij1Var.d, ij1Var.f38676e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        y9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    y9Var2.getImageReceiver().setGradientBitmap(cd0Var2.f25341k);
                }
                patternColor = cd0.g(i13, i12, i11, ij1Var.f38676e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(ij1Var.f38673a)) {
                if (ij1Var.f38683m == null) {
                    ij1Var.f38683m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                y9Var2.setImageBitmap(ij1Var.f38683m);
                y9Var2.getImageReceiver().setAlpha(Math.abs(ij1Var.h));
            } else if (file != null) {
                y9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(ij1Var.f38678g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j3 = closestPhotoSizeWithSize3.size;
                } else {
                    j3 = ij1Var.f38678g.document.size;
                }
                y9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, ij1Var.f38678g.document), "180_180", null, null, j3, "jpg", ij1Var.f38678g, 1);
                y9Var2.getImageReceiver().setAlpha(Math.abs(ij1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                y9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof jj1) {
            jj1 jj1Var = (jj1) obj;
            File file2 = jj1Var.f38963e;
            if (file2 != null) {
                y9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = jj1Var.d;
            if (file3 != null) {
                y9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(jj1Var.f38960a)) {
                y9Var2.setImageDrawable(org.telegram.ui.ActionBar.i6.X0(y9Var2, true));
            } else {
                y9Var2.setImageResource(jj1Var.f38962c);
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
            y9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.f21892e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f21893f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21893f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f21889a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cb cbVar = this.f21894n;
        if (!cbVar.f21949b || !this.f21891c.f24081x) {
            ai.z5 z5Var = this.f21889a;
            if (z5Var.getImageReceiver().hasBitmapImage() && z5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), cbVar.f21955s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
