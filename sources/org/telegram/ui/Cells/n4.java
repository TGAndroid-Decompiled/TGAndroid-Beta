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
import org.telegram.messenger.cj;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;
import org.telegram.messenger.rz;
import org.telegram.messenger.uz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t80;
public final class n4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 f22338a;
    public l4 f22339b;
    public int d;
    public int e;
    public int f22341f;
    public int f22342g;
    public int h;
    public boolean f22343i;
    public final org.telegram.ui.Components.t5 f22344j;
    public t80 f22345k;
    public final nh.h f22346l;
    public int f22347m;
    public final dc f22348n;
    public m4 f22349o;
    public boolean f22350p;
    public rz0 f22351q;
    public rz0 f22352r;
    public long f22353s;
    public Bitmap f22356w;
    public Paint f22357x;
    public int f22358y;
    public int f22359z;
    public final ArrayList f22340c = new ArrayList();
    public final Path f22354t = new Path();
    public final Path f22355u = new Path();
    public final RectF v = new RectF();

    public n4(q1 q1Var) {
        this.f22338a = q1Var;
        this.f22346l = nh.h.e(q1Var);
        this.f22344j = new org.telegram.ui.Components.t5(q1Var, 0L, 350L, gr.h);
        this.f22348n = new dc(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f22340c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((m4) obj).f22304f.Q0) {
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
        if (this.f22339b != null) {
            q1 q1Var = this.f22338a;
            if (q1Var.getMessageObject() != null) {
                i10 = q1Var.getMessageObject().f1();
            } else {
                i10 = 0;
            }
            int i13 = this.f22342g;
            int i14 = this.h;
            float f11 = 100.0f;
            if (i13 > i14) {
                f10 = 100.0f;
            } else {
                f10 = (i13 / i14) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f10);
            int i15 = this.h;
            int i16 = this.f22342g;
            if (i15 <= i16) {
                f11 = 100.0f * (i15 / i16);
            }
            int max2 = (int) Math.max(1.0f, f11);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                arrayList = this.f22340c;
                if (i17 >= arrayList.size()) {
                    break;
                }
                m4 m4Var = (m4) arrayList.get(i17);
                if (m4Var.f22304f.K() && m4Var.f22304f.n() != null) {
                    i18 |= 1 << i17;
                }
                i17++;
            }
            Bitmap bitmap = this.f22356w;
            if (bitmap == null || this.f22359z != i10 || this.f22358y != i18 || this.A != max || this.B != max2) {
                this.f22358y = i18;
                this.f22359z = i10;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f22356w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f22356w);
                float f12 = max / this.f22342g;
                canvas2.scale(f12, f12);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    m4 m4Var2 = (m4) arrayList.get(i19);
                    m4Var2.f22304f.y0(m4Var2.f22301a, m4Var2.f22302b, m4Var2.f22303c - i11, m4Var2.d - i12);
                    m4Var2.f22304f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.f22356w, 12);
                if (this.f22357x == null) {
                    this.f22357x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f22357x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f22356w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.f22342g / this.f22356w.getWidth(), this.f22342g / this.f22356w.getWidth());
                this.f22357x.setAlpha((int) (f7 * 255.0f));
                canvas.drawBitmap(this.f22356w, 0.0f, 0.0f, this.f22357x);
                canvas.restore();
            }
        }
    }

    public final m4 d(float f7, float f10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22340c;
            if (i10 < arrayList.size()) {
                if (((m4) arrayList.get(i10)).f22304f.O(f7, f10)) {
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
            nh.h hVar = this.f22346l;
            if (hVar != null) {
                hVar.a(this.f22338a);
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22340c;
                if (i10 < arrayList.size()) {
                    m4 m4Var = (m4) arrayList.get(i10);
                    if (m4Var.M) {
                        m4Var.M = false;
                        m4Var.f22304f.R();
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
            this.f22349o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f24129i.f27048q != 4 && radialProgress2.f24124a.contains(x10, y3)) {
                    z12 = true;
                    this.f22350p = z12;
                }
            }
            z12 = false;
            this.f22350p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m4 d10 = d(x10, y3);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.G;
                if (radialProgress22.f24129i.f27048q != 4 && radialProgress22.f24124a.contains(x10, y3)) {
                    z10 = true;
                    m4Var = this.f22349o;
                    if (m4Var != null && m4Var == d10) {
                        q1Var = this.f22338a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            kj messageObject = q1Var.getMessageObject();
                            if (!this.f22350p && z10 && d10.G.f24129i.f27048q == 3 && messageObject != null) {
                                if (messageObject.o4()) {
                                    rz.C(messageObject.I1).g(messageObject);
                                }
                            } else {
                                l1 delegate = q1Var.getDelegate();
                                m4 m4Var2 = this.f22349o;
                                ImageReceiver imageReceiver = m4Var2.f22304f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = m4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.C1(q1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f22350p = false;
                    this.f22349o = null;
                }
            }
            z10 = false;
            m4Var = this.f22349o;
            if (m4Var != null) {
                q1Var = this.f22338a;
                if (q1Var.getDelegate() != null) {
                    kj messageObject2 = q1Var.getMessageObject();
                    if (!this.f22350p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    m4 m4Var22 = this.f22349o;
                    ImageReceiver imageReceiver2 = m4Var22.f22304f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = m4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.C1(q1Var, messageExtendedMedia2);
                }
            }
            this.f22350p = false;
            this.f22349o = null;
        }
        if (this.f22349o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22348n.c(z11);
        if (this.f22349o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.kj r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.g(org.telegram.messenger.kj):void");
    }

    public final void h(kj kjVar) {
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
        q1 q1Var = this.f22338a;
        boolean z15 = false;
        if (q1Var.Sa <= 0 && (!q1Var.f22739u1 || TextUtils.isEmpty(kjVar.f16747z))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((q1Var.f22739u1 || TextUtils.isEmpty(kjVar.f16747z)) && q1Var.N.f48461p && !q1Var.f22757v7) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i18 = this.f22347m;
        float f10 = 1000.0f;
        if (i18 > 0) {
            f7 = 1000.0f / this.f22339b.d;
            this.f22341f = i18;
        } else {
            if (org.telegram.messenger.i0.Q1()) {
                this.f22341f = org.telegram.messenger.i0.Q0() - org.telegram.messenger.i0.L(122.0f);
            } else {
                int min = Math.min(q1Var.getParentWidth(), org.telegram.messenger.i0.f16172q.y);
                if (q1Var.V(kjVar)) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                this.f22341f = min - org.telegram.messenger.i0.L(i10 + 64);
            }
            if (q1Var.V2()) {
                this.f22341f -= org.telegram.messenger.i0.L(52.0f);
            }
            f7 = 1.0f;
        }
        l4 l4Var = this.f22339b;
        this.f22342g = (int) ((l4Var.d / 1000.0f) * f7 * this.f22341f);
        this.h = (int) (l4Var.f22236g * l4Var.f22237i);
        this.f22343i = false;
        int L = org.telegram.messenger.i0.L(1.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        char c10 = 2;
        if (uz.Y0 > 2) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int L3 = org.telegram.messenger.i0.L(i11 - i12);
        int min2 = Math.min(org.telegram.messenger.i0.L(3.0f), L3);
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.f22340c;
            float f11 = f10;
            cj cjVar = null;
            if (i19 >= arrayList.size()) {
                break;
            }
            m4 m4Var = (m4) arrayList.get(i19);
            l4 l4Var2 = this.f22339b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = m4Var.E;
            boolean z16 = z15;
            ImageReceiver imageReceiver = m4Var.f22304f;
            if (messageExtendedMedia == null) {
                l4Var2.getClass();
            } else {
                cjVar = (cj) l4Var2.f22234c.get(messageExtendedMedia);
            }
            if (cjVar == null) {
                z12 = z10;
                z13 = z11;
                i13 = L;
            } else {
                float f12 = this.f22341f;
                int i20 = (int) ((cjVar.f15171q / f11) * f7 * f12);
                z12 = z10;
                float f13 = cjVar.f15170p;
                float f14 = this.f22339b.f22237i;
                int i21 = (int) (f13 * f14);
                int i22 = (int) (cjVar.f15161f * f14);
                int i23 = (int) ((cjVar.e / f11) * f7 * f12);
                int i24 = cjVar.f15166l;
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
                m4Var.f22301a = i20;
                m4Var.f22302b = i25;
                i13 = L;
                m4Var.f22303c = i20 + i27;
                m4Var.d = i25 + i28;
                imageReceiver.y0(i20, i25, i27, i28);
                int i29 = cjVar.f15166l;
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
                    if (kjVar.P3()) {
                        i17 = L2;
                    } else {
                        i16 = L2;
                    }
                }
                if (!z12 && q1Var.E) {
                    if (kjVar.P3()) {
                        i15 = min2;
                    } else {
                        i14 = min2;
                    }
                }
                imageReceiver.K0(i14, i15, i17, i16);
                float[] fArr = m4Var.f22307s;
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
                if (kjVar != null && kjVar.o4()) {
                    m4Var.b(3);
                }
                if (!this.f22343i && !m4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f22343i = z14;
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
        if (this.f22343i) {
            if (kjVar == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) kjVar.f16690k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                rz0 rz0Var = new rz0(rh.h8.a1(z17, dd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                this.f22351q = rz0Var;
                if (rz0Var.f30126c > this.f22342g - org.telegram.messenger.i0.L(30.0f)) {
                    this.f22351q = new rz0(rh.h8.a1(false, dd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                }
            }
        }
    }
}
