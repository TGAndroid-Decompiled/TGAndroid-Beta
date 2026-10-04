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
import org.telegram.ui.Components.pc0;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;
public final class db extends FrameLayout {
    public final ai.y5 f21989a;
    public final ImageView f21990b;
    public final CheckBox f21991c;
    public final View d;
    public boolean f21992e;
    public AnimatorSet f21993f;
    public Object h;
    public final eb f21994n;

    public db(eb ebVar, Context context) {
        super(context);
        this.f21994n = ebVar;
        setWillNotDraw(false);
        ai.y5 y5Var = new ai.y5(this, context, 4);
        this.f21989a = y5Var;
        addView(y5Var, w7.z5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f21990b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
        addView(view, w7.z5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.f21991c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20914i7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20952k7, false));
        addView(checkBox, w7.z5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int patternColor;
        long j3;
        long j10;
        int patternColor2;
        org.telegram.ui.Components.w9 w9Var;
        this.h = obj;
        org.telegram.ui.Components.w9 w9Var2 = this.f21989a;
        w9Var2.setVisibility(0);
        this.f21990b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        w9Var2.setBackgroundDrawable(null);
        w9Var2.getImageReceiver().setColorFilter(null);
        w9Var2.getImageReceiver().setAlpha(1.0f);
        w9Var2.getImageReceiver().setBlendMode(null);
        w9Var2.getImageReceiver().setGradientBitmap(null);
        if (obj == obj2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21992e = z10;
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
                    pc0 pc0Var = new pc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                    if (tL_wallPaper.settings.intensity < 0 && org.telegram.ui.ActionBar.i6.I.q()) {
                        w9Var2.getImageReceiver().setGradientBitmap(pc0Var.f29618k);
                    } else {
                        w9Var2.setBackground(pc0Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            w9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    patternColor2 = pc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    w9Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.X0(wallPaperSettings.background_color));
                    patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    w9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
                }
                if (photoSize != null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    w9Var = w9Var2;
                    w9Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
                } else {
                    ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                    w9Var = w9Var2;
                    w9Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
                }
                w9Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            } else if (photoSize != null) {
                w9Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            } else {
                w9Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
            }
        } else if (obj instanceof yi1) {
            yi1 yi1Var = (yi1) obj;
            File file = yi1Var.f43245i;
            int i11 = yi1Var.d;
            int i12 = yi1Var.f43241c;
            int i13 = yi1Var.f43240b;
            if (file == null && yi1Var.f43244g == null && !"d".equals(yi1Var.f43239a)) {
                w9Var2.setImageBitmap(null);
                if (yi1Var.f43247k) {
                    w9Var2.setBackground(new pc0(true, yi1Var.f43240b, yi1Var.f43241c, yi1Var.d, yi1Var.f43242e));
                    return;
                } else if (i12 != 0) {
                    w9Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i13 | (-16777216), i12 | (-16777216)}));
                    return;
                } else {
                    w9Var2.setBackgroundColor(i13 | (-16777216));
                    return;
                }
            }
            if (i11 != 0) {
                pc0 pc0Var2 = new pc0(true, yi1Var.f43240b, yi1Var.f43241c, yi1Var.d, yi1Var.f43242e);
                if (yi1Var.h >= 0.0f) {
                    w9Var2.setBackground(new pc0(true, yi1Var.f43240b, yi1Var.f43241c, yi1Var.d, yi1Var.f43242e));
                    if (Build.VERSION.SDK_INT >= 29) {
                        w9Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    w9Var2.getImageReceiver().setGradientBitmap(pc0Var2.f29618k);
                }
                patternColor = pc0.g(i13, i12, i11, yi1Var.f43242e);
            } else {
                patternColor = AndroidUtilities.getPatternColor(i13);
            }
            int i14 = patternColor;
            if ("d".equals(yi1Var.f43239a)) {
                if (yi1Var.f43249m == null) {
                    yi1Var.f43249m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
                }
                w9Var2.setImageBitmap(yi1Var.f43249m);
                w9Var2.getImageReceiver().setAlpha(Math.abs(yi1Var.h));
            } else if (file != null) {
                w9Var2.f(file.getAbsolutePath(), "180_180", null);
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(yi1Var.f43244g.document.thumbs, 100);
                if (closestPhotoSizeWithSize3 != null) {
                    j3 = closestPhotoSizeWithSize3.size;
                } else {
                    j3 = yi1Var.f43244g.document.size;
                }
                w9Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize3, yi1Var.f43244g.document), "180_180", null, null, j3, "jpg", yi1Var.f43244g, 1);
                w9Var2.getImageReceiver().setAlpha(Math.abs(yi1Var.h));
                if (Build.VERSION.SDK_INT >= 29 && i11 != 0) {
                    return;
                }
                w9Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i14), PorterDuff.Mode.SRC_IN));
            }
        } else if (obj instanceof zi1) {
            zi1 zi1Var = (zi1) obj;
            File file2 = zi1Var.f43838e;
            if (file2 != null) {
                w9Var2.f(file2.getAbsolutePath(), "180_180", null);
                return;
            }
            File file3 = zi1Var.d;
            if (file3 != null) {
                w9Var2.f(file3.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(zi1Var.f43835a)) {
                w9Var2.setImageDrawable(org.telegram.ui.ActionBar.i6.W0(w9Var2, true));
            } else {
                w9Var2.setImageResource(zi1Var.f43837c);
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
                w9Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize5, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                return;
            }
            w9Var2.f(searchImage.thumbUrl, "180_180", null);
        } else {
            this.f21992e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f21993f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21993f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f21989a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eb ebVar = this.f21994n;
        if (!ebVar.f22064b || !this.f21991c.f24082x) {
            ai.y5 y5Var = this.f21989a;
            if (y5Var.getImageReceiver().hasBitmapImage() && y5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ebVar.f22070s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
