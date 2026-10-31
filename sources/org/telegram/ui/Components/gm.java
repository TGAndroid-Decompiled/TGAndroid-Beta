package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class gm {
    public TextPaint B;
    public TextPaint C;
    public final hm O;
    public hm f26415a;
    public org.telegram.messenger.ef f26416b;
    public ImageReceiver f26417c;
    public ImageReceiver d;
    public boolean e;
    public float f26423l;
    public float f26424m;
    public float f26425n;
    public float f26426o;
    public nh.h f26430s;
    public Bitmap v;
    public RectF f26418f = null;
    public final RectF f26419g = new RectF();
    public long h = 0;
    public int f26420i = 0;
    public float f26421j = 1.0f;
    public float f26422k = 0.0f;
    public RectF f26427p = null;
    public final RectF f26428q = new RectF();
    public String f26429r = null;
    public final Path f26431t = new Path();
    public final float[] f26432u = new float[8];
    public float f26433w = 1.0f;
    public final Paint f26434x = new Paint(1);
    public final RectF f26435y = new RectF();
    public final Paint f26436z = new Paint(1);
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

    public gm(hm hmVar) {
        this.O = hmVar;
        this.f26415a = hmVar;
    }

    public static void a(gm gmVar, org.telegram.messenger.ef efVar) {
        hm hmVar = gmVar.O;
        gmVar.f26416b = efVar;
        if (efVar.f19507b) {
            gmVar.f26429r = org.telegram.messenger.i0.g0(efVar.E, false, false);
        } else {
            gmVar.f26429r = null;
        }
        if (gmVar.f26417c == null) {
            gmVar.f26417c = new ImageReceiver(hmVar.f26779z);
            gmVar.d = new ImageReceiver(hmVar.f26779z);
            gmVar.f26417c.f14382g1 = new f2(10, gmVar, efVar);
        }
        int i10 = efVar.C;
        String str = efVar.I;
        String str2 = efVar.f19508c;
        if (str2 != null) {
            gmVar.f26417c.r0(org.telegram.messenger.ic.g(str2), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (efVar.f19507b) {
                ImageReceiver imageReceiver = gmVar.f26417c;
                imageReceiver.r0(org.telegram.messenger.ic.g("vthumb://" + i10 + ":" + str), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
                gmVar.f26417c.f14408t0 = true;
                return;
            }
            gmVar.f26417c.G0(efVar.J, 0, true);
            ImageReceiver imageReceiver2 = gmVar.f26417c;
            imageReceiver2.r0(org.telegram.messenger.ic.g("thumb://" + i10 + ":" + str), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
        } else {
            gmVar.f26417c.w0(org.telegram.ui.ActionBar.t6.R4);
        }
    }

    public static void b(gm gmVar, dm dmVar, org.telegram.messenger.bj bjVar, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = gmVar.f26428q;
        RectF rectF2 = gmVar.f26419g;
        if (dmVar != null && bjVar != null) {
            gmVar.f26420i = bjVar.f14783l;
            if (z10) {
                float e = gmVar.e();
                RectF rectF3 = gmVar.f26418f;
                if (rectF3 != null) {
                    org.telegram.messenger.i0.Z1(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = gmVar.f26427p;
                if (rectF4 != null) {
                    org.telegram.messenger.i0.Z1(rectF4, rectF, e, rectF4);
                }
                gmVar.f26421j = org.telegram.messenger.i0.T1(gmVar.f26421j, gmVar.f26422k, e);
                gmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = bjVar.f14788q;
            float f13 = dmVar.f25464b;
            float f14 = f12 / f13;
            float f15 = bjVar.f14787p;
            float f16 = dmVar.f25463a;
            float f17 = f15 / f16;
            gmVar.f26422k = 1.0f;
            rectF2.set(f14, f17, (bjVar.e / f13) + f14, (bjVar.f14778f / f16) + f17);
            float L = org.telegram.messenger.i0.L(2.0f);
            float L2 = org.telegram.messenger.i0.L(org.telegram.messenger.tz.Y0 - 1);
            int i10 = gmVar.f26420i;
            if ((i10 & 5) == 5) {
                f7 = L2;
            } else {
                f7 = L;
            }
            if ((i10 & 6) == 6) {
                f10 = L2;
            } else {
                f10 = L;
            }
            if ((i10 & 10) == 10) {
                f11 = L2;
            } else {
                f11 = L;
            }
            if ((i10 & 9) == 9) {
                L = L2;
            }
            rectF.set(f7, f10, f11, L);
            if (gmVar.f26418f == null) {
                RectF rectF5 = new RectF();
                gmVar.f26418f = rectF5;
                rectF5.set(rectF2);
            }
            if (gmVar.f26427p == null) {
                RectF rectF6 = new RectF();
                gmVar.f26427p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gmVar.f26421j = org.telegram.messenger.i0.T1(gmVar.f26421j, gmVar.f26422k, gmVar.e());
            RectF rectF7 = gmVar.f26418f;
            if (rectF7 != null) {
                org.telegram.messenger.i0.Z1(rectF7, rectF2, gmVar.e(), gmVar.f26418f);
            }
            gmVar.f26422k = 0.0f;
            gmVar.h = elapsedRealtime;
        } else {
            gmVar.f26421j = 0.0f;
            gmVar.f26422k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        gm gmVar = new gm(this.O);
        gmVar.f26419g.set(this.f26419g);
        gmVar.f26417c = this.f26417c;
        gmVar.f26416b = this.f26416b;
        return gmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26419g != null && this.f26417c != null) {
            im imVar = this.O.f26779z;
            gm gmVar = imVar.P.J;
            if (gmVar != null && gmVar.f26416b == this.f26416b) {
                f7 = imVar.G;
            }
            float T1 = (((1.0f - f7) * 0.2f) + 0.8f) * org.telegram.messenger.i0.T1(this.f26421j, this.f26422k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - T1;
            float f12 = T1 + 1.0f;
            f10.set(a1.g.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26435y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26764j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26435y;
        RectF rectF3 = this.f26419g;
        if (rectF3 != null && this.f26417c != null) {
            hm hmVar = this.O;
            float f10 = (rectF3.left * hmVar.f26772r) + hmVar.f26768n;
            float f11 = (rectF3.top * hmVar.f26773s) + hmVar.f26770p;
            float width = rectF3.width() * hmVar.f26772r;
            float height = rectF3.height() * hmVar.f26773s;
            if (f7 < 1.0f && (rectF = this.f26418f) != null) {
                f10 = org.telegram.messenger.i0.T1((rectF.left * hmVar.f26772r) + hmVar.f26768n, f10, f7);
                f11 = org.telegram.messenger.i0.T1((this.f26418f.top * hmVar.f26773s) + hmVar.f26770p, f11, f7);
                width = org.telegram.messenger.i0.T1(this.f26418f.width() * hmVar.f26772r, width, f7);
                height = org.telegram.messenger.i0.T1(this.f26418f.height() * hmVar.f26773s, height, f7);
            }
            int i10 = this.f26420i;
            if ((i10 & 4) == 0) {
                int i11 = hmVar.f26767m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= hmVar.f26767m;
            }
            if ((i10 & 1) == 0) {
                int i12 = hmVar.f26767m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= hmVar.f26767m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
