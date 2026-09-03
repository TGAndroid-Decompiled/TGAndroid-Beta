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
import org.telegram.ui.vi1;
import org.telegram.ui.wi1;
public final class ya extends FrameLayout {
    public final oh.a4 f24465a;
    public final ImageView f24466b;
    public final CheckBox f24467c;
    public final View d;
    public boolean f24468e;
    public AnimatorSet f24469f;
    public Object h;
    public final za f24470n;

    public ya(za zaVar, Context context) {
        super(context);
        this.f24470n = zaVar;
        setWillNotDraw(false);
        oh.a4 a4Var = new oh.a4(this, context, 3);
        this.f24465a = a4Var;
        addView(a4Var, k7.c6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f24466b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
        addView(view, k7.c6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f24467c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21753i7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21788k7, false));
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
        org.telegram.ui.Components.p9 p9Var2 = this.f24465a;
        p9Var2.setVisibility(0);
        this.f24466b.setVisibility(4);
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
        this.f24468e = z4;
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
                        p9Var2.getImageReceiver().setGradientBitmap(fc0Var.f26878k);
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
        } else if (obj instanceof vi1) {
            vi1 vi1Var = (vi1) obj;
            File file = vi1Var.f42158i;
            int i11 = vi1Var.d;
            int i12 = vi1Var.f42154c;
            int i13 = vi1Var.f42153b;
            if (file == null && vi1Var.f42157g == null && !"d".equals(vi1Var.f42152a)) {
                p9Var2.setImageBitmap(null);
                if (vi1Var.f42160k) {
                    p9Var2.setBackground(new fc0(true, vi1Var.f42153b, vi1Var.f42154c, vi1Var.d, vi1Var.f42155e));
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
                fc0 fc0Var2 = new fc0(true, vi1Var.f42153b, vi1Var.f42154c, vi1Var.d, vi1Var.f42155e);
                if (vi1Var.h >= 0.0f) {
                    p9Var2.setBackground(new fc0(true, vi1Var.f42153b, vi1Var.f42154c, vi1Var.d, vi1Var.f42155e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    p9Var2.getImageReceiver().setGradientBitmap(fc0Var2.f26878k);
                }
                patternColor = fc0.g(i13, i12, i11, vi1Var.f42155e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(vi1Var.f42152a)) {
                if (vi1Var.f42162m == null) {
                    vi1Var.f42162m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                p9Var2.setImageBitmap(vi1Var.f42162m);
                p9Var2.getImageReceiver().setAlpha(Math.abs(vi1Var.h));
            } else if (file != null) {
                p9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(vi1Var.f42157g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = vi1Var.f42157g.document.size;
                }
                p9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, vi1Var.f42157g.document), "180_180", null, null, j10, "jpg", vi1Var.f42157g, 1);
                p9Var2.getImageReceiver().setAlpha(Math.abs(vi1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                p9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof wi1) {
            wi1 wi1Var = (wi1) obj;
            File file2 = wi1Var.f42790e;
            if (file2 != null) {
                p9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = wi1Var.d;
            if (file3 != null) {
                p9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(wi1Var.f42787a)) {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.W0(p9Var2, true));
            } else {
                p9Var2.setImageResource(wi1Var.f42789c);
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
            this.f24468e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f24469f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24469f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24465a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        za zaVar = this.f24470n;
        if (!zaVar.f24545b || !this.f24467c.f24795x) {
            oh.a4 a4Var = this.f24465a;
            if (a4Var.getImageReceiver().hasBitmapImage() && a4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zaVar.f24551s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
