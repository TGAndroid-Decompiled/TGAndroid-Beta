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
    public hm f26476a;
    public org.telegram.messenger.ff f26477b;
    public ImageReceiver f26478c;
    public ImageReceiver d;
    public boolean e;
    public float f26484l;
    public float f26485m;
    public float f26486n;
    public float f26487o;
    public nh.h f26491s;
    public Bitmap v;
    public RectF f26479f = null;
    public final RectF f26480g = new RectF();
    public long h = 0;
    public int f26481i = 0;
    public float f26482j = 1.0f;
    public float f26483k = 0.0f;
    public RectF f26488p = null;
    public final RectF f26489q = new RectF();
    public String f26490r = null;
    public final Path f26492t = new Path();
    public final float[] f26493u = new float[8];
    public float f26494w = 1.0f;
    public final Paint f26495x = new Paint(1);
    public final RectF f26496y = new RectF();
    public final Paint f26497z = new Paint(1);
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
        this.f26476a = hmVar;
    }

    public static void a(gm gmVar, org.telegram.messenger.ff ffVar) {
        hm hmVar = gmVar.O;
        gmVar.f26477b = ffVar;
        if (ffVar.f14603b) {
            gmVar.f26490r = org.telegram.messenger.i0.g0(ffVar.E, false, false);
        } else {
            gmVar.f26490r = null;
        }
        if (gmVar.f26478c == null) {
            gmVar.f26478c = new ImageReceiver(hmVar.f26857z);
            gmVar.d = new ImageReceiver(hmVar.f26857z);
            gmVar.f26478c.f14383g1 = new f2(10, gmVar, ffVar);
        }
        int i10 = ffVar.C;
        String str = ffVar.I;
        String str2 = ffVar.f14604c;
        if (str2 != null) {
            gmVar.f26478c.r0(org.telegram.messenger.jc.g(str2), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (ffVar.f14603b) {
                ImageReceiver imageReceiver = gmVar.f26478c;
                imageReceiver.r0(org.telegram.messenger.jc.g("vthumb://" + i10 + ":" + str), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
                gmVar.f26478c.f14409t0 = true;
                return;
            }
            gmVar.f26478c.G0(ffVar.J, 0, true);
            ImageReceiver imageReceiver2 = gmVar.f26478c;
            imageReceiver2.r0(org.telegram.messenger.jc.g("thumb://" + i10 + ":" + str), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
        } else {
            gmVar.f26478c.w0(org.telegram.ui.ActionBar.t6.R4);
        }
    }

    public static void b(gm gmVar, dm dmVar, org.telegram.messenger.cj cjVar, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = gmVar.f26489q;
        RectF rectF2 = gmVar.f26480g;
        if (dmVar != null && cjVar != null) {
            gmVar.f26481i = cjVar.f15166l;
            if (z10) {
                float e = gmVar.e();
                RectF rectF3 = gmVar.f26479f;
                if (rectF3 != null) {
                    org.telegram.messenger.i0.Z1(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = gmVar.f26488p;
                if (rectF4 != null) {
                    org.telegram.messenger.i0.Z1(rectF4, rectF, e, rectF4);
                }
                gmVar.f26482j = org.telegram.messenger.i0.T1(gmVar.f26482j, gmVar.f26483k, e);
                gmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = cjVar.f15171q;
            float f13 = dmVar.f25513b;
            float f14 = f12 / f13;
            float f15 = cjVar.f15170p;
            float f16 = dmVar.f25512a;
            float f17 = f15 / f16;
            gmVar.f26483k = 1.0f;
            rectF2.set(f14, f17, (cjVar.e / f13) + f14, (cjVar.f15161f / f16) + f17);
            float L = org.telegram.messenger.i0.L(2.0f);
            float L2 = org.telegram.messenger.i0.L(org.telegram.messenger.uz.Y0 - 1);
            int i10 = gmVar.f26481i;
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
            if (gmVar.f26479f == null) {
                RectF rectF5 = new RectF();
                gmVar.f26479f = rectF5;
                rectF5.set(rectF2);
            }
            if (gmVar.f26488p == null) {
                RectF rectF6 = new RectF();
                gmVar.f26488p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gmVar.f26482j = org.telegram.messenger.i0.T1(gmVar.f26482j, gmVar.f26483k, gmVar.e());
            RectF rectF7 = gmVar.f26479f;
            if (rectF7 != null) {
                org.telegram.messenger.i0.Z1(rectF7, rectF2, gmVar.e(), gmVar.f26479f);
            }
            gmVar.f26483k = 0.0f;
            gmVar.h = elapsedRealtime;
        } else {
            gmVar.f26482j = 0.0f;
            gmVar.f26483k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        gm gmVar = new gm(this.O);
        gmVar.f26480g.set(this.f26480g);
        gmVar.f26478c = this.f26478c;
        gmVar.f26477b = this.f26477b;
        return gmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26480g != null && this.f26478c != null) {
            im imVar = this.O.f26857z;
            gm gmVar = imVar.P.J;
            if (gmVar != null && gmVar.f26477b == this.f26477b) {
                f7 = imVar.G;
            }
            float T1 = (((1.0f - f7) * 0.2f) + 0.8f) * org.telegram.messenger.i0.T1(this.f26482j, this.f26483k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - T1;
            float f12 = T1 + 1.0f;
            f10.set(a1.g.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26496y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26842j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26496y;
        RectF rectF3 = this.f26480g;
        if (rectF3 != null && this.f26478c != null) {
            hm hmVar = this.O;
            float f10 = (rectF3.left * hmVar.f26850r) + hmVar.f26846n;
            float f11 = (rectF3.top * hmVar.f26851s) + hmVar.f26848p;
            float width = rectF3.width() * hmVar.f26850r;
            float height = rectF3.height() * hmVar.f26851s;
            if (f7 < 1.0f && (rectF = this.f26479f) != null) {
                f10 = org.telegram.messenger.i0.T1((rectF.left * hmVar.f26850r) + hmVar.f26846n, f10, f7);
                f11 = org.telegram.messenger.i0.T1((this.f26479f.top * hmVar.f26851s) + hmVar.f26848p, f11, f7);
                width = org.telegram.messenger.i0.T1(this.f26479f.width() * hmVar.f26850r, width, f7);
                height = org.telegram.messenger.i0.T1(this.f26479f.height() * hmVar.f26851s, height, f7);
            }
            int i10 = this.f26481i;
            if ((i10 & 4) == 0) {
                int i11 = hmVar.f26845m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= hmVar.f26845m;
            }
            if ((i10 & 1) == 0) {
                int i12 = hmVar.f26845m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= hmVar.f26845m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
