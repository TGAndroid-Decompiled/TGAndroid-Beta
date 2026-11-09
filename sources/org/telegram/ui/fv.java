package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fv implements e50, org.telegram.ui.Components.wf, org.telegram.ui.Components.t4, org.telegram.ui.Components.cm0, org.telegram.ui.Components.fj0, fi.ma, org.telegram.ui.Components.r00 {
    public final yw f45795a;

    public fv(yw ywVar) {
        this.f45795a = ywVar;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45795a.movePreviewFragment(f10);
        }
    }

    @Override
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        yw ywVar = this.f45795a;
        if (ywVar.D2 != null && !ywVar.J2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ywVar.J2.size(); i11++) {
                arrayList.add(org.telegram.messenger.xr.a(((Long) ywVar.J2.get(i11)).longValue(), 0L));
            }
            yw ywVar2 = this.f45795a;
            ywVar2.D2.y(ywVar2, arrayList, charSequence, false, z9, i7, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        yw ywVar = this.f45795a;
        ArrayList arrayList = ywVar.J2;
        ywVar.L2 = i7;
        ywVar.M2 = i10;
        ywVar.N2 = false;
        if (ywVar.D2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            ywVar.D2.y(ywVar, arrayList2, ywVar.C1.getFieldText(), false, z9, i7, i10, null);
        }
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        this.f45795a.T4(t2Var);
    }

    @Override
    public int S0() {
        return 0;
    }

    @Override
    public TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public boolean V0(long j3) {
        return false;
    }

    @Override
    public boolean X0() {
        return false;
    }

    @Override
    public void a1(CharSequence charSequence, boolean z9, boolean z10) {
        yw ywVar = this.f45795a;
        org.telegram.messenger.g0.i3(new bv(ywVar, 12), 100L);
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            if (z9) {
                if (qo0Var.h) {
                    qo0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.m51 m51Var = ywVar.I2;
            if (m51Var != null) {
                org.telegram.messenger.g0.r(m51Var);
            }
            org.telegram.ui.Components.m51 m51Var2 = new org.telegram.ui.Components.m51(15, this, charSequence);
            ywVar.I2 = m51Var2;
            org.telegram.messenger.g0.i3(m51Var2, 1000L);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public fi.qa d(long j3) {
        di.p pVar;
        rv rvVar = this.f45795a.E0;
        if (rvVar != null) {
            pVar = rvVar.e(j3);
        } else {
            pVar = null;
        }
        return fi.qa.c(pVar);
    }

    @Override
    public boolean d1() {
        return false;
    }

    @Override
    public void e(f50 f50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.xr.a(-j3, 0L));
        yw ywVar = this.f45795a;
        sw swVar = ywVar.D2;
        if (ywVar.C2) {
            ywVar.removeSelfFromStack();
        }
        swVar.y(ywVar, arrayList, null, true, ywVar.K2, ywVar.L2, ywVar.M2, null);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.g6;
        yw ywVar = this.f45795a;
        if (z9) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.f29165n0) {
                ywVar.Z4(g6Var.getDialogId(), view);
                return true;
            }
        }
        hw hwVar = ywVar.C0;
        bi.q1 q1Var = hwVar.f33992a0;
        return ywVar.A4(view, i7, f10, hwVar.f33995d0);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45795a.finishPreviewFragment();
        }
    }

    @Override
    public void g(long j3, bi.r3 r3Var) {
        yw ywVar = this.f45795a;
        if (ywVar.E0 != null) {
            ywVar.J4(false, true);
            ywVar.Q = true;
            ywVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != ywVar.getUserConfig().e()) {
                ywVar.E0.k(j3);
            } else {
                ywVar.E0.S.h1(0, 0);
            }
            ywVar.f52231e0[0].f51772a.getViewTreeObserver().addOnPreDrawListener(new mw(0, this, r3Var));
            return;
        }
        r3Var.run();
    }

    public void h(jg.o0 o0Var) {
        yw ywVar = this.f45795a;
        if (!ywVar.f52297r3) {
            return;
        }
        hw hwVar = ywVar.C0;
        if (hwVar != null) {
            hwVar.C0.remove(o0Var);
            hw hwVar2 = ywVar.C0;
            String obj = ywVar.f52257j0.getSearchField().getText().toString();
            View currentView = hwVar2.getCurrentView();
            boolean z9 = true;
            boolean z10 = !hwVar2.f33998g0;
            if (!TextUtils.isEmpty(hwVar2.M0)) {
                z9 = z10;
            }
            hwVar2.M0 = obj;
            hwVar2.P(currentView, hwVar2.getCurrentPosition(), obj, z9);
        }
        ywVar.j5(true, null, null, false, true);
        ywVar.Y.f3360a.l(ywVar.X.f37857r);
    }

    @Override
    public void i() {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45795a.finishPreviewFragment();
        }
    }

    @Override
    public int l() {
        return 0;
    }

    @Override
    public boolean l1() {
        return false;
    }

    @Override
    public sm o0() {
        return null;
    }

    @Override
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45795a.movePreviewFragment(f10);
        }
    }

    @Override
    public TLRPC.Peer s() {
        return null;
    }

    @Override
    public boolean v0() {
        return true;
    }

    @Override
    public void B(boolean z9) {
    }

    @Override
    public void R0(int i7) {
    }

    @Override
    public void V1(int i7) {
    }

    @Override
    public void Y(boolean z9) {
    }

    @Override
    public void Y1(boolean z9) {
    }

    @Override
    public void k1(CharSequence charSequence) {
    }

    @Override
    public void w(float f10) {
    }

    @Override
    public void C0() {
    }

    @Override
    public void D() {
    }

    @Override
    public void E() {
    }

    @Override
    public void I0() {
    }

    @Override
    public void T1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void l2() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void t() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void M(float f10, int i7) {
    }

    @Override
    public void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override
    public void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
