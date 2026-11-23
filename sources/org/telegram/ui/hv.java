package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hv implements e50, org.telegram.ui.Components.ng, org.telegram.ui.Components.a5, org.telegram.ui.Components.qm0, org.telegram.ui.Components.tj0, hi.ja, org.telegram.ui.Components.d10 {
    public final cx f48533a;

    public hv(cx cxVar) {
        this.f48533a = cxVar;
    }

    @Override
    public boolean E0() {
        return true;
    }

    @Override
    public void F(org.telegram.ui.Cells.u2 u2Var) {
        this.f48533a.b5(u2Var);
    }

    @Override
    public void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        cx cxVar = this.f48533a;
        if (cxVar.E2 != null && !cxVar.K2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < cxVar.K2.size(); i11++) {
                arrayList.add(org.telegram.messenger.tr.a(((Long) cxVar.K2.get(i11)).longValue(), 0L));
            }
            cx cxVar2 = this.f48533a;
            cxVar2.E2.y(cxVar2, arrayList, charSequence, false, z10, i7, i10, null);
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        cx cxVar = this.f48533a;
        ArrayList arrayList = cxVar.K2;
        cxVar.M2 = i7;
        cxVar.N2 = i10;
        cxVar.O2 = false;
        if (cxVar.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(org.telegram.messenger.tr.a(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            cxVar.E2.y(cxVar, arrayList2, cxVar.D1.getFieldText(), false, z10, i7, i10, null);
        }
    }

    @Override
    public hi.na a(long j3) {
        fi.p pVar;
        tv tvVar = this.f48533a.F0;
        if (tvVar != null) {
            pVar = tvVar.e(j3);
        } else {
            pVar = null;
        }
        return hi.na.c(pVar);
    }

    @Override
    public void b(long j3, bi.c4 c4Var) {
        cx cxVar = this.f48533a;
        if (cxVar.F0 != null) {
            cxVar.R4(false, true);
            cxVar.R = true;
            cxVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != cxVar.getUserConfig().e()) {
                cxVar.F0.k(j3);
            } else {
                cxVar.F0.T.h1(0, 0);
            }
            cxVar.f46722f0[0].f46325a.getViewTreeObserver().addOnPreDrawListener(new pw(0, this, c4Var));
            return;
        }
        c4Var.run();
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public void c(f50 f50Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(org.telegram.messenger.tr.a(-j3, 0L));
        cx cxVar = this.f48533a;
        ww wwVar = cxVar.E2;
        if (cxVar.D2) {
            cxVar.removeSelfFromStack();
        }
        wwVar.y(cxVar, arrayList, null, true, cxVar.L2, cxVar.M2, cxVar.N2, null);
    }

    @Override
    public TL_stories.StoryItem c1() {
        return null;
    }

    public void e(jg.o0 o0Var) {
        cx cxVar = this.f48533a;
        if (!cxVar.f46788s3) {
            return;
        }
        kw kwVar = cxVar.D0;
        if (kwVar != null) {
            kwVar.D0.remove(o0Var);
            kw kwVar2 = cxVar.D0;
            String obj = cxVar.f46746k0.getSearchField().getText().toString();
            View currentView = kwVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !kwVar2.f40505h0;
            if (!TextUtils.isEmpty(kwVar2.N0)) {
                z10 = z11;
            }
            kwVar2.N0 = obj;
            kwVar2.L(currentView, kwVar2.getCurrentPosition(), obj, z10);
        }
        cxVar.r5(true, null, null, false, true);
        cxVar.Z.f3342a.l(cxVar.Y.f34642r);
    }

    @Override
    public boolean e1(long j3) {
        return false;
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        cx cxVar = this.f48533a;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f30749o0) {
                cxVar.h5(h6Var.getDialogId(), view);
                return true;
            }
        }
        kw kwVar = cxVar.D0;
        di.b1 b1Var = kwVar.f40499b0;
        return cxVar.F4(view, i7, f10, kwVar.f40502e0);
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            this.f48533a.finishPreviewFragment();
        }
    }

    @Override
    public boolean g1() {
        return false;
    }

    @Override
    public void j() {
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            this.f48533a.finishPreviewFragment();
        }
    }

    @Override
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
        cx cxVar = this.f48533a;
        org.telegram.messenger.g0.h3(new zu(cxVar, 17), 100L);
        org.telegram.ui.Components.ep0 ep0Var = cxVar.I2;
        if (ep0Var != null) {
            if (z10) {
                if (ep0Var.h) {
                    ep0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            ss ssVar = cxVar.J2;
            if (ssVar != null) {
                org.telegram.messenger.g0.r(ssVar);
            }
            ss ssVar2 = new ss(8, this, charSequence);
            cxVar.J2 = ssVar2;
            org.telegram.messenger.g0.h3(ssVar2, 1000L);
        }
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public rm m0() {
        return null;
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
    public void o(float f10) {
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            this.f48533a.movePreviewFragment(f10);
        }
    }

    @Override
    public void r(float f10) {
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            this.f48533a.movePreviewFragment(f10);
        }
    }

    @Override
    public TLRPC.Peer t() {
        return null;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void a0(boolean z10) {
    }

    @Override
    public void a1(int i7) {
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
    public void x(float f10) {
    }

    @Override
    public void B2() {
    }

    @Override
    public void D() {
    }

    @Override
    public void G() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void V() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void d() {
    }

    @Override
    public void g() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void l1() {
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
    public void u() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void Q(float f10, int i7) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
