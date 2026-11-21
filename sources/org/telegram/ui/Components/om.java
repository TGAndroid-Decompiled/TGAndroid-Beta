package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class om {
    public TextPaint B;
    public TextPaint C;
    public final pm O;
    public pm f38292a;
    public org.telegram.messenger.ef f38293b;
    public ImageReceiver f38294c;
    public ImageReceiver d;
    public boolean f38295e;
    public float f38301l;
    public float f38302m;
    public float f38303n;
    public float f38304o;
    public xh.e f38308s;
    public Bitmap v;
    public RectF f38296f = null;
    public final RectF f38297g = new RectF();
    public long h = 0;
    public int f38298i = 0;
    public float f38299j = 1.0f;
    public float f38300k = 0.0f;
    public RectF f38305p = null;
    public final RectF f38306q = new RectF();
    public String f38307r = null;
    public final Path f38309t = new Path();
    public final float[] f38310u = new float[8];
    public float f38311w = 1.0f;
    public final Paint f38312x = new Paint(1);
    public final RectF f38313y = new RectF();
    public final Paint f38314z = new Paint(1);
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

    public om(pm pmVar) {
        this.O = pmVar;
        this.f38292a = pmVar;
    }

    public static void a(om omVar, org.telegram.messenger.ef efVar) {
        pm pmVar = omVar.O;
        omVar.f38293b = efVar;
        if (efVar.f27875b) {
            omVar.f38307r = org.telegram.messenger.g0.g0(efVar.E, false, false);
        } else {
            omVar.f38307r = null;
        }
        if (omVar.f38294c == null) {
            omVar.f38294c = new ImageReceiver(pmVar.f38638z);
            omVar.d = new ImageReceiver(pmVar.f38638z);
            omVar.f38294c.f22667h1 = new h2(12, omVar, efVar);
        }
        int i7 = efVar.C;
        String str = efVar.I;
        String str2 = efVar.f27876c;
        if (str2 != null) {
            omVar.f38294c.r0(org.telegram.messenger.fc.g(str2), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (efVar.f27875b) {
                ImageReceiver imageReceiver = omVar.f38294c;
                imageReceiver.r0(org.telegram.messenger.fc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
                omVar.f38294c.f22692u0 = true;
                return;
            }
            omVar.f38294c.G0(efVar.J, 0, true);
            ImageReceiver imageReceiver2 = omVar.f38294c;
            imageReceiver2.r0(org.telegram.messenger.fc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
        } else {
            omVar.f38294c.w0(org.telegram.ui.ActionBar.m6.R4);
        }
    }

    public static void b(om omVar, lm lmVar, org.telegram.messenger.xi xiVar, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = omVar.f38306q;
        RectF rectF2 = omVar.f38297g;
        if (lmVar != null && xiVar != null) {
            omVar.f38298i = xiVar.f27917l;
            if (z10) {
                float e10 = omVar.e();
                RectF rectF3 = omVar.f38296f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = omVar.f38305p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                omVar.f38299j = org.telegram.messenger.g0.T1(omVar.f38299j, omVar.f38300k, e10);
                omVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = xiVar.f27922q;
            float f14 = lmVar.f37233b;
            float f15 = f13 / f14;
            float f16 = xiVar.f27921p;
            float f17 = lmVar.f37232a;
            float f18 = f16 / f17;
            omVar.f38300k = 1.0f;
            rectF2.set(f15, f18, (xiVar.f27911e / f14) + f15, (xiVar.f27912f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.Y0 - 1);
            int i7 = omVar.f38298i;
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
            if (omVar.f38296f == null) {
                RectF rectF5 = new RectF();
                omVar.f38296f = rectF5;
                rectF5.set(rectF2);
            }
            if (omVar.f38305p == null) {
                RectF rectF6 = new RectF();
                omVar.f38305p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            omVar.f38299j = org.telegram.messenger.g0.T1(omVar.f38299j, omVar.f38300k, omVar.e());
            RectF rectF7 = omVar.f38296f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, omVar.e(), omVar.f38296f);
            }
            omVar.f38300k = 0.0f;
            omVar.h = elapsedRealtime;
        } else {
            omVar.f38299j = 0.0f;
            omVar.f38300k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        om omVar = new om(this.O);
        omVar.f38297g.set(this.f38297g);
        omVar.f38294c = this.f38294c;
        omVar.f38293b = this.f38293b;
        return omVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f38297g != null && this.f38294c != null) {
            qm qmVar = this.O.f38638z;
            om omVar = qmVar.Q.K;
            if (omVar != null && omVar.f38293b == this.f38293b) {
                f10 = qmVar.H;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f38299j, this.f38300k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f38313y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f38623j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f38313y;
        RectF rectF3 = this.f38297g;
        if (rectF3 != null && this.f38294c != null) {
            pm pmVar = this.O;
            float f11 = (rectF3.left * pmVar.f38631r) + pmVar.f38627n;
            float f12 = (rectF3.top * pmVar.f38632s) + pmVar.f38629p;
            float width = rectF3.width() * pmVar.f38631r;
            float height = rectF3.height() * pmVar.f38632s;
            if (f10 < 1.0f && (rectF = this.f38296f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * pmVar.f38631r) + pmVar.f38627n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f38296f.top * pmVar.f38632s) + pmVar.f38629p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f38296f.width() * pmVar.f38631r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f38296f.height() * pmVar.f38632s, height, f10);
            }
            int i7 = this.f38298i;
            if ((i7 & 4) == 0) {
                int i10 = pmVar.f38626m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= pmVar.f38626m;
            }
            if ((i7 & 1) == 0) {
                int i11 = pmVar.f38626m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= pmVar.f38626m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
