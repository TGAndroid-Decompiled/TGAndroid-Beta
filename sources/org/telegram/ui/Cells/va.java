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
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ai1;
import org.telegram.ui.zh1;
public final class va extends FrameLayout {
    public final lh.y3 f25843a;
    public final ImageView f25844b;
    public final CheckBox f25845c;
    public final View d;
    public boolean f25846e;
    public AnimatorSet f25847f;
    public Object h;
    public final wa f25848n;

    public va(wa waVar, Context context) {
        super(context);
        this.f25848n = waVar;
        setWillNotDraw(false);
        lh.y3 y3Var = new lh.y3(this, context, 3);
        this.f25843a = y3Var;
        addView(y3Var, i7.f6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f25844b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, i7.f6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f25845c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23153i7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190k7, false));
        addView(checkBox, i7.f6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j10;
        long j11;
        int patternColor2;
        org.telegram.ui.Components.t9 t9Var;
        this.h = obj;
        org.telegram.ui.Components.t9 t9Var2 = this.f25843a;
        t9Var2.setVisibility(0);
        this.f25844b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        t9Var2.setBackgroundDrawable(null);
        t9Var2.getImageReceiver().setColorFilter(null);
        t9Var2.getImageReceiver().setAlpha(1.0f);
        t9Var2.getImageReceiver().setBlendMode(null);
        t9Var2.getImageReceiver().setGradientBitmap(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25846e = z10;
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
                    yb0 yb0Var = new yb0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.g6.I.q()) {
                        t9Var2.getImageReceiver().setGradientBitmap(yb0Var.f35026k);
                    } else {
                        t9Var2.setBackground(yb0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            t9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = yb0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    t9Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    t9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    t9Var = t9Var2;
                    t9Var.k(forDocument, "180_180", forDocument2, null, j11, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    t9Var = t9Var2;
                    t9Var.k(forDocument3, "180_180", null, null, j11, "jpg", tL_wallPaper, 1);
                }
                t9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                t9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            } else {
                t9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j11, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof zh1) {
            zh1 zh1Var = (zh1) obj;
            File file = zh1Var.f45231i;
            int i11 = zh1Var.d;
            int i12 = zh1Var.f45227c;
            int i13 = zh1Var.f45226b;
            if (file == null && zh1Var.f45230g == null && !"d".equals(zh1Var.f45225a)) {
                t9Var2.setImageBitmap(null);
                if (zh1Var.f45233k) {
                    t9Var2.setBackground(new yb0(true, zh1Var.f45226b, zh1Var.f45227c, zh1Var.d, zh1Var.f45228e));
                    return;
                } else if (i12 != 0) {
                    t9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    t9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                yb0 yb0Var2 = new yb0(true, zh1Var.f45226b, zh1Var.f45227c, zh1Var.d, zh1Var.f45228e);
                if (zh1Var.h >= 0.0f) {
                    t9Var2.setBackground(new yb0(true, zh1Var.f45226b, zh1Var.f45227c, zh1Var.d, zh1Var.f45228e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        t9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    t9Var2.getImageReceiver().setGradientBitmap(yb0Var2.f35026k);
                }
                patternColor = yb0.g(i13, i12, i11, zh1Var.f45228e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(zh1Var.f45225a)) {
                if (zh1Var.f45235m == null) {
                    zh1Var.f45235m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                t9Var2.setImageBitmap(zh1Var.f45235m);
                t9Var2.getImageReceiver().setAlpha(Math.abs(zh1Var.h));
            } else if (file != null) {
                t9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(zh1Var.f45230g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = zh1Var.f45230g.document.size;
                }
                t9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, zh1Var.f45230g.document), "180_180", null, null, j10, "jpg", zh1Var.f45230g, 1);
                t9Var2.getImageReceiver().setAlpha(Math.abs(zh1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                t9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof ai1) {
            ai1 ai1Var = (ai1) obj;
            File file2 = ai1Var.f36560e;
            if (file2 != null) {
                t9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = ai1Var.d;
            if (file3 != null) {
                t9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(ai1Var.f36557a)) {
                t9Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.W0(t9Var2, true));
            } else {
                t9Var2.setImageResource(ai1Var.f36559c);
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
                t9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            t9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.f25846e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f25847f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f25847f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25843a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wa waVar = this.f25848n;
        if (!waVar.f25889b || !this.f25845c.f26308x) {
            lh.y3 y3Var = this.f25843a;
            if (y3Var.getImageReceiver().hasBitmapImage() && y3Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), waVar.f25895s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
