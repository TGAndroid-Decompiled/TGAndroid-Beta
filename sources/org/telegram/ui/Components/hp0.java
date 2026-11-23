package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class hp0 implements Runnable {
    public final int f35947a;
    public final jt0 f35948b;

    public hp0(jt0 jt0Var, int i7) {
        this.f35947a = i7;
        this.f35948b = jt0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35947a;
        jt0 jt0Var = this.f35948b;
        switch (i7) {
            case 0:
                jt0Var.w0();
                return;
            case 1:
                jt0Var.f36658p2 = (int) jt0Var.S0.d(jt0.f36607v2);
                jt0Var.G();
                if (jt0Var.f36614b0 != null) {
                    jt0Var.H1();
                }
                ds0[] ds0VarArr = jt0Var.f36651n0;
                if (ds0VarArr != null) {
                    for (ds0 ds0Var : ds0VarArr) {
                        if (ds0Var != null) {
                            int paddingTop = ds0Var.h.getPaddingTop();
                            nq0 nq0Var = ds0Var.h;
                            int paddingLeft = nq0Var.getPaddingLeft();
                            int j02 = jt0Var.j0(ds0Var.F);
                            int paddingRight = ds0Var.h.getPaddingRight();
                            nq0 nq0Var2 = ds0Var.h;
                            int i02 = jt0Var.i0(jt0Var.I0());
                            nq0Var2.f34296i3 = i02;
                            nq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(ds0Var.h, new qp0(ds0Var, paddingTop - ds0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                c5.P(jt0Var.getContext(), jt0Var.f36684y1, jt0Var.I1, new jp0(jt0Var));
                return;
            case 3:
                jt0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -jt0Var.f36632g1.f28435id);
                k90 k90Var = new k90(bundle, null);
                k90Var.f36865c = jt0Var.f36632g1;
                jt0Var.f36684y1.presentFragment(k90Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36684y1;
                hi.sa D = hi.sa.D(g2Var.getParentActivity(), g2Var.getCurrentAccount());
                long j3 = jt0Var.f36648m1;
                String currentLang = jt0Var.f36610a0.getCurrentLang();
                D.f15455w0 = j3;
                D.f15459x0 = currentLang;
                D.Q(null);
                D.f15455w0 = j3;
                D.f15459x0 = currentLang;
                return;
            case 5:
                jt0Var.f36610a0.f();
                return;
            case 6:
                fq0 fq0Var = jt0Var.f36610a0;
                if (fq0Var.d()) {
                    fq0Var.h();
                    return;
                } else {
                    fq0Var.f();
                    return;
                }
            case 7:
                fq0 fq0Var2 = jt0Var.f36610a0;
                fq0Var2.b(fq0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var.f36684y1;
                g2Var2.getMessagesController().Z4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", g2Var2.getUserConfig().e());
                g2Var2.presentFragment(new org.telegram.ui.bn(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var.f36684y1;
                try {
                    org.telegram.messenger.si mediaDataController = g2Var3.getMediaDataController();
                    long e10 = g2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.si.U1;
                    mediaDataController.A0(e10, 0, null);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var.f36684y1;
                TLRPC.User f10 = g2Var4.getUserConfig().f();
                c5.r(g2Var4, false, null, f10, false, true, false, true, new h2(20, jt0Var, f10));
                return;
            case 11:
                gq0 gq0Var = jt0Var.f36614b0;
                gq0Var.getClass();
                gq0Var.h(null, new bi.k5(gq0Var, 1));
                return;
            case 12:
                jt0Var.f36614b0.setReordering(true);
                return;
            case 13:
                if (!jt0Var.D0()) {
                    jt0Var.E1();
                    return;
                }
                return;
            default:
                jt0Var.q1(false);
                org.telegram.ui.ActionBar.z4 z4Var = jt0Var.I;
                if (z4Var != null) {
                    z4Var.o(true);
                } else {
                    jt0Var.H.n(true);
                }
                jt0Var.f36622d1 = 0;
                return;
        }
    }
}
