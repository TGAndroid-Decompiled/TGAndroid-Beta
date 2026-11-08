package org.telegram.ui.Components;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class rt implements ti.m, r0.m, wr0, ue.a, jg.y1, q5.b, x2.d1, com.google.android.gms.common.api.internal.p, tg.l1, sg.v0, v4.i1, androidx.lifecycle.s0 {
    public final int f37757a;
    public Object f37758b;

    public rt(Object obj, int i7) {
        this.f37757a = i7;
        this.f37758b = obj;
    }

    @Override
    public int A() {
        return ((v4.n0) this.f37758b).G();
    }

    @Override
    public View D() {
        return ((wt) this.f37758b).K1;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public void G() {
        ((xs0) this.f37758b).I.a(-1);
    }

    @Override
    public org.telegram.ui.ActionBar.z0 H(String str) {
        org.telegram.ui.ActionBar.f5 f5Var = ((xs0) this.f37758b).I;
        return f5Var.d(0, 0, null, str, true, true, f5Var.m0);
    }

    @Override
    public void H0() {
        ((s41) this.f37758b).h.c(false);
    }

    @Override
    public int I() {
        return ((wt) this.f37758b).L1;
    }

    @Override
    public boolean K() {
        return false;
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public e2.c1 M() {
        return null;
    }

    @Override
    public int N() {
        v4.n0 n0Var = (v4.n0) this.f37758b;
        return n0Var.f57141n - n0Var.C();
    }

    @Override
    public void O(float f10, float f11) {
        Runnable runnable = ((s41) this.f37758b).f37906j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void Q() {
        wt wtVar = (wt) this.f37758b;
        wtVar.J1 = null;
        wtVar.K0();
    }

    @Override
    public boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        jk0 jk0Var = (jk0) this.f37758b;
        jk0Var.f35012w.setPadding(I0.f15120a, I0.f15121b, I0.f15122c, I0.d);
        jk0Var.f35011s.requestLayout();
        return r0.k1.f54200b;
    }

    @Override
    public void T() {
        ((wt) this.f37758b).L0();
    }

    @Override
    public int U() {
        return ((wt) this.f37758b).M1;
    }

    @Override
    public boolean U0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((s41) this.f37758b).f37904g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override
    public float V() {
        return 0.0f;
    }

    @Override
    public View W(int i7) {
        return ((v4.n0) this.f37758b).q(i7);
    }

    @Override
    public void X(float f10) {
        org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f37758b;
        sg.l0.e(up0Var.f55702y1).k(String.valueOf(sg.h.f55059a.indexOf(up0Var.F0.getCurrentBrush())), f10);
        sg.j1 j1Var = up0Var.f55692t1;
        j1Var.f55110c = f10;
        up0Var.s0(j1Var, null);
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void Y() {
        tg.o0 o0Var = (tg.o0) this.f37758b;
        o0Var.f55872b.f55146a.f();
        o0Var.f55880x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.tp0) o0Var).K;
        Drawable[] drawableArr = PhotoViewer.Y8;
        photoViewer.U2(true, true);
    }

    @Override
    public int a0(View view) {
        return v4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f37757a) {
            case 14:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.c cVar = (s6.c) ((s6.e) obj).n();
                Parcel j12 = cVar.j1();
                n7.a.b(j12, (q6.p) this.f37758b);
                try {
                    cVar.f306b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            default:
                u7.x xVar = (u7.x) ((u7.k) obj).n();
                u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
                Parcel p12 = xVar.p1();
                int i7 = u7.d.f56362a;
                p12.writeInt(1);
                ((j8.c) this.f37758b).writeToParcel(p12, 0);
                u7.d.c(p12, fVar);
                p12.writeString(null);
                xVar.t1(p12, 63);
                return;
        }
    }

    @Override
    public void b() {
        l71 l71Var = ((wt) this.f37758b).f40042j1;
        if (l71Var != null && l71Var.f35590x) {
            l71Var.f35570a.g0();
            l71Var.n();
            l71Var.f35580f0.d(true, true);
        }
    }

    @Override
    public org.telegram.ui.ActionBar.z0 b0(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        xs0 xs0Var = (xs0) this.f37758b;
        org.telegram.ui.ActionBar.z0 e10 = xs0Var.I.e(0, i7, str);
        if (z9) {
            int i10 = org.telegram.ui.ActionBar.k6.f28073p7;
            e10.d(xs0Var.s0(i10), xs0Var.s0(i10));
        }
        e10.setOnClickListener(new ka0(this, z10, runnable));
        return e10;
    }

    @Override
    public boolean c1(View view, float f10, float f11) {
        return false;
    }

    @Override
    public void d(x2.e1 e1Var) {
        r2.p pVar = (r2.p) e1Var;
        r2.j jVar = (r2.j) this.f37758b;
        jVar.G.d(jVar);
    }

    @Override
    public void d0() {
        ((tg.o0) this.f37758b).f55880x.setViewHidden(true);
    }

    @Override
    public boolean e0() {
        return false;
    }

    public void g0(v4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f37758b;
        int i7 = aVar.f56991a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        return;
                    }
                    recyclerView.f2873y.X(recyclerView, aVar.f56992b, aVar.d);
                    return;
                }
                recyclerView.f2873y.a0(recyclerView, aVar.f56992b, aVar.d, aVar.f56993c);
                return;
            }
            recyclerView.f2873y.Y(recyclerView, aVar.f56992b, aVar.d);
            return;
        }
        recyclerView.f2873y.V(recyclerView, aVar.f56992b, aVar.d);
    }

    @Override
    public Object mo24get() {
        return new org.telegram.ui.hy0((Context) ((e.a) this.f37758b).f10026a, new nb.a(28), new w7.s(27, false), 4);
    }

    @Override
    public long getDuration() {
        return 0L;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean h() {
        return false;
    }

    public ClipDescription h0() {
        return ((t0.h) this.f37758b).getDescription();
    }

    @Override
    public androidx.lifecycle.p0 i(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public void i0(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f37758b;
        int B = recyclerView.f2847e.B();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < B; i14++) {
            View A = recyclerView.f2847e.A(i14);
            v4.d1 U = RecyclerView.U(A);
            if (U != null && !U.r() && (i12 = U.f57045c) >= i7 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f57052l) == 0) {
                    if (U.f57053m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f57053m = arrayList;
                        U.f57054n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f57053m.add(obj);
                }
                ((v4.o0) A.getLayoutParams()).f57145c = true;
            }
        }
        v4.v0 v0Var = recyclerView.f2842b;
        ArrayList arrayList2 = (ArrayList) v0Var.f57179e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            v4.d1 d1Var = (v4.d1) arrayList2.get(size);
            if (d1Var != null && (i11 = d1Var.f57045c) >= i7 && i11 < i13) {
                d1Var.a(2);
                v0Var.f(size);
            }
        }
        recyclerView.f2874y0 = true;
    }

    @Override
    public int j() {
        return 0;
    }

    @Override
    public boolean j0() {
        return true;
    }

    @Override
    public int k(View view) {
        return v4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).topMargin;
    }

    public void k0(int i7, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f37758b;
        int B = recyclerView.f2847e.B();
        for (int i11 = 0; i11 < B; i11++) {
            v4.d1 U = RecyclerView.U(recyclerView.f2847e.A(i11));
            if (U != null && !U.r() && U.f57045c >= i7) {
                U.n(i10, false);
                recyclerView.f2867u0.f57001f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2842b.f57179e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            v4.d1 d1Var = (v4.d1) arrayList.get(i12);
            if (d1Var != null && d1Var.f57045c >= i7) {
                d1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2872x0 = true;
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public long l() {
        return 0L;
    }

    public void l0(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = (RecyclerView) this.f37758b;
        int B = recyclerView.f2847e.B();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < B; i19++) {
            v4.d1 U = RecyclerView.U(recyclerView.f2847e.A(i19));
            if (U != null && (i17 = U.f57045c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.f2867u0.f57001f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2842b.f57179e;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            v4.d1 d1Var = (v4.d1) arrayList.get(i20);
            if (d1Var != null && (i16 = d1Var.f57045c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    d1Var.n(i10 - i7, false);
                } else {
                    d1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2872x0 = true;
    }

    public void m0() {
        r2.p[] pVarArr;
        r2.p[] pVarArr2;
        r2.j jVar = (r2.j) this.f37758b;
        int i7 = jVar.H - 1;
        jVar.H = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.p pVar : jVar.J) {
            pVar.l();
            i10 += pVar.Y.f58448a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.p pVar2 : jVar.J) {
            pVar2.l();
            int i12 = pVar2.Y.f58448a;
            int i13 = 0;
            while (i13 < i12) {
                pVar2.l();
                m1VarArr[i11] = pVar2.Y.a(i13);
                i13++;
                i11++;
            }
        }
        jVar.I = new x2.q1(m1VarArr);
        jVar.G.a(jVar);
    }

    @Override
    public void n() {
        tg.o0 o0Var = (tg.o0) this.f37758b;
        o0Var.f55874e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new fi.v3(o0Var, 24)).setInterpolator(xq.h);
    }

    public boolean n0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rt.n0(android.view.MotionEvent):boolean");
    }

    public void o0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f37758b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long q02 = q0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + q02);
    }

    @Override
    public boolean o1() {
        return false;
    }

    public void p0(long j3) {
        long q02 = q0();
        if (q02 != j3) {
            if (q02 != -1) {
                if (q02 == -2) {
                    q02 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(q02);
            throw new IOException(t6.toString());
        }
    }

    @Override
    public void q(int i7) {
        org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) this.f37758b;
        if (!w9Var.f43312r && i7 == w9Var.J) {
            w9Var.j0(w9Var.N.getText().toString().trim());
        }
    }

    public long q0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f37758b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public boolean r() {
        wt wtVar = (wt) this.f37758b;
        if (wtVar.K1 == wtVar.f40041i1 && wtVar.f40051u1 && "inapp".equals(org.telegram.messenger.qp.s1(wtVar.f28616a).A3)) {
            return false;
        }
        return true;
    }

    @Override
    public androidx.lifecycle.p0 t(Class cls, y1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (y1.c cVar : (y1.c[]) this.f37758b) {
            if (cVar.f58871a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void t0() {
        ((s41) this.f37758b).h.c(true);
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void v(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public View x(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public boolean z() {
        return true;
    }

    public rt(boolean z9) {
        this.f37757a = 8;
        this.f37758b = new AtomicBoolean(z9);
    }

    public rt(int i7) {
        this.f37757a = i7;
        switch (i7) {
            case 10:
                this.f37758b = new ArrayDeque(16);
                return;
            case 27:
                return;
            default:
                this.f37758b = h9.i0.p();
                return;
        }
    }

    public rt(y1.c[] initializers) {
        this.f37757a = 26;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f37758b = initializers;
    }

    @Override
    public float get() {
        org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f37758b;
        int i7 = up0Var.f55702y1;
        sg.h currentBrush = up0Var.F0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.l0.e(i7).f55132i;
        }
        return sg.l0.e(i7).f(String.valueOf(sg.h.f55059a.indexOf(currentBrush)), currentBrush.d());
    }

    public rt(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f37757a = 15;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f37758b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.f37758b = new org.telegram.ui.hy0(uri, clipDescription, uri2, 15);
        }
    }

    public rt(Context context, c10 c10Var) {
        this.f37757a = 1;
        this.f37758b = new b10(context, c10Var);
    }

    @Override
    public void B(View view) {
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void J(float f10) {
    }

    @Override
    public void S(View view) {
    }

    @Override
    public void c(long j3) {
    }

    @Override
    public void e(View view) {
    }

    @Override
    public void f0(int i7) {
    }

    @Override
    public void g(ti.p pVar) {
    }

    @Override
    public void m1(ArrayList arrayList) {
    }

    @Override
    public void y(View view) {
    }

    @Override
    public void F() {
    }

    @Override
    public void f() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p() {
    }

    @Override
    public void Z(int i7, ArrayList arrayList) {
    }

    @Override
    public void s(float f10, float f11) {
    }

    @Override
    public void c0(Canvas canvas, int i7, int i10) {
    }

    @Override
    public void l1(View view, float f10, float f11) {
    }

    @Override
    public void m(View view, float f10, float f11) {
    }

    @Override
    public void w(View view, float f10, float f11) {
    }
}
