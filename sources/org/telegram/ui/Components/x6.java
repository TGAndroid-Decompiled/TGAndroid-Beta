package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class x6 implements Runnable {
    public final int f40243a;
    public final z7 f40244b;
    public final f60 f40245c;
    public final org.telegram.messenger.zi d;

    public x6(z7 z7Var, org.telegram.messenger.zi ziVar, f60 f60Var, int i3) {
        this.f40243a = i3;
        this.f40244b = z7Var;
        this.d = ziVar;
        this.f40245c = f60Var;
    }

    @Override
    public final void run() {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        String a02;
        int i3 = this.f40243a;
        f60 f60Var = this.f40245c;
        org.telegram.messenger.zi ziVar = this.d;
        z7 z7Var = this.f40244b;
        switch (i3) {
            case 0:
                z7Var.getClass();
                f60Var.u();
                z7Var.M0(ziVar);
                return;
            case 1:
                z7Var.getClass();
                f60Var.u();
                z7Var.V0(ziVar);
                return;
            case 2:
                z7Var.R0(ziVar, false, new x6(z7Var, ziVar, f60Var, 5), false);
                return;
            case 3:
                z7Var.getClass();
                f60Var.u();
                z7Var.M0(ziVar);
                return;
            case 4:
                z7Var.getClass();
                f60Var.u();
                z7Var.V0(ziVar);
                return;
            case 5:
                org.telegram.messenger.bp bpVar = z7Var.f40955n2;
                TLRPC.Document a10 = bpVar.a();
                bpVar.f21866c.remove(ziVar);
                if (bpVar.a() != a10) {
                    bpVar.e();
                }
                z7Var.f40957o2.remove(ziVar);
                z7Var.f40962r1.f();
                f60Var.u();
                z7Var.U0(false);
                org.telegram.messenger.k5.o(null, 2131753911, new fc((FrameLayout) z7Var.f28586b, z7Var.J0), 2131624051, 36);
                return;
            case 6:
                z7Var.R0(ziVar, true, new y6(z7Var, f60Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.h10.i(z7Var.f28583a).e();
                int i10 = org.telegram.messenger.h10.f22829t0;
                int i11 = z7Var.f28583a;
                if (i10 != i11) {
                    z7Var.f40975x2.O0(i11);
                }
                if (ziVar.f1() < 0) {
                    if (ziVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) ziVar.F0();
                        k10 = null;
                    }
                    f60Var.u();
                    org.telegram.messenger.k5.o(null, 2131753909, new fc((FrameLayout) z7Var.f28586b, z7Var.J0), 2131624190, 36);
                    return;
                }
                k10 = org.telegram.messenger.k5.k(ziVar);
                tL_document = null;
                if (k10 != null) {
                    org.telegram.messenger.yy.C(z7Var.f28583a).q0(k10, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.yy C = org.telegram.messenger.yy.C(z7Var.f28583a);
                    org.telegram.messenger.wy e11 = org.telegram.messenger.wy.e(tL_document, null, ziVar.f26868k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, z7Var.f40955n2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    fc a03 = fc.a0(Q);
                    if (e10 == org.telegram.messenger.h10.i(z7Var.f28583a).e()) {
                        a02 = org.telegram.messenger.bd.M0(2131750506, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131750505, org.telegram.messenger.m5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131750510, org.telegram.messenger.m5.t(e10));
                    }
                    a03.Q(2131624028, 36, a02).j();
                }
                f60Var.u();
                org.telegram.messenger.k5.o(null, 2131753909, new fc((FrameLayout) z7Var.f28586b, z7Var.J0), 2131624190, 36);
                return;
            default:
                z7Var.Q0(ziVar);
                f60Var.u();
                return;
        }
    }

    public x6(z7 z7Var, f60 f60Var, org.telegram.messenger.zi ziVar, int i3) {
        this.f40243a = i3;
        this.f40244b = z7Var;
        this.f40245c = f60Var;
        this.d = ziVar;
    }
}
