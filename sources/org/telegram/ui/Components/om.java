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
    public pm f38286a;
    public org.telegram.messenger.ff f38287b;
    public ImageReceiver f38288c;
    public ImageReceiver d;
    public boolean f38289e;
    public float f38295l;
    public float f38296m;
    public float f38297n;
    public float f38298o;
    public xh.e f38302s;
    public Bitmap v;
    public RectF f38290f = null;
    public final RectF f38291g = new RectF();
    public long h = 0;
    public int f38292i = 0;
    public float f38293j = 1.0f;
    public float f38294k = 0.0f;
    public RectF f38299p = null;
    public final RectF f38300q = new RectF();
    public String f38301r = null;
    public final Path f38303t = new Path();
    public final float[] f38304u = new float[8];
    public float f38305w = 1.0f;
    public final Paint f38306x = new Paint(1);
    public final RectF f38307y = new RectF();
    public final Paint f38308z = new Paint(1);
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
        this.f38286a = pmVar;
    }

    public static void a(om omVar, org.telegram.messenger.ff ffVar) {
        pm pmVar = omVar.O;
        omVar.f38287b = ffVar;
        if (ffVar.f28059b) {
            omVar.f38301r = org.telegram.messenger.g0.g0(ffVar.E, false, false);
        } else {
            omVar.f38301r = null;
        }
        if (omVar.f38288c == null) {
            omVar.f38288c = new ImageReceiver(pmVar.f38637z);
            omVar.d = new ImageReceiver(pmVar.f38637z);
            omVar.f38288c.f22670h1 = new h2(12, omVar, ffVar);
        }
        int i7 = ffVar.C;
        String str = ffVar.I;
        String str2 = ffVar.f28060c;
        if (str2 != null) {
            omVar.f38288c.r0(org.telegram.messenger.gc.g(str2), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (ffVar.f28059b) {
                ImageReceiver imageReceiver = omVar.f38288c;
                imageReceiver.r0(org.telegram.messenger.gc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
                omVar.f38288c.f22695u0 = true;
                return;
            }
            omVar.f38288c.G0(ffVar.J, 0, true);
            ImageReceiver imageReceiver2 = omVar.f38288c;
            imageReceiver2.r0(org.telegram.messenger.gc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.m6.R4, 0L, null, null, 0);
        } else {
            omVar.f38288c.w0(org.telegram.ui.ActionBar.m6.R4);
        }
    }

    public static void b(om omVar, lm lmVar, org.telegram.messenger.yi yiVar, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = omVar.f38300q;
        RectF rectF2 = omVar.f38291g;
        if (lmVar != null && yiVar != null) {
            omVar.f38292i = yiVar.f28101l;
            if (z10) {
                float e10 = omVar.e();
                RectF rectF3 = omVar.f38290f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = omVar.f38299p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                omVar.f38293j = org.telegram.messenger.g0.T1(omVar.f38293j, omVar.f38294k, e10);
                omVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = yiVar.f28106q;
            float f14 = lmVar.f37239b;
            float f15 = f13 / f14;
            float f16 = yiVar.f28105p;
            float f17 = lmVar.f37238a;
            float f18 = f16 / f17;
            omVar.f38294k = 1.0f;
            rectF2.set(f15, f18, (yiVar.f28095e / f14) + f15, (yiVar.f28096f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.cz.Y0 - 1);
            int i7 = omVar.f38292i;
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
            if (omVar.f38290f == null) {
                RectF rectF5 = new RectF();
                omVar.f38290f = rectF5;
                rectF5.set(rectF2);
            }
            if (omVar.f38299p == null) {
                RectF rectF6 = new RectF();
                omVar.f38299p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            omVar.f38293j = org.telegram.messenger.g0.T1(omVar.f38293j, omVar.f38294k, omVar.e());
            RectF rectF7 = omVar.f38290f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, omVar.e(), omVar.f38290f);
            }
            omVar.f38294k = 0.0f;
            omVar.h = elapsedRealtime;
        } else {
            omVar.f38293j = 0.0f;
            omVar.f38294k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        om omVar = new om(this.O);
        omVar.f38291g.set(this.f38291g);
        omVar.f38288c = this.f38288c;
        omVar.f38287b = this.f38287b;
        return omVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f38291g != null && this.f38288c != null) {
            qm qmVar = this.O.f38637z;
            om omVar = qmVar.Q.K;
            if (omVar != null && omVar.f38287b == this.f38287b) {
                f10 = qmVar.H;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f38293j, this.f38294k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f38307y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f38622j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f38307y;
        RectF rectF3 = this.f38291g;
        if (rectF3 != null && this.f38288c != null) {
            pm pmVar = this.O;
            float f11 = (rectF3.left * pmVar.f38630r) + pmVar.f38626n;
            float f12 = (rectF3.top * pmVar.f38631s) + pmVar.f38628p;
            float width = rectF3.width() * pmVar.f38630r;
            float height = rectF3.height() * pmVar.f38631s;
            if (f10 < 1.0f && (rectF = this.f38290f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * pmVar.f38630r) + pmVar.f38626n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f38290f.top * pmVar.f38631s) + pmVar.f38628p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f38290f.width() * pmVar.f38630r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f38290f.height() * pmVar.f38631s, height, f10);
            }
            int i7 = this.f38292i;
            if ((i7 & 4) == 0) {
                int i10 = pmVar.f38625m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= pmVar.f38625m;
            }
            if ((i7 & 1) == 0) {
                int i11 = pmVar.f38625m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= pmVar.f38625m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
