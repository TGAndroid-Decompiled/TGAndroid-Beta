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
public final class en extends Drawable {
    public final boolean f47328a;
    public View f47329b;
    public int f47330c = 255;
    public final float d;
    public final fi.s2 f47331e;
    public final org.telegram.ui.Components.cb0 f47332f;
    public final TLRPC.WallPaper f47333g;
    public boolean h;
    public boolean f47334i;
    public final ArrayList f47335j;

    public en(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        fi.s2 s2Var = new fi.s2(this, 3);
        this.f47331e = s2Var;
        this.f47335j = new ArrayList();
        s2Var.K0 = true;
        boolean z12 = wallPaper.pattern;
        this.f47333g = wallPaper;
        this.f47328a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0();
            this.f47332f = cb0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            cb0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.s3.o(org.telegram.messenger.j10.f24798t0, wallPaper.f28585id, wallPaper, new li.d(25, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.g0.f24146q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z11) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f24145p));
            sb2.append("_");
            n10 = a8.p0.n((int) (max / org.telegram.messenger.g0.f24145p), "_wallpaper", sb2);
        }
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(n10);
        m10.append(wallPaper.f28585id);
        StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(m10.toString());
        m11.append(e(wallPaper.settings));
        String sb3 = m11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            s2Var.q0(org.telegram.messenger.fc.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            s2Var.q0(org.telegram.messenger.fc.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            s2Var.w0(b10);
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
                    a10 = new BitmapDrawable(org.telegram.messenger.ec.F("b", wallPaper.document.thumbs.get(i7).bytes));
                }
                i7++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a10 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a10 = a(new GradientDrawable(org.telegram.ui.Components.p9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, 255), i0.a.o(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int o4 = i0.a.o(wallPaperSettings.background_color, 255);
                    int o10 = i0.a.o(wallPaper.settings.second_background_color, 255);
                    int o11 = i0.a.o(wallPaper.settings.third_background_color, 255);
                    int i10 = wallPaper.settings.fourth_background_color;
                    if (i10 != 0) {
                        i7 = i0.a.o(i10, 255);
                    }
                    org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0();
                    cb0Var.n(o4, o10, o11, i7);
                    a10 = new BitmapDrawable(cb0Var.f34161k);
                }
            } else {
                a10 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a10;
        return a10;
    }

    public static en d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof en) {
            en enVar = (en) drawable;
            boolean z11 = enVar.f47328a;
            TLRPC.WallPaper wallPaper2 = enVar.f47333g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f28585id != wallPaper2.f28585id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return enVar;
            }
        }
        return new en(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.cb0 cb0Var = this.f47332f;
        if (cb0Var != null) {
            return cb0Var;
        }
        fi.s2 s2Var = this.f47331e;
        if (z10 && (drawable = s2Var.f22677n0) != null) {
            return drawable;
        }
        Drawable drawable2 = s2Var.f22651b0;
        if (drawable2 != null) {
            return drawable2;
        }
        if (s2Var.t() != null) {
            return s2Var.t();
        }
        return s2Var.f22677n0;
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.cb0 cb0Var = this.f47332f;
        if (cb0Var != null) {
            cb0Var.setBounds(getBounds());
            cb0Var.setAlpha(this.f47330c);
            cb0Var.draw(canvas);
            return;
        }
        fi.s2 s2Var = this.f47331e;
        boolean J = s2Var.J();
        float f10 = this.d;
        boolean z10 = true;
        if (J && s2Var.f22669i1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                s2Var.f22681p1 = new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z10 = false;
        }
        s2Var.z0(getBounds());
        s2Var.setAlpha(this.f47330c / 255.0f);
        s2Var.h(canvas, null);
        if (z10 && f10 != 0.0f) {
            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f47335j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        fi.s2 s2Var = this.f47331e;
        if (size > 0 && !this.f47334i) {
            this.f47334i = true;
            s2Var.P();
        } else if (arrayList.size() <= 0 && this.f47334i) {
            this.f47334i = false;
            s2Var.R();
        }
        org.telegram.ui.Components.cb0 cb0Var = this.f47332f;
        if (cb0Var != null) {
            cb0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f47335j;
        arrayList.remove(view);
        int size = arrayList.size();
        fi.s2 s2Var = this.f47331e;
        if (size > 0 && !this.f47334i) {
            this.f47334i = true;
            s2Var.P();
        } else if (arrayList.size() <= 0 && this.f47334i) {
            this.f47334i = false;
            s2Var.R();
        }
        org.telegram.ui.Components.cb0 cb0Var = this.f47332f;
        if (cb0Var != null) {
            cb0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f47330c != i7) {
            this.f47330c = i7;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
