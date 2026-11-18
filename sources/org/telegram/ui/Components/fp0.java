package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class fp0 implements Runnable {
    public final int f35148a;
    public final gt0 f35149b;

    public fp0(gt0 gt0Var, int i7) {
        this.f35148a = i7;
        this.f35149b = gt0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35148a;
        gt0 gt0Var = this.f35149b;
        switch (i7) {
            case 0:
                gt0Var.w0();
                return;
            case 1:
                gt0Var.f35616p2 = (int) gt0Var.S0.d(gt0.f35565v2);
                gt0Var.G();
                if (gt0Var.f35572b0 != null) {
                    gt0Var.H1();
                }
                bs0[] bs0VarArr = gt0Var.f35609n0;
                if (bs0VarArr != null) {
                    for (bs0 bs0Var : bs0VarArr) {
                        if (bs0Var != null) {
                            int paddingTop = bs0Var.h.getPaddingTop();
                            lq0 lq0Var = bs0Var.h;
                            int paddingLeft = lq0Var.getPaddingLeft();
                            int j02 = gt0Var.j0(bs0Var.F);
                            int paddingRight = bs0Var.h.getPaddingRight();
                            lq0 lq0Var2 = bs0Var.h;
                            int i02 = gt0Var.i0(gt0Var.I0());
                            lq0Var2.f33443i3 = i02;
                            lq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(bs0Var.h, new op0(bs0Var, paddingTop - bs0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                b5.P(gt0Var.getContext(), gt0Var.f35642y1, gt0Var.I1, new hp0(gt0Var));
                return;
            case 3:
                gt0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -gt0Var.f35590g1.f28404id);
                i90 i90Var = new i90(bundle, null);
                i90Var.f36077c = gt0Var.f35590g1;
                gt0Var.f35642y1.presentFragment(i90Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
                hi.ta D = hi.ta.D(h2Var.getParentActivity(), h2Var.getCurrentAccount());
                long j3 = gt0Var.f35606m1;
                String currentLang = gt0Var.f35568a0.getCurrentLang();
                D.f15491w0 = j3;
                D.f15495x0 = currentLang;
                D.Q(null);
                D.f15491w0 = j3;
                D.f15495x0 = currentLang;
                return;
            case 5:
                gt0Var.f35568a0.f();
                return;
            case 6:
                dq0 dq0Var = gt0Var.f35568a0;
                if (dq0Var.d()) {
                    dq0Var.h();
                    return;
                } else {
                    dq0Var.f();
                    return;
                }
            case 7:
                dq0 dq0Var2 = gt0Var.f35568a0;
                dq0Var2.b(dq0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var.f35642y1;
                h2Var2.getMessagesController().Z4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", h2Var2.getUserConfig().e());
                h2Var2.presentFragment(new org.telegram.ui.bn(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var.f35642y1;
                try {
                    org.telegram.messenger.ri mediaDataController = h2Var3.getMediaDataController();
                    long e10 = h2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ri.U1;
                    mediaDataController.A0(e10, 0, null);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var.f35642y1;
                TLRPC.User f10 = h2Var4.getUserConfig().f();
                b5.r(h2Var4, false, null, f10, false, true, false, true, new g2(20, gt0Var, f10));
                return;
            case 11:
                eq0 eq0Var = gt0Var.f35572b0;
                eq0Var.getClass();
                eq0Var.h(null, new bi.h5(eq0Var, 1));
                return;
            case 12:
                gt0Var.f35572b0.setReordering(true);
                return;
            case 13:
                if (!gt0Var.D0()) {
                    gt0Var.E1();
                    return;
                }
                return;
            default:
                gt0Var.q1(false);
                org.telegram.ui.ActionBar.a5 a5Var = gt0Var.I;
                if (a5Var != null) {
                    a5Var.o(true);
                } else {
                    gt0Var.H.o(true);
                }
                gt0Var.f35580d1 = 0;
                return;
        }
    }
}
