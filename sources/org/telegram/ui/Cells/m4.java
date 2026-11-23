package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.xi;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.wy0;
public final class m4 {
    public int A;
    public int B;
    public boolean C;
    public final r1 f31129a;
    public k4 f31130b;
    public int d;
    public int f31132e;
    public int f31133f;
    public int f31134g;
    public int h;
    public boolean f31135i;
    public final org.telegram.ui.Components.c6 f31136j;
    public n80 f31137k;
    public final xh.e f31138l;
    public int f31139m;
    public final lc f31140n;
    public l4 f31141o;
    public boolean f31142p;
    public wy0 f31143q;
    public wy0 f31144r;
    public long f31145s;
    public Bitmap f31148w;
    public Paint f31149x;
    public int f31150y;
    public int f31151z;
    public final ArrayList f31131c = new ArrayList();
    public final Path f31146t = new Path();
    public final Path f31147u = new Path();
    public final RectF v = new RectF();

    public m4(r1 r1Var) {
        this.f31129a = r1Var;
        this.f31138l = xh.e.e(r1Var);
        this.f31136j = new org.telegram.ui.Components.c6(r1Var, 0L, 350L, kr.h);
        this.f31140n = new lc(r1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f31131c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!((l4) obj).f31080f.R0) {
                return false;
            }
        }
        return true;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m4.b(android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float f11;
        ArrayList arrayList;
        int i10;
        int i11;
        if (this.f31130b != null) {
            r1 r1Var = this.f31129a;
            if (r1Var.getMessageObject() != null) {
                i7 = r1Var.getMessageObject().e1();
            } else {
                i7 = 0;
            }
            int i12 = this.f31134g;
            int i13 = this.h;
            float f12 = 100.0f;
            if (i12 > i13) {
                f11 = 100.0f;
            } else {
                f11 = (i12 / i13) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i14 = this.h;
            int i15 = this.f31134g;
            if (i14 <= i15) {
                f12 = 100.0f * (i14 / i15);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                arrayList = this.f31131c;
                if (i16 >= arrayList.size()) {
                    break;
                }
                l4 l4Var = (l4) arrayList.get(i16);
                if (l4Var.f31080f.L() && l4Var.f31080f.n() != null) {
                    i17 |= 1 << i16;
                }
                i16++;
            }
            Bitmap bitmap = this.f31148w;
            if (bitmap == null || this.f31151z != i7 || this.f31150y != i17 || this.A != max || this.B != max2) {
                this.f31150y = i17;
                this.f31151z = i7;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f31148w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f31148w);
                float f13 = max / this.f31134g;
                canvas2.scale(f13, f13);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    l4 l4Var2 = (l4) arrayList.get(i18);
                    l4Var2.f31080f.z0(l4Var2.f31076a, l4Var2.f31077b, l4Var2.f31078c - i10, l4Var2.d - i11);
                    l4Var2.f31080f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.f31148w, 12);
                if (this.f31149x == null) {
                    this.f31149x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f31149x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f31148w != null) {
                canvas.save();
                canvas.translate(this.d, this.f31132e);
                canvas.scale(this.f31134g / this.f31148w.getWidth(), this.f31134g / this.f31148w.getWidth());
                this.f31149x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f31148w, 0.0f, 0.0f, this.f31149x);
                canvas.restore();
            }
        }
    }

    public final l4 d(float f10, float f11) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f31131c;
            if (i7 < arrayList.size()) {
                if (((l4) arrayList.get(i7)).f31080f.P(f10, f11)) {
                    return (l4) arrayList.get(i7);
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void e() {
        if (this.C) {
            this.C = false;
            xh.e eVar = this.f31138l;
            if (eVar != null) {
                eVar.a(this.f31129a);
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f31131c;
                if (i7 < arrayList.size()) {
                    l4 l4Var = (l4) arrayList.get(i7);
                    if (l4Var.N) {
                        l4Var.N = false;
                        l4Var.f31080f.S();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        l4 l4Var;
        r1 r1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            l4 d = d(x10, y10);
            this.f31141o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.f33158i.f33986q != 4 && radialProgress2.f33152a.contains(x10, y10)) {
                    z12 = true;
                    this.f31142p = z12;
                }
            }
            z12 = false;
            this.f31142p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            l4 d2 = d(x10, y10);
            if (d2 != null) {
                RadialProgress2 radialProgress22 = d2.H;
                if (radialProgress22.f33158i.f33986q != 4 && radialProgress22.f33152a.contains(x10, y10)) {
                    z10 = true;
                    l4Var = this.f31141o;
                    if (l4Var != null && l4Var == d2) {
                        r1Var = this.f31129a;
                        if (r1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            fj messageObject = r1Var.getMessageObject();
                            if (!this.f31142p && z10 && d2.H.f33158i.f33986q == 3 && messageObject != null) {
                                if (messageObject.o4()) {
                                    zy.C(messageObject.K1).g(messageObject);
                                }
                            } else {
                                m1 delegate = r1Var.getDelegate();
                                l4 l4Var2 = this.f31141o;
                                ImageReceiver imageReceiver = l4Var2.f31080f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = l4Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.Y1(r1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f31142p = false;
                    this.f31141o = null;
                }
            }
            z10 = false;
            l4Var = this.f31141o;
            if (l4Var != null) {
                r1Var = this.f31129a;
                if (r1Var.getDelegate() != null) {
                    fj messageObject2 = r1Var.getMessageObject();
                    if (!this.f31142p) {
                    }
                    m1 delegate2 = r1Var.getDelegate();
                    l4 l4Var22 = this.f31141o;
                    ImageReceiver imageReceiver2 = l4Var22.f31080f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = l4Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.Y1(r1Var, messageExtendedMedia2);
                }
            }
            this.f31142p = false;
            this.f31141o = null;
        }
        if (this.f31141o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31140n.c(z11);
        if (this.f31141o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.fj r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m4.g(org.telegram.messenger.fj):void");
    }

    public final void h(fj fjVar) {
        boolean z10;
        boolean z11;
        int i7;
        float f10;
        int i10;
        int i11;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        r1 r1Var = this.f31129a;
        boolean z15 = false;
        if (r1Var.Ua <= 0 && (!r1Var.f31700w1 || TextUtils.isEmpty(fjVar.f24131z))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((r1Var.f31700w1 || TextUtils.isEmpty(fjVar.f24131z)) && r1Var.O.f5487p && !r1Var.f31719x7) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i17 = this.f31139m;
        float f11 = 1000.0f;
        if (i17 > 0) {
            f10 = 1000.0f / this.f31130b.d;
            this.f31133f = i17;
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                this.f31133f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
            } else {
                int min = Math.min(r1Var.getParentWidth(), org.telegram.messenger.g0.f24226q.y);
                if (r1Var.X(fjVar)) {
                    i7 = 10;
                } else {
                    i7 = 0;
                }
                this.f31133f = min - org.telegram.messenger.g0.L(i7 + 64);
            }
            if (r1Var.b3()) {
                this.f31133f -= org.telegram.messenger.g0.L(52.0f);
            }
            f10 = 1.0f;
        }
        k4 k4Var = this.f31130b;
        this.f31134g = (int) ((k4Var.d / 1000.0f) * f10 * this.f31133f);
        this.h = (int) (k4Var.f31012g * k4Var.f31013i);
        this.f31135i = false;
        int L = org.telegram.messenger.g0.L(1.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        char c10 = 2;
        if (bz.Y0 > 2) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int L3 = org.telegram.messenger.g0.L(i10 - i11);
        int min2 = Math.min(org.telegram.messenger.g0.L(3.0f), L3);
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.f31131c;
            float f12 = f11;
            xi xiVar = null;
            if (i18 >= arrayList.size()) {
                break;
            }
            l4 l4Var = (l4) arrayList.get(i18);
            k4 k4Var2 = this.f31130b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = l4Var.F;
            boolean z16 = z15;
            ImageReceiver imageReceiver = l4Var.f31080f;
            if (messageExtendedMedia == null) {
                k4Var2.getClass();
            } else {
                xiVar = (xi) k4Var2.f31009c.get(messageExtendedMedia);
            }
            if (xiVar == null) {
                z12 = z10;
                z13 = z11;
                i12 = L;
            } else {
                float f13 = this.f31133f;
                int i19 = (int) ((xiVar.f28010q / f12) * f10 * f13);
                z12 = z10;
                float f14 = xiVar.f28009p;
                float f15 = this.f31130b.f31013i;
                int i20 = (int) (f14 * f15);
                int i21 = (int) (xiVar.f28000f * f15);
                int i22 = (int) ((xiVar.f27999e / f12) * f10 * f13);
                int i23 = xiVar.f28005l;
                if ((i23 & 1) == 0) {
                    i19 += L;
                    i22 -= L;
                }
                if ((i23 & 4) == 0) {
                    i20 += L;
                    i21 -= L;
                }
                int i24 = i20;
                int i25 = i21;
                if ((i23 & 2) == 0) {
                    i22 -= L;
                }
                int i26 = i22;
                if ((i23 & 8) == 0) {
                    i25 -= L;
                }
                z13 = z11;
                int i27 = i25;
                l4Var.f31076a = i19;
                l4Var.f31077b = i24;
                i12 = L;
                l4Var.f31078c = i19 + i26;
                l4Var.d = i24 + i27;
                imageReceiver.z0(i19, i24, i26, i27);
                int i28 = xiVar.f28005l;
                int i29 = i28 & 4;
                if (i29 != 0 && (i28 & 1) != 0 && !z12) {
                    i13 = L3;
                } else {
                    i13 = L2;
                }
                if (i29 != 0 && (i28 & 2) != 0 && !z12) {
                    i14 = L3;
                } else {
                    i14 = L2;
                }
                int i30 = i28 & 8;
                if (i30 != 0 && (i28 & 1) != 0 && !z13) {
                    i15 = L3;
                } else {
                    i15 = L2;
                }
                if (i30 != 0 && (i28 & 2) != 0 && !z13) {
                    i16 = L3;
                } else {
                    i16 = L2;
                }
                if (!z13) {
                    if (fjVar.P3()) {
                        i16 = L2;
                    } else {
                        i15 = L2;
                    }
                }
                if (!z12 && r1Var.F) {
                    if (fjVar.P3()) {
                        i14 = min2;
                    } else {
                        i13 = min2;
                    }
                }
                imageReceiver.L0(i13, i14, i16, i15);
                float[] fArr = l4Var.f31083s;
                float f16 = i13;
                fArr[1] = f16;
                fArr[z16 ? 1 : 0] = f16;
                float f17 = i14;
                fArr[3] = f17;
                fArr[c11] = f17;
                float f18 = i16;
                fArr[5] = f18;
                fArr[4] = f18;
                float f19 = i15;
                fArr[7] = f19;
                fArr[6] = f19;
                if (fjVar != null && fjVar.o4()) {
                    l4Var.b(3);
                }
                if (!this.f31135i && !l4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f31135i = z14;
            }
            i18++;
            f11 = f12;
            c10 = c11;
            z15 = z16 ? 1 : 0;
            z10 = z12;
            L = i12;
            z11 = z13;
        }
        boolean z17 = z15;
        if (this.f31135i) {
            if (fjVar == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) fjVar.f24073k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                wy0 wy0Var = new wy0(pb.b1(z17, gd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                this.f31143q = wy0Var;
                if (wy0Var.f41763c > this.f31134g - org.telegram.messenger.g0.L(30.0f)) {
                    this.f31143q = new wy0(pb.b1(false, gd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
        }
    }
}
