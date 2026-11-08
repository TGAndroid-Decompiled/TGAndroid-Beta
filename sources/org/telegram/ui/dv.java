package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class dv implements c50, org.telegram.ui.Components.wf, org.telegram.ui.Components.t4, org.telegram.ui.Components.bm0, org.telegram.ui.Components.ej0, fi.ma, org.telegram.ui.Components.r00 {
    public final ww f45140a;

    public dv(ww wwVar) {
        this.f45140a = wwVar;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45140a.movePreviewFragment(f10);
        }
    }

    @Override
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        ww wwVar = this.f45140a;
        if (wwVar.C2 != null && !wwVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < wwVar.I2.size(); i11++) {
                arrayList.add(org.telegram.messenger.xr.a(((Long) wwVar.I2.get(i11)).longValue(), 0L));
            }
            ww wwVar2 = this.f45140a;
            wwVar2.C2.y(wwVar2, arrayList, charSequence, false, z9, i7, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        ww wwVar = this.f45140a;
        ArrayList arrayList = wwVar.I2;
        wwVar.K2 = i7;
        wwVar.L2 = i10;
        wwVar.M2 = false;
        if (wwVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            wwVar.C2.y(wwVar, arrayList2, wwVar.B1.getFieldText(), false, z9, i7, i10, null);
        }
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        this.f45140a.T4(t2Var);
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
        ww wwVar = this.f45140a;
        org.telegram.messenger.g0.i3(new zu(wwVar, 12), 100L);
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            if (z9) {
                if (po0Var.h) {
                    po0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.l51 l51Var = wwVar.H2;
            if (l51Var != null) {
                org.telegram.messenger.g0.r(l51Var);
            }
            org.telegram.ui.Components.l51 l51Var2 = new org.telegram.ui.Components.l51(15, this, charSequence);
            wwVar.H2 = l51Var2;
            org.telegram.messenger.g0.i3(l51Var2, 1000L);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public fi.qa d(long j3) {
        di.p pVar;
        pv pvVar = this.f45140a.E0;
        if (pvVar != null) {
            pVar = pvVar.e(j3);
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
    public void e(d50 d50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.xr.a(-j3, 0L));
        ww wwVar = this.f45140a;
        qw qwVar = wwVar.C2;
        if (wwVar.B2) {
            wwVar.removeSelfFromStack();
        }
        qwVar.y(wwVar, arrayList, null, true, wwVar.J2, wwVar.K2, wwVar.L2, null);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.g6;
        ww wwVar = this.f45140a;
        if (z9) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.f29161n0) {
                wwVar.Z4(g6Var.getDialogId(), view);
                return true;
            }
        }
        fw fwVar = wwVar.C0;
        bi.q1 q1Var = fwVar.f33595a0;
        return wwVar.A4(view, i7, f10, fwVar.f33598d0);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45140a.finishPreviewFragment();
        }
    }

    @Override
    public void g(long j3, bi.r3 r3Var) {
        ww wwVar = this.f45140a;
        if (wwVar.E0 != null) {
            wwVar.J4(false, true);
            wwVar.Q = true;
            wwVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != wwVar.getUserConfig().e()) {
                wwVar.E0.k(j3);
            } else {
                wwVar.E0.S.h1(0, 0);
            }
            wwVar.f51556e0[0].f50782a.getViewTreeObserver().addOnPreDrawListener(new kw(0, this, r3Var));
            return;
        }
        r3Var.run();
    }

    public void h(jg.o0 o0Var) {
        ww wwVar = this.f45140a;
        if (!wwVar.f51616q3) {
            return;
        }
        fw fwVar = wwVar.C0;
        if (fwVar != null) {
            fwVar.C0.remove(o0Var);
            fw fwVar2 = wwVar.C0;
            String obj = wwVar.f51582j0.getSearchField().getText().toString();
            View currentView = fwVar2.getCurrentView();
            boolean z9 = true;
            boolean z10 = !fwVar2.f33601g0;
            if (!TextUtils.isEmpty(fwVar2.M0)) {
                z9 = z10;
            }
            fwVar2.M0 = obj;
            fwVar2.P(currentView, fwVar2.getCurrentPosition(), obj, z9);
        }
        wwVar.j5(true, null, null, false, true);
        wwVar.Y.f3360a.l(wwVar.X.f37824r);
    }

    @Override
    public void i() {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45140a.finishPreviewFragment();
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
    public qm o0() {
        return null;
    }

    @Override
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            this.f45140a.movePreviewFragment(f10);
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
