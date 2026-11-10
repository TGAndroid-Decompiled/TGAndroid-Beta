package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gv implements f50, org.telegram.ui.Components.vf, org.telegram.ui.Components.s4, org.telegram.ui.Components.bm0, org.telegram.ui.Components.ej0, fi.ma, org.telegram.ui.Components.q00 {
    public final zw f46162a;

    public gv(zw zwVar) {
        this.f46162a = zwVar;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            this.f46162a.movePreviewFragment(f10);
        }
    }

    @Override
    public void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        zw zwVar = this.f46162a;
        if (zwVar.D2 != null && !zwVar.J2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < zwVar.J2.size(); i11++) {
                arrayList.add(org.telegram.messenger.xr.a(((Long) zwVar.J2.get(i11)).longValue(), 0L));
            }
            zw zwVar2 = this.f46162a;
            zwVar2.D2.y(zwVar2, arrayList, charSequence, false, z9, i7, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        zw zwVar = this.f46162a;
        ArrayList arrayList = zwVar.J2;
        zwVar.L2 = i7;
        zwVar.M2 = i10;
        zwVar.N2 = false;
        if (zwVar.D2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            zwVar.D2.y(zwVar, arrayList2, zwVar.C1.getFieldText(), false, z9, i7, i10, null);
        }
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        this.f46162a.T4(t2Var);
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
        zw zwVar = this.f46162a;
        org.telegram.messenger.g0.i3(new cv(zwVar, 12), 100L);
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            if (z9) {
                if (po0Var.h) {
                    po0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.h41 h41Var = zwVar.I2;
            if (h41Var != null) {
                org.telegram.messenger.g0.r(h41Var);
            }
            org.telegram.ui.Components.h41 h41Var2 = new org.telegram.ui.Components.h41(16, this, charSequence);
            zwVar.I2 = h41Var2;
            org.telegram.messenger.g0.i3(h41Var2, 1000L);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public fi.qa d(long j3) {
        di.p pVar;
        sv svVar = this.f46162a.E0;
        if (svVar != null) {
            pVar = svVar.e(j3);
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
    public void e(g50 g50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.xr.a(-j3, 0L));
        zw zwVar = this.f46162a;
        tw twVar = zwVar.D2;
        if (zwVar.C2) {
            zwVar.removeSelfFromStack();
        }
        twVar.y(zwVar, arrayList, null, true, zwVar.K2, zwVar.L2, zwVar.M2, null);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.g6;
        zw zwVar = this.f46162a;
        if (z9) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.f29176n0) {
                zwVar.Z4(g6Var.getDialogId(), view);
                return true;
            }
        }
        iw iwVar = zwVar.C0;
        bi.q1 q1Var = iwVar.f33587a0;
        return zwVar.A4(view, i7, f10, iwVar.f33590d0);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            this.f46162a.finishPreviewFragment();
        }
    }

    @Override
    public void g(long j3, bi.r3 r3Var) {
        zw zwVar = this.f46162a;
        if (zwVar.E0 != null) {
            zwVar.J4(false, true);
            zwVar.Q = true;
            zwVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != zwVar.getUserConfig().e()) {
                zwVar.E0.k(j3);
            } else {
                zwVar.E0.S.h1(0, 0);
            }
            zwVar.f52577e0[0].f52125a.getViewTreeObserver().addOnPreDrawListener(new nw(0, this, r3Var));
            return;
        }
        r3Var.run();
    }

    public void h(jg.o0 o0Var) {
        zw zwVar = this.f46162a;
        if (!zwVar.f52643r3) {
            return;
        }
        iw iwVar = zwVar.C0;
        if (iwVar != null) {
            iwVar.C0.remove(o0Var);
            iw iwVar2 = zwVar.C0;
            String obj = zwVar.f52603j0.getSearchField().getText().toString();
            View currentView = iwVar2.getCurrentView();
            boolean z9 = true;
            boolean z10 = !iwVar2.f33593g0;
            if (!TextUtils.isEmpty(iwVar2.M0)) {
                z9 = z10;
            }
            iwVar2.M0 = obj;
            iwVar2.P(currentView, iwVar2.getCurrentPosition(), obj, z9);
        }
        zwVar.j5(true, null, null, false, true);
        zwVar.Y.f3360a.l(zwVar.X.f37446r);
    }

    @Override
    public void i() {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            this.f46162a.finishPreviewFragment();
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
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            this.f46162a.movePreviewFragment(f10);
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
