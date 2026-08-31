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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.pi1;
import org.telegram.ui.qi1;
public final class ya extends FrameLayout {
    public final oh.a4 f24463a;
    public final ImageView f24464b;
    public final CheckBox f24465c;
    public final View d;
    public boolean f24466e;
    public AnimatorSet f24467f;
    public Object h;
    public final za f24468n;

    public ya(za zaVar, Context context) {
        super(context);
        this.f24468n = zaVar;
        setWillNotDraw(false);
        oh.a4 a4Var = new oh.a4(this, context, 3);
        this.f24463a = a4Var;
        addView(a4Var, k7.c6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f24464b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
        addView(view, k7.c6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f24465c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21751i7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21786k7, false));
        addView(checkBox, k7.c6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
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
        org.telegram.ui.Components.p9 p9Var2 = this.f24463a;
        p9Var2.setVisibility(0);
        this.f24464b.setVisibility(4);
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
        this.f24466e = z4;
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
                    fc0 fc0Var = new fc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.k6.I.q()) {
                        p9Var2.getImageReceiver().setGradientBitmap(fc0Var.f26879k);
                    } else {
                        p9Var2.setBackground(fc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = fc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    p9Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.X0(wallPaperSettings.background_color));
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
        } else if (obj instanceof pi1) {
            pi1 pi1Var = (pi1) obj;
            File file = pi1Var.f40062i;
            int i11 = pi1Var.d;
            int i12 = pi1Var.f40058c;
            int i13 = pi1Var.f40057b;
            if (file == null && pi1Var.f40061g == null && !"d".equals(pi1Var.f40056a)) {
                p9Var2.setImageBitmap(null);
                if (pi1Var.f40064k) {
                    p9Var2.setBackground(new fc0(true, pi1Var.f40057b, pi1Var.f40058c, pi1Var.d, pi1Var.f40059e));
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
                fc0 fc0Var2 = new fc0(true, pi1Var.f40057b, pi1Var.f40058c, pi1Var.d, pi1Var.f40059e);
                if (pi1Var.h >= 0.0f) {
                    p9Var2.setBackground(new fc0(true, pi1Var.f40057b, pi1Var.f40058c, pi1Var.d, pi1Var.f40059e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    p9Var2.getImageReceiver().setGradientBitmap(fc0Var2.f26879k);
                }
                patternColor = fc0.g(i13, i12, i11, pi1Var.f40059e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(pi1Var.f40056a)) {
                if (pi1Var.f40066m == null) {
                    pi1Var.f40066m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                p9Var2.setImageBitmap(pi1Var.f40066m);
                p9Var2.getImageReceiver().setAlpha(Math.abs(pi1Var.h));
            } else if (file != null) {
                p9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(pi1Var.f40061g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = pi1Var.f40061g.document.size;
                }
                p9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, pi1Var.f40061g.document), "180_180", null, null, j10, "jpg", pi1Var.f40061g, 1);
                p9Var2.getImageReceiver().setAlpha(Math.abs(pi1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                p9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof qi1) {
            qi1 qi1Var = (qi1) obj;
            File file2 = qi1Var.f40534e;
            if (file2 != null) {
                p9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = qi1Var.d;
            if (file3 != null) {
                p9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(qi1Var.f40531a)) {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.W0(p9Var2, true));
            } else {
                p9Var2.setImageResource(qi1Var.f40533c);
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
            this.f24466e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f24467f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24467f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24463a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        za zaVar = this.f24468n;
        if (!zaVar.f24543b || !this.f24465c.f24793x) {
            oh.a4 a4Var = this.f24463a;
            if (a4Var.getImageReceiver().hasBitmapImage() && a4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zaVar.f24549s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
