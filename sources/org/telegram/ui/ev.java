package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ev implements b50, org.telegram.ui.Components.cg, org.telegram.ui.Components.r4, org.telegram.ui.Components.fm0, org.telegram.ui.Components.jj0, hi.ja, org.telegram.ui.Components.u00 {
    public final yw f46925a;

    public ev(yw ywVar) {
        this.f46925a = ywVar;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            this.f46925a.movePreviewFragment(f10);
        }
    }

    @Override
    public void D(org.telegram.ui.Cells.t2 t2Var) {
        this.f46925a.T4(t2Var);
    }

    @Override
    public boolean E0() {
        return true;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        yw ywVar = this.f46925a;
        ArrayList arrayList = ywVar.K2;
        ywVar.M2 = i7;
        ywVar.N2 = i10;
        ywVar.O2 = false;
        if (ywVar.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.ur.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            ywVar.E2.y(ywVar, arrayList2, ywVar.D1.getFieldText(), false, z10, i7, i10, null);
        }
    }

    @Override
    public void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        yw ywVar = this.f46925a;
        if (ywVar.E2 != null && !ywVar.K2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ywVar.K2.size(); i11++) {
                arrayList.add(org.telegram.messenger.ur.a(((Long) ywVar.K2.get(i11)).longValue(), 0L));
            }
            yw ywVar2 = this.f46925a;
            ywVar2.E2.y(ywVar2, arrayList, charSequence, false, z10, i7, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override
    public hi.na a(long j3) {
        fi.p pVar;
        qv qvVar = this.f46925a.F0;
        if (qvVar != null) {
            pVar = qvVar.e(j3);
        } else {
            pVar = null;
        }
        return hi.na.c(pVar);
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public void c(c50 c50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.ur.a(-j3, 0L));
        yw ywVar = this.f46925a;
        sw swVar = ywVar.E2;
        if (ywVar.D2) {
            ywVar.removeSelfFromStack();
        }
        swVar.y(ywVar, arrayList, null, true, ywVar.L2, ywVar.M2, ywVar.N2, null);
    }

    @Override
    public TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public void e(long j3, di.x2 x2Var) {
        yw ywVar = this.f46925a;
        if (ywVar.F0 != null) {
            ywVar.J4(false, true);
            ywVar.R = true;
            ywVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != ywVar.getUserConfig().e()) {
                ywVar.F0.k(j3);
            } else {
                ywVar.F0.T.h1(0, 0);
            }
            ywVar.f53673f0[0].f53331a.getViewTreeObserver().addOnPreDrawListener(new mw(0, this, x2Var));
            return;
        }
        x2Var.run();
    }

    @Override
    public boolean e1(long j3) {
        return false;
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.f6;
        yw ywVar = this.f46925a;
        if (z10) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.f30254o0) {
                ywVar.Z4(f6Var.getDialogId(), view);
                return true;
            }
        }
        hw hwVar = ywVar.D0;
        di.c1 c1Var = hwVar.f36047b0;
        return ywVar.A4(view, i7, f10, hwVar.f36050e0);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            this.f46925a.finishPreviewFragment();
        }
    }

    public void g(jg.o0 o0Var) {
        yw ywVar = this.f46925a;
        if (!ywVar.f53739s3) {
            return;
        }
        hw hwVar = ywVar.D0;
        if (hwVar != null) {
            hwVar.D0.remove(o0Var);
            hw hwVar2 = ywVar.D0;
            String obj = ywVar.f53697k0.getSearchField().getText().toString();
            View currentView = hwVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !hwVar2.f36053h0;
            if (!TextUtils.isEmpty(hwVar2.N0)) {
                z10 = z11;
            }
            hwVar2.N0 = obj;
            hwVar2.O(currentView, hwVar2.getCurrentPosition(), obj, z10);
        }
        ywVar.j5(true, null, null, false, true);
        ywVar.Z.f3312a.l(ywVar.Y.f40202r);
    }

    @Override
    public boolean g1() {
        return false;
    }

    @Override
    public void i() {
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            this.f46925a.finishPreviewFragment();
        }
    }

    @Override
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
        yw ywVar = this.f46925a;
        org.telegram.messenger.g0.i3(new av(ywVar, 12), 100L);
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            if (z10) {
                if (to0Var.h) {
                    to0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.u uVar = ywVar.J2;
            if (uVar != null) {
                org.telegram.messenger.g0.r(uVar);
            }
            org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(11, this, charSequence);
            ywVar.J2 = uVar2;
            org.telegram.messenger.g0.i3(uVar2, 1000L);
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m1() {
        return false;
    }

    @Override
    public int n() {
        return 0;
    }

    @Override
    public qm p0() {
        return null;
    }

    @Override
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            this.f46925a.movePreviewFragment(f10);
        }
    }

    @Override
    public TLRPC.Peer s() {
        return null;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void a1(int i7) {
    }

    @Override
    public void b0(boolean z10) {
    }

    @Override
    public void k2(int i7) {
    }

    @Override
    public void n2(boolean z10) {
    }

    @Override
    public void u1(CharSequence charSequence) {
    }

    @Override
    public void y(float f10) {
    }

    @Override
    public void B2() {
    }

    @Override
    public void E() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void I() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void Y() {
    }

    @Override
    public void b() {
    }

    @Override
    public void d() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m0() {
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
    public void r2() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void v() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void W(float f10, int i7) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
