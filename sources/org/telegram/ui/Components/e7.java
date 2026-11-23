package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e7 implements Runnable {
    public final int f34681a;
    public final f8 f34682b;
    public final a70 f34683c;
    public final org.telegram.messenger.gj d;

    public e7(f8 f8Var, org.telegram.messenger.gj gjVar, a70 a70Var, int i7) {
        this.f34681a = i7;
        this.f34682b = f8Var;
        this.d = gjVar;
        this.f34683c = a70Var;
    }

    @Override
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        String a02;
        int i10 = this.f34681a;
        a70 a70Var = this.f34683c;
        org.telegram.messenger.gj gjVar = this.d;
        f8 f8Var = this.f34682b;
        switch (i10) {
            case 0:
                f8Var.getClass();
                a70Var.v();
                f8Var.N0(gjVar);
                return;
            case 1:
                f8Var.getClass();
                a70Var.v();
                f8Var.W0(gjVar);
                return;
            case 2:
                f8Var.S0(gjVar, false, new e7(f8Var, gjVar, a70Var, 5), false);
                return;
            case 3:
                f8Var.getClass();
                a70Var.v();
                f8Var.N0(gjVar);
                return;
            case 4:
                f8Var.getClass();
                a70Var.v();
                f8Var.W0(gjVar);
                return;
            case 5:
                org.telegram.messenger.hp hpVar = f8Var.f35105q2;
                TLRPC.Document a10 = hpVar.a();
                hpVar.f24486c.remove(gjVar);
                if (hpVar.a() != a10) {
                    hpVar.e();
                }
                f8Var.f35107r2.remove(gjVar);
                f8Var.f35112u1.f();
                a70Var.v();
                f8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753908, new lc((FrameLayout) f8Var.f30142b, f8Var.J0), 2131624052, 36);
                return;
            case 6:
                f8Var.S0(gjVar, true, new f7(f8Var, a70Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.k10.i(f8Var.f30139a).e();
                int i11 = org.telegram.messenger.k10.f24932t0;
                int i12 = f8Var.f30139a;
                if (i11 != i12) {
                    f8Var.A2.O0(i12);
                }
                if (gjVar.e1() < 0) {
                    if (gjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) gjVar.F0();
                        i7 = null;
                    }
                    a70Var.v();
                    org.telegram.messenger.f3.n(null, 2131753906, new lc((FrameLayout) f8Var.f30142b, f8Var.J0), 2131624191, 36);
                    return;
                }
                i7 = org.telegram.messenger.f3.i(gjVar);
                tL_document = null;
                if (i7 != null) {
                    org.telegram.messenger.az.C(f8Var.f30139a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.az C = org.telegram.messenger.az.C(f8Var.f30139a);
                    org.telegram.messenger.yy e11 = org.telegram.messenger.yy.e(tL_document, null, gjVar.f24177k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, f8Var.f35105q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    lc b02 = lc.b0(Q);
                    if (e10 == org.telegram.messenger.k10.i(f8Var.f30139a).e()) {
                        a02 = org.telegram.messenger.hd.N0(2131750481, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131750480, org.telegram.messenger.n5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131750485, org.telegram.messenger.n5.t(e10));
                    }
                    b02.Q(2131624029, 36, a02).j();
                }
                a70Var.v();
                org.telegram.messenger.f3.n(null, 2131753906, new lc((FrameLayout) f8Var.f30142b, f8Var.J0), 2131624191, 36);
                return;
            default:
                f8Var.R0(gjVar);
                a70Var.v();
                return;
        }
    }

    public e7(f8 f8Var, a70 a70Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f34681a = i7;
        this.f34682b = f8Var;
        this.f34683c = a70Var;
        this.d = gjVar;
    }
}
