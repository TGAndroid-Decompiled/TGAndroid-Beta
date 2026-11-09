package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z6 implements Runnable {
    public final int f40915a;
    public final b8 f40916b;
    public final l60 f40917c;
    public final org.telegram.messenger.ij d;

    public z6(b8 b8Var, org.telegram.messenger.ij ijVar, l60 l60Var, int i7) {
        this.f40915a = i7;
        this.f40916b = b8Var;
        this.d = ijVar;
        this.f40917c = l60Var;
    }

    @Override
    public final void run() {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        String a02;
        int i7 = this.f40915a;
        l60 l60Var = this.f40917c;
        org.telegram.messenger.ij ijVar = this.d;
        b8 b8Var = this.f40916b;
        switch (i7) {
            case 0:
                b8Var.getClass();
                l60Var.u();
                b8Var.M0(ijVar);
                return;
            case 1:
                b8Var.getClass();
                l60Var.u();
                b8Var.V0(ijVar);
                return;
            case 2:
                b8Var.R0(ijVar, false, new z6(b8Var, ijVar, l60Var, 5), false);
                return;
            case 3:
                b8Var.getClass();
                l60Var.u();
                b8Var.M0(ijVar);
                return;
            case 4:
                b8Var.getClass();
                l60Var.u();
                b8Var.V0(ijVar);
                return;
            case 5:
                org.telegram.messenger.kp kpVar = b8Var.f32140m2;
                TLRPC.Document a10 = kpVar.a();
                kpVar.f23741c.remove(ijVar);
                if (kpVar.a() != a10) {
                    kpVar.e();
                }
                b8Var.f32141n2.remove(ijVar);
                b8Var.f32146q1.f();
                l60Var.u();
                b8Var.U0(false);
                org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.f28624b, b8Var.I0), 2131624051, 36);
                return;
            case 6:
                b8Var.R0(ijVar, true, new a7(b8Var, l60Var, 4), false);
                return;
            case 7:
                long e10 = org.telegram.messenger.p10.i(b8Var.f28621a).e();
                int i10 = org.telegram.messenger.p10.f24470s0;
                int i11 = b8Var.f28621a;
                if (i10 != i11) {
                    b8Var.f32159w2.O0(i11);
                }
                if (ijVar.e1() < 0) {
                    if (ijVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) ijVar.F0();
                        k10 = null;
                    }
                    l60Var.u();
                    org.telegram.messenger.k5.o(null, 2131753909, new hc((FrameLayout) b8Var.f28624b, b8Var.I0), 2131624190, 36);
                    return;
                }
                k10 = org.telegram.messenger.k5.k(ijVar);
                tL_document = null;
                if (k10 != null) {
                    org.telegram.messenger.gz.C(b8Var.f28621a).q0(k10, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.gz C = org.telegram.messenger.gz.C(b8Var.f28621a);
                    org.telegram.messenger.ez e11 = org.telegram.messenger.ez.e(tL_document, null, ijVar.f23262k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, b8Var.f32140m2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    hc a03 = hc.a0(Q);
                    if (e10 == org.telegram.messenger.p10.i(b8Var.f28621a).e()) {
                        a02 = org.telegram.messenger.id.M0(2131750498, null);
                    } else if (e10 > 0) {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131750497, org.telegram.messenger.m5.t(e10));
                    } else {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131750502, org.telegram.messenger.m5.t(e10));
                    }
                    a03.Q(2131624028, 36, a02).j();
                }
                l60Var.u();
                org.telegram.messenger.k5.o(null, 2131753909, new hc((FrameLayout) b8Var.f28624b, b8Var.I0), 2131624190, 36);
                return;
            default:
                b8Var.Q0(ijVar);
                l60Var.u();
                return;
        }
    }

    public z6(b8 b8Var, l60 l60Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f40915a = i7;
        this.f40916b = b8Var;
        this.f40917c = l60Var;
        this.d = ijVar;
    }
}
