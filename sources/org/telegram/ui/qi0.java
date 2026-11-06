package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qi0 implements View.OnClickListener {
    public final int f49242a;
    public final bk0 f49243b;

    public qi0(bk0 bk0Var, int i7) {
        this.f49242a = i7;
        this.f49243b = bk0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49242a;
        bk0 bk0Var = this.f49243b;
        switch (i7) {
            case 0:
                bk0Var.S0 = 2;
                bk0Var.H1();
                return;
            case 1:
                bk0Var.h1();
                return;
            case 2:
                bk0Var.S0 = 3;
                bk0Var.H1();
                return;
            case 3:
                bk0Var.S0 = 1;
                bk0Var.H1();
                return;
            case 4:
                bk0Var.S0 = 4;
                bk0Var.H1();
                return;
            case 5:
                if (bk0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    bk0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                s9 s9Var = new s9(0);
                s9Var.M = new bj0(bk0Var);
                bk0Var.presentFragment(s9Var);
                return;
            case 6:
                bk0Var.f44374f = true;
                bk0Var.L.callOnClick();
                bk0Var.f44374f = false;
                return;
            case 7:
                bk0Var.S0 = 0;
                bk0Var.H1();
                return;
            case 8:
                bk0Var.S0 = 4;
                bk0Var.H1();
                return;
            case 9:
                bk0Var.h1();
                return;
            case 10:
                bk0.g0(bk0Var);
                return;
            case 11:
                bk0.h0(bk0Var);
                return;
            case 12:
                bk0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131744233, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131744234, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new si0(bk0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                bk0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                    return;
                }
                return;
            case 14:
                bk0Var.G1();
                return;
            case 15:
                bk0.a0(bk0Var);
                return;
            default:
                bk0Var.f44374f = true;
                bk0Var.L.callOnClick();
                bk0Var.f44374f = false;
                return;
        }
    }
}
