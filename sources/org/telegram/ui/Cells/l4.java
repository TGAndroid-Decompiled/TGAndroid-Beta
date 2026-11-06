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
import bi.dd;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.aj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
public final class l4 {
    public int A;
    public int B;
    public boolean C;
    public final q1 f29487a;
    public j4 f29488b;
    public int d;
    public int f29490e;
    public int f29491f;
    public int f29492g;
    public int h;
    public boolean f29493i;
    public final org.telegram.ui.Components.w5 f29494j;
    public a80 f29495k;
    public final xh.e f29496l;
    public int f29497m;
    public final ic f29498n;
    public k4 f29499o;
    public boolean f29500p;
    public ly0 f29501q;
    public ly0 f29502r;
    public long f29503s;
    public Bitmap f29506w;
    public Paint f29507x;
    public int f29508y;
    public int f29509z;
    public final ArrayList f29489c = new ArrayList();
    public final Path f29504t = new Path();
    public final Path f29505u = new Path();
    public final RectF v = new RectF();

    public l4(q1 q1Var) {
        this.f29487a = q1Var;
        this.f29496l = xh.e.e(q1Var);
        this.f29494j = new org.telegram.ui.Components.w5(q1Var, 0L, 350L, xq.h);
        this.f29498n = new ic(q1Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.f29489c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (!((k4) obj).f29420f.Q0) {
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
        if (this.f29488b != null) {
            q1 q1Var = this.f29487a;
            if (q1Var.getMessageObject() != null) {
                i7 = q1Var.getMessageObject().f1();
            } else {
                i7 = 0;
            }
            int i12 = this.f29492g;
            int i13 = this.h;
            float f12 = 100.0f;
            if (i12 > i13) {
                f11 = 100.0f;
            } else {
                f11 = (i12 / i13) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f11);
            int i14 = this.h;
            int i15 = this.f29492g;
            if (i14 <= i15) {
                f12 = 100.0f * (i14 / i15);
            }
            int max2 = (int) Math.max(1.0f, f12);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                arrayList = this.f29489c;
                if (i16 >= arrayList.size()) {
                    break;
                }
                k4 k4Var = (k4) arrayList.get(i16);
                if (k4Var.f29420f.K() && k4Var.f29420f.n() != null) {
                    i17 |= 1 << i16;
                }
                i16++;
            }
            Bitmap bitmap = this.f29506w;
            if (bitmap == null || this.f29509z != i7 || this.f29508y != i17 || this.A != max || this.B != max2) {
                this.f29508y = i17;
                this.f29509z = i7;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f29506w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.f29506w);
                float f13 = max / this.f29492g;
                canvas2.scale(f13, f13);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    k4 k4Var2 = (k4) arrayList.get(i18);
                    k4Var2.f29420f.y0(k4Var2.f29416a, k4Var2.f29417b, k4Var2.f29418c - i10, k4Var2.d - i11);
                    k4Var2.f29420f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.f29506w, 12);
                if (this.f29507x == null) {
                    this.f29507x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.f29507x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.f29506w != null) {
                canvas.save();
                canvas.translate(this.d, this.f29490e);
                canvas.scale(this.f29492g / this.f29506w.getWidth(), this.f29492g / this.f29506w.getWidth());
                this.f29507x.setAlpha((int) (f10 * 255.0f));
                canvas.drawBitmap(this.f29506w, 0.0f, 0.0f, this.f29507x);
                canvas.restore();
            }
        }
    }

    public final k4 d(float f10, float f11) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f29489c;
            if (i7 < arrayList.size()) {
                if (((k4) arrayList.get(i7)).f29420f.O(f10, f11)) {
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
            xh.e eVar = this.f29496l;
            if (eVar != null) {
                eVar.a(this.f29487a);
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f29489c;
                if (i7 < arrayList.size()) {
                    k4 k4Var = (k4) arrayList.get(i7);
                    if (k4Var.M) {
                        k4Var.M = false;
                        k4Var.f29420f.R();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z9;
        k4 k4Var;
        q1 q1Var;
        boolean z10;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            k4 d = d(x10, y10);
            this.f29499o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.G;
                if (radialProgress2.f31477i.f36814q != 4 && radialProgress2.f31471a.contains(x10, y10)) {
                    z11 = true;
                    this.f29500p = z11;
                }
            }
            z11 = false;
            this.f29500p = z11;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            k4 d2 = d(x10, y10);
            if (d2 != null) {
                RadialProgress2 radialProgress22 = d2.G;
                if (radialProgress22.f31477i.f36814q != 4 && radialProgress22.f31471a.contains(x10, y10)) {
                    z9 = true;
                    k4Var = this.f29499o;
                    if (k4Var != null && k4Var == d2) {
                        q1Var = this.f29487a;
                        if (q1Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            ij messageObject = q1Var.getMessageObject();
                            if (!this.f29500p && z9 && d2.G.f31477i.f36814q == 3 && messageObject != null) {
                                if (messageObject.p4()) {
                                    gz.C(messageObject.I1).g(messageObject);
                                }
                            } else {
                                l1 delegate = q1Var.getDelegate();
                                k4 k4Var2 = this.f29499o;
                                ImageReceiver imageReceiver = k4Var2.f29420f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var2.E;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.H1(q1Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.f29500p = false;
                    this.f29499o = null;
                }
            }
            z9 = false;
            k4Var = this.f29499o;
            if (k4Var != null) {
                q1Var = this.f29487a;
                if (q1Var.getDelegate() != null) {
                    ij messageObject2 = q1Var.getMessageObject();
                    if (!this.f29500p) {
                    }
                    l1 delegate2 = q1Var.getDelegate();
                    k4 k4Var22 = this.f29499o;
                    ImageReceiver imageReceiver2 = k4Var22.f29420f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = k4Var22.E;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.H1(q1Var, messageExtendedMedia2);
                }
            }
            this.f29500p = false;
            this.f29499o = null;
        }
        if (this.f29499o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29498n.c(z10);
        if (this.f29499o == null) {
            return false;
        }
        return true;
    }

    public final void g(org.telegram.messenger.ij r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.g(org.telegram.messenger.ij):void");
    }

    public final void h(ij ijVar) {
        boolean z9;
        boolean z10;
        int i7;
        float f10;
        int i10;
        int i11;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13;
        q1 q1Var = this.f29487a;
        boolean z14 = false;
        if (q1Var.Ta <= 0 && (!q1Var.f30031v1 || TextUtils.isEmpty(ijVar.f23293z))) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((q1Var.f30031v1 || TextUtils.isEmpty(ijVar.f23293z)) && q1Var.N.f6373p && !q1Var.f30051w7) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i17 = this.f29497m;
        float f11 = 1000.0f;
        if (i17 > 0) {
            f10 = 1000.0f / this.f29488b.d;
            this.f29491f = i17;
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                this.f29491f = org.telegram.messenger.g0.Q0() - org.telegram.messenger.g0.L(122.0f);
            } else {
                int min = Math.min(q1Var.getParentWidth(), org.telegram.messenger.g0.f22537q.y);
                if (q1Var.U(ijVar)) {
                    i7 = 10;
                } else {
                    i7 = 0;
                }
                this.f29491f = min - org.telegram.messenger.g0.L(i7 + 64);
            }
            if (q1Var.Y2()) {
                this.f29491f -= org.telegram.messenger.g0.L(52.0f);
            }
            f10 = 1.0f;
        }
        j4 j4Var = this.f29488b;
        this.f29492g = (int) ((j4Var.d / 1000.0f) * f10 * this.f29491f);
        this.h = (int) (j4Var.f29356g * j4Var.f29357i);
        this.f29493i = false;
        int L = org.telegram.messenger.g0.L(1.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        char c10 = 2;
        if (iz.Y0 > 2) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int L3 = org.telegram.messenger.g0.L(i10 - i11);
        int min2 = Math.min(org.telegram.messenger.g0.L(3.0f), L3);
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.f29489c;
            float f12 = f11;
            aj ajVar = null;
            if (i18 >= arrayList.size()) {
                break;
            }
            k4 k4Var = (k4) arrayList.get(i18);
            j4 j4Var2 = this.f29488b;
            char c11 = c10;
            TLRPC.MessageExtendedMedia messageExtendedMedia = k4Var.E;
            boolean z15 = z14;
            ImageReceiver imageReceiver = k4Var.f29420f;
            if (messageExtendedMedia == null) {
                j4Var2.getClass();
            } else {
                ajVar = (aj) j4Var2.f29353c.get(messageExtendedMedia);
            }
            if (ajVar == null) {
                z11 = z9;
                z12 = z10;
                i12 = L;
            } else {
                float f13 = this.f29491f;
                int i19 = (int) ((ajVar.f21456q / f12) * f10 * f13);
                z11 = z9;
                float f14 = ajVar.f21455p;
                float f15 = this.f29488b.f29357i;
                int i20 = (int) (f14 * f15);
                int i21 = (int) (ajVar.f21446f * f15);
                int i22 = (int) ((ajVar.f21445e / f12) * f10 * f13);
                int i23 = ajVar.f21451l;
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
                z12 = z10;
                int i27 = i25;
                k4Var.f29416a = i19;
                k4Var.f29417b = i24;
                i12 = L;
                k4Var.f29418c = i19 + i26;
                k4Var.d = i24 + i27;
                imageReceiver.y0(i19, i24, i26, i27);
                int i28 = ajVar.f21451l;
                int i29 = i28 & 4;
                if (i29 != 0 && (i28 & 1) != 0 && !z11) {
                    i13 = L3;
                } else {
                    i13 = L2;
                }
                if (i29 != 0 && (i28 & 2) != 0 && !z11) {
                    i14 = L3;
                } else {
                    i14 = L2;
                }
                int i30 = i28 & 8;
                if (i30 != 0 && (i28 & 1) != 0 && !z12) {
                    i15 = L3;
                } else {
                    i15 = L2;
                }
                if (i30 != 0 && (i28 & 2) != 0 && !z12) {
                    i16 = L3;
                } else {
                    i16 = L2;
                }
                if (!z12) {
                    if (ijVar.Q3()) {
                        i16 = L2;
                    } else {
                        i15 = L2;
                    }
                }
                if (!z11 && q1Var.E) {
                    if (ijVar.Q3()) {
                        i14 = min2;
                    } else {
                        i13 = min2;
                    }
                }
                imageReceiver.K0(i13, i14, i16, i15);
                float[] fArr = k4Var.f29423s;
                float f16 = i13;
                fArr[1] = f16;
                fArr[z15 ? 1 : 0] = f16;
                float f17 = i14;
                fArr[3] = f17;
                fArr[c11] = f17;
                float f18 = i16;
                fArr[5] = f18;
                fArr[4] = f18;
                float f19 = i15;
                fArr[7] = f19;
                fArr[6] = f19;
                if (ijVar != null && ijVar.p4()) {
                    k4Var.b(3);
                }
                if (!this.f29493i && !k4Var.h) {
                    z13 = z15 ? 1 : 0;
                } else {
                    z13 = true;
                }
                this.f29493i = z13;
            }
            i18++;
            f11 = f12;
            c10 = c11;
            z14 = z15 ? 1 : 0;
            z9 = z11;
            L = i12;
            z10 = z12;
        }
        boolean z16 = z14;
        if (this.f29493i) {
            if (ijVar == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) ijVar.f23237k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                ly0 ly0Var = new ly0(dd.a1(z16, hd.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                this.f29501q = ly0Var;
                if (ly0Var.f35782c > this.f29492g - org.telegram.messenger.g0.L(30.0f)) {
                    this.f29501q = new ly0(dd.a1(false, hd.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
            }
        }
    }
}
