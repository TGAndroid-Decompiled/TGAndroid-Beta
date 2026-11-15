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
import di.lb;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.yi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class l4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 f30609a;
    public j4 f30610b;
    public int d;
    public int f30612e;
    public int f30613f;
    public int f30614g;
    public int h;
    public boolean f30615i;
    public final org.telegram.ui.Components.u5 f30616j;
    public d80 f30617k;
    public final xh.e f30618l;
    public int f30619m;
    public final dc f30620n;
    public k4 f30621o;
    public boolean f30622p;
    public oy0 f30623q;
    public oy0 f30624r;
    public long f30625s;
    public Bitmap f30628w;
    public Paint f30629x;
    public int f30630y;
    public int f30631z;
    public final ArrayList f30611c = new ArrayList();
    public final Path f30626t = new Path();
    public final Path f30627u = new Path();
    public final RectF v = new RectF();

    public l4(q1 q1Var) {
        this.f30609a = q1Var;
        this.f30618l = xh.e.e(q1Var);
        this.f30616j = new org.telegram.ui.Components.u5(q1Var, 0L, 350L, er.h);
        this.f30620n = new dc(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f30611c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!((k4) obj).f30559f.R0) {
                return false;
            }
        }
        return true;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.b(android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float f11;
        ArrayList arrayList;
        int i10;
        int i11;
        if (this.f30610b != null) {
            q1 q1Var = this.f30609a;
            if (q1Var.getMessageObject() != null) {
                i7 = q1Var.getMessageObject().e1();
            } else {
                i7 = 0;
            }
            int i12 = this.f30614g;
            int i13 = this.h;
            float f12 = 100.0f;
            if (i12 > i13) {
                f11 = 100.0f;
            } else {
                f11 = (i12 / i13) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i14 = this.h;
            int i15 = this.f30614g;
            if (i14 <= i15) {
                f12 = 100.0f * (i14 / i15);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                arrayList = this.f30611c;
                if (i16 >= arrayList.size()) {
                    break;
                }
                k4 k4Var = (k4) arrayList.get(i16);
                if (k4Var.f30559f.K() && k4Var.f30559f.n() != null) {
                    i17 |= 1 << i16;
                }
                i16++;
            }
            Bitmap bitmap = this.f30628w;
            if (bitmap == null || this.f30631z != i7 || this.f30630y != i17 || this.A != max || this.B != max2) {
                this.f30630y = i17;
                this.f30631z = i7;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f30628w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f30628w);
                float f13 = max / this.f30614g;
                canvas2.scale(f13, f13);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    k4 k4Var2 = (k4) arrayList.get(i18);
                    k4Var2.f30559f.y0(k4Var2.f30555a, k4Var2.f30556b, k4Var2.f30557c - i10, k4Var2.d - i11);
                    k4Var2.f30559f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.f30628w, 12);
                if (this.f30629x == null) {
                    this.f30629x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f30629x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f30628w != null) {
                canvas.save();
                canvas.translate(this.d, this.f30612e);
                canvas.scale(this.f30614g / this.f30628w.getWidth(), this.f30614g / this.f30628w.getWidth());
                this.f30629x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f30628w, 0.0f, 0.0f, this.f30629x);
                canvas.restore();
            }
        }
    }

    public final k4 d(float f10, float f11) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f30611c;
            if (i7 < arrayList.size()) {
                if (((k4) arrayList.get(i7)).f30559f.O(f10, f11)) {
                    return (k4) arrayList.get(i7);
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
            xh.e eVar = this.f30618l;
            if (eVar != null) {
                eVar.a(this.f30609a);
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f30611c;
                if (i7 < arrayList.size()) {
                    k4 k4Var = (k4) arrayList.get(i7);
                    if (k4Var.N) {
                        k4Var.N = false;
                        k4Var.f30559f.R();
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
        k4 k4Var;
        q1 q1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            k4 d = d(x10, y10);
            this.f30621o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.f32661i.f39227q != 4 && radialProgress2.f32655a.contains(x10, y10)) {
                    z12 = true;
                    this.f30622p = z12;
                }
            }
            z12 = false;
            this.f30622p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            k4 d2 = d(x10, y10);
            if (d2 != null) {
                RadialProgress2 radialProgress22 = d2.H;
                if (radialProgress22.f32661i.f39227q != 4 && radialProgress22.f32655a.contains(x10, y10)) {
                    z10 = true;
                    k4Var = this.f30621o;
                    if (k4Var != null && k4Var == d2) {
                        q1Var = this.f30609a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            gj messageObject = q1Var.getMessageObject();
                            if (!this.f30622p && z10 && d2.H.f32661i.f39227q == 3 && messageObject != null) {
                                if (messageObject.o4()) {
                                    ez.C(messageObject.K1).g(messageObject);
                                }
                            } else {
                                l1 delegate = q1Var.getDelegate();
                                k4 k4Var2 = this.f30621o;
                                ImageReceiver imageReceiver = k4Var2.f30559f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.X1(q1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f30622p = false;
                    this.f30621o = null;
                }
            }
            z10 = false;
            k4Var = this.f30621o;
            if (k4Var != null) {
                q1Var = this.f30609a;
                if (q1Var.getDelegate() != null) {
                    gj messageObject2 = q1Var.getMessageObject();
                    if (!this.f30622p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    k4 k4Var22 = this.f30621o;
                    ImageReceiver imageReceiver2 = k4Var22.f30559f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = k4Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.X1(q1Var, messageExtendedMedia2);
                }
            }
            this.f30622p = false;
            this.f30621o = null;
        }
        if (this.f30621o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30620n.c(z11);
        if (this.f30621o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.gj r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.g(org.telegram.messenger.gj):void");
    }

    public final void h(gj gjVar) {
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
        q1 q1Var = this.f30609a;
        boolean z15 = false;
        if (q1Var.Ua <= 0 && (!q1Var.f31197w1 || TextUtils.isEmpty(gjVar.f23877z))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((q1Var.f31197w1 || TextUtils.isEmpty(gjVar.f23877z)) && q1Var.O.f5207p && !q1Var.f31216x7) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i17 = this.f30619m;
        float f11 = 1000.0f;
        if (i17 > 0) {
            f10 = 1000.0f / this.f30610b.d;
            this.f30613f = i17;
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                this.f30613f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
            } else {
                int min = Math.min(q1Var.getParentWidth(), org.telegram.messenger.g0.f23611q.y);
                if (q1Var.X(gjVar)) {
                    i7 = 10;
                } else {
                    i7 = 0;
                }
                this.f30613f = min - org.telegram.messenger.g0.L(i7 + 64);
            }
            if (q1Var.Z2()) {
                this.f30613f -= org.telegram.messenger.g0.L(52.0f);
            }
            f10 = 1.0f;
        }
        j4 j4Var = this.f30610b;
        this.f30614g = (int) ((j4Var.d / 1000.0f) * f10 * this.f30613f);
        this.h = (int) (j4Var.f30489g * j4Var.f30490i);
        this.f30615i = false;
        int L = org.telegram.messenger.g0.L(1.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        char c10 = 2;
        if (gz.Y0 > 2) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int L3 = org.telegram.messenger.g0.L(i10 - i11);
        int min2 = Math.min(org.telegram.messenger.g0.L(3.0f), L3);
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.f30611c;
            float f12 = f11;
            yi yiVar = null;
            if (i18 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i18);
            j4 j4Var2 = this.f30610b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var.F;
            boolean z16 = z15;
            ImageReceiver imageReceiver = k4Var.f30559f;
            if (messageExtendedMedia == null) {
                j4Var2.getClass();
            } else {
                yiVar = (yi) j4Var2.f30486c.get(messageExtendedMedia);
            }
            if (yiVar == null) {
                z12 = z10;
                z13 = z11;
                i12 = L;
            } else {
                float f13 = this.f30613f;
                int i19 = (int) ((yiVar.f27760q / f12) * f10 * f13);
                z12 = z10;
                float f14 = yiVar.f27759p;
                float f15 = this.f30610b.f30490i;
                int i20 = (int) (f14 * f15);
                int i21 = (int) (yiVar.f27750f * f15);
                int i22 = (int) ((yiVar.f27749e / f12) * f10 * f13);
                int i23 = yiVar.f27755l;
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
                k4Var.f30555a = i19;
                k4Var.f30556b = i24;
                i12 = L;
                k4Var.f30557c = i19 + i26;
                k4Var.d = i24 + i27;
                imageReceiver.y0(i19, i24, i26, i27);
                int i28 = yiVar.f27755l;
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
                    if (gjVar.P3()) {
                        i16 = L2;
                    } else {
                        i15 = L2;
                    }
                }
                if (!z12 && q1Var.F) {
                    if (gjVar.P3()) {
                        i14 = min2;
                    } else {
                        i13 = min2;
                    }
                }
                imageReceiver.K0(i13, i14, i16, i15);
                float[] fArr = k4Var.f30562s;
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
                if (gjVar != null && gjVar.o4()) {
                    k4Var.b(3);
                }
                if (!this.f30615i && !k4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f30615i = z14;
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
        if (this.f30615i) {
            if (gjVar == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) gjVar.f23819k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                oy0 oy0Var = new oy0(lb.a1(z17, hd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                this.f30623q = oy0Var;
                if (oy0Var.f38103c > this.f30614g - org.telegram.messenger.g0.L(30.0f)) {
                    this.f30623q = new oy0(lb.a1(false, hd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
        }
    }
}
