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
import org.telegram.tgnet.TLRPC;
public final class dn extends Drawable {
    public final boolean f46435a;
    public View f46436b;
    public int f46437c = 255;
    public final float d;
    public final fi.u2 f46438e;
    public final org.telegram.ui.Components.ra0 f46439f;
    public final TLRPC.WallPaper f46440g;
    public boolean h;
    public boolean f46441i;
    public final ArrayList f46442j;

    public dn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        fi.u2 u2Var = new fi.u2(this, 3);
        this.f46438e = u2Var;
        this.f46442j = new ArrayList();
        u2Var.K0 = true;
        boolean z12 = wallPaper.pattern;
        this.f46440g = wallPaper;
        this.f46435a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0();
            this.f46439f = ra0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            ra0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.p3.o(org.telegram.messenger.m10.f24934t0, wallPaper.f28205id, wallPaper, new li.v(26, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.g0.f23609q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z11) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f23608p));
            sb2.append("_");
            n10 = a8.p0.n((int) (max / org.telegram.messenger.g0.f23608p), "_wallpaper", sb2);
        }
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(n10);
        m10.append(wallPaper.f28205id);
        StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(m10.toString());
        m11.append(e(wallPaper.settings));
        String sb3 = m11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            u2Var.q0(org.telegram.messenger.gc.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            u2Var.q0(org.telegram.messenger.gc.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            u2Var.w0(b10);
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
        BitmapDrawable a10;
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
        int i7 = 0;
        if (wallPaper.document != null) {
            a10 = null;
            while (i7 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i7) instanceof TLRPC.TL_photoStrippedSize) {
                    a10 = new BitmapDrawable(org.telegram.messenger.fc.F("b", wallPaper.document.thumbs.get(i7).bytes));
                }
                i7++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a10 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a10 = a(new GradientDrawable(org.telegram.ui.Components.h9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, 255), i0.a.o(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int o4 = i0.a.o(wallPaperSettings.background_color, 255);
                    int o10 = i0.a.o(wallPaper.settings.second_background_color, 255);
                    int o11 = i0.a.o(wallPaper.settings.third_background_color, 255);
                    int i10 = wallPaper.settings.fourth_background_color;
                    if (i10 != 0) {
                        i7 = i0.a.o(i10, 255);
                    }
                    org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0();
                    ra0Var.n(o4, o10, o11, i7);
                    a10 = new BitmapDrawable(ra0Var.f38926k);
                }
            } else {
                a10 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a10;
        return a10;
    }

    public static dn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof dn) {
            dn dnVar = (dn) drawable;
            boolean z11 = dnVar.f46435a;
            TLRPC.WallPaper wallPaper2 = dnVar.f46440g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f28205id != wallPaper2.f28205id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return dnVar;
            }
        }
        return new dn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.ra0 ra0Var = this.f46439f;
        if (ra0Var != null) {
            return ra0Var;
        }
        fi.u2 u2Var = this.f46438e;
        if (z10 && (drawable = u2Var.f22286n0) != null) {
            return drawable;
        }
        Drawable drawable2 = u2Var.f22260b0;
        if (drawable2 != null) {
            return drawable2;
        }
        if (u2Var.t() != null) {
            return u2Var.t();
        }
        return u2Var.f22286n0;
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.ra0 ra0Var = this.f46439f;
        if (ra0Var != null) {
            ra0Var.setBounds(getBounds());
            ra0Var.setAlpha(this.f46437c);
            ra0Var.draw(canvas);
            return;
        }
        fi.u2 u2Var = this.f46438e;
        boolean J = u2Var.J();
        float f10 = this.d;
        boolean z10 = true;
        if (J && u2Var.f22278i1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                u2Var.f22290p1 = new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z10 = false;
        }
        u2Var.z0(getBounds());
        u2Var.setAlpha(this.f46437c / 255.0f);
        u2Var.h(canvas, null);
        if (z10 && f10 != 0.0f) {
            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f46442j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        fi.u2 u2Var = this.f46438e;
        if (size > 0 && !this.f46441i) {
            this.f46441i = true;
            u2Var.P();
        } else if (arrayList.size() <= 0 && this.f46441i) {
            this.f46441i = false;
            u2Var.R();
        }
        org.telegram.ui.Components.ra0 ra0Var = this.f46439f;
        if (ra0Var != null) {
            ra0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f46442j;
        arrayList.remove(view);
        int size = arrayList.size();
        fi.u2 u2Var = this.f46438e;
        if (size > 0 && !this.f46441i) {
            this.f46441i = true;
            u2Var.P();
        } else if (arrayList.size() <= 0 && this.f46441i) {
            this.f46441i = false;
            u2Var.R();
        }
        org.telegram.ui.Components.ra0 ra0Var = this.f46439f;
        if (ra0Var != null) {
            ra0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f46437c != i7) {
            this.f46437c = i7;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
