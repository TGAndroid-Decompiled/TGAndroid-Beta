package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class d7 implements Runnable {
    public final int f34226a;
    public final e8 f34227b;
    public final x60 f34228c;
    public final org.telegram.messenger.fj d;

    public d7(e8 e8Var, org.telegram.messenger.fj fjVar, x60 x60Var, int i7) {
        this.f34226a = i7;
        this.f34227b = e8Var;
        this.d = fjVar;
        this.f34228c = x60Var;
    }

    @Override
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        String a02;
        int i10 = this.f34226a;
        x60 x60Var = this.f34228c;
        org.telegram.messenger.fj fjVar = this.d;
        e8 e8Var = this.f34227b;
        switch (i10) {
            case 0:
                e8Var.getClass();
                x60Var.v();
                e8Var.N0(fjVar);
                return;
            case 1:
                e8Var.getClass();
                x60Var.v();
                e8Var.W0(fjVar);
                return;
            case 2:
                e8Var.S0(fjVar, false, new d7(e8Var, fjVar, x60Var, 5), false);
                return;
            case 3:
                e8Var.getClass();
                x60Var.v();
                e8Var.N0(fjVar);
                return;
            case 4:
                e8Var.getClass();
                x60Var.v();
                e8Var.W0(fjVar);
                return;
            case 5:
                org.telegram.messenger.gp gpVar = e8Var.f34611q2;
                TLRPC.Document a10 = gpVar.a();
                gpVar.f24392c.remove(fjVar);
                if (gpVar.a() != a10) {
                    gpVar.e();
                }
                e8Var.f34613r2.remove(fjVar);
                e8Var.f34618u1.f();
                x60Var.v();
                e8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753908, new kc((FrameLayout) e8Var.f30226b, e8Var.J0), 2131624052, 36);
                return;
            case 6:
                e8Var.S0(fjVar, true, new e7(e8Var, x60Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.i10.i(e8Var.f30223a).e();
                int i11 = org.telegram.messenger.i10.f24637t0;
                int i12 = e8Var.f30223a;
                if (i11 != i12) {
                    e8Var.A2.O0(i12);
                }
                if (fjVar.e1() < 0) {
                    if (fjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) fjVar.F0();
                        i7 = null;
                    }
                    x60Var.v();
                    org.telegram.messenger.f3.n(null, 2131753906, new kc((FrameLayout) e8Var.f30226b, e8Var.J0), 2131624191, 36);
                    return;
                }
                i7 = org.telegram.messenger.f3.i(fjVar);
                tL_document = null;
                if (i7 != null) {
                    org.telegram.messenger.zy.C(e8Var.f30223a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(e8Var.f30223a);
                    org.telegram.messenger.xy e11 = org.telegram.messenger.xy.e(tL_document, null, fjVar.f24073k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, e8Var.f34611q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    kc b02 = kc.b0(Q);
                    if (e10 == org.telegram.messenger.i10.i(e8Var.f30223a).e()) {
                        a02 = org.telegram.messenger.gd.N0(2131750481, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131750480, org.telegram.messenger.n5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131750485, org.telegram.messenger.n5.t(e10));
                    }
                    b02.Q(2131624029, 36, a02).j();
                }
                x60Var.v();
                org.telegram.messenger.f3.n(null, 2131753906, new kc((FrameLayout) e8Var.f30226b, e8Var.J0), 2131624191, 36);
                return;
            default:
                e8Var.R0(fjVar);
                x60Var.v();
                return;
        }
    }

    public d7(e8 e8Var, x60 x60Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f34226a = i7;
        this.f34227b = e8Var;
        this.f34228c = x60Var;
        this.d = fjVar;
    }
}
