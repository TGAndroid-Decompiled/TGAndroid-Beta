package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class so0 implements Runnable {
    public final int f38130a;
    public final xs0 f38131b;

    public so0(xs0 xs0Var, int i7) {
        this.f38130a = i7;
        this.f38131b = xs0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f38130a;
        xs0 xs0Var = this.f38131b;
        switch (i7) {
            case 0:
                xs0Var.w0();
                return;
            case 1:
                xs0Var.f40380o2 = (int) xs0Var.R0.c(xs0.f40332u2);
                xs0Var.G();
                if (xs0Var.f40335a0 != null) {
                    xs0Var.F1();
                }
                sr0[] sr0VarArr = xs0Var.m0;
                if (sr0VarArr != null) {
                    for (sr0 sr0Var : sr0VarArr) {
                        if (sr0Var != null) {
                            int paddingTop = sr0Var.h.getPaddingTop();
                            cq0 cq0Var = sr0Var.h;
                            int paddingLeft = cq0Var.getPaddingLeft();
                            int j02 = xs0Var.j0(sr0Var.E);
                            int paddingRight = sr0Var.h.getPaddingRight();
                            cq0 cq0Var2 = sr0Var.h;
                            int i02 = xs0Var.i0(xs0Var.H0());
                            cq0Var2.f37826h3 = i02;
                            cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(sr0Var.h, new bp0(sr0Var, paddingTop - sr0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                v4.P(xs0Var.getContext(), xs0Var.f40405x1, xs0Var.H1, new uo0(xs0Var));
                return;
            case 3:
                xs0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -xs0Var.f40354f1.f26953id);
                u80 u80Var = new u80(bundle, null);
                u80Var.f38554c = xs0Var.f40354f1;
                xs0Var.f40405x1.presentFragment(u80Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40405x1;
                fi.va D = fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount());
                long j3 = xs0Var.l1;
                String currentLang = xs0Var.W.getCurrentLang();
                D.f13001v0 = j3;
                D.f13005w0 = currentLang;
                D.Q(null);
                D.f13001v0 = j3;
                D.f13005w0 = currentLang;
                return;
            case 5:
                xs0Var.W.f();
                return;
            case 6:
                sp0 sp0Var = xs0Var.W;
                if (sp0Var.d()) {
                    sp0Var.h();
                    return;
                } else {
                    sp0Var.f();
                    return;
                }
            case 7:
                sp0 sp0Var2 = xs0Var.W;
                sp0Var2.b(sp0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.f2 f2Var2 = xs0Var.f40405x1;
                f2Var2.getMessagesController().N4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", f2Var2.getUserConfig().e());
                f2Var2.presentFragment(new org.telegram.ui.an(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.f2 f2Var3 = xs0Var.f40405x1;
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
                org.telegram.ui.ActionBar.f2 f2Var4 = xs0Var.f40405x1;
                TLRPC.User f10 = f2Var4.getUserConfig().f();
                v4.r(f2Var4, false, null, f10, false, true, false, true, new f2(17, xs0Var, f10));
                return;
            case 11:
                up0 up0Var = xs0Var.f40335a0;
                up0Var.getClass();
                up0Var.h(null, new zh.k1(up0Var, 1));
                return;
            case 12:
                xs0Var.f40335a0.setReordering(true);
                return;
            case 13:
                if (!xs0Var.D0()) {
                    xs0Var.C1();
                    return;
                }
                return;
            default:
                xs0Var.o1(false);
                org.telegram.ui.ActionBar.y4 y4Var = xs0Var.H;
                if (y4Var != null) {
                    y4Var.j(true);
                } else {
                    xs0Var.G.k();
                }
                xs0Var.f40344c1 = 0;
                return;
        }
    }
}
