package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class x6 implements Runnable {
    public final int f41593a;
    public final y7 f41594b;
    public final m60 f41595c;
    public final org.telegram.messenger.gj d;

    public x6(y7 y7Var, org.telegram.messenger.gj gjVar, m60 m60Var, int i7) {
        this.f41593a = i7;
        this.f41594b = y7Var;
        this.d = gjVar;
        this.f41595c = m60Var;
    }

    @Override
    public final void run() {
        ArrayList j3;
        TLRPC.TL_document tL_document;
        String a02;
        int i7 = this.f41593a;
        m60 m60Var = this.f41595c;
        org.telegram.messenger.gj gjVar = this.d;
        y7 y7Var = this.f41594b;
        switch (i7) {
            case 0:
                y7Var.getClass();
                m60Var.u();
                y7Var.M0(gjVar);
                return;
            case 1:
                y7Var.getClass();
                m60Var.u();
                y7Var.V0(gjVar);
                return;
            case 2:
                y7Var.R0(gjVar, false, new x6(y7Var, gjVar, m60Var, 5), false);
                return;
            case 3:
                y7Var.getClass();
                m60Var.u();
                y7Var.M0(gjVar);
                return;
            case 4:
                y7Var.getClass();
                m60Var.u();
                y7Var.V0(gjVar);
                return;
            case 5:
                org.telegram.messenger.hp hpVar = y7Var.f41913q2;
                TLRPC.Document a10 = hpVar.a();
                hpVar.f24202c.remove(gjVar);
                if (hpVar.a() != a10) {
                    hpVar.e();
                }
                y7Var.f41915r2.remove(gjVar);
                y7Var.f41920u1.f();
                m60Var.u();
                y7Var.U0(false);
                org.telegram.messenger.k5.n(null, 2131753911, new cc((FrameLayout) y7Var.f29682b, y7Var.J0), 2131624052, 36);
                return;
            case 6:
                y7Var.R0(gjVar, true, new y6(y7Var, m60Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.m10.i(y7Var.f29679a).e();
                int i10 = org.telegram.messenger.m10.f24934t0;
                int i11 = y7Var.f29679a;
                if (i10 != i11) {
                    y7Var.A2.O0(i11);
                }
                if (gjVar.e1() < 0) {
                    if (gjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) gjVar.F0();
                        j3 = null;
                    }
                    m60Var.u();
                    org.telegram.messenger.k5.n(null, 2131753909, new cc((FrameLayout) y7Var.f29682b, y7Var.J0), 2131624191, 36);
                    return;
                }
                j3 = org.telegram.messenger.k5.j(gjVar);
                tL_document = null;
                if (j3 != null) {
                    org.telegram.messenger.ez.C(y7Var.f29679a).q0(j3, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.ez C = org.telegram.messenger.ez.C(y7Var.f29679a);
                    org.telegram.messenger.cz e11 = org.telegram.messenger.cz.e(tL_document, null, gjVar.f23817k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, y7Var.f41913q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    cc a03 = cc.a0(Q);
                    if (e10 == org.telegram.messenger.m10.i(y7Var.f29679a).e()) {
                        a02 = org.telegram.messenger.hd.M0(2131750498, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131750497, org.telegram.messenger.m5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131750502, org.telegram.messenger.m5.t(e10));
                    }
                    a03.Q(2131624029, 36, a02).j();
                }
                m60Var.u();
                org.telegram.messenger.k5.n(null, 2131753909, new cc((FrameLayout) y7Var.f29682b, y7Var.J0), 2131624191, 36);
                return;
            default:
                y7Var.Q0(gjVar);
                m60Var.u();
                return;
        }
    }

    public x6(y7 y7Var, m60 m60Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f41593a = i7;
        this.f41594b = y7Var;
        this.f41595c = m60Var;
        this.d = gjVar;
    }
}
