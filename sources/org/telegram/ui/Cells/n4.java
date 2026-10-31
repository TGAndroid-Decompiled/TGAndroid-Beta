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
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.qz;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
public final class n4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 f22337a;
    public l4 f22338b;
    public int d;
    public int e;
    public int f22340f;
    public int f22341g;
    public int h;
    public boolean f22342i;
    public final org.telegram.ui.Components.t5 f22343j;
    public t80 f22344k;
    public final nh.h f22345l;
    public int f22346m;
    public final dc f22347n;
    public m4 f22348o;
    public boolean f22349p;
    public qz0 f22350q;
    public qz0 f22351r;
    public long f22352s;
    public Bitmap f22355w;
    public Paint f22356x;
    public int f22357y;
    public int f22358z;
    public final ArrayList f22339c = new ArrayList();
    public final Path f22353t = new Path();
    public final Path f22354u = new Path();
    public final RectF v = new RectF();

    public n4(q1 q1Var) {
        this.f22337a = q1Var;
        this.f22345l = nh.h.e(q1Var);
        this.f22343j = new org.telegram.ui.Components.t5(q1Var, 0L, 350L, gr.h);
        this.f22347n = new dc(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22339c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((m4) obj).f22303f.Q0) {
                return false;
            }
        }
        return true;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.b(android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        float f10;
        ArrayList arrayList;
        int i11;
        int i12;
        if (this.f22338b != null) {
            q1 q1Var = this.f22337a;
            if (q1Var.getMessageObject() != null) {
                i10 = q1Var.getMessageObject().f1();
            } else {
                i10 = 0;
            }
            int i13 = this.f22341g;
            int i14 = this.h;
            float f11 = 100.0f;
            if (i13 > i14) {
                f10 = 100.0f;
            } else {
                f10 = (i13 / i14) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i15 = this.h;
            int i16 = this.f22341g;
            if (i15 <= i16) {
                f11 = 100.0f * (i15 / i16);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                arrayList = this.f22339c;
                if (i17 >= arrayList.size()) {
                    break;
                }
                m4 m4Var = (m4) arrayList.get(i17);
                if (m4Var.f22303f.K() && m4Var.f22303f.n() != null) {
                    i18 |= 1 << i17;
                }
                i17++;
            }
            Bitmap bitmap = this.f22355w;
            if (bitmap == null || this.f22358z != i10 || this.f22357y != i18 || this.A != max || this.B != max2) {
                this.f22357y = i18;
                this.f22358z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22355w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22355w);
                float f12 = max / this.f22341g;
                canvas2.scale(f12, f12);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    m4 m4Var2 = (m4) arrayList.get(i19);
                    m4Var2.f22303f.y0(m4Var2.f22300a, m4Var2.f22301b, m4Var2.f22302c - i11, m4Var2.d - i12);
                    m4Var2.f22303f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.f22355w, 12);
                if (this.f22356x == null) {
                    this.f22356x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22356x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22355w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f22341g / this.f22355w.getWidth(), this.f22341g / this.f22355w.getWidth());
                this.f22356x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22355w, 0.0f, 0.0f, this.f22356x);
                canvas.restore();
            }
        }
    }

    public final m4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22339c;
            if (i10 < arrayList.size()) {
                if (((m4) arrayList.get(i10)).f22303f.O(f7, f10)) {
                    return (m4) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void e() {
        if (this.C) {
            this.C = false;
            nh.h hVar = this.f22345l;
            if (hVar != null) {
                hVar.a(this.f22337a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22339c;
                if (i10 < arrayList.size()) {
                    m4 m4Var = (m4) arrayList.get(i10);
                    if (m4Var.M) {
                        m4Var.M = false;
                        m4Var.f22303f.R();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z10;
        m4 m4Var;
        q1 q1Var;
        boolean z11;
        boolean z12;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            m4 d = d(x10, y3);
            this.f22348o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24128i.f26933q != 4 && radialProgress2.f24123a.contains(x10, y3)) {
                    z12 = true;
                    this.f22349p = z12;
                }
            }
            z12 = false;
            this.f22349p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24128i.f26933q != 4 && radialProgress22.f24123a.contains(x10, y3)) {
                    z10 = true;
                    m4Var = this.f22348o;
                    if (m4Var != null && m4Var == d10) {
                        q1Var = this.f22337a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            jj messageObject = q1Var.getMessageObject();
                            if (!this.f22349p && z10 && d10.G.f24128i.f26933q == 3 && messageObject != null) {
                                if (messageObject.o4()) {
                                    qz.C(messageObject.I1).g(messageObject);
                                }
                            } else {
                                l1 delegate = q1Var.getDelegate();
                                m4 m4Var2 = this.f22348o;
                                ImageReceiver imageReceiver = m4Var2.f22303f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = m4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.C1(q1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22349p = false;
                    this.f22348o = null;
                }
            }
            z10 = false;
            m4Var = this.f22348o;
            if (m4Var != null) {
                q1Var = this.f22337a;
                if (q1Var.getDelegate() != null) {
                    jj messageObject2 = q1Var.getMessageObject();
                    if (!this.f22349p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    m4 m4Var22 = this.f22348o;
                    ImageReceiver imageReceiver2 = m4Var22.f22303f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = m4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.C1(q1Var, messageExtendedMedia2);
                }
            }
            this.f22349p = false;
            this.f22348o = null;
        }
        if (this.f22348o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22347n.c(z11);
        if (this.f22348o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.jj r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.g(org.telegram.messenger.jj):void");
    }

    public final void h(jj jjVar) {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        int i12;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        q1 q1Var = this.f22337a;
        boolean z15 = false;
        if (q1Var.Sa <= 0 && (!q1Var.f22738u1 || TextUtils.isEmpty(jjVar.f16394z))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((q1Var.f22738u1 || TextUtils.isEmpty(jjVar.f16394z)) && q1Var.N.f48450p && !q1Var.f22756v7) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22346m;
        float f10 = 1000.0f;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22338b.d;
            this.f22340f = i18;
        } else {
            if (org.telegram.messenger.i0.Q1()) {
                this.f22340f = org.telegram.messenger.i0.Q0() - org.telegram.messenger.i0.L(122.0f);
            } else {
                int min = Math.min(q1Var.getParentWidth(), org.telegram.messenger.i0.f16026q.y);
                if (q1Var.V(jjVar)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22340f = min - org.telegram.messenger.i0.L(i10 + 64);
            }
            if (q1Var.V2()) {
                this.f22340f -= org.telegram.messenger.i0.L(52.0f);
            }
            f7 = 1.0f;
        }
        l4 l4Var = this.f22338b;
        this.f22341g = (int) ((l4Var.d / 1000.0f) * f7 * this.f22340f);
        this.h = (int) (l4Var.f22235g * l4Var.f22236i);
        this.f22342i = false;
        int L = org.telegram.messenger.i0.L(1.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        char c10 = 2;
        if (tz.Y0 > 2) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int L3 = org.telegram.messenger.i0.L(i11 - i12);
        int min2 = Math.min(org.telegram.messenger.i0.L(3.0f), L3);
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.f22339c;
            float f11 = f10;
            bj bjVar = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            m4 m4Var = (m4) arrayList.get(i19);
            l4 l4Var2 = this.f22338b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = m4Var.E;
            boolean z16 = z15;
            ImageReceiver imageReceiver = m4Var.f22303f;
            if (messageExtendedMedia == null) {
                l4Var2.getClass();
            } else {
                bjVar = (bj) l4Var2.f22233c.get(messageExtendedMedia);
            }
            if (bjVar == null) {
                z12 = z10;
                z13 = z11;
                i13 = L;
            } else {
                float f12 = this.f22340f;
                int i20 = (int) ((bjVar.f14788q / f11) * f7 * f12);
                z12 = z10;
                float f13 = bjVar.f14787p;
                float f14 = this.f22338b.f22236i;
                int i21 = (int) (f13 * f14);
                int i22 = (int) (bjVar.f14778f * f14);
                int i23 = (int) ((bjVar.e / f11) * f7 * f12);
                int i24 = bjVar.f14783l;
                if ((i24 & 1) == 0) {
                    i20 += L;
                    i23 -= L;
                }
                if ((i24 & 4) == 0) {
                    i21 += L;
                    i22 -= L;
                }
                int i25 = i21;
                int i26 = i22;
                if ((i24 & 2) == 0) {
                    i23 -= L;
                }
                int i27 = i23;
                if ((i24 & 8) == 0) {
                    i26 -= L;
                }
                z13 = z11;
                int i28 = i26;
                m4Var.f22300a = i20;
                m4Var.f22301b = i25;
                i13 = L;
                m4Var.f22302c = i20 + i27;
                m4Var.d = i25 + i28;
                imageReceiver.y0(i20, i25, i27, i28);
                int i29 = bjVar.f14783l;
                int i30 = i29 & 4;
                if (i30 != 0 && (i29 & 1) != 0 && !z12) {
                    i14 = L3;
                } else {
                    i14 = L2;
                }
                if (i30 != 0 && (i29 & 2) != 0 && !z12) {
                    i15 = L3;
                } else {
                    i15 = L2;
                }
                int i31 = i29 & 8;
                if (i31 != 0 && (i29 & 1) != 0 && !z13) {
                    i16 = L3;
                } else {
                    i16 = L2;
                }
                if (i31 != 0 && (i29 & 2) != 0 && !z13) {
                    i17 = L3;
                } else {
                    i17 = L2;
                }
                if (!z13) {
                    if (jjVar.P3()) {
                        i17 = L2;
                    } else {
                        i16 = L2;
                    }
                }
                if (!z12 && q1Var.E) {
                    if (jjVar.P3()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.K0(i14, i15, i17, i16);
                float[] fArr = m4Var.f22306s;
                float f15 = i14;
                fArr[1] = f15;
                fArr[z16 ? 1 : 0] = f15;
                float f16 = i15;
                fArr[3] = f16;
                fArr[c11] = f16;
                float f17 = i17;
                fArr[5] = f17;
                fArr[4] = f17;
                float f18 = i16;
                fArr[7] = f18;
                fArr[6] = f18;
                if (jjVar != null && jjVar.o4()) {
                    m4Var.b(3);
                }
                if (!this.f22342i && !m4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f22342i = z14;
            }
            i19++;
            f10 = f11;
            c10 = c11;
            z15 = z16 ? 1 : 0;
            z10 = z12;
            L = i13;
            z11 = z13;
        }
        boolean z17 = z15;
        if (this.f22342i) {
            if (jjVar == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) jjVar.f16337k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                qz0 qz0Var = new qz0(rh.h8.Z0(z17, cd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                this.f22350q = qz0Var;
                if (qz0Var.f29774c > this.f22341g - org.telegram.messenger.i0.L(30.0f)) {
                    this.f22350q = new qz0(rh.h8.Z0(false, cd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                }
            }
        }
    }
}
