package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class iw implements b60, org.telegram.ui.Components.sf, org.telegram.ui.Components.q4, org.telegram.ui.Components.cn0, org.telegram.ui.Components.jk0, vh.f8, org.telegram.ui.Components.g10 {
    public final ay f38358a;

    public iw(ay ayVar) {
        this.f38358a = ayVar;
    }

    @Override
    public void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ay ayVar = this.f38358a;
        if (ayVar.C2 != null && !ayVar.I2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < ayVar.I2.size(); i12++) {
                arrayList.add(org.telegram.messenger.gs.a(((Long) ayVar.I2.get(i12)).longValue(), 0L));
            }
            ay ayVar2 = this.f38358a;
            ayVar2.C2.y(ayVar2, arrayList, charSequence, false, z10, i10, i11, null);
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
        ay ayVar = this.f38358a;
        ArrayList arrayList = ayVar.I2;
        ayVar.K2 = i10;
        ayVar.L2 = i11;
        ayVar.M2 = false;
        if (ayVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(org.telegram.messenger.gs.a(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            ayVar.C2.y(ayVar, arrayList2, ayVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }

    @Override
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        this.f38358a.S4(v2Var);
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
        ay ayVar = this.f38358a;
        org.telegram.messenger.i0.h3(new ew(ayVar, 12), 100L);
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            if (z10) {
                if (sp0Var.h) {
                    sp0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            xs xsVar = ayVar.H2;
            if (xsVar != null) {
                org.telegram.messenger.i0.r(xsVar);
            }
            xs xsVar2 = new xs(8, this, charSequence);
            ayVar.H2 = xsVar2;
            org.telegram.messenger.i0.h3(xsVar2, 1000L);
        }
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            this.f38358a.movePreviewFragment(f7);
        }
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.k6;
        ay ayVar = this.f38358a;
        if (z10) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            if (k6Var.f22137n0) {
                ayVar.Y4(k6Var.getDialogId(), view);
                return true;
            }
        }
        kx kxVar = ayVar.C0;
        ag.b1 b1Var = kxVar.f26448a0;
        return ayVar.z4(view, i10, f7, kxVar.f26451d0);
    }

    @Override
    public kn b0() {
        return null;
    }

    @Override
    public vh.j8 c(long j10) {
        th.l lVar;
        uw uwVar = this.f38358a.E0;
        if (uwVar != null) {
            lVar = uwVar.e(j10);
        } else {
            lVar = null;
        }
        return vh.j8.c(lVar);
    }

    @Override
    public void d(long j10, bi.e eVar) {
        ay ayVar = this.f38358a;
        if (ayVar.E0 != null) {
            ayVar.I4(false, true);
            ayVar.Q = true;
            ayVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != ayVar.getUserConfig().e()) {
                ayVar.E0.k(j10);
            } else {
                ayVar.E0.S.h1(0, 0);
            }
            ayVar.f35794e0[0].f44239a.getViewTreeObserver().addOnPreDrawListener(new mh.f(1, this, eVar));
            return;
        }
        eVar.run();
    }

    @Override
    public void f(c60 c60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.gs.a(-j10, 0L));
        ay ayVar = this.f38358a;
        ux uxVar = ayVar.C2;
        if (ayVar.B2) {
            ayVar.removeSelfFromStack();
        }
        uxVar.y(ayVar, arrayList, null, true, ayVar.J2, ayVar.K2, ayVar.L2, null);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            this.f38358a.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            this.f38358a.finishPreviewFragment();
        }
    }

    public void h(zf.e0 e0Var) {
        ay ayVar = this.f38358a;
        if (!ayVar.f35856q3) {
            return;
        }
        kx kxVar = ayVar.C0;
        if (kxVar != null) {
            kxVar.C0.remove(e0Var);
            kx kxVar2 = ayVar.C0;
            String obj = ayVar.f35820j0.getSearchField().getText().toString();
            View currentView = kxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !kxVar2.f26454g0;
            if (!TextUtils.isEmpty(kxVar2.M0)) {
                z10 = z11;
            }
            kxVar2.M0 = obj;
            kxVar2.P(currentView, kxVar2.getCurrentPosition(), obj, z10);
        }
        ayVar.i5(true, null, null, false, true);
        ayVar.Y.f46491a.l(ayVar.X.f26588r);
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
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            this.f38358a.movePreviewFragment(f7);
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
