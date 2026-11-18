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
    public nm f37561a;
    public org.telegram.messenger.ef f37562b;
    public ImageReceiver f37563c;
    public ImageReceiver d;
    public boolean f37564e;
    public float f37570l;
    public float f37571m;
    public float f37572n;
    public float f37573o;
    public xh.e f37577s;
    public Bitmap v;
    public RectF f37565f = null;
    public final RectF f37566g = new RectF();
    public long h = 0;
    public int f37567i = 0;
    public float f37568j = 1.0f;
    public float f37569k = 0.0f;
    public RectF f37574p = null;
    public final RectF f37575q = new RectF();
    public String f37576r = null;
    public final Path f37578t = new Path();
    public final float[] f37579u = new float[8];
    public float f37580w = 1.0f;
    public final Paint f37581x = new Paint(1);
    public final RectF f37582y = new RectF();
    public final Paint f37583z = new Paint(1);
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
        this.f37561a = nmVar;
    }

    public static void a(mm mmVar, org.telegram.messenger.ef efVar) {
        nm nmVar = mmVar.O;
        mmVar.f37562b = efVar;
        if (efVar.f27847b) {
            mmVar.f37576r = org.telegram.messenger.g0.g0(efVar.E, false, false);
        } else {
            mmVar.f37576r = null;
        }
        if (mmVar.f37563c == null) {
            mmVar.f37563c = new ImageReceiver(nmVar.f37828z);
            mmVar.d = new ImageReceiver(nmVar.f37828z);
            mmVar.f37563c.f22639h1 = new g2(12, mmVar, efVar);
        }
        int i7 = efVar.C;
        String str = efVar.I;
        String str2 = efVar.f27848c;
        if (str2 != null) {
            mmVar.f37563c.r0(org.telegram.messenger.fc.g(str2), null, null, null, org.telegram.ui.ActionBar.n6.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (efVar.f27847b) {
                ImageReceiver imageReceiver = mmVar.f37563c;
                imageReceiver.r0(org.telegram.messenger.fc.g("vthumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.n6.R4, 0L, null, null, 0);
                mmVar.f37563c.f22664u0 = true;
                return;
            }
            mmVar.f37563c.G0(efVar.J, 0, true);
            ImageReceiver imageReceiver2 = mmVar.f37563c;
            imageReceiver2.r0(org.telegram.messenger.fc.g("thumb://" + i7 + ":" + str), null, null, null, org.telegram.ui.ActionBar.n6.R4, 0L, null, null, 0);
        } else {
            mmVar.f37563c.w0(org.telegram.ui.ActionBar.n6.R4);
        }
    }

    public static void b(mm mmVar, jm jmVar, org.telegram.messenger.xi xiVar, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = mmVar.f37575q;
        RectF rectF2 = mmVar.f37566g;
        if (jmVar != null && xiVar != null) {
            mmVar.f37567i = xiVar.f27889l;
            if (z10) {
                float e10 = mmVar.e();
                RectF rectF3 = mmVar.f37565f;
                if (rectF3 != null) {
                    org.telegram.messenger.g0.Z1(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = mmVar.f37574p;
                if (rectF4 != null) {
                    org.telegram.messenger.g0.Z1(rectF4, rectF, e10, rectF4);
                }
                mmVar.f37568j = org.telegram.messenger.g0.T1(mmVar.f37568j, mmVar.f37569k, e10);
                mmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = xiVar.f27894q;
            float f14 = jmVar.f36487b;
            float f15 = f13 / f14;
            float f16 = xiVar.f27893p;
            float f17 = jmVar.f36486a;
            float f18 = f16 / f17;
            mmVar.f37569k = 1.0f;
            rectF2.set(f15, f18, (xiVar.f27883e / f14) + f15, (xiVar.f27884f / f17) + f18);
            float L = org.telegram.messenger.g0.L(2.0f);
            float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.Y0 - 1);
            int i7 = mmVar.f37567i;
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
            if (mmVar.f37565f == null) {
                RectF rectF5 = new RectF();
                mmVar.f37565f = rectF5;
                rectF5.set(rectF2);
            }
            if (mmVar.f37574p == null) {
                RectF rectF6 = new RectF();
                mmVar.f37574p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mmVar.f37568j = org.telegram.messenger.g0.T1(mmVar.f37568j, mmVar.f37569k, mmVar.e());
            RectF rectF7 = mmVar.f37565f;
            if (rectF7 != null) {
                org.telegram.messenger.g0.Z1(rectF7, rectF2, mmVar.e(), mmVar.f37565f);
            }
            mmVar.f37569k = 0.0f;
            mmVar.h = elapsedRealtime;
        } else {
            mmVar.f37568j = 0.0f;
            mmVar.f37569k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        mm mmVar = new mm(this.O);
        mmVar.f37566g.set(this.f37566g);
        mmVar.f37563c = this.f37563c;
        mmVar.f37562b = this.f37562b;
        return mmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f37566g != null && this.f37563c != null) {
            om omVar = this.O.f37828z;
            mm mmVar = omVar.Q.K;
            if (mmVar != null && mmVar.f37562b == this.f37562b) {
                f10 = omVar.H;
            }
            float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.f37568j, this.f37569k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - T1;
            float f13 = T1 + 1.0f;
            f11.set(a8.p0.f(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a8.p0.f(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f37582y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f37813j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f37582y;
        RectF rectF3 = this.f37566g;
        if (rectF3 != null && this.f37563c != null) {
            nm nmVar = this.O;
            float f11 = (rectF3.left * nmVar.f37821r) + nmVar.f37817n;
            float f12 = (rectF3.top * nmVar.f37822s) + nmVar.f37819p;
            float width = rectF3.width() * nmVar.f37821r;
            float height = rectF3.height() * nmVar.f37822s;
            if (f10 < 1.0f && (rectF = this.f37565f) != null) {
                f11 = org.telegram.messenger.g0.T1((rectF.left * nmVar.f37821r) + nmVar.f37817n, f11, f10);
                f12 = org.telegram.messenger.g0.T1((this.f37565f.top * nmVar.f37822s) + nmVar.f37819p, f12, f10);
                width = org.telegram.messenger.g0.T1(this.f37565f.width() * nmVar.f37821r, width, f10);
                height = org.telegram.messenger.g0.T1(this.f37565f.height() * nmVar.f37822s, height, f10);
            }
            int i7 = this.f37567i;
            if ((i7 & 4) == 0) {
                int i10 = nmVar.f37816m;
                f12 += i10;
                height -= i10;
            }
            if ((i7 & 8) == 0) {
                height -= nmVar.f37816m;
            }
            if ((i7 & 1) == 0) {
                int i11 = nmVar.f37816m;
                f11 += i11;
                width -= i11;
            }
            if ((i7 & 2) == 0) {
                width -= nmVar.f37816m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
