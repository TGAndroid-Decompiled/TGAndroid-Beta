package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ao extends Drawable {
    public final boolean f35215a;
    public View f35216b;
    public int f35217c = 255;
    public final float d;
    public final oh.z2 f35218e;
    public final org.telegram.ui.Components.fc0 f35219f;
    public final TLRPC.WallPaper f35220g;
    public boolean h;
    public boolean f35221i;
    public final ArrayList f35222j;

    public ao(TLRPC.WallPaper wallPaper, boolean z4, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String m9;
        TLRPC.WallPaperSettings wallPaperSettings2;
        oh.z2 z2Var = new oh.z2(this, 2);
        this.f35218e = z2Var;
        this.f35222j = new ArrayList();
        z2Var.setInvalidateAll(true);
        boolean z11 = wallPaper.pattern;
        this.f35220g = wallPaper;
        this.f35215a = z4;
        if (z4 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z11 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z11 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0();
            this.f35219f = fc0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            fc0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j10 = wallPaper.f20995id;
            lh.a1 a1Var = new lh.a1(26, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.f4.h;
            boolean z12 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j10, z12 ? 1 : 0, new org.telegram.ui.ActionBar.c4(a1Var, wallPaper, z12 ? 1 : 0, i10, j10));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z10) {
            m9 = "150_150_wallpaper";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / AndroidUtilities.density));
            sb.append("_");
            m9 = android.support.v4.media.a.m((int) (max / AndroidUtilities.density), "_wallpaper", sb);
        }
        StringBuilder l10 = e2.c.l(m9);
        l10.append(wallPaper.f20995id);
        StringBuilder l11 = e2.c.l(l10.toString());
        l11.append(e(wallPaper.settings));
        String sb2 = l11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            z2Var.setImage(ImageLocation.getForPath(str), sb2, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            z2Var.setImage(ImageLocation.getForDocument(document), sb2, b10, null, wallPaper, 1);
        } else {
            z2Var.setImageBitmap(b10);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(createBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable a2;
        Drawable drawable = wallPaper.thumbDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (wallPaper.stripedThumb != null) {
            return new BitmapDrawable(wallPaper.stripedThumb);
        }
        if (wallPaper.pattern && wallPaper.settings == null) {
            return new ColorDrawable(-16777216);
        }
        int i10 = 0;
        if (wallPaper.document != null) {
            a2 = null;
            while (i10 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i10) instanceof TLRPC.TL_photoStrippedSize) {
                    a2 = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(i10).bytes, "b"));
                }
                i10++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a2 = a(new ColorDrawable(i0.a.k(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a2 = a(new GradientDrawable(org.telegram.ui.Components.o9.d(wallPaper.settings.rotation), new int[]{i0.a.k(wallPaperSettings.background_color, 255), i0.a.k(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int k10 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k11 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int k12 = i0.a.k(wallPaper.settings.third_background_color, 255);
                    int i11 = wallPaper.settings.fourth_background_color;
                    if (i11 != 0) {
                        i10 = i0.a.k(i11, 255);
                    }
                    org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0();
                    fc0Var.n(k10, k11, k12, i10);
                    a2 = new BitmapDrawable(fc0Var.f26879k);
                }
            } else {
                a2 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static ao d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z4) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof ao) {
            ao aoVar = (ao) drawable;
            boolean z10 = aoVar.f35215a;
            TLRPC.WallPaper wallPaper2 = aoVar.f35220g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f20995id != wallPaper2.f20995id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z10 != z4)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z10 != z4))) {
                return aoVar;
            }
        }
        return new ao(wallPaper, z4, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z4) {
        org.telegram.ui.Components.fc0 fc0Var = this.f35219f;
        if (fc0Var != null) {
            return fc0Var;
        }
        oh.z2 z2Var = this.f35218e;
        if (z4 && z2Var.getStaticThumb() != null) {
            return z2Var.getStaticThumb();
        }
        if (z2Var.getThumb() != null) {
            return z2Var.getThumb();
        }
        if (z2Var.getDrawable() != null) {
            return z2Var.getDrawable();
        }
        return z2Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.fc0 fc0Var = this.f35219f;
        if (fc0Var != null) {
            fc0Var.setBounds(getBounds());
            fc0Var.setAlpha(this.f35217c);
            fc0Var.draw(canvas);
            return;
        }
        oh.z2 z2Var = this.f35218e;
        boolean hasImageLoaded = z2Var.hasImageLoaded();
        float f10 = this.d;
        boolean z4 = true;
        if (hasImageLoaded && z2Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                z2Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z4 = false;
        }
        z2Var.setImageCoords(getBounds());
        z2Var.setAlpha(this.f35217c / 255.0f);
        z2Var.draw(canvas);
        if (z4 && f10 != 0.0f) {
            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f35222j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        oh.z2 z2Var = this.f35218e;
        if (size > 0 && !this.f35221i) {
            this.f35221i = true;
            z2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f35221i) {
            this.f35221i = false;
            z2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.fc0 fc0Var = this.f35219f;
        if (fc0Var != null) {
            fc0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f35222j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        oh.z2 z2Var = this.f35218e;
        if (size > 0 && !this.f35221i) {
            this.f35221i = true;
            z2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f35221i) {
            this.f35221i = false;
            z2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.fc0 fc0Var = this.f35219f;
        if (fc0Var != null) {
            fc0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f35217c != i10) {
            this.f35217c = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
