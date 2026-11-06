package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class yl {
    public TextPaint B;
    public TextPaint C;
    public final zl O;
    public zl f40661a;
    public org.telegram.messenger.gf f40662b;
    public ImageReceiver f40663c;
    public ImageReceiver d;
    public boolean f40664e;
    public float f40670l;
    public float f40671m;
    public float f40672n;
    public float f40673o;
    public xh.e f40677s;
    public Bitmap v;
    public RectF f40665f = null;
    public final RectF f40666g = new RectF();
    public long h = 0;
    public int f40667i = 0;
    public float f40668j = 1.0f;
    public float f40669k = 0.0f;
    public RectF f40674p = null;
    public final RectF f40675q = new RectF();
    public String f40676r = null;
    public final Path f40678t = new Path();
    public final float[] f40679u = new float[8];
    public float f40680w = 1.0f;
    public final Paint f40681x = new Paint(1);
    public final RectF f40682y = new RectF();
    public final Paint f40683z = new Paint(1);
    public final Paint A = new Paint(1);
    public final Paint D = new Paint(1);
    public Bitmap E = null;
    public String F = null;
    public Bitmap G = null;
    public String H = null;
    public final Rect I = new Rect();
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public float M = 1.0f;
    public long N = 0;

    public yl(zl zlVar) {
        this.O = zlVar;
        this.f40661a = zlVar;
    }

    public static void a(yl ylVar, org.telegram.messenger.gf gfVar) {
        zl zlVar = ylVar.O;
        ylVar.f40662b = gfVar;
        if (gfVar.f26824b) {
            ylVar.f40676r = org.telegram.messenger.g0.g0(gfVar.E, false, false);
        } else {
            ylVar.f40676r = null;
        }
        if (ylVar.f40663c == null) {
            ylVar.f40663c = new ImageReceiver(zlVar.f41072z);
            ylVar.d = new ImageReceiver(zlVar.f41072z);
            ylVar.f40663c.f21192g1 = new f2(9, ylVar, gfVar);
        }
        int i7 = gfVar.C;
        String str = gfVar.I;
        String str2 = gfVar.f26825c;
        if (str2 != null) {
            ylVar.f40663c.r0(org.telegram.messenger.hc.g(str2), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (gfVar.f26824b) {
                ImageReceiver imageReceiver = ylVar.f40663c;
                imageReceiver.r0(org.telegram.messenger.hc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
                ylVar.f40663c.f21217t0 = true;
                return;
            }
            ylVar.f40663c.G0(gfVar.J, 0, true);
            ImageReceiver imageReceiver2 = ylVar.f40663c;
            imageReceiver2.r0(org.telegram.messenger.hc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else {
            ylVar.f40663c.w0(org.telegram.ui.ActionBar.k6.R4);
        }
    }

    public static void b(yl ylVar, vl vlVar, org.telegram.messenger.aj ajVar, boolean z9) {
        float f10;
        float f11;
        float f12;
        RectF rectF = ylVar.f40675q;
        RectF rectF2 = ylVar.f40666g;
        if (vlVar != null && ajVar != null) {
            ylVar.f40667i = ajVar.f21451l;
            if (z9) {
                float e10 = ylVar.e();
                RectF rectF3 = ylVar.f40665f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = ylVar.f40674p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                ylVar.f40668j = org.telegram.messenger.g0.T1(ylVar.f40668j, ylVar.f40669k, e10);
                ylVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = ajVar.f21456q;
            float f14 = vlVar.f38997b;
            float f15 = f13 / f14;
            float f16 = ajVar.f21455p;
            float f17 = vlVar.f38996a;
            float f18 = f16 / f17;
            ylVar.f40669k = 1.0f;
            rectF2.set(f15, f18, (ajVar.f21445e / f14) + f15, (ajVar.f21446f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.iz.Y0 - 1);
            int i7 = ylVar.f40667i;
            if ((i7 & 5) == 5) {
                f10 = L2;
            } else {
                f10 = L;
            }
            if ((i7 & 6) == 6) {
                f11 = L2;
            } else {
                f11 = L;
            }
            if ((i7 & 10) == 10) {
                f12 = L2;
            } else {
                f12 = L;
            }
            if ((i7 & 9) == 9) {
                L = L2;
            }
            rectF.set(f10, f11, f12, L);
            if (ylVar.f40665f == null) {
                RectF rectF5 = new RectF();
                ylVar.f40665f = rectF5;
                rectF5.set(rectF2);
            }
            if (ylVar.f40674p == null) {
                RectF rectF6 = new RectF();
                ylVar.f40674p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z9) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ylVar.f40668j = org.telegram.messenger.g0.T1(ylVar.f40668j, ylVar.f40669k, ylVar.e());
            RectF rectF7 = ylVar.f40665f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, ylVar.e(), ylVar.f40665f);
            }
            ylVar.f40669k = 0.0f;
            ylVar.h = elapsedRealtime;
        } else {
            ylVar.f40668j = 0.0f;
            ylVar.f40669k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yl.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        yl ylVar = new yl(this.O);
        ylVar.f40666g.set(this.f40666g);
        ylVar.f40663c = this.f40663c;
        ylVar.f40662b = this.f40662b;
        return ylVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f40666g != null && this.f40663c != null) {
            am amVar = this.O.f41072z;
            yl ylVar = amVar.P.J;
            if (ylVar != null && ylVar.f40662b == this.f40662b) {
                f10 = amVar.G;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f40668j, this.f40669k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f40682y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f41057j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f40682y;
        RectF rectF3 = this.f40666g;
        if (rectF3 != null && this.f40663c != null) {
            zl zlVar = this.O;
            float f11 = (rectF3.left * zlVar.f41065r) + zlVar.f41061n;
            float f12 = (rectF3.top * zlVar.f41066s) + zlVar.f41063p;
            float width = rectF3.width() * zlVar.f41065r;
            float height = rectF3.height() * zlVar.f41066s;
            if (f10 < 1.0f && (rectF = this.f40665f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * zlVar.f41065r) + zlVar.f41061n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f40665f.top * zlVar.f41066s) + zlVar.f41063p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f40665f.width() * zlVar.f41065r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f40665f.height() * zlVar.f41066s, height, f10);
            }
            int i7 = this.f40667i;
            if ((i7 & 4) == 0) {
                int i10 = zlVar.f41060m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= zlVar.f41060m;
            }
            if ((i7 & 1) == 0) {
                int i11 = zlVar.f41060m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= zlVar.f41060m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
