package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z6 implements Runnable {
    public final int f40916a;
    public final b8 f40917b;
    public final k60 f40918c;
    public final org.telegram.messenger.ij d;

    public z6(b8 b8Var, org.telegram.messenger.ij ijVar, k60 k60Var, int i7) {
        this.f40916a = i7;
        this.f40917b = b8Var;
        this.d = ijVar;
        this.f40918c = k60Var;
    }

    @Override
    public final void run() {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        String a02;
        int i7 = this.f40916a;
        k60 k60Var = this.f40918c;
        org.telegram.messenger.ij ijVar = this.d;
        b8 b8Var = this.f40917b;
        switch (i7) {
            case 0:
                b8Var.getClass();
                k60Var.u();
                b8Var.M0(ijVar);
                return;
            case 1:
                b8Var.getClass();
                k60Var.u();
                b8Var.V0(ijVar);
                return;
            case 2:
                b8Var.R0(ijVar, false, new z6(b8Var, ijVar, k60Var, 5), false);
                return;
            case 3:
                b8Var.getClass();
                k60Var.u();
                b8Var.M0(ijVar);
                return;
            case 4:
                b8Var.getClass();
                k60Var.u();
                b8Var.V0(ijVar);
                return;
            case 5:
                org.telegram.messenger.kp kpVar = b8Var.f32098m2;
                TLRPC.Document a10 = kpVar.a();
                kpVar.f23741c.remove(ijVar);
                if (kpVar.a() != a10) {
                    kpVar.e();
                }
                b8Var.f32099n2.remove(ijVar);
                b8Var.f32104q1.f();
                k60Var.u();
                b8Var.U0(false);
                org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.f28619b, b8Var.I0), 2131624051, 36);
                return;
            case 6:
                b8Var.R0(ijVar, true, new a7(b8Var, k60Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.p10.i(b8Var.f28616a).e();
                int i10 = org.telegram.messenger.p10.f24470s0;
                int i11 = b8Var.f28616a;
                if (i10 != i11) {
                    b8Var.f32117w2.O0(i11);
                }
                if (ijVar.f1() < 0) {
                    if (ijVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) ijVar.F0();
                        k10 = null;
                    }
                    k60Var.u();
                    org.telegram.messenger.k5.o(null, 2131753909, new hc((FrameLayout) b8Var.f28619b, b8Var.I0), 2131624190, 36);
                    return;
                }
                k10 = org.telegram.messenger.k5.k(ijVar);
                tL_document = null;
                if (k10 != null) {
                    org.telegram.messenger.gz.C(b8Var.f28616a).q0(k10, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.gz C = org.telegram.messenger.gz.C(b8Var.f28616a);
                    org.telegram.messenger.ez e11 = org.telegram.messenger.ez.e(tL_document, null, ijVar.f23262k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, b8Var.f32098m2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    hc a03 = hc.a0(Q);
                    if (e10 == org.telegram.messenger.p10.i(b8Var.f28616a).e()) {
                        a02 = org.telegram.messenger.id.M0(2131750499, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131750498, org.telegram.messenger.m5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131750503, org.telegram.messenger.m5.t(e10));
                    }
                    a03.Q(2131624028, 36, a02).j();
                }
                k60Var.u();
                org.telegram.messenger.k5.o(null, 2131753909, new hc((FrameLayout) b8Var.f28619b, b8Var.I0), 2131624190, 36);
                return;
            default:
                b8Var.Q0(ijVar);
                k60Var.u();
                return;
        }
    }

    public z6(b8 b8Var, k60 k60Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f40916a = i7;
        this.f40917b = b8Var;
        this.f40918c = k60Var;
        this.d = ijVar;
    }
}
