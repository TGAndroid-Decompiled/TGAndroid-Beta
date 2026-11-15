package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class fm {
    public TextPaint B;
    public TextPaint C;
    public final gm O;
    public gm f34628a;
    public org.telegram.messenger.ff f34629b;
    public ImageReceiver f34630c;
    public ImageReceiver d;
    public boolean f34631e;
    public float f34637l;
    public float f34638m;
    public float f34639n;
    public float f34640o;
    public xh.e f34644s;
    public Bitmap v;
    public RectF f34632f = null;
    public final RectF f34633g = new RectF();
    public long h = 0;
    public int f34634i = 0;
    public float f34635j = 1.0f;
    public float f34636k = 0.0f;
    public RectF f34641p = null;
    public final RectF f34642q = new RectF();
    public String f34643r = null;
    public final Path f34645t = new Path();
    public final float[] f34646u = new float[8];
    public float f34647w = 1.0f;
    public final Paint f34648x = new Paint(1);
    public final RectF f34649y = new RectF();
    public final Paint f34650z = new Paint(1);
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

    public fm(gm gmVar) {
        this.O = gmVar;
        this.f34628a = gmVar;
    }

    public static void a(fm fmVar, org.telegram.messenger.ff ffVar) {
        gm gmVar = fmVar.O;
        fmVar.f34629b = ffVar;
        if (ffVar.f27710b) {
            fmVar.f34643r = org.telegram.messenger.g0.g0(ffVar.E, false, false);
        } else {
            fmVar.f34643r = null;
        }
        if (fmVar.f34630c == null) {
            fmVar.f34630c = new ImageReceiver(gmVar.f35025z);
            fmVar.d = new ImageReceiver(gmVar.f35025z);
            fmVar.f34630c.f22276h1 = new f1(13, fmVar, ffVar);
        }
        int i7 = ffVar.C;
        String str = ffVar.I;
        String str2 = ffVar.f27711c;
        if (str2 != null) {
            fmVar.f34630c.r0(org.telegram.messenger.gc.g(str2), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (ffVar.f27710b) {
                ImageReceiver imageReceiver = fmVar.f34630c;
                imageReceiver.r0(org.telegram.messenger.gc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                fmVar.f34630c.f22301u0 = true;
                return;
            }
            fmVar.f34630c.G0(ffVar.J, 0, true);
            ImageReceiver imageReceiver2 = fmVar.f34630c;
            imageReceiver2.r0(org.telegram.messenger.gc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            fmVar.f34630c.w0(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(fm fmVar, cm cmVar, org.telegram.messenger.yi yiVar, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = fmVar.f34642q;
        RectF rectF2 = fmVar.f34633g;
        if (cmVar != null && yiVar != null) {
            fmVar.f34634i = yiVar.f27755l;
            if (z10) {
                float e10 = fmVar.e();
                RectF rectF3 = fmVar.f34632f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = fmVar.f34641p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                fmVar.f34635j = org.telegram.messenger.g0.T1(fmVar.f34635j, fmVar.f34636k, e10);
                fmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = yiVar.f27760q;
            float f14 = cmVar.f33633b;
            float f15 = f13 / f14;
            float f16 = yiVar.f27759p;
            float f17 = cmVar.f33632a;
            float f18 = f16 / f17;
            fmVar.f34636k = 1.0f;
            rectF2.set(f15, f18, (yiVar.f27749e / f14) + f15, (yiVar.f27750f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.gz.Y0 - 1);
            int i7 = fmVar.f34634i;
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
            if (fmVar.f34632f == null) {
                RectF rectF5 = new RectF();
                fmVar.f34632f = rectF5;
                rectF5.set(rectF2);
            }
            if (fmVar.f34641p == null) {
                RectF rectF6 = new RectF();
                fmVar.f34641p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            fmVar.f34635j = org.telegram.messenger.g0.T1(fmVar.f34635j, fmVar.f34636k, fmVar.e());
            RectF rectF7 = fmVar.f34632f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, fmVar.e(), fmVar.f34632f);
            }
            fmVar.f34636k = 0.0f;
            fmVar.h = elapsedRealtime;
        } else {
            fmVar.f34635j = 0.0f;
            fmVar.f34636k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        fm fmVar = new fm(this.O);
        fmVar.f34633g.set(this.f34633g);
        fmVar.f34630c = this.f34630c;
        fmVar.f34629b = this.f34629b;
        return fmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f34633g != null && this.f34630c != null) {
            hm hmVar = this.O.f35025z;
            fm fmVar = hmVar.Q.K;
            if (fmVar != null && fmVar.f34629b == this.f34629b) {
                f10 = hmVar.H;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f34635j, this.f34636k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f34649y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f35010j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f34649y;
        RectF rectF3 = this.f34633g;
        if (rectF3 != null && this.f34630c != null) {
            gm gmVar = this.O;
            float f11 = (rectF3.left * gmVar.f35018r) + gmVar.f35014n;
            float f12 = (rectF3.top * gmVar.f35019s) + gmVar.f35016p;
            float width = rectF3.width() * gmVar.f35018r;
            float height = rectF3.height() * gmVar.f35019s;
            if (f10 < 1.0f && (rectF = this.f34632f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * gmVar.f35018r) + gmVar.f35014n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f34632f.top * gmVar.f35019s) + gmVar.f35016p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f34632f.width() * gmVar.f35018r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f34632f.height() * gmVar.f35019s, height, f10);
            }
            int i7 = this.f34634i;
            if ((i7 & 4) == 0) {
                int i10 = gmVar.f35013m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= gmVar.f35013m;
            }
            if ((i7 & 1) == 0) {
                int i11 = gmVar.f35013m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= gmVar.f35013m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
