package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class xl {
    public TextPaint B;
    public TextPaint C;
    public final yl O;
    public yl f40389a;
    public org.telegram.messenger.ye f40390b;
    public ImageReceiver f40391c;
    public ImageReceiver d;
    public boolean f40392e;
    public float f40398l;
    public float f40399m;
    public float f40400n;
    public float f40401o;
    public yh.e f40405s;
    public Bitmap v;
    public RectF f40393f = null;
    public final RectF f40394g = new RectF();
    public long h = 0;
    public int f40395i = 0;
    public float f40396j = 1.0f;
    public float f40397k = 0.0f;
    public RectF f40402p = null;
    public final RectF f40403q = new RectF();
    public String f40404r = null;
    public final Path f40406t = new Path();
    public final float[] f40407u = new float[8];
    public float f40408w = 1.0f;
    public final Paint f40409x = new Paint(1);
    public final RectF f40410y = new RectF();
    public final Paint f40411z = new Paint(1);
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

    public xl(yl ylVar) {
        this.O = ylVar;
        this.f40389a = ylVar;
    }

    public static void a(xl xlVar, org.telegram.messenger.ye yeVar) {
        yl ylVar = xlVar.O;
        xlVar.f40390b = yeVar;
        if (yeVar.f25310b) {
            xlVar.f40404r = org.telegram.messenger.g0.g0(yeVar.E, false, false);
        } else {
            xlVar.f40404r = null;
        }
        if (xlVar.f40391c == null) {
            xlVar.f40391c = new ImageReceiver(ylVar.f40783z);
            xlVar.d = new ImageReceiver(ylVar.f40783z);
            xlVar.f40391c.f21247h1 = new org.telegram.ui.jo(19, xlVar, yeVar);
        }
        int i3 = yeVar.C;
        String str = yeVar.I;
        String str2 = yeVar.f25311c;
        if (str2 != null) {
            xlVar.f40391c.r0(org.telegram.messenger.ac.g(str2), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (yeVar.f25310b) {
                ImageReceiver imageReceiver = xlVar.f40391c;
                imageReceiver.r0(org.telegram.messenger.ac.g("vthumb://" + i3 + ":" + str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
                xlVar.f40391c.f21272u0 = true;
                return;
            }
            xlVar.f40391c.G0(yeVar.J, 0, true);
            ImageReceiver imageReceiver2 = xlVar.f40391c;
            imageReceiver2.r0(org.telegram.messenger.ac.g("thumb://" + i3 + ":" + str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else {
            xlVar.f40391c.w0(org.telegram.ui.ActionBar.k6.R4);
        }
    }

    public static void b(xl xlVar, ul ulVar, org.telegram.messenger.ri riVar, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = xlVar.f40403q;
        RectF rectF2 = xlVar.f40394g;
        if (ulVar != null && riVar != null) {
            xlVar.f40395i = riVar.f25149l;
            if (z10) {
                float e10 = xlVar.e();
                RectF rectF3 = xlVar.f40393f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = xlVar.f40402p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                xlVar.f40396j = org.telegram.messenger.g0.T1(xlVar.f40396j, xlVar.f40397k, e10);
                xlVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = riVar.f25154q;
            float f14 = ulVar.f38815b;
            float f15 = f13 / f14;
            float f16 = riVar.f25153p;
            float f17 = ulVar.f38814a;
            float f18 = f16 / f17;
            xlVar.f40397k = 1.0f;
            rectF2.set(f15, f18, (riVar.f25143e / f14) + f15, (riVar.f25144f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.az.Y0 - 1);
            int i3 = xlVar.f40395i;
            if ((i3 & 5) == 5) {
                f10 = L2;
            } else {
                f10 = L;
            }
            if ((i3 & 6) == 6) {
                f11 = L2;
            } else {
                f11 = L;
            }
            if ((i3 & 10) == 10) {
                f12 = L2;
            } else {
                f12 = L;
            }
            if ((i3 & 9) == 9) {
                L = L2;
            }
            rectF.set(f10, f11, f12, L);
            if (xlVar.f40393f == null) {
                RectF rectF5 = new RectF();
                xlVar.f40393f = rectF5;
                rectF5.set(rectF2);
            }
            if (xlVar.f40402p == null) {
                RectF rectF6 = new RectF();
                xlVar.f40402p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xlVar.f40396j = org.telegram.messenger.g0.T1(xlVar.f40396j, xlVar.f40397k, xlVar.e());
            RectF rectF7 = xlVar.f40393f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, xlVar.e(), xlVar.f40393f);
            }
            xlVar.f40397k = 0.0f;
            xlVar.h = elapsedRealtime;
        } else {
            xlVar.f40396j = 0.0f;
            xlVar.f40397k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xl.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        xl xlVar = new xl(this.O);
        xlVar.f40394g.set(this.f40394g);
        xlVar.f40391c = this.f40391c;
        xlVar.f40390b = this.f40390b;
        return xlVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f40394g != null && this.f40391c != null) {
            zl zlVar = this.O.f40783z;
            xl xlVar = zlVar.Q.K;
            if (xlVar != null && xlVar.f40390b == this.f40390b) {
                f10 = zlVar.H;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f40396j, this.f40397k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a1.g.e(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a1.g.e(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f40410y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f40768j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f40410y;
        RectF rectF3 = this.f40394g;
        if (rectF3 != null && this.f40391c != null) {
            yl ylVar = this.O;
            float f11 = (rectF3.left * ylVar.f40776r) + ylVar.f40772n;
            float f12 = (rectF3.top * ylVar.f40777s) + ylVar.f40774p;
            float width = rectF3.width() * ylVar.f40776r;
            float height = rectF3.height() * ylVar.f40777s;
            if (f10 < 1.0f && (rectF = this.f40393f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * ylVar.f40776r) + ylVar.f40772n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f40393f.top * ylVar.f40777s) + ylVar.f40774p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f40393f.width() * ylVar.f40776r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f40393f.height() * ylVar.f40777s, height, f10);
            }
            int i3 = this.f40395i;
            if ((i3 & 4) == 0) {
                int i10 = ylVar.f40771m;
                f12 += i10;
                height -= i10;
            }
            if ((i3 & 8) == 0) {
                height -= ylVar.f40771m;
            }
            if ((i3 & 1) == 0) {
                int i11 = ylVar.f40771m;
                f11 += i11;
                width -= i11;
            }
            if ((i3 & 2) == 0) {
                width -= ylVar.f40771m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
