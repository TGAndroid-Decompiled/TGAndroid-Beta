package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class mm {
    public TextPaint B;
    public TextPaint C;
    public final nm O;
    public nm f37479a;
    public org.telegram.messenger.ef f37480b;
    public ImageReceiver f37481c;
    public ImageReceiver d;
    public boolean f37482e;
    public float f37488l;
    public float f37489m;
    public float f37490n;
    public float f37491o;
    public xh.e f37495s;
    public Bitmap v;
    public RectF f37483f = null;
    public final RectF f37484g = new RectF();
    public long h = 0;
    public int f37485i = 0;
    public float f37486j = 1.0f;
    public float f37487k = 0.0f;
    public RectF f37492p = null;
    public final RectF f37493q = new RectF();
    public String f37494r = null;
    public final Path f37496t = new Path();
    public final float[] f37497u = new float[8];
    public float f37498w = 1.0f;
    public final Paint f37499x = new Paint(1);
    public final RectF f37500y = new RectF();
    public final Paint f37501z = new Paint(1);
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

    public mm(nm nmVar) {
        this.O = nmVar;
        this.f37479a = nmVar;
    }

    public static void a(mm mmVar, org.telegram.messenger.ef efVar) {
        nm nmVar = mmVar.O;
        mmVar.f37480b = efVar;
        if (efVar.f27963b) {
            mmVar.f37494r = org.telegram.messenger.g0.g0(efVar.E, false, false);
        } else {
            mmVar.f37494r = null;
        }
        if (mmVar.f37481c == null) {
            mmVar.f37481c = new ImageReceiver(nmVar.f37872z);
            mmVar.d = new ImageReceiver(nmVar.f37872z);
            mmVar.f37481c.f22737h1 = new g2(12, mmVar, efVar);
        }
        int i7 = efVar.C;
        String str = efVar.I;
        String str2 = efVar.f27964c;
        if (str2 != null) {
            mmVar.f37481c.s0(org.telegram.messenger.fc.g(str2), null, null, null, org.telegram.ui.ActionBar.n6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (efVar.f27963b) {
                ImageReceiver imageReceiver = mmVar.f37481c;
                imageReceiver.s0(org.telegram.messenger.fc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.n6.R4, 0L, null, null, 0);
                mmVar.f37481c.f22762u0 = true;
                return;
            }
            mmVar.f37481c.H0(efVar.J, 0, true);
            ImageReceiver imageReceiver2 = mmVar.f37481c;
            imageReceiver2.s0(org.telegram.messenger.fc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.n6.R4, 0L, null, null, 0);
        } else {
            mmVar.f37481c.x0(org.telegram.ui.ActionBar.n6.R4);
        }
    }

    public static void b(mm mmVar, jm jmVar, org.telegram.messenger.xi xiVar, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = mmVar.f37493q;
        RectF rectF2 = mmVar.f37484g;
        if (jmVar != null && xiVar != null) {
            mmVar.f37485i = xiVar.f28005l;
            if (z10) {
                float e10 = mmVar.e();
                RectF rectF3 = mmVar.f37483f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = mmVar.f37492p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                mmVar.f37486j = org.telegram.messenger.g0.T1(mmVar.f37486j, mmVar.f37487k, e10);
                mmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = xiVar.f28010q;
            float f14 = jmVar.f36457b;
            float f15 = f13 / f14;
            float f16 = xiVar.f28009p;
            float f17 = jmVar.f36456a;
            float f18 = f16 / f17;
            mmVar.f37487k = 1.0f;
            rectF2.set(f15, f18, (xiVar.f27999e / f14) + f15, (xiVar.f28000f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.Y0 - 1);
            int i7 = mmVar.f37485i;
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
            if (mmVar.f37483f == null) {
                RectF rectF5 = new RectF();
                mmVar.f37483f = rectF5;
                rectF5.set(rectF2);
            }
            if (mmVar.f37492p == null) {
                RectF rectF6 = new RectF();
                mmVar.f37492p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mmVar.f37486j = org.telegram.messenger.g0.T1(mmVar.f37486j, mmVar.f37487k, mmVar.e());
            RectF rectF7 = mmVar.f37483f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, mmVar.e(), mmVar.f37483f);
            }
            mmVar.f37487k = 0.0f;
            mmVar.h = elapsedRealtime;
        } else {
            mmVar.f37486j = 0.0f;
            mmVar.f37487k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        mm mmVar = new mm(this.O);
        mmVar.f37484g.set(this.f37484g);
        mmVar.f37481c = this.f37481c;
        mmVar.f37480b = this.f37480b;
        return mmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f37484g != null && this.f37481c != null) {
            om omVar = this.O.f37872z;
            mm mmVar = omVar.Q.K;
            if (mmVar != null && mmVar.f37480b == this.f37480b) {
                f10 = omVar.H;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f37486j, this.f37487k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f37500y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f37857j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f37500y;
        RectF rectF3 = this.f37484g;
        if (rectF3 != null && this.f37481c != null) {
            nm nmVar = this.O;
            float f11 = (rectF3.left * nmVar.f37865r) + nmVar.f37861n;
            float f12 = (rectF3.top * nmVar.f37866s) + nmVar.f37863p;
            float width = rectF3.width() * nmVar.f37865r;
            float height = rectF3.height() * nmVar.f37866s;
            if (f10 < 1.0f && (rectF = this.f37483f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * nmVar.f37865r) + nmVar.f37861n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f37483f.top * nmVar.f37866s) + nmVar.f37863p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f37483f.width() * nmVar.f37865r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f37483f.height() * nmVar.f37866s, height, f10);
            }
            int i7 = this.f37485i;
            if ((i7 & 4) == 0) {
                int i10 = nmVar.f37860m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= nmVar.f37860m;
            }
            if ((i7 & 1) == 0) {
                int i11 = nmVar.f37860m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= nmVar.f37860m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
