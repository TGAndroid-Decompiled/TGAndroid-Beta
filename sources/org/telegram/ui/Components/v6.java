package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class v6 implements Runnable {
    public final int f31190a;
    public final w7 f31191b;
    public final z60 f31192c;
    public final org.telegram.messenger.kj d;

    public v6(w7 w7Var, org.telegram.messenger.kj kjVar, z60 z60Var, int i10) {
        this.f31190a = i10;
        this.f31191b = w7Var;
        this.d = kjVar;
        this.f31192c = z60Var;
    }

    @Override
    public final void run() {
        ArrayList j10;
        TLRPC.TL_document tL_document;
        String a02;
        int i10 = this.f31190a;
        z60 z60Var = this.f31192c;
        org.telegram.messenger.kj kjVar = this.d;
        w7 w7Var = this.f31191b;
        switch (i10) {
            case 0:
                w7Var.getClass();
                z60Var.u();
                w7Var.M0(kjVar);
                return;
            case 1:
                w7Var.getClass();
                z60Var.u();
                w7Var.V0(kjVar);
                return;
            case 2:
                w7Var.R0(kjVar, false, new v6(w7Var, kjVar, z60Var, 5), false);
                return;
            case 3:
                w7Var.getClass();
                z60Var.u();
                w7Var.M0(kjVar);
                return;
            case 4:
                w7Var.getClass();
                z60Var.u();
                w7Var.V0(kjVar);
                return;
            case 5:
                org.telegram.messenger.qp qpVar = w7Var.f32107m2;
                TLRPC.Document a2 = qpVar.a();
                qpVar.f17804c.remove(kjVar);
                if (qpVar.a() != a2) {
                    qpVar.e();
                }
                w7Var.f32109n2.remove(kjVar);
                w7Var.f32114q1.f();
                z60Var.u();
                w7Var.U0(false);
                org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.f21587b, w7Var.I0), 2131624050, 36);
                return;
            case 6:
                w7Var.R0(kjVar, true, new w6(w7Var, z60Var, 4), false);
                return;
            case 7:
                long e = org.telegram.messenger.e20.i(w7Var.f21584a).e();
                int i11 = org.telegram.messenger.e20.f15506s0;
                int i12 = w7Var.f21584a;
                if (i11 != i12) {
                    w7Var.f32127w2.O0(i12);
                }
                if (kjVar.f1() < 0) {
                    if (kjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) kjVar.F0();
                        j10 = null;
                    }
                    z60Var.u();
                    org.telegram.messenger.m5.n(null, 2131753909, new cc((FrameLayout) w7Var.f21587b, w7Var.I0), 2131624188, 36);
                    return;
                }
                j10 = org.telegram.messenger.m5.j(kjVar);
                tL_document = null;
                if (j10 != null) {
                    org.telegram.messenger.rz.C(w7Var.f21584a).q0(j10, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.rz C = org.telegram.messenger.rz.C(w7Var.f21584a);
                    org.telegram.messenger.pz e7 = org.telegram.messenger.pz.e(tL_document, null, kjVar.f16690k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, w7Var.f32107m2, false);
                    e = e;
                    C.r0(e7);
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    cc a03 = cc.a0(Q);
                    if (e == org.telegram.messenger.e20.i(w7Var.f21584a).e()) {
                        a02 = org.telegram.messenger.dd.L0(2131750507, null);
                    } else if (e > 0) {
                        a02 = org.telegram.messenger.dd.a0(null, null, 2131750506, org.telegram.messenger.o5.t(e));
                    } else {
                        a02 = org.telegram.messenger.dd.a0(null, null, 2131750511, org.telegram.messenger.o5.t(e));
                    }
                    a03.Q(2131624027, 36, a02).j();
                }
                z60Var.u();
                org.telegram.messenger.m5.n(null, 2131753909, new cc((FrameLayout) w7Var.f21587b, w7Var.I0), 2131624188, 36);
                return;
            default:
                w7Var.Q0(kjVar);
                z60Var.u();
                return;
        }
    }

    public v6(w7 w7Var, z60 z60Var, org.telegram.messenger.kj kjVar, int i10) {
        this.f31190a = i10;
        this.f31191b = w7Var;
        this.f31192c = z60Var;
        this.d = kjVar;
    }
}
