package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class uo0 implements Runnable {
    public final int f38835a;
    public final ws0 f38836b;

    public uo0(ws0 ws0Var, int i3) {
        this.f38835a = i3;
        this.f38836b = ws0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f38835a;
        ws0 ws0Var = this.f38836b;
        switch (i3) {
            case 0:
                ws0Var.w0();
                return;
            case 1:
                ws0Var.f40116p2 = (int) ws0Var.S0.c(ws0.f40065v2);
                ws0Var.G();
                if (ws0Var.f40072b0 != null) {
                    ws0Var.F1();
                }
                rr0[] rr0VarArr = ws0Var.f40108n0;
                if (rr0VarArr != null) {
                    for (rr0 rr0Var : rr0VarArr) {
                        if (rr0Var != null) {
                            int paddingTop = rr0Var.h.getPaddingTop();
                            cq0 cq0Var = rr0Var.h;
                            int paddingLeft = cq0Var.getPaddingLeft();
                            int j02 = ws0Var.j0(rr0Var.F);
                            int paddingRight = rr0Var.h.getPaddingRight();
                            cq0 cq0Var2 = rr0Var.h;
                            int i02 = ws0Var.i0(ws0Var.H0());
                            cq0Var2.i3 = i02;
                            cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(rr0Var.h, new dp0(rr0Var, paddingTop - rr0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 2:
                t4.R(ws0Var.getContext(), ws0Var.f40142y1, ws0Var.I1, new wo0(ws0Var));
                return;
            case 3:
                ws0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -ws0Var.f40090g1.f27002id);
                r80 r80Var = new r80(bundle, null);
                r80Var.f37683c = ws0Var.f40090g1;
                ws0Var.f40142y1.presentFragment(r80Var);
                return;
            case 4:
                org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
                gi.va D = gi.va.D(d2Var.getParentActivity(), d2Var.getCurrentAccount());
                long j10 = ws0Var.m1;
                String currentLang = ws0Var.f40068a0.getCurrentLang();
                D.f13769w0 = j10;
                D.f13773x0 = currentLang;
                D.Q(null);
                D.f13769w0 = j10;
                D.f13773x0 = currentLang;
                return;
            case 5:
                ws0Var.f40068a0.f();
                return;
            case 6:
                tp0 tp0Var = ws0Var.f40068a0;
                if (tp0Var.d()) {
                    tp0Var.h();
                    return;
                } else {
                    tp0Var.f();
                    return;
                }
            case 7:
                tp0 tp0Var2 = ws0Var.f40068a0;
                tp0Var2.b(tp0Var2.getCurrentLang());
                return;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var.f40142y1;
                d2Var2.getMessagesController().N4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", d2Var2.getUserConfig().e());
                d2Var2.presentFragment(new org.telegram.ui.wm(bundle2), true);
                return;
            case 9:
                org.telegram.ui.ActionBar.d2 d2Var3 = ws0Var.f40142y1;
                try {
                    org.telegram.messenger.li mediaDataController = d2Var3.getMediaDataController();
                    long e10 = d2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.li.S1;
                    mediaDataController.y0(e10, 0, null);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.d2 d2Var4 = ws0Var.f40142y1;
                TLRPC.User f10 = d2Var4.getUserConfig().f();
                t4.r(d2Var4, false, null, f10, false, true, false, true, new org.telegram.ui.jo(27, ws0Var, f10));
                return;
            case 11:
                vp0 vp0Var = ws0Var.f40072b0;
                vp0Var.getClass();
                vp0Var.h(null, new ai.l3(vp0Var, 1));
                return;
            case 12:
                ws0Var.f40072b0.setReordering(true);
                return;
            case 13:
                if (!ws0Var.D0()) {
                    ws0Var.C1();
                    return;
                }
                return;
            default:
                ws0Var.o1(false);
                org.telegram.ui.ActionBar.y4 y4Var = ws0Var.I;
                if (y4Var != null) {
                    y4Var.j(true);
                } else {
                    ws0Var.H.l(true);
                }
                ws0Var.f40079d1 = 0;
                return;
        }
    }
}
