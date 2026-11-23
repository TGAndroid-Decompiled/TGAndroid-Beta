package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class gp0 implements Runnable {
    public final int f35511a;
    public final it0 f35512b;

    public gp0(it0 it0Var, int i7) {
        this.f35511a = i7;
        this.f35512b = it0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35511a;
        it0 it0Var = this.f35512b;
        switch (i7) {
            case 0:
                it0Var.w0();
                return;
            case 1:
                it0Var.f36140p2 = (int) it0Var.S0.d(it0.f36089v2);
                it0Var.G();
                if (it0Var.f36096b0 != null) {
                    it0Var.H1();
                }
                ds0[] ds0VarArr = it0Var.f36133n0;
                if (ds0VarArr != null) {
                    for (ds0 ds0Var : ds0VarArr) {
                        if (ds0Var != null) {
                            int paddingTop = ds0Var.h.getPaddingTop();
                            mq0 mq0Var = ds0Var.h;
                            int paddingLeft = mq0Var.getPaddingLeft();
                            int j02 = it0Var.j0(ds0Var.F);
                            int paddingRight = ds0Var.h.getPaddingRight();
                            mq0 mq0Var2 = ds0Var.h;
                            int i02 = it0Var.i0(it0Var.I0());
                            mq0Var2.f34120i3 = i02;
                            mq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(ds0Var.h, new pp0(ds0Var, paddingTop - ds0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                b5.P(it0Var.getContext(), it0Var.f36166y1, it0Var.I1, new ip0(it0Var));
                return;
            case 3:
                it0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -it0Var.f36114g1.f28493id);
                h90 h90Var = new h90(bundle, null);
                h90Var.f35690c = it0Var.f36114g1;
                it0Var.f36166y1.presentFragment(h90Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
                hi.nb D = hi.nb.D(g2Var.getParentActivity(), g2Var.getCurrentAccount());
                long j3 = it0Var.f36130m1;
                String currentLang = it0Var.f36092a0.getCurrentLang();
                D.f15125w0 = j3;
                D.f15129x0 = currentLang;
                D.Q(null);
                D.f15125w0 = j3;
                D.f15129x0 = currentLang;
                return;
            case 5:
                it0Var.f36092a0.f();
                return;
            case 6:
                eq0 eq0Var = it0Var.f36092a0;
                if (eq0Var.d()) {
                    eq0Var.h();
                    return;
                } else {
                    eq0Var.f();
                    return;
                }
            case 7:
                eq0 eq0Var2 = it0Var.f36092a0;
                eq0Var2.b(eq0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var.f36166y1;
                g2Var2.getMessagesController().Z4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", g2Var2.getUserConfig().e());
                g2Var2.presentFragment(new org.telegram.ui.bn(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var.f36166y1;
                try {
                    org.telegram.messenger.ri mediaDataController = g2Var3.getMediaDataController();
                    long e10 = g2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ri.U1;
                    mediaDataController.A0(e10, 0, null);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var.f36166y1;
                TLRPC.User f10 = g2Var4.getUserConfig().f();
                b5.r(g2Var4, false, null, f10, false, true, false, true, new g2(20, it0Var, f10));
                return;
            case 11:
                fq0 fq0Var = it0Var.f36096b0;
                fq0Var.getClass();
                fq0Var.h(null, new bi.n5(fq0Var, 1));
                return;
            case 12:
                it0Var.f36096b0.setReordering(true);
                return;
            case 13:
                if (!it0Var.D0()) {
                    it0Var.E1();
                    return;
                }
                return;
            default:
                it0Var.q1(false);
                org.telegram.ui.ActionBar.z4 z4Var = it0Var.I;
                if (z4Var != null) {
                    z4Var.o(true);
                } else {
                    it0Var.H.n(true);
                }
                it0Var.f36104d1 = 0;
                return;
        }
    }
}
