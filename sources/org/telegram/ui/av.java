package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class av implements x40, org.telegram.ui.Components.uf, org.telegram.ui.Components.r4, org.telegram.ui.Components.em0, org.telegram.ui.Components.ij0, gi.ma, org.telegram.ui.Components.m00 {
    public final uw f43848a;

    public av(uw uwVar) {
        this.f43848a = uwVar;
    }

    @Override
    public void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        uw uwVar = this.f43848a;
        if (uwVar.D2 != null && !uwVar.J2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < uwVar.J2.size(); i11++) {
                arrayList.add(org.telegram.messenger.pr.a(((Long) uwVar.J2.get(i11)).longValue(), 0L));
            }
            uw uwVar2 = this.f43848a;
            uwVar2.D2.y(uwVar2, arrayList, charSequence, false, z10, i3, i10, null);
        }
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        uw uwVar = this.f43848a;
        ArrayList arrayList = uwVar.J2;
        uwVar.L2 = i3;
        uwVar.M2 = i10;
        uwVar.N2 = false;
        if (uwVar.D2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.pr.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            uwVar.D2.y(uwVar, arrayList2, uwVar.C1.getFieldText(), false, z10, i3, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override
    public int O0() {
        return 0;
    }

    @Override
    public TL_stories.StoryItem R0() {
        return null;
    }

    @Override
    public boolean T0(long j10) {
        return false;
    }

    @Override
    public boolean V0() {
        return false;
    }

    @Override
    public void Y(org.telegram.ui.Cells.t2 t2Var) {
        this.f43848a.T4(t2Var);
    }

    @Override
    public void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        uw uwVar = this.f43848a;
        org.telegram.messenger.g0.i3(new wu(uwVar, 12), 100L);
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            if (z10) {
                if (ro0Var.h) {
                    ro0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.p11 p11Var = uwVar.I2;
            if (p11Var != null) {
                org.telegram.messenger.g0.r(p11Var);
            }
            org.telegram.ui.Components.p11 p11Var2 = new org.telegram.ui.Components.p11(20, this, charSequence);
            uwVar.I2 = p11Var2;
            org.telegram.messenger.g0.i3(p11Var2, 1000L);
        }
    }

    @Override
    public void a(long j10, ci.e3 e3Var) {
        uw uwVar = this.f43848a;
        if (uwVar.F0 != null) {
            uwVar.J4(false, true);
            uwVar.R = true;
            uwVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != uwVar.getUserConfig().e()) {
                uwVar.F0.k(j10);
            } else {
                uwVar.F0.T.h1(0, 0);
            }
            uwVar.f50230f0[0].f49897a.getViewTreeObserver().addOnPreDrawListener(new hw(0, this, e3Var));
            return;
        }
        e3Var.run();
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.f6;
        uw uwVar = this.f43848a;
        if (z10) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.f29195o0) {
                uwVar.Z4(f6Var.getDialogId(), view);
                return true;
            }
        }
        cw cwVar = uwVar.D0;
        ci.j1 j1Var = cwVar.f34748b0;
        return uwVar.A4(view, i3, f10, cwVar.f34751e0);
    }

    @Override
    public gi.qa c(long j10) {
        ei.q qVar;
        mv mvVar = this.f43848a.F0;
        if (mvVar != null) {
            qVar = mvVar.e(j10);
        } else {
            qVar = null;
        }
        return gi.qa.c(qVar);
    }

    @Override
    public void d(y40 y40Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.pr.a(-j10, 0L));
        uw uwVar = this.f43848a;
        nw nwVar = uwVar.D2;
        if (uwVar.C2) {
            uwVar.removeSelfFromStack();
        }
        nwVar.y(uwVar, arrayList, null, true, uwVar.K2, uwVar.L2, uwVar.M2, null);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            this.f43848a.finishPreviewFragment();
        }
    }

    public void g(kg.l0 l0Var) {
        uw uwVar = this.f43848a;
        if (!uwVar.f50290r3) {
            return;
        }
        cw cwVar = uwVar.D0;
        if (cwVar != null) {
            cwVar.D0.remove(l0Var);
            cw cwVar2 = uwVar.D0;
            String obj = uwVar.f50254k0.getSearchField().getText().toString();
            View currentView = cwVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !cwVar2.f34754h0;
            if (!TextUtils.isEmpty(cwVar2.N0)) {
                z10 = z11;
            }
            cwVar2.N0 = obj;
            cwVar2.P(currentView, cwVar2.getCurrentPosition(), obj, z10);
        }
        uwVar.j5(true, null, null, false, true);
        uwVar.Z.f4725a.l(uwVar.Y.f36302r);
    }

    @Override
    public void h() {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            this.f43848a.finishPreviewFragment();
        }
    }

    @Override
    public mm i0() {
        return null;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public void m(float f10) {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            this.f43848a.movePreviewFragment(f10);
        }
    }

    @Override
    public int o() {
        return 0;
    }

    @Override
    public void r(float f10) {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            this.f43848a.movePreviewFragment(f10);
        }
    }

    @Override
    public TLRPC.Peer t() {
        return null;
    }

    @Override
    public boolean u0() {
        return true;
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void M0(int i3) {
    }

    @Override
    public void T1(int i3) {
    }

    @Override
    public void c0(boolean z10) {
    }

    @Override
    public void c2(boolean z10) {
    }

    @Override
    public void j1(CharSequence charSequence) {
    }

    @Override
    public void x(float f10) {
    }

    @Override
    public void E() {
    }

    @Override
    public void F() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void I0() {
    }

    @Override
    public void O1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void b2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void f() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void s1() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void O(float f10, int i3) {
    }

    @Override
    public void h1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
