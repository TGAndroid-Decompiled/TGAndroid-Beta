package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class tp0 implements ng.g, j81, androidx.activity.result.b, SuccessContinuation, yf.m, f71, com.google.android.gms.common.api.internal.s, g5.n0, OnSuccessListener, ra.m, u5.o, sh.m0, td.a, androidx.lifecycle.s0, y4, vh.d1, xd.b {
    public final int f29014a;
    public Object f29015b;

    public tp0(int i10) {
        this.f29014a = i10;
    }

    @Override
    public void D(Canvas canvas) {
        lq0 lq0Var = (lq0) this.f29015b;
        canvas.drawColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        if (SharedConfig.chatBlurEnabled()) {
            lq0Var.L0.b(canvas, -3);
        }
    }

    @Override
    public void D1(g.x xVar) {
        xVar.a(((lq0) this.f29015b).getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f29014a) {
            case 20:
                ((vh.q) this.f29015b).H(i10, z4, i11, false, 0L);
                vh.q qVar = (vh.q) this.f29015b;
                org.telegram.ui.ui0 ui0Var = qVar.L;
                if (ui0Var != null) {
                    ui0Var.i();
                    qVar.L = null;
                    return;
                }
                return;
            default:
                ((vh.y1) this.f29015b).s0(i10, i11, z4);
                return;
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((xd.h) this.f29015b).i(f10);
    }

    @Override
    public void Q0(CharSequence charSequence) {
        vh.z2 z2Var = ((vh.j5) this.f29015b).B;
        if (z2Var != null && charSequence != null && charSequence.length() > 0) {
            z2Var.f46422a.s4(charSequence.toString());
        }
    }

    @Override
    public boolean V0(vh.e1 e1Var) {
        return false;
    }

    @Override
    public void a() {
        r4.g gVar = (r4.g) this.f29015b;
        gVar.B.a();
        b7.y0 y0Var = gVar.D;
        if (y0Var == null) {
            return;
        }
        throw y0Var;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        u5.x xVar = (u5.x) obj;
        u5.f fVar = (u5.f) xVar.u();
        q5.e0 e0Var = ((q5.f0) this.f29015b).f42822k;
        Parcel M0 = fVar.M0();
        com.google.android.gms.internal.cast.t.d(M0, e0Var);
        fVar.R0(M0, 18);
        u5.f fVar2 = (u5.f) xVar.u();
        fVar2.R0(fVar2.M0(), 17);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override
    public androidx.lifecycle.p0 b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void c(vh.e1 e1Var) {
        vh.z2 z2Var = ((vh.j5) this.f29015b).B;
        if (z2Var != null) {
            vh.s3 s3Var = z2Var.f46422a;
            vh.s3.L1(s3Var, e1Var);
            s3Var.f46209e3.d(e1Var, true);
        }
    }

    @Override
    public void close() {
        ((sh.q) this.f29015b).finishFragment();
    }

    @Override
    public void d(long j10) {
        ((sh.q) this.f29015b).presentFragment(org.telegram.ui.zn.R9(j10));
    }

    @Override
    public void e(String str, long j10, long j11, long j12) {
        s5.o oVar = (s5.o) this.f29015b;
        try {
            oVar.a(new s5.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            u5.b bVar = s5.h.f44136k;
            Log.e(bVar.f45160a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f44159q.f44142i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void f() {
        boolean z4;
        sh.q qVar = (sh.q) this.f29015b;
        xd.a aVar = qVar.f44463a;
        sh.n0 n0Var = qVar.v;
        if (n0Var.f44455n && n0Var.f44453l == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        qVar.d.V2.N(true);
    }

    @Override
    public void g(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tp0.g(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public boolean h() {
        vh.j5 j5Var = (vh.j5) this.f29015b;
        vh.z2 z2Var = j5Var.B;
        if (z2Var != null && j5Var.f46414a != null) {
            return z2Var.f46422a.R4();
        }
        return false;
    }

    @Override
    public boolean h0(vh.e1 e1Var) {
        return false;
    }

    public float i(ub.c cVar, ub.c cVar2) {
        int i10 = (int) cVar.f16518b;
        int i11 = (int) cVar2.f16518b;
        float q10 = q((int) cVar.f16517a, i10, (int) cVar2.f16517a, i11);
        float q11 = q((int) cVar2.f16517a, i11, (int) cVar.f16517a, i10);
        if (Float.isNaN(q10)) {
            return q11 / 7.0f;
        }
        if (Float.isNaN(q11)) {
            return q10 / 7.0f;
        }
        return (q10 + q11) / 14.0f;
    }

    public boolean j(int i10) {
        c81 c81Var = ((l81) this.f29015b).I;
        if (c81Var == null) {
            return false;
        }
        return c81Var.c(i10);
    }

    public int k(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        rb.a aVar = (rb.a) this.f29015b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z4 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f43459a[aVar.f43463g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            rb.a aVar2 = rb.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z4 = false;
                }
            }
            if (z4) {
                return 0;
            }
            rb.b bVar = new rb.b(aVar, iArr5);
            rb.b a2 = aVar.a(i10, 1);
            rb.b bVar2 = aVar.f43461c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            rb.b bVar3 = aVar.d;
            rb.b bVar4 = a2;
            rb.b bVar5 = bVar;
            rb.b bVar6 = bVar4;
            rb.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    rb.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c3 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c3));
                        bVar5 = bVar5.a(bVar6.h(d, c3));
                    }
                    rb.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        rb.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c10 = bVar3.c(0);
            if (c10 != 0) {
                int b11 = aVar.b(c10);
                rb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                rb.b bVar10 = bVarArr[0];
                rb.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c11 = aVar.c(iArr3[i24], b12);
                            if ((c11 & 1) == 0) {
                                i11 = c11 | 1;
                            } else {
                                i11 = c11 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c12 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c12;
                    if (aVar.f43463g != 0) {
                        iArr7[i22] = aVar.c(c12, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f43460b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    public String l(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            w9.d dVar = (w9.d) this.f29015b;
            w9.e eVar = new w9.e(stringWriter, dVar.f46580a, dVar.f46581b, dVar.f46582c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f46584b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void l1(Editable editable) {
        vh.j5 j5Var = (vh.j5) this.f29015b;
        vh.a aVar = j5Var.f46414a;
        if (aVar != null) {
            aVar.f45867s = true;
            aVar.f45866r = j5Var.f46038r.B;
        }
        j5Var.u();
        vh.z2 z2Var = j5Var.B;
        if (z2Var != null && j5Var.f46414a != null) {
            z2Var.a();
        }
    }

    public ub.a m(float f10, float f11, int i10, int i11) {
        int i12;
        ub.a b10;
        ub.a b11;
        int i13 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i13);
        pb.b bVar = (pb.b) this.f29015b;
        int min = Math.min(bVar.f41119a - 1, i10 + i13) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f41120b - 1, i11 + i13) - max2;
            if (min2 >= f12) {
                pb.b bVar2 = (pb.b) this.f29015b;
                ub.b bVar3 = new ub.b(bVar2, max, max2, min, min2, f10);
                int i14 = bVar3.e;
                int i15 = bVar3.f45270c;
                int i16 = i14 + i15;
                int i17 = bVar3.f45271f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f45269b;
                if (!arrayList.isEmpty()) {
                    return (ub.a) arrayList.get(0);
                }
                throw ob.e.a();
            }
            throw ob.e.a();
        }
        throw ob.e.a();
    }

    public void n(float f10) {
        l81 l81Var = (l81) this.f29015b;
        if (f10 == 1.0f) {
            View[] viewArr = l81Var.e;
            View[] viewArr2 = l81Var.e;
            if (viewArr[1] != null) {
                l81Var.F();
                l81Var.h.put(l81Var.f26619f[1], viewArr2[1]);
                l81Var.removeView(viewArr2[1]);
                l81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            l81Var.z(l81Var.f26617b);
            return;
        }
        View[] viewArr3 = l81Var.e;
        View[] viewArr4 = l81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (l81Var.f26625y) {
            l81Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            l81Var.E(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            l81Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            l81Var.E(view3, view3.getMeasuredWidth() * f10);
        }
        l81Var.w(false);
    }

    @Override
    public void n1(vh.e1 e1Var, int i10, int i11) {
        vh.z2 z2Var;
        org.telegram.ui.Cells.l9 textSelectionHelper;
        vh.j5 j5Var = (vh.j5) this.f29015b;
        if (!j5Var.D && i10 != i11 && (z2Var = j5Var.B) != null && (textSelectionHelper = z2Var.f46422a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != j5Var) {
                j5Var.post(new org.telegram.messenger.p6(this, e1Var, i11, textSelectionHelper, i10, 6));
            }
        }
    }

    public float o(int i10, int i11, int i12, int i13) {
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = (-abs) / 2;
        int i23 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i23 = 1;
        }
        int i24 = i16 + i18;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if (z4) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z4) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z11 = z4;
            if (i27 == i21) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i28 = abs;
            if (z10 == ((pb.b) this.f29015b).b(i19, i20)) {
                if (i27 == 2) {
                    return k7.n6.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i26 == i17) {
                    break;
                }
                i26 += i23;
                i22 -= i28;
            }
            i25 += i18;
            abs = i28;
            z4 = z11;
            i21 = 1;
        }
        if (i27 == 2) {
            return k7.n6.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        ph.k5 k5Var = (ph.k5) this.f29015b;
        ph.i5 i5Var = k5Var.J;
        i71 i71Var = k5Var.f41918x;
        if (i71Var == null) {
            return;
        }
        if (i71Var.y()) {
            AndroidUtilities.runOnUIThread(i5Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(i5Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((r5.a) this.f29015b).getClass();
        j7.t5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        ph.k5 k5Var = (ph.k5) this.f29015b;
        k5Var.getClass();
        k5Var.getClass();
        dg.b3 b3Var = k5Var.f41916w;
        if (b3Var != null) {
            float f11 = i10 / i11;
            if (Math.abs(b3Var.f4407v0 - f11) >= 1.0E-4f) {
                b3Var.f4407v0 = f11;
                b3Var.requestLayout();
            }
        }
    }

    @Override
    public androidx.lifecycle.p0 p(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f29015b) {
            if (cVar.f45618a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public float q(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        pb.b bVar = (pb.b) this.f29015b;
        float o10 = o(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f41119a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f10 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f10));
        if (i18 < 0) {
            f11 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.f41120b;
            if (i18 >= i19) {
                f11 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f11 = 1.0f;
            }
        }
        return (o(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + o10) - 1.0f;
    }

    @Override
    public void r(int i10, int i11) {
        vh.d2 d2Var;
        vh.j5 j5Var = (vh.j5) this.f29015b;
        vh.z2 z2Var = j5Var.B;
        if (z2Var != null && j5Var.f46414a != null && (d2Var = z2Var.f46422a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public void r0() {
        ((ph.f0) this.f29015b).e.invalidate();
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        e3.g gVar = (e3.g) this.f29015b;
        p9.a aVar = (p9.a) gVar.f5104f;
        p9.d dVar = (p9.d) gVar.f5102b;
        String str = aVar.f41083a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = p9.a.b(dVar);
            l7.w0 w0Var = new l7.w0(str, b10);
            w0Var.w("User-Agent", "Crashlytics Android SDK/18.6.0");
            w0Var.w("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            p9.a.a(w0Var, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(w0Var.q());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            p9.b s6 = ((o3.c) gVar.f5103c).s(jSONObject);
            zz zzVar = (zz) gVar.e;
            long j10 = s6.f41086c;
            zzVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) zzVar.f31508b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e6) {
                        e = e6;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        i9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.g.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f41091f;
                        SharedPreferences.Editor edit = ((Context) gVar.f5101a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) gVar.h).set(s6);
                        ((TaskCompletionSource) ((AtomicReference) gVar.f5106i).get()).trySetResult(s6);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    i9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                i9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            i9.h.c(fileWriter, "Failed to close settings writer.");
            e3.g.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f41091f;
            SharedPreferences.Editor edit2 = ((Context) gVar.f5101a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) gVar.h).set(s6);
            ((TaskCompletionSource) ((AtomicReference) gVar.f5106i).get()).trySetResult(s6);
        }
        return Tasks.forResult(null);
    }

    @Override
    public Object u2() {
        Type type = (Type) this.f29015b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public boolean w1(boolean z4) {
        return false;
    }

    @Override
    public void x(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f29015b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f345b;
        int i10 = aVar.f344a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f41015a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.L;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void z(float f10, int i10) {
        ((xd.h) this.f29015b).i(f10);
    }

    public tp0(Object obj, int i10) {
        this.f29014a = i10;
        this.f29015b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public tp0() {
        this.f29014a = 15;
        this.f29015b = new SparseArray();
    }

    public tp0(v1.c[] initializers) {
        this.f29014a = 19;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f29015b = initializers;
    }

    @Override
    public void G1(boolean z4) {
    }

    @Override
    public void M0(boolean z4) {
    }

    @Override
    public void d2() {
    }

    @Override
    public void g1(vh.e1 e1Var) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void q0() {
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
    }
}
