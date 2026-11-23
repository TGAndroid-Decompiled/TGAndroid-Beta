package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gv implements d50, org.telegram.ui.Components.mg, org.telegram.ui.Components.z4, org.telegram.ui.Components.pm0, org.telegram.ui.Components.tj0, hi.eb, org.telegram.ui.Components.b10 {
    public final bx f48363a;

    public gv(bx bxVar) {
        this.f48363a = bxVar;
    }

    @Override
    public void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        bx bxVar = this.f48363a;
        if (bxVar.E2 != null && !bxVar.K2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < bxVar.K2.size(); i11++) {
                arrayList.add(org.telegram.messenger.sr.a(((Long) bxVar.K2.get(i11)).longValue(), 0L));
            }
            bx bxVar2 = this.f48363a;
            bxVar2.E2.z(bxVar2, arrayList, charSequence, false, z10, i7, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        bx bxVar = this.f48363a;
        ArrayList arrayList = bxVar.K2;
        bxVar.M2 = i7;
        bxVar.N2 = i10;
        bxVar.O2 = false;
        if (bxVar.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.sr.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            bxVar.E2.z(bxVar, arrayList2, bxVar.D1.getFieldText(), false, z10, i7, i10, null);
        }
    }

    @Override
    public int X0() {
        return 0;
    }

    @Override
    public TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public hi.ib a(long j3) {
        fi.p pVar;
        sv svVar = this.f48363a.F0;
        if (svVar != null) {
            pVar = svVar.e(j3);
        } else {
            pVar = null;
        }
        return hi.ib.c(pVar);
    }

    @Override
    public rm a0() {
        return null;
    }

    @Override
    public boolean b1(long j3) {
        return false;
    }

    @Override
    public void c(long j3, bi.e4 e4Var) {
        bx bxVar = this.f48363a;
        if (bxVar.F0 != null) {
            bxVar.R4(false, true);
            bxVar.R = true;
            bxVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != bxVar.getUserConfig().e()) {
                bxVar.F0.k(j3);
            } else {
                bxVar.F0.T.h1(0, 0);
            }
            bxVar.f46549f0[0].f45822a.getViewTreeObserver().addOnPreDrawListener(new ow(0, this, e4Var));
            return;
        }
        e4Var.run();
    }

    @Override
    public void d(e50 e50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.sr.a(-j3, 0L));
        bx bxVar = this.f48363a;
        vw vwVar = bxVar.E2;
        if (bxVar.D2) {
            bxVar.removeSelfFromStack();
        }
        vwVar.z(bxVar, arrayList, null, true, bxVar.L2, bxVar.M2, bxVar.N2, null);
    }

    @Override
    public boolean d1() {
        return false;
    }

    public void e(jg.o0 o0Var) {
        bx bxVar = this.f48363a;
        if (!bxVar.f46615s3) {
            return;
        }
        jw jwVar = bxVar.D0;
        if (jwVar != null) {
            jwVar.D0.remove(o0Var);
            jw jwVar2 = bxVar.D0;
            String obj = bxVar.f46573k0.getSearchField().getText().toString();
            View currentView = jwVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !jwVar2.f40088h0;
            if (!TextUtils.isEmpty(jwVar2.N0)) {
                z10 = z11;
            }
            jwVar2.N0 = obj;
            jwVar2.N(currentView, jwVar2.getCurrentPosition(), obj, z10);
        }
        bxVar.r5(true, null, null, false, true);
        bxVar.Z.f3293a.l(bxVar.Y.f33883r);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            this.f48363a.finishPreviewFragment();
        }
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.g6;
        bx bxVar = this.f48363a;
        if (z10) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.f30775o0) {
                bxVar.h5(g6Var.getDialogId(), view);
                return true;
            }
        }
        jw jwVar = bxVar.D0;
        di.b1 b1Var = jwVar.f40082b0;
        return bxVar.F4(view, i7, f10, jwVar.f40085e0);
    }

    @Override
    public void h() {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            this.f48363a.finishPreviewFragment();
        }
    }

    @Override
    public void i1(CharSequence charSequence, boolean z10, boolean z11) {
        bx bxVar = this.f48363a;
        org.telegram.messenger.g0.h3(new yu(bxVar, 17), 100L);
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            if (z10) {
                if (dp0Var.h) {
                    dp0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.o oVar = bxVar.J2;
            if (oVar != null) {
                org.telegram.messenger.g0.r(oVar);
            }
            org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(12, this, charSequence);
            bxVar.J2 = oVar2;
            org.telegram.messenger.g0.h3(oVar2, 1000L);
        }
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public void l(float f10) {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            this.f48363a.movePreviewFragment(f10);
        }
    }

    @Override
    public boolean l1() {
        return false;
    }

    @Override
    public int n() {
        return 0;
    }

    @Override
    public TLRPC.Peer o() {
        return null;
    }

    @Override
    public void v(float f10) {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            this.f48363a.movePreviewFragment(f10);
        }
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public boolean w0() {
        return true;
    }

    @Override
    public void y(org.telegram.ui.Cells.u2 u2Var) {
        this.f48363a.b5(u2Var);
    }

    @Override
    public void Q(boolean z10) {
    }

    @Override
    public void U0(int i7) {
    }

    @Override
    public void i2(int i7) {
    }

    @Override
    public void n2(boolean z10) {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void u1(CharSequence charSequence) {
    }

    @Override
    public void w(boolean z10) {
    }

    @Override
    public void E() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void N() {
    }

    @Override
    public void V() {
    }

    @Override
    public void b() {
    }

    @Override
    public void f() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void n1() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void t2() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void K(float f10, int i7) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
