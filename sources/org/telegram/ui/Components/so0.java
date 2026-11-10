package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class so0 implements Runnable {
    public final int f38037a;
    public final ys0 f38038b;

    public so0(ys0 ys0Var, int i7) {
        this.f38037a = i7;
        this.f38038b = ys0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f38037a;
        ys0 ys0Var = this.f38038b;
        switch (i7) {
            case 0:
                ys0Var.w0();
                return;
            case 1:
                ys0Var.f40694o2 = (int) ys0Var.R0.c(ys0.f40646u2);
                ys0Var.G();
                if (ys0Var.f40649a0 != null) {
                    ys0Var.H1();
                }
                tr0[] tr0VarArr = ys0Var.m0;
                if (tr0VarArr != null) {
                    for (tr0 tr0Var : tr0VarArr) {
                        if (tr0Var != null) {
                            int paddingTop = tr0Var.h.getPaddingTop();
                            cq0 cq0Var = tr0Var.h;
                            int paddingLeft = cq0Var.getPaddingLeft();
                            int j02 = ys0Var.j0(tr0Var.E);
                            int paddingRight = tr0Var.h.getPaddingRight();
                            cq0 cq0Var2 = tr0Var.h;
                            int i02 = ys0Var.i0(ys0Var.I0());
                            cq0Var2.f38051h3 = i02;
                            cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(tr0Var.h, new bp0(tr0Var, paddingTop - tr0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                u4.P(ys0Var.getContext(), ys0Var.f40719x1, ys0Var.H1, new uo0(ys0Var));
                return;
            case 3:
                ys0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -ys0Var.f40668f1.f26961id);
                v80 v80Var = new v80(bundle, null);
                v80Var.f38937c = ys0Var.f40668f1;
                ys0Var.f40719x1.presentFragment(v80Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
                fi.va D = fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount());
                long j3 = ys0Var.l1;
                String currentLang = ys0Var.W.getCurrentLang();
                D.f13003v0 = j3;
                D.f13007w0 = currentLang;
                D.Q(null);
                D.f13003v0 = j3;
                D.f13007w0 = currentLang;
                return;
            case 5:
                ys0Var.W.f();
                return;
            case 6:
                sp0 sp0Var = ys0Var.W;
                if (sp0Var.d()) {
                    sp0Var.h();
                    return;
                } else {
                    sp0Var.f();
                    return;
                }
            case 7:
                sp0 sp0Var2 = ys0Var.W;
                sp0Var2.b(sp0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.f2 f2Var2 = ys0Var.f40719x1;
                f2Var2.getMessagesController().N4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", f2Var2.getUserConfig().e());
                f2Var2.presentFragment(new org.telegram.ui.cn(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.f2 f2Var3 = ys0Var.f40719x1;
                try {
                    org.telegram.messenger.ui mediaDataController = f2Var3.getMediaDataController();
                    long e10 = f2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ui.R1;
                    mediaDataController.y0(e10, 0, null);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var4 = ys0Var.f40719x1;
                TLRPC.User f10 = f2Var4.getUserConfig().f();
                u4.r(f2Var4, false, null, f10, false, true, false, true, new e2(17, ys0Var, f10));
                return;
            case 11:
                up0 up0Var = ys0Var.f40649a0;
                up0Var.getClass();
                up0Var.h(null, new zh.j1(up0Var, 1));
                return;
            case 12:
                ys0Var.f40649a0.setReordering(true);
                return;
            case 13:
                if (!ys0Var.D0()) {
                    ys0Var.E1();
                    return;
                }
                return;
            default:
                ys0Var.q1(false);
                org.telegram.ui.ActionBar.z4 z4Var = ys0Var.H;
                if (z4Var != null) {
                    z4Var.l(true);
                } else {
                    ys0Var.G.n(true);
                }
                ys0Var.f40658c1 = 0;
                return;
        }
    }
}
