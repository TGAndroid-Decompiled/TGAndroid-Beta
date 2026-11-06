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
    public final boolean f45086a;
    public View f45087b;
    public int f45088c = 255;
    public final float d;
    public final di.z2 f45089e;
    public final org.telegram.ui.Components.qa0 f45090f;
    public final TLRPC.WallPaper f45091g;
    public boolean h;
    public boolean f45092i;
    public final ArrayList f45093j;

    public dn(TLRPC.WallPaper wallPaper, boolean z9, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        di.z2 z2Var = new di.z2(this, 3);
        this.f45089e = z2Var;
        this.f45093j = new ArrayList();
        z2Var.J0 = true;
        boolean z11 = wallPaper.pattern;
        this.f45091g = wallPaper;
        this.f45086a = z9;
        if (z9 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z11 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z11 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.qa0 qa0Var = new org.telegram.ui.Components.qa0();
            this.f45090f = qa0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            qa0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.r3.o(org.telegram.messenger.p10.f24459s0, wallPaper.f27106id, wallPaper, new org.telegram.messenger.voip.k(21, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.g0.f22537q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z10) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f22536p));
            sb2.append("_");
            n10 = a8.p0.n((int) (max / org.telegram.messenger.g0.f22536p), "_wallpaper", sb2);
        }
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(n10);
        m10.append(wallPaper.f27106id);
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(m10.toString());
        m11.append(e(wallPaper.settings));
        String sb3 = m11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            z2Var.q0(org.telegram.messenger.hc.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            z2Var.q0(org.telegram.messenger.hc.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            z2Var.w0(b10);
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
                    a10 = new BitmapDrawable(org.telegram.messenger.gc.F("b", wallPaper.document.thumbs.get(i7).bytes));
                }
                i7++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a10 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a10 = a(new GradientDrawable(org.telegram.ui.Components.k9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, 255), i0.a.o(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int o4 = i0.a.o(wallPaperSettings.background_color, 255);
                    int o10 = i0.a.o(wallPaper.settings.second_background_color, 255);
                    int o11 = i0.a.o(wallPaper.settings.third_background_color, 255);
                    int i10 = wallPaper.settings.fourth_background_color;
                    if (i10 != 0) {
                        i7 = i0.a.o(i10, 255);
                    }
                    org.telegram.ui.Components.qa0 qa0Var = new org.telegram.ui.Components.qa0();
                    qa0Var.n(o4, o10, o11, i7);
                    a10 = new BitmapDrawable(qa0Var.f37345k);
                }
            } else {
                a10 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a10;
        return a10;
    }

    public static dn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z9) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof dn) {
            dn dnVar = (dn) drawable;
            boolean z10 = dnVar.f45086a;
            TLRPC.WallPaper wallPaper2 = dnVar.f45091g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f27106id != wallPaper2.f27106id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z10 != z9)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z10 != z9))) {
                return dnVar;
            }
        }
        return new dn(wallPaper, z9, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z9) {
        Drawable drawable;
        org.telegram.ui.Components.qa0 qa0Var = this.f45090f;
        if (qa0Var != null) {
            return qa0Var;
        }
        di.z2 z2Var = this.f45089e;
        if (z9 && (drawable = z2Var.m0) != null) {
            return drawable;
        }
        Drawable drawable2 = z2Var.f21175a0;
        if (drawable2 != null) {
            return drawable2;
        }
        if (z2Var.t() != null) {
            return z2Var.t();
        }
        return z2Var.m0;
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.qa0 qa0Var = this.f45090f;
        if (qa0Var != null) {
            qa0Var.setBounds(getBounds());
            qa0Var.setAlpha(this.f45088c);
            qa0Var.draw(canvas);
            return;
        }
        di.z2 z2Var = this.f45089e;
        boolean J = z2Var.J();
        float f10 = this.d;
        boolean z9 = true;
        if (J && z2Var.f21194h1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                z2Var.f21206o1 = new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z9 = false;
        }
        z2Var.z0(getBounds());
        z2Var.setAlpha(this.f45088c / 255.0f);
        z2Var.h(canvas, null);
        if (z9 && f10 != 0.0f) {
            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f45093j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        di.z2 z2Var = this.f45089e;
        if (size > 0 && !this.f45092i) {
            this.f45092i = true;
            z2Var.P();
        } else if (arrayList.size() <= 0 && this.f45092i) {
            this.f45092i = false;
            z2Var.R();
        }
        org.telegram.ui.Components.qa0 qa0Var = this.f45090f;
        if (qa0Var != null) {
            qa0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f45093j;
        arrayList.remove(view);
        int size = arrayList.size();
        di.z2 z2Var = this.f45089e;
        if (size > 0 && !this.f45092i) {
            this.f45092i = true;
            z2Var.P();
        } else if (arrayList.size() <= 0 && this.f45092i) {
            this.f45092i = false;
            z2Var.R();
        }
        org.telegram.ui.Components.qa0 qa0Var = this.f45090f;
        if (qa0Var != null) {
            qa0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f45088c != i7) {
            this.f45088c = i7;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
