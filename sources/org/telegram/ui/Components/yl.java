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
    public zl f40740a;
    public org.telegram.messenger.gf f40741b;
    public ImageReceiver f40742c;
    public ImageReceiver d;
    public boolean f40743e;
    public float f40749l;
    public float f40750m;
    public float f40751n;
    public float f40752o;
    public xh.e f40756s;
    public Bitmap v;
    public RectF f40744f = null;
    public final RectF f40745g = new RectF();
    public long h = 0;
    public int f40746i = 0;
    public float f40747j = 1.0f;
    public float f40748k = 0.0f;
    public RectF f40753p = null;
    public final RectF f40754q = new RectF();
    public String f40755r = null;
    public final Path f40757t = new Path();
    public final float[] f40758u = new float[8];
    public float f40759w = 1.0f;
    public final Paint f40760x = new Paint(1);
    public final RectF f40761y = new RectF();
    public final Paint f40762z = new Paint(1);
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
        this.f40740a = zlVar;
    }

    public static void a(yl ylVar, org.telegram.messenger.gf gfVar) {
        zl zlVar = ylVar.O;
        ylVar.f40741b = gfVar;
        if (gfVar.f26845b) {
            ylVar.f40755r = org.telegram.messenger.g0.g0(gfVar.E, false, false);
        } else {
            ylVar.f40755r = null;
        }
        if (ylVar.f40742c == null) {
            ylVar.f40742c = new ImageReceiver(zlVar.f41021z);
            ylVar.d = new ImageReceiver(zlVar.f41021z);
            ylVar.f40742c.f21195g1 = new f2(9, ylVar, gfVar);
        }
        int i7 = gfVar.C;
        String str = gfVar.I;
        String str2 = gfVar.f26846c;
        if (str2 != null) {
            ylVar.f40742c.r0(org.telegram.messenger.hc.g(str2), null, null, null, org.telegram.ui.ActionBar.l6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (gfVar.f26845b) {
                ImageReceiver imageReceiver = ylVar.f40742c;
                imageReceiver.r0(org.telegram.messenger.hc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.l6.R4, 0L, null, null, 0);
                ylVar.f40742c.f21220t0 = true;
                return;
            }
            ylVar.f40742c.G0(gfVar.J, 0, true);
            ImageReceiver imageReceiver2 = ylVar.f40742c;
            imageReceiver2.r0(org.telegram.messenger.hc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.l6.R4, 0L, null, null, 0);
        } else {
            ylVar.f40742c.w0(org.telegram.ui.ActionBar.l6.R4);
        }
    }

    public static void b(yl ylVar, vl vlVar, org.telegram.messenger.aj ajVar, boolean z9) {
        float f10;
        float f11;
        float f12;
        RectF rectF = ylVar.f40754q;
        RectF rectF2 = ylVar.f40745g;
        if (vlVar != null && ajVar != null) {
            ylVar.f40746i = ajVar.f21450l;
            if (z9) {
                float e10 = ylVar.e();
                RectF rectF3 = ylVar.f40744f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = ylVar.f40753p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                ylVar.f40747j = org.telegram.messenger.g0.T1(ylVar.f40747j, ylVar.f40748k, e10);
                ylVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = ajVar.f21455q;
            float f14 = vlVar.f39120b;
            float f15 = f13 / f14;
            float f16 = ajVar.f21454p;
            float f17 = vlVar.f39119a;
            float f18 = f16 / f17;
            ylVar.f40748k = 1.0f;
            rectF2.set(f15, f18, (ajVar.f21444e / f14) + f15, (ajVar.f21445f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.iz.Y0 - 1);
            int i7 = ylVar.f40746i;
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
            if (ylVar.f40744f == null) {
                RectF rectF5 = new RectF();
                ylVar.f40744f = rectF5;
                rectF5.set(rectF2);
            }
            if (ylVar.f40753p == null) {
                RectF rectF6 = new RectF();
                ylVar.f40753p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z9) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ylVar.f40747j = org.telegram.messenger.g0.T1(ylVar.f40747j, ylVar.f40748k, ylVar.e());
            RectF rectF7 = ylVar.f40744f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, ylVar.e(), ylVar.f40744f);
            }
            ylVar.f40748k = 0.0f;
            ylVar.h = elapsedRealtime;
        } else {
            ylVar.f40747j = 0.0f;
            ylVar.f40748k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yl.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        yl ylVar = new yl(this.O);
        ylVar.f40745g.set(this.f40745g);
        ylVar.f40742c = this.f40742c;
        ylVar.f40741b = this.f40741b;
        return ylVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f40745g != null && this.f40742c != null) {
            am amVar = this.O.f41021z;
            yl ylVar = amVar.P.J;
            if (ylVar != null && ylVar.f40741b == this.f40741b) {
                f10 = amVar.G;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f40747j, this.f40748k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f40761y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f41006j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f40761y;
        RectF rectF3 = this.f40745g;
        if (rectF3 != null && this.f40742c != null) {
            zl zlVar = this.O;
            float f11 = (rectF3.left * zlVar.f41014r) + zlVar.f41010n;
            float f12 = (rectF3.top * zlVar.f41015s) + zlVar.f41012p;
            float width = rectF3.width() * zlVar.f41014r;
            float height = rectF3.height() * zlVar.f41015s;
            if (f10 < 1.0f && (rectF = this.f40744f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * zlVar.f41014r) + zlVar.f41010n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f40744f.top * zlVar.f41015s) + zlVar.f41012p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f40744f.width() * zlVar.f41014r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f40744f.height() * zlVar.f41015s, height, f10);
            }
            int i7 = this.f40746i;
            if ((i7 & 4) == 0) {
                int i10 = zlVar.f41009m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= zlVar.f41009m;
            }
            if ((i7 & 1) == 0) {
                int i11 = zlVar.f41009m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= zlVar.f41009m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
