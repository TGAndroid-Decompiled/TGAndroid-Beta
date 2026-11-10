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
    public yl f40327a;
    public org.telegram.messenger.gf f40328b;
    public ImageReceiver f40329c;
    public ImageReceiver d;
    public boolean f40330e;
    public float f40336l;
    public float f40337m;
    public float f40338n;
    public float f40339o;
    public xh.e f40343s;
    public Bitmap v;
    public RectF f40331f = null;
    public final RectF f40332g = new RectF();
    public long h = 0;
    public int f40333i = 0;
    public float f40334j = 1.0f;
    public float f40335k = 0.0f;
    public RectF f40340p = null;
    public final RectF f40341q = new RectF();
    public String f40342r = null;
    public final Path f40344t = new Path();
    public final float[] f40345u = new float[8];
    public float f40346w = 1.0f;
    public final Paint f40347x = new Paint(1);
    public final RectF f40348y = new RectF();
    public final Paint f40349z = new Paint(1);
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
        this.f40327a = ylVar;
    }

    public static void a(xl xlVar, org.telegram.messenger.gf gfVar) {
        yl ylVar = xlVar.O;
        xlVar.f40328b = gfVar;
        if (gfVar.f26849b) {
            xlVar.f40342r = org.telegram.messenger.g0.g0(gfVar.E, false, false);
        } else {
            xlVar.f40342r = null;
        }
        if (xlVar.f40329c == null) {
            xlVar.f40329c = new ImageReceiver(ylVar.f40617z);
            xlVar.d = new ImageReceiver(ylVar.f40617z);
            xlVar.f40329c.f21200g1 = new e2(9, xlVar, gfVar);
        }
        int i7 = gfVar.C;
        String str = gfVar.I;
        String str2 = gfVar.f26850c;
        if (str2 != null) {
            xlVar.f40329c.r0(org.telegram.messenger.hc.g(str2), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (gfVar.f26849b) {
                ImageReceiver imageReceiver = xlVar.f40329c;
                imageReceiver.r0(org.telegram.messenger.hc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
                xlVar.f40329c.f21225t0 = true;
                return;
            }
            xlVar.f40329c.G0(gfVar.J, 0, true);
            ImageReceiver imageReceiver2 = xlVar.f40329c;
            imageReceiver2.r0(org.telegram.messenger.hc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
        } else {
            xlVar.f40329c.w0(org.telegram.ui.ActionBar.m6.R4);
        }
    }

    public static void b(xl xlVar, ul ulVar, org.telegram.messenger.aj ajVar, boolean z9) {
        float f10;
        float f11;
        float f12;
        RectF rectF = xlVar.f40341q;
        RectF rectF2 = xlVar.f40332g;
        if (ulVar != null && ajVar != null) {
            xlVar.f40333i = ajVar.f21455l;
            if (z9) {
                float e10 = xlVar.e();
                RectF rectF3 = xlVar.f40331f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = xlVar.f40340p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                xlVar.f40334j = org.telegram.messenger.g0.T1(xlVar.f40334j, xlVar.f40335k, e10);
                xlVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = ajVar.f21460q;
            float f14 = ulVar.f38705b;
            float f15 = f13 / f14;
            float f16 = ajVar.f21459p;
            float f17 = ulVar.f38704a;
            float f18 = f16 / f17;
            xlVar.f40335k = 1.0f;
            rectF2.set(f15, f18, (ajVar.f21449e / f14) + f15, (ajVar.f21450f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.iz.Y0 - 1);
            int i7 = xlVar.f40333i;
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
            if (xlVar.f40331f == null) {
                RectF rectF5 = new RectF();
                xlVar.f40331f = rectF5;
                rectF5.set(rectF2);
            }
            if (xlVar.f40340p == null) {
                RectF rectF6 = new RectF();
                xlVar.f40340p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z9) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xlVar.f40334j = org.telegram.messenger.g0.T1(xlVar.f40334j, xlVar.f40335k, xlVar.e());
            RectF rectF7 = xlVar.f40331f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, xlVar.e(), xlVar.f40331f);
            }
            xlVar.f40335k = 0.0f;
            xlVar.h = elapsedRealtime;
        } else {
            xlVar.f40334j = 0.0f;
            xlVar.f40335k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xl.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        xl xlVar = new xl(this.O);
        xlVar.f40332g.set(this.f40332g);
        xlVar.f40329c = this.f40329c;
        xlVar.f40328b = this.f40328b;
        return xlVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f40332g != null && this.f40329c != null) {
            zl zlVar = this.O.f40617z;
            xl xlVar = zlVar.P.J;
            if (xlVar != null && xlVar.f40328b == this.f40328b) {
                f10 = zlVar.G;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f40334j, this.f40335k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f40348y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f40602j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f40348y;
        RectF rectF3 = this.f40332g;
        if (rectF3 != null && this.f40329c != null) {
            yl ylVar = this.O;
            float f11 = (rectF3.left * ylVar.f40610r) + ylVar.f40606n;
            float f12 = (rectF3.top * ylVar.f40611s) + ylVar.f40608p;
            float width = rectF3.width() * ylVar.f40610r;
            float height = rectF3.height() * ylVar.f40611s;
            if (f10 < 1.0f && (rectF = this.f40331f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * ylVar.f40610r) + ylVar.f40606n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f40331f.top * ylVar.f40611s) + ylVar.f40608p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f40331f.width() * ylVar.f40610r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f40331f.height() * ylVar.f40611s, height, f10);
            }
            int i7 = this.f40333i;
            if ((i7 & 4) == 0) {
                int i10 = ylVar.f40605m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= ylVar.f40605m;
            }
            if ((i7 & 1) == 0) {
                int i11 = ylVar.f40605m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= ylVar.f40605m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
