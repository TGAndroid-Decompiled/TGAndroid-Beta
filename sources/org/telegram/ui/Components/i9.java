package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.PhotoViewer;
public final class i9 implements wj0, k51, pg.l, r0.m, vr0, re.a, kg.u1, om0, com.google.android.gms.common.api.internal.p, u4.i1, ug.k1, androidx.lifecycle.s0 {
    public final int f34635a;
    public Object f34636b;

    public i9(int i3, boolean z10) {
        this.f34635a = i3;
    }

    public static float[] v(ArrayList arrayList) {
        float f10;
        int i3;
        int i10;
        float f11;
        double d;
        double d10;
        double[] dArr;
        ArrayList arrayList2;
        float f12;
        float f13;
        int i11;
        float f14;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f10 = 255.0f;
            if (i13 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i13);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i13++;
        }
        int size2 = arrayList.size();
        int i14 = 1;
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i3 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d10 = 6.0d;
            dArr = null;
        } else {
            char c2 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i15 = 1;
            while (true) {
                i11 = size2 - 1;
                if (i15 >= i11) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i15 - 1);
                PointF pointF3 = (PointF) arrayList.get(i15);
                int i16 = i15 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c10 = c2;
                float f15 = pointF3.x;
                double d14 = d12;
                int i17 = i12;
                int i18 = i14;
                double d15 = f15 - pointF2.x;
                dArr5[i17] = d15 / 6.0d;
                float f16 = pointF4.x;
                float f17 = f10;
                dArr5[i18] = (f16 - f14) / 3.0d;
                double d16 = f16 - f15;
                dArr5[c10] = d16 / 6.0d;
                float f18 = pointF4.y;
                float f19 = pointF3.y;
                dArr3[i15] = ((f18 - f19) / d16) - ((f19 - pointF2.y) / d15);
                i15 = i16;
                c2 = c10;
                d11 = d13;
                d12 = d14;
                i12 = i17;
                i14 = i18;
                f10 = f17;
            }
            i3 = i12;
            i10 = i14;
            f11 = f10;
            d = d11;
            char c11 = c2;
            double d17 = d12;
            d10 = 6.0d;
            dArr3[i3] = d17;
            dArr3[i11] = d17;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i3] = d17;
            dArr6[c11] = d17;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d18 = dArr7[i3];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d19 = d18 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c11] * d19);
                dArr7[i3] = d17;
                dArr3[i19] = dArr3[i19] - (d19 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d20 = dArr9[c11];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d21 = d20 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i3] * d21);
                dArr9[c11] = d17;
                dArr3[i21] = dArr3[i21] - (d21 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i3; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i3;
            while (i24 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i24);
                int i25 = i24 + 1;
                PointF pointF6 = (PointF) arrayList.get(i25);
                int i26 = (int) pointF5.x;
                while (true) {
                    float f20 = pointF6.x;
                    if (i26 < ((int) f20)) {
                        float f21 = i26;
                        PointF pointF7 = pointF5;
                        double d22 = f20 - pointF5.x;
                        double d23 = (f21 - f13) / d22;
                        double d24 = d - d23;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f22 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i25]) + ((((d24 * d24) * d24) - d24) * dArr11[i24])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f22 > f11) {
                            f22 = f11;
                        } else if (f22 < 0.0f) {
                            f22 = 0.0f;
                        }
                        arrayList2.add(new PointF(f21, f22));
                        i26++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i27;
                    }
                }
                i24 = i25;
            }
            f12 = 0.0f;
            arrayList2.add((PointF) k2.p1.h(1, arrayList));
        }
        int i28 = i3;
        float f23 = ((PointF) arrayList2.get(i28)).x;
        if (f23 > f12) {
            for (int i29 = (int) f23; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f24 = ((PointF) k2.p1.h(1, arrayList2)).x;
        if (f24 < f11) {
            for (int i30 = ((int) f24) + 1; i30 <= 255; i30++) {
                arrayList2.add(new PointF(i30, f11));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i28 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i28);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i28] = sqrt;
            i28++;
        }
        return fArr;
    }

    public static i9 w(float f10, int i3) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f22608q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new i9(i10, i11, new int[0]);
        }
        if (i3 == 3) {
            return new i9(i10, i11, new int[]{i11, i10});
        }
        boolean z11 = true;
        if (i3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= i11) {
            z11 = false;
        }
        if (z10 == z11) {
            return new i9(i10, i11, new int[0]);
        }
        return new i9(i11, i10, new int[0]);
    }

    @Override
    public void A(boolean z10) {
        ((ad0) this.f34636b).f31809c.setAspectLock(z10);
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public androidx.lifecycle.p0 G(Class cls, x1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (x1.c cVar : (x1.c[]) this.f34636b) {
            if (cVar.f58125a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void H0() {
        ((o41) this.f34636b).h.c(false);
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public void O(float f10, float f11) {
        Runnable runnable = ((o41) this.f34636b).f36698j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void Q(boolean z10) {
        ad0 ad0Var = (ad0) this.f34636b;
        ad0Var.getClass();
        zc0 zc0Var = ad0Var.f31807a;
        if (zc0Var != null) {
            ((org.telegram.ui.io0) zc0Var).a(z10);
        }
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        nk0 nk0Var = (nk0) this.f34636b;
        nk0Var.f36580w.setPadding(I0.f14495a, I0.f14496b, I0.f14497c, I0.d);
        nk0Var.f36579s.requestLayout();
        return r0.k1.f54025b;
    }

    @Override
    public void S() {
        zc0 zc0Var = ((ad0) this.f34636b).f31807a;
        if (zc0Var != null) {
            PhotoViewer photoViewer = ((org.telegram.ui.io0) zc0Var).f46322a;
            if (photoViewer.f41402d2 == 1) {
                photoViewer.I2 = true;
                photoViewer.t3();
            }
        }
    }

    @Override
    public boolean U0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((o41) this.f34636b).f36696g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        return false;
    }

    @Override
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f34635a) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                r6.c cVar = (r6.c) ((r6.e) obj).m();
                Parcel J0 = cVar.J0();
                m7.a.b(J0, (p6.p) this.f34636b);
                try {
                    cVar.f2456b.transact(1, J0, null, 1);
                    J0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    J0.recycle();
                    throw th2;
                }
            default:
                t7.x xVar = (t7.x) ((t7.k) obj).m();
                t7.f fVar = new t7.f(1, (TaskCompletionSource) obj2);
                Parcel P0 = xVar.P0();
                int i3 = t7.d.f54953a;
                P0.writeInt(1);
                ((i8.c) this.f34636b).writeToParcel(P0, 0);
                t7.d.c(P0, fVar);
                P0.writeString(null);
                xVar.T0(P0, 63);
                return;
        }
    }

    @Override
    public void b(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f34636b;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override
    public boolean c(int i3) {
        if (((ChatAttachAlertPhotoLayout) this.f34636b).H.d(i3) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int d(View view) {
        return u4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).topMargin;
    }

    @Override
    public void e() {
        ((ws0) this.f34636b).J.a(-1);
    }

    @Override
    public void f(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.f34636b).L && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30216y.c(q5Var);
        }
    }

    @Override
    public int g() {
        return ((u4.o0) this.f34636b).G();
    }

    @Override
    public boolean g0() {
        return true;
    }

    @Override
    public float get() {
        ug.n0 n0Var = (ug.n0) this.f34636b;
        int i3 = n0Var.f56167a;
        tg.h currentBrush = n0Var.f56170e.getCurrentBrush();
        if (currentBrush == null) {
            return tg.k0.e(i3).f55235i;
        }
        return tg.k0.e(i3).f("-1", currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        qg.g gVar = (qg.g) this.f34636b;
        float f10 = gVar.f53925b;
        return String.valueOf(Math.round((gVar.f53924a.getProgress() * (gVar.f53926c - f10)) + f10));
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public org.telegram.ui.ActionBar.y0 h(String str) {
        org.telegram.ui.ActionBar.f5 f5Var = ((ws0) this.f34636b).J;
        return f5Var.d(0, 0, null, str, true, true, f5Var.f28456n0);
    }

    @Override
    public int i() {
        u4.o0 o0Var = (u4.o0) this.f34636b;
        return o0Var.f55640n - o0Var.C();
    }

    @Override
    public View j(int i3) {
        return ((u4.o0) this.f34636b).q(i3);
    }

    @Override
    public void k(boolean z10, float f10) {
        qg.g gVar = (qg.g) this.f34636b;
        float f11 = gVar.f53925b;
        float y9 = com.google.android.recaptcha.internal.a.y(gVar.f53926c, f11, f10, f11);
        gVar.d = y9;
        if (z10) {
            j6 j6Var = gVar.f53927e;
            j6Var.getClass();
            j6Var.c(null, y9);
        }
        gVar.invalidate();
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public int l(View view) {
        return u4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public boolean m(int i3) {
        org.telegram.messenger.ye M = ((ChatAttachAlertPhotoLayout) this.f34636b).H.M(i3);
        if (M != null && ChatAttachAlertPhotoLayout.f31260t1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public org.telegram.ui.ActionBar.y0 n(int i3, Runnable runnable, String str, boolean z10, boolean z11) {
        ws0 ws0Var = (ws0) this.f34636b;
        org.telegram.ui.ActionBar.y0 e10 = ws0Var.J.e(0, i3, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
            e10.d(ws0Var.s0(i10), ws0Var.s0(i10));
        }
        e10.setOnClickListener(new fa0(this, z11, runnable));
        return e10;
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        k40 k40Var;
        org.telegram.messenger.b20 b20Var;
        c40 c40Var = (c40) this.f34636b;
        m51 m51Var = c40Var.I0.T;
        if (m51Var != null && m51Var.d0() && i3 == 4 && (b20Var = (k40Var = c40Var.I0).S) != null) {
            m51 m51Var2 = k40Var.T;
            long j10 = b20Var.f21708a;
            if (j10 <= 0) {
                j10 = 0;
            }
            m51Var2.p0(j10);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f34636b).remove(runnable);
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
        }
    }

    public void q() {
        HashMap hashMap = (HashMap) this.f34636b;
        for (Map.Entry entry : hashMap.entrySet()) {
            org.telegram.messenger.g0.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public void r(int i3) {
        org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) this.f34636b;
        if (!w9Var.f43365r && i3 == w9Var.K) {
            w9Var.j0(w9Var.O.getText().toString().trim());
        }
    }

    @Override
    public void s(float f10) {
        ug.n0 n0Var = (ug.n0) this.f34636b;
        tg.k0.e(n0Var.f56167a).k("-1", f10);
        n0Var.f56170e.setBrushSize(f10);
    }

    @Override
    public boolean s1() {
        return false;
    }

    public String toString() {
        switch (this.f34635a) {
            case 26:
                we.b bVar = we.b.f57560e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((u4.b) this.f34636b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        zc0 zc0Var = ((ad0) this.f34636b).f31807a;
        if (zc0Var != null) {
            ((org.telegram.ui.io0) zc0Var).f46322a.f41420f0.invalidate();
        }
    }

    @Override
    public void u0() {
        ((o41) this.f34636b).h.c(true);
    }

    public i9(Object obj, int i3) {
        this.f34635a = i3;
        this.f34636b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i9(int i3) {
        this.f34635a = i3;
        switch (i3) {
            case 13:
                this.f34636b = new SparseArray();
                return;
            default:
                this.f34636b = new HashMap();
                return;
        }
    }

    public i9(int i3, int i10, int[] iArr) {
        this.f34635a = 0;
        q40[] q40VarArr = new q40[(iArr.length / 2) + 1];
        this.f34636b = q40VarArr;
        q40 q40Var = new q40(i3, i10);
        int i11 = 0;
        q40VarArr[0] = q40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((q40[]) this.f34636b)[i12] = new q40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public i9(x1.c[] initializers) {
        this.f34635a = 27;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f34636b = initializers;
    }

    public i9(EditText editText) {
        this.f34635a = 17;
        this.f34636b = new mi.h0(editText);
    }

    @Override
    public void b2(ArrayList arrayList) {
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void D() {
    }

    @Override
    public void t(float f10, float f11) {
    }

    @Override
    public void o(View view, float f10, float f11) {
    }

    @Override
    public void o1(View view, float f10, float f11) {
    }

    @Override
    public void x(View view, float f10, float f11) {
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
