package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class wo0 implements Runnable {
    public final int f41412a;
    public final ys0 f41413b;

    public wo0(ys0 ys0Var, int i7) {
        this.f41412a = i7;
        this.f41413b = ys0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f41412a;
        ys0 ys0Var = this.f41413b;
        switch (i7) {
            case 0:
                ys0Var.w0();
                return;
            case 1:
                ys0Var.f42124p2 = (int) ys0Var.S0.c(ys0.f42073v2);
                ys0Var.G();
                if (ys0Var.f42080b0 != null) {
                    ys0Var.H1();
                }
                tr0[] tr0VarArr = ys0Var.f42117n0;
                if (tr0VarArr != null) {
                    for (tr0 tr0Var : tr0VarArr) {
                        if (tr0Var != null) {
                            int paddingTop = tr0Var.h.getPaddingTop();
                            dq0 dq0Var = tr0Var.h;
                            int paddingLeft = dq0Var.getPaddingLeft();
                            int j02 = ys0Var.j0(tr0Var.F);
                            int paddingRight = tr0Var.h.getPaddingRight();
                            dq0 dq0Var2 = tr0Var.h;
                            int i02 = ys0Var.i0(ys0Var.I0());
                            dq0Var2.f39402i3 = i02;
                            dq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(tr0Var.h, new ep0(tr0Var, paddingTop - tr0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                t4.P(ys0Var.getContext(), ys0Var.f42150y1, ys0Var.I1, new yo0(ys0Var));
                return;
            case 3:
                ys0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -ys0Var.f42098g1.f28052id);
                x80 x80Var = new x80(bundle, null);
                x80Var.f41618c = ys0Var.f42098g1;
                ys0Var.f42150y1.presentFragment(x80Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
                hi.sa D = hi.sa.D(e2Var.getParentActivity(), e2Var.getCurrentAccount());
                long j3 = ys0Var.f42114m1;
                String currentLang = ys0Var.f42076a0.getCurrentLang();
                D.f15106w0 = j3;
                D.f15110x0 = currentLang;
                D.Q(null);
                D.f15106w0 = j3;
                D.f15110x0 = currentLang;
                return;
            case 5:
                ys0Var.f42076a0.f();
                return;
            case 6:
                vp0 vp0Var = ys0Var.f42076a0;
                if (vp0Var.d()) {
                    vp0Var.h();
                    return;
                } else {
                    vp0Var.f();
                    return;
                }
            case 7:
                vp0 vp0Var2 = ys0Var.f42076a0;
                vp0Var2.b(vp0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var.f42150y1;
                e2Var2.getMessagesController().O4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", e2Var2.getUserConfig().e());
                e2Var2.presentFragment(new org.telegram.ui.an(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.e2 e2Var3 = ys0Var.f42150y1;
                try {
                    org.telegram.messenger.si mediaDataController = e2Var3.getMediaDataController();
                    long e10 = e2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.si.S1;
                    mediaDataController.y0(e10, 0, null);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.e2 e2Var4 = ys0Var.f42150y1;
                TLRPC.User f10 = e2Var4.getUserConfig().f();
                t4.r(e2Var4, false, null, f10, false, true, false, true, new f1(21, ys0Var, f10));
                return;
            case 11:
                wp0 wp0Var = ys0Var.f42080b0;
                wp0Var.getClass();
                wp0Var.h(null, new bi.a3(wp0Var, 1));
                return;
            case 12:
                ys0Var.f42080b0.setReordering(true);
                return;
            case 13:
                if (!ys0Var.D0()) {
                    ys0Var.E1();
                    return;
                }
                return;
            default:
                ys0Var.q1(false);
                org.telegram.ui.ActionBar.w4 w4Var = ys0Var.I;
                if (w4Var != null) {
                    w4Var.m(true);
                } else {
                    ys0Var.H.n(true);
                }
                ys0Var.f42088d1 = 0;
                return;
        }
    }
}
