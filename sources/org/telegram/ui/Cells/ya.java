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
import org.telegram.ui.mi1;
import org.telegram.ui.ni1;
public final class ya extends FrameLayout {
    public final nh.y3 f22633a;
    public final ImageView f22634b;
    public final CheckBox f22635c;
    public final View d;
    public boolean e;
    public AnimatorSet f22636f;
    public Object h;
    public final za f22637n;

    public ya(za zaVar, Context context) {
        super(context);
        this.f22637n = zaVar;
        setWillNotDraw(false);
        nh.y3 y3Var = new nh.y3(this, context, 3);
        this.f22633a = y3Var;
        addView(y3Var, k7.b6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f22634b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, k7.b6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f22635c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19997i7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20032k7, false));
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
        org.telegram.ui.Components.p9 p9Var2 = this.f22633a;
        p9Var2.setVisibility(0);
        this.f22634b.setVisibility(4);
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
                    dc0 dc0Var = new dc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.j6.I.q()) {
                        p9Var2.getImageReceiver().setGradientBitmap(dc0Var.f24241k);
                    } else {
                        p9Var2.setBackground(dc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = dc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
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
        } else if (obj instanceof mi1) {
            mi1 mi1Var = (mi1) obj;
            File file = mi1Var.f36330i;
            int i11 = mi1Var.d;
            int i12 = mi1Var.f36327c;
            int i13 = mi1Var.f36326b;
            if (file == null && mi1Var.f36329g == null && !"d".equals(mi1Var.f36325a)) {
                p9Var2.setImageBitmap(null);
                if (mi1Var.f36332k) {
                    p9Var2.setBackground(new dc0(true, mi1Var.f36326b, mi1Var.f36327c, mi1Var.d, mi1Var.e));
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
                dc0 dc0Var2 = new dc0(true, mi1Var.f36326b, mi1Var.f36327c, mi1Var.d, mi1Var.e);
                if (mi1Var.h >= 0.0f) {
                    p9Var2.setBackground(new dc0(true, mi1Var.f36326b, mi1Var.f36327c, mi1Var.d, mi1Var.e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        p9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    p9Var2.getImageReceiver().setGradientBitmap(dc0Var2.f24241k);
                }
                patternColor = dc0.g(i13, i12, i11, mi1Var.e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(mi1Var.f36325a)) {
                if (mi1Var.f36334m == null) {
                    mi1Var.f36334m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                p9Var2.setImageBitmap(mi1Var.f36334m);
                p9Var2.getImageReceiver().setAlpha(Math.abs(mi1Var.h));
            } else if (file != null) {
                p9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(mi1Var.f36329g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j10 = closestPhotoSizeWithSize3.size;
                } else {
                    j10 = mi1Var.f36329g.document.size;
                }
                p9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, mi1Var.f36329g.document), "180_180", null, null, j10, "jpg", mi1Var.f36329g, 1);
                p9Var2.getImageReceiver().setAlpha(Math.abs(mi1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                p9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof ni1) {
            ni1 ni1Var = (ni1) obj;
            File file2 = ni1Var.e;
            if (file2 != null) {
                p9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = ni1Var.d;
            if (file3 != null) {
                p9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(ni1Var.f36672a)) {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(p9Var2, true));
            } else {
                p9Var2.setImageResource(ni1Var.f36674c);
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
        AnimatorSet animatorSet = this.f22636f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22636f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22633a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        za zaVar = this.f22637n;
        if (!zaVar.f22707b || !this.f22635c.f22950x) {
            nh.y3 y3Var = this.f22633a;
            if (y3Var.getImageReceiver().hasBitmapImage() && y3Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zaVar.f22712s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
