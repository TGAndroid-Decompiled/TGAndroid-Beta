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
import ci.wb;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.ri;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
public final class l4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 f29548a;
    public j4 f29549b;
    public int d;
    public int f29551e;
    public int f29552f;
    public int f29553g;
    public int h;
    public boolean f29554i;
    public final org.telegram.ui.Components.u5 f29555j;
    public w70 f29556k;
    public final yh.e f29557l;
    public int f29558m;
    public final gc f29559n;
    public k4 f29560o;
    public boolean f29561p;
    public ly0 f29562q;
    public ly0 f29563r;
    public long f29564s;
    public Bitmap f29567w;
    public Paint f29568x;
    public int f29569y;
    public int f29570z;
    public final ArrayList f29550c = new ArrayList();
    public final Path f29565t = new Path();
    public final Path f29566u = new Path();
    public final RectF v = new RectF();

    public l4(q1 q1Var) {
        this.f29548a = q1Var;
        this.f29557l = yh.e.e(q1Var);
        this.f29555j = new org.telegram.ui.Components.u5(q1Var, 0L, 350L, xq.h);
        this.f29559n = new gc(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f29550c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (!((k4) obj).f29498f.R0) {
                return false;
            }
        }
        return true;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.b(android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, float f10) {
        int i3;
        float f11;
        ArrayList arrayList;
        int i10;
        int i11;
        if (this.f29549b != null) {
            q1 q1Var = this.f29548a;
            if (q1Var.getMessageObject() != null) {
                i3 = q1Var.getMessageObject().f1();
            } else {
                i3 = 0;
            }
            int i12 = this.f29553g;
            int i13 = this.h;
            float f12 = 100.0f;
            if (i12 > i13) {
                f11 = 100.0f;
            } else {
                f11 = (i12 / i13) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i14 = this.h;
            int i15 = this.f29553g;
            if (i14 <= i15) {
                f12 = 100.0f * (i14 / i15);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                arrayList = this.f29550c;
                if (i16 >= arrayList.size()) {
                    break;
                }
                k4 k4Var = (k4) arrayList.get(i16);
                if (k4Var.f29498f.K() && k4Var.f29498f.n() != null) {
                    i17 |= 1 << i16;
                }
                i16++;
            }
            Bitmap bitmap = this.f29567w;
            if (bitmap == null || this.f29570z != i3 || this.f29569y != i17 || this.A != max || this.B != max2) {
                this.f29569y = i17;
                this.f29570z = i3;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f29567w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f29567w);
                float f13 = max / this.f29553g;
                canvas2.scale(f13, f13);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    k4 k4Var2 = (k4) arrayList.get(i18);
                    k4Var2.f29498f.y0(k4Var2.f29494a, k4Var2.f29495b, k4Var2.f29496c - i10, k4Var2.d - i11);
                    k4Var2.f29498f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.f29567w, 12);
                if (this.f29568x == null) {
                    this.f29568x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f29568x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f29567w != null) {
                canvas.save();
                canvas.translate(this.d, this.f29551e);
                canvas.scale(this.f29553g / this.f29567w.getWidth(), this.f29553g / this.f29567w.getWidth());
                this.f29568x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f29567w, 0.0f, 0.0f, this.f29568x);
                canvas.restore();
            }
        }
    }

    public final k4 d(float f10, float f11) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f29550c;
            if (i3 < arrayList.size()) {
                if (((k4) arrayList.get(i3)).f29498f.O(f10, f11)) {
                    return (k4) arrayList.get(i3);
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    public final void e() {
        if (this.C) {
            this.C = false;
            yh.e eVar = this.f29557l;
            if (eVar != null) {
                eVar.a(this.f29548a);
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f29550c;
                if (i3 < arrayList.size()) {
                    k4 k4Var = (k4) arrayList.get(i3);
                    if (k4Var.N) {
                        k4Var.N = false;
                        k4Var.f29498f.R();
                    }
                    i3++;
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
        float y9 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            k4 d = d(x10, y9);
            this.f29560o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.f31554i.f36083q != 4 && radialProgress2.f31548a.contains(x10, y9)) {
                    z12 = true;
                    this.f29561p = z12;
                }
            }
            z12 = false;
            this.f29561p = z12;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            k4 d10 = d(x10, y9);
            if (d10 != null) {
                RadialProgress2 radialProgress22 = d10.H;
                if (radialProgress22.f31554i.f36083q != 4 && radialProgress22.f31548a.contains(x10, y9)) {
                    z10 = true;
                    k4Var = this.f29560o;
                    if (k4Var != null && k4Var == d10) {
                        q1Var = this.f29548a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            zi messageObject = q1Var.getMessageObject();
                            if (!this.f29561p && z10 && d10.H.f31554i.f36083q == 3 && messageObject != null) {
                                if (messageObject.p4()) {
                                    yy.C(messageObject.I1).g(messageObject);
                                }
                            } else {
                                l1 delegate = q1Var.getDelegate();
                                k4 k4Var2 = this.f29560o;
                                ImageReceiver imageReceiver = k4Var2.f29498f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.M1(q1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f29561p = false;
                    this.f29560o = null;
                }
            }
            z10 = false;
            k4Var = this.f29560o;
            if (k4Var != null) {
                q1Var = this.f29548a;
                if (q1Var.getDelegate() != null) {
                    zi messageObject2 = q1Var.getMessageObject();
                    if (!this.f29561p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    k4 k4Var22 = this.f29560o;
                    ImageReceiver imageReceiver2 = k4Var22.f29498f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = k4Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.M1(q1Var, messageExtendedMedia2);
                }
            }
            this.f29561p = false;
            this.f29560o = null;
        }
        if (this.f29560o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29559n.c(z11);
        if (this.f29560o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.zi r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.g(org.telegram.messenger.zi):void");
    }

    public final void h(zi ziVar) {
        boolean z10;
        boolean z11;
        int i3;
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
        q1 q1Var = this.f29548a;
        boolean z15 = false;
        if (q1Var.Ta <= 0 && (!q1Var.f30107v1 || TextUtils.isEmpty(ziVar.f26924z))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((q1Var.f30107v1 || TextUtils.isEmpty(ziVar.f26924z)) && q1Var.O.f9125p && !q1Var.f30127w7) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i17 = this.f29558m;
        float f11 = 1000.0f;
        if (i17 > 0) {
            f10 = 1000.0f / this.f29549b.d;
            this.f29552f = i17;
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                this.f29552f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
            } else {
                int min = Math.min(q1Var.getParentWidth(), org.telegram.messenger.g0.f22608q.y);
                if (q1Var.U(ziVar)) {
                    i3 = 10;
                } else {
                    i3 = 0;
                }
                this.f29552f = min - org.telegram.messenger.g0.L(i3 + 64);
            }
            if (q1Var.X2()) {
                this.f29552f -= org.telegram.messenger.g0.L(52.0f);
            }
            f10 = 1.0f;
        }
        j4 j4Var = this.f29549b;
        this.f29553g = (int) ((j4Var.d / 1000.0f) * f10 * this.f29552f);
        this.h = (int) (j4Var.f29428g * j4Var.f29429i);
        this.f29554i = false;
        int L = org.telegram.messenger.g0.L(1.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        char c2 = 2;
        if (az.Y0 > 2) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int L3 = org.telegram.messenger.g0.L(i10 - i11);
        int min2 = Math.min(org.telegram.messenger.g0.L(3.0f), L3);
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.f29550c;
            float f12 = f11;
            ri riVar = null;
            if (i18 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i18);
            j4 j4Var2 = this.f29549b;
            char c10 = c2;
            TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var.F;
            boolean z16 = z15;
            ImageReceiver imageReceiver = k4Var.f29498f;
            if (messageExtendedMedia == null) {
                j4Var2.getClass();
            } else {
                riVar = (ri) j4Var2.f29425c.get(messageExtendedMedia);
            }
            if (riVar == null) {
                z12 = z10;
                z13 = z11;
                i12 = L;
            } else {
                float f13 = this.f29552f;
                int i19 = (int) ((riVar.f25154q / f12) * f10 * f13);
                z12 = z10;
                float f14 = riVar.f25153p;
                float f15 = this.f29549b.f29429i;
                int i20 = (int) (f14 * f15);
                int i21 = (int) (riVar.f25144f * f15);
                int i22 = (int) ((riVar.f25143e / f12) * f10 * f13);
                int i23 = riVar.f25149l;
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
                k4Var.f29494a = i19;
                k4Var.f29495b = i24;
                i12 = L;
                k4Var.f29496c = i19 + i26;
                k4Var.d = i24 + i27;
                imageReceiver.y0(i19, i24, i26, i27);
                int i28 = riVar.f25149l;
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
                    if (ziVar.Q3()) {
                        i16 = L2;
                    } else {
                        i15 = L2;
                    }
                }
                if (!z12 && q1Var.F) {
                    if (ziVar.Q3()) {
                        i14 = min2;
                    } else {
                        i13 = min2;
                    }
                }
                imageReceiver.K0(i13, i14, i16, i15);
                float[] fArr = k4Var.f29501s;
                float f16 = i13;
                fArr[1] = f16;
                fArr[z16 ? 1 : 0] = f16;
                float f17 = i14;
                fArr[3] = f17;
                fArr[c10] = f17;
                float f18 = i16;
                fArr[5] = f18;
                fArr[4] = f18;
                float f19 = i15;
                fArr[7] = f19;
                fArr[6] = f19;
                if (ziVar != null && ziVar.p4()) {
                    k4Var.b(3);
                }
                if (!this.f29554i && !k4Var.h) {
                    z14 = z16 ? 1 : 0;
                } else {
                    z14 = true;
                }
                this.f29554i = z14;
            }
            i18++;
            f11 = f12;
            c2 = c10;
            z15 = z16 ? 1 : 0;
            z10 = z12;
            L = i12;
            z11 = z13;
        }
        boolean z17 = z15;
        if (this.f29554i) {
            if (ziVar == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) ziVar.f26868k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                ly0 ly0Var = new ly0(wb.a1(z17, bd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                this.f29562q = ly0Var;
                if (ly0Var.f35918c > this.f29553g - org.telegram.messenger.g0.L(30.0f)) {
                    this.f29562q = new ly0(wb.a1(false, bd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
        }
    }
}
