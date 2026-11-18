package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class d7 implements Runnable {
    public final int f34289a;
    public final g8 f34290b;
    public final y60 f34291c;
    public final org.telegram.messenger.fj d;

    public d7(g8 g8Var, org.telegram.messenger.fj fjVar, y60 y60Var, int i7) {
        this.f34289a = i7;
        this.f34290b = g8Var;
        this.d = fjVar;
        this.f34291c = y60Var;
    }

    @Override
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        String a02;
        int i10 = this.f34289a;
        y60 y60Var = this.f34291c;
        org.telegram.messenger.fj fjVar = this.d;
        g8 g8Var = this.f34290b;
        switch (i10) {
            case 0:
                g8Var.getClass();
                y60Var.v();
                g8Var.N0(fjVar);
                return;
            case 1:
                g8Var.getClass();
                y60Var.v();
                g8Var.W0(fjVar);
                return;
            case 2:
                g8Var.S0(fjVar, false, new d7(g8Var, fjVar, y60Var, 5), false);
                return;
            case 3:
                g8Var.getClass();
                y60Var.v();
                g8Var.N0(fjVar);
                return;
            case 4:
                g8Var.getClass();
                y60Var.v();
                g8Var.W0(fjVar);
                return;
            case 5:
                org.telegram.messenger.gp gpVar = g8Var.f35405q2;
                TLRPC.Document a10 = gpVar.a();
                gpVar.f24291c.remove(fjVar);
                if (gpVar.a() != a10) {
                    gpVar.e();
                }
                g8Var.f35407r2.remove(fjVar);
                g8Var.f35412u1.f();
                y60Var.v();
                g8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753909, new lc((FrameLayout) g8Var.f30190b, g8Var.J0), 2131624052, 36);
                return;
            case 6:
                g8Var.S0(fjVar, true, new e7(g8Var, y60Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.j10.i(g8Var.f30187a).e();
                int i11 = org.telegram.messenger.j10.f24770t0;
                int i12 = g8Var.f30187a;
                if (i11 != i12) {
                    g8Var.A2.O0(i12);
                }
                if (fjVar.e1() < 0) {
                    if (fjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) fjVar.F0();
                        i7 = null;
                    }
                    y60Var.v();
                    org.telegram.messenger.f3.n(null, 2131753907, new lc((FrameLayout) g8Var.f30190b, g8Var.J0), 2131624191, 36);
                    return;
                }
                i7 = org.telegram.messenger.f3.i(fjVar);
                tL_document = null;
                if (i7 != null) {
                    org.telegram.messenger.zy.C(g8Var.f30187a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(g8Var.f30187a);
                    org.telegram.messenger.xy e11 = org.telegram.messenger.xy.e(tL_document, null, fjVar.f23965k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, g8Var.f35405q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    lc b02 = lc.b0(Q);
                    if (e10 == org.telegram.messenger.j10.i(g8Var.f30187a).e()) {
                        a02 = org.telegram.messenger.gd.M0(2131750482, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131750481, org.telegram.messenger.n5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131750486, org.telegram.messenger.n5.t(e10));
                    }
                    b02.Q(2131624029, 36, a02).j();
                }
                y60Var.v();
                org.telegram.messenger.f3.n(null, 2131753907, new lc((FrameLayout) g8Var.f30190b, g8Var.J0), 2131624191, 36);
                return;
            default:
                g8Var.R0(fjVar);
                y60Var.v();
                return;
        }
    }

    public d7(g8 g8Var, y60 y60Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f34289a = i7;
        this.f34290b = g8Var;
        this.f34291c = y60Var;
        this.d = fjVar;
    }
}
