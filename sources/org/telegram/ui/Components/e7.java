package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e7 implements Runnable {
    public final int f34693a;
    public final f8 f34694b;
    public final a70 f34695c;
    public final org.telegram.messenger.fj d;

    public e7(f8 f8Var, org.telegram.messenger.fj fjVar, a70 a70Var, int i7) {
        this.f34693a = i7;
        this.f34694b = f8Var;
        this.d = fjVar;
        this.f34695c = a70Var;
    }

    @Override
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        String a02;
        int i10 = this.f34693a;
        a70 a70Var = this.f34695c;
        org.telegram.messenger.fj fjVar = this.d;
        f8 f8Var = this.f34694b;
        switch (i10) {
            case 0:
                f8Var.getClass();
                a70Var.v();
                f8Var.N0(fjVar);
                return;
            case 1:
                f8Var.getClass();
                a70Var.v();
                f8Var.W0(fjVar);
                return;
            case 2:
                f8Var.S0(fjVar, false, new e7(f8Var, fjVar, a70Var, 5), false);
                return;
            case 3:
                f8Var.getClass();
                a70Var.v();
                f8Var.N0(fjVar);
                return;
            case 4:
                f8Var.getClass();
                a70Var.v();
                f8Var.W0(fjVar);
                return;
            case 5:
                org.telegram.messenger.gp gpVar = f8Var.f35128q2;
                TLRPC.Document a10 = gpVar.a();
                gpVar.f24319c.remove(fjVar);
                if (gpVar.a() != a10) {
                    gpVar.e();
                }
                f8Var.f35130r2.remove(fjVar);
                f8Var.f35135u1.f();
                a70Var.v();
                f8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753908, new lc((FrameLayout) f8Var.f30173b, f8Var.J0), 2131624052, 36);
                return;
            case 6:
                f8Var.S0(fjVar, true, new f7(f8Var, a70Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.j10.i(f8Var.f30170a).e();
                int i11 = org.telegram.messenger.j10.f24798t0;
                int i12 = f8Var.f30170a;
                if (i11 != i12) {
                    f8Var.A2.O0(i12);
                }
                if (fjVar.e1() < 0) {
                    if (fjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) fjVar.F0();
                        i7 = null;
                    }
                    a70Var.v();
                    org.telegram.messenger.f3.n(null, 2131753906, new lc((FrameLayout) f8Var.f30173b, f8Var.J0), 2131624191, 36);
                    return;
                }
                i7 = org.telegram.messenger.f3.i(fjVar);
                tL_document = null;
                if (i7 != null) {
                    org.telegram.messenger.zy.C(f8Var.f30170a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(f8Var.f30170a);
                    org.telegram.messenger.xy e11 = org.telegram.messenger.xy.e(tL_document, null, fjVar.f23993k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, f8Var.f35128q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    lc b02 = lc.b0(Q);
                    if (e10 == org.telegram.messenger.j10.i(f8Var.f30170a).e()) {
                        a02 = org.telegram.messenger.gd.N0(2131750481, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131750480, org.telegram.messenger.n5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131750485, org.telegram.messenger.n5.t(e10));
                    }
                    b02.Q(2131624029, 36, a02).j();
                }
                a70Var.v();
                org.telegram.messenger.f3.n(null, 2131753906, new lc((FrameLayout) f8Var.f30173b, f8Var.J0), 2131624191, 36);
                return;
            default:
                f8Var.R0(fjVar);
                a70Var.v();
                return;
        }
    }

    public e7(f8 f8Var, a70 a70Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f34693a = i7;
        this.f34694b = f8Var;
        this.f34695c = a70Var;
        this.d = fjVar;
    }
}
