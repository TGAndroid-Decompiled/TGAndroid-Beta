package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class v6 implements Runnable {
    public final int f31149a;
    public final w7 f31150b;
    public final z60 f31151c;
    public final org.telegram.messenger.jj d;

    public v6(w7 w7Var, org.telegram.messenger.jj jjVar, z60 z60Var, int i10) {
        this.f31149a = i10;
        this.f31150b = w7Var;
        this.d = jjVar;
        this.f31151c = z60Var;
    }

    @Override
    public final void run() {
        ArrayList j10;
        TLRPC.TL_document tL_document;
        String a02;
        int i10 = this.f31149a;
        z60 z60Var = this.f31151c;
        org.telegram.messenger.jj jjVar = this.d;
        w7 w7Var = this.f31150b;
        switch (i10) {
            case 0:
                w7Var.getClass();
                z60Var.u();
                w7Var.M0(jjVar);
                return;
            case 1:
                w7Var.getClass();
                z60Var.u();
                w7Var.V0(jjVar);
                return;
            case 2:
                w7Var.R0(jjVar, false, new v6(w7Var, jjVar, z60Var, 5), false);
                return;
            case 3:
                w7Var.getClass();
                z60Var.u();
                w7Var.M0(jjVar);
                return;
            case 4:
                w7Var.getClass();
                z60Var.u();
                w7Var.V0(jjVar);
                return;
            case 5:
                org.telegram.messenger.pp ppVar = w7Var.f32059m2;
                TLRPC.Document a2 = ppVar.a();
                ppVar.f17469c.remove(jjVar);
                if (ppVar.a() != a2) {
                    ppVar.e();
                }
                w7Var.f32061n2.remove(jjVar);
                w7Var.f32066q1.f();
                z60Var.u();
                w7Var.U0(false);
                org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.f21586b, w7Var.I0), 2131624050, 36);
                return;
            case 6:
                w7Var.R0(jjVar, true, new w6(w7Var, z60Var, 4), false);
                return;
            case 7:
                long e = org.telegram.messenger.d20.i(w7Var.f21583a).e();
                int i11 = org.telegram.messenger.d20.f15147s0;
                int i12 = w7Var.f21583a;
                if (i11 != i12) {
                    w7Var.f32079w2.O0(i12);
                }
                if (jjVar.f1() < 0) {
                    if (jjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) jjVar.F0();
                        j10 = null;
                    }
                    z60Var.u();
                    org.telegram.messenger.m5.n(null, 2131753909, new cc((FrameLayout) w7Var.f21586b, w7Var.I0), 2131624188, 36);
                    return;
                }
                j10 = org.telegram.messenger.m5.j(jjVar);
                tL_document = null;
                if (j10 != null) {
                    org.telegram.messenger.qz.C(w7Var.f21583a).q0(j10, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.qz C = org.telegram.messenger.qz.C(w7Var.f21583a);
                    org.telegram.messenger.oz e7 = org.telegram.messenger.oz.e(tL_document, null, jjVar.f16337k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, w7Var.f32059m2, false);
                    e = e;
                    C.r0(e7);
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    cc a03 = cc.a0(Q);
                    if (e == org.telegram.messenger.d20.i(w7Var.f21583a).e()) {
                        a02 = org.telegram.messenger.cd.L0(2131750507, null);
                    } else if (e > 0) {
                        a02 = org.telegram.messenger.cd.a0(null, null, 2131750506, org.telegram.messenger.o5.t(e));
                    } else {
                        a02 = org.telegram.messenger.cd.a0(null, null, 2131750511, org.telegram.messenger.o5.t(e));
                    }
                    a03.Q(2131624027, 36, a02).j();
                }
                z60Var.u();
                org.telegram.messenger.m5.n(null, 2131753909, new cc((FrameLayout) w7Var.f21586b, w7Var.I0), 2131624188, 36);
                return;
            default:
                w7Var.Q0(jjVar);
                z60Var.u();
                return;
        }
    }

    public v6(w7 w7Var, z60 z60Var, org.telegram.messenger.jj jjVar, int i10) {
        this.f31149a = i10;
        this.f31150b = w7Var;
        this.f31151c = z60Var;
        this.d = jjVar;
    }
}
