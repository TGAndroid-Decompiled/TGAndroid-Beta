package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hw implements a60, org.telegram.ui.Components.sf, org.telegram.ui.Components.q4, org.telegram.ui.Components.dn0, org.telegram.ui.Components.kk0, vh.f8, org.telegram.ui.Components.g10 {
    public final zx f37876a;

    public hw(zx zxVar) {
        this.f37876a = zxVar;
    }

    @Override
    public void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        zx zxVar = this.f37876a;
        if (zxVar.C2 != null && !zxVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < zxVar.I2.size(); i12++) {
                arrayList.add(org.telegram.messenger.hs.a(((Long) zxVar.I2.get(i12)).longValue(), 0L));
            }
            zx zxVar2 = this.f37876a;
            zxVar2.C2.z(zxVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public int H0() {
        return 0;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        zx zxVar = this.f37876a;
        ArrayList arrayList = zxVar.I2;
        zxVar.K2 = i10;
        zxVar.L2 = i11;
        zxVar.M2 = false;
        if (zxVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(org.telegram.messenger.hs.a(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            zxVar.C2.z(zxVar, arrayList2, zxVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }

    @Override
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        this.f37876a.T4(v2Var);
    }

    @Override
    public TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public boolean T0() {
        return false;
    }

    @Override
    public void V0(CharSequence charSequence, boolean z10, boolean z11) {
        zx zxVar = this.f37876a;
        org.telegram.messenger.i0.h3(new dw(zxVar, 12), 100L);
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            if (z10) {
                if (tp0Var.h) {
                    tp0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.u uVar = zxVar.H2;
            if (uVar != null) {
                org.telegram.messenger.i0.r(uVar);
            }
            org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(9, this, charSequence);
            zxVar.H2 = uVar2;
            org.telegram.messenger.i0.h3(uVar2, 1000L);
        }
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            this.f37876a.movePreviewFragment(f7);
        }
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.k6;
        zx zxVar = this.f37876a;
        if (z10) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            if (k6Var.f22138n0) {
                zxVar.Z4(k6Var.getDialogId(), view);
                return true;
            }
        }
        jx jxVar = zxVar.C0;
        ag.b1 b1Var = jxVar.f26869a0;
        return zxVar.A4(view, i10, f7, jxVar.f26872d0);
    }

    @Override
    public kn b0() {
        return null;
    }

    @Override
    public vh.j8 c(long j10) {
        th.l lVar;
        tw twVar = this.f37876a.E0;
        if (twVar != null) {
            lVar = twVar.e(j10);
        } else {
            lVar = null;
        }
        return vh.j8.c(lVar);
    }

    @Override
    public void d(long j10, bi.e eVar) {
        zx zxVar = this.f37876a;
        if (zxVar.E0 != null) {
            zxVar.J4(false, true);
            zxVar.Q = true;
            zxVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != zxVar.getUserConfig().e()) {
                zxVar.E0.k(j10);
            } else {
                zxVar.E0.S.h1(0, 0);
            }
            zxVar.f44137e0[0].f43733a.getViewTreeObserver().addOnPreDrawListener(new mh.f(1, this, eVar));
            return;
        }
        eVar.run();
    }

    @Override
    public void f(b60 b60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.hs.a(-j10, 0L));
        zx zxVar = this.f37876a;
        tx txVar = zxVar.C2;
        if (zxVar.B2) {
            zxVar.removeSelfFromStack();
        }
        txVar.z(zxVar, arrayList, null, true, zxVar.J2, zxVar.K2, zxVar.L2, null);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            this.f37876a.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            this.f37876a.finishPreviewFragment();
        }
    }

    public void h(zf.e0 e0Var) {
        zx zxVar = this.f37876a;
        if (!zxVar.f44199q3) {
            return;
        }
        jx jxVar = zxVar.C0;
        if (jxVar != null) {
            jxVar.C0.remove(e0Var);
            jx jxVar2 = zxVar.C0;
            String obj = zxVar.f44163j0.getSearchField().getText().toString();
            View currentView = jxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !jxVar2.f26875g0;
            if (!TextUtils.isEmpty(jxVar2.M0)) {
                z10 = z11;
            }
            jxVar2.M0 = obj;
            jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj, z10);
        }
        zxVar.j5(true, null, null, false, true);
        zxVar.Y.f46502a.l(zxVar.X.f26635r);
    }

    @Override
    public boolean h1() {
        return false;
    }

    @Override
    public boolean k0() {
        return true;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void p(float f7) {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            this.f37876a.movePreviewFragment(f7);
        }
    }

    @Override
    public int r() {
        return 0;
    }

    @Override
    public TLRPC.Peer u() {
        return null;
    }

    @Override
    public void B(boolean z10) {
    }

    @Override
    public void G0(int i10) {
    }

    @Override
    public void Q1(int i10) {
    }

    @Override
    public void U1(boolean z10) {
    }

    @Override
    public void V(boolean z10) {
    }

    @Override
    public void g1(CharSequence charSequence) {
    }

    @Override
    public void y(float f7) {
    }

    @Override
    public void C() {
    }

    @Override
    public void D() {
    }

    @Override
    public void N() {
    }

    @Override
    public void O1() {
    }

    @Override
    public void T1() {
    }

    @Override
    public void X() {
    }

    @Override
    public void X0() {
    }

    @Override
    public void Y1() {
    }

    @Override
    public void a1() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n0() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void w() {
    }

    @Override
    public void I(float f7, int i10) {
    }

    @Override
    public void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
