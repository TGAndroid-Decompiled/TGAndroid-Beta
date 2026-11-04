package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ni0 implements View.OnClickListener {
    public final int f48011a;
    public final yj0 f48012b;

    public ni0(yj0 yj0Var, int i3) {
        this.f48011a = i3;
        this.f48012b = yj0Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f48011a;
        yj0 yj0Var = this.f48012b;
        switch (i3) {
            case 0:
                yj0Var.T0 = 2;
                yj0Var.H1();
                return;
            case 1:
                yj0Var.h1();
                return;
            case 2:
                yj0Var.T0 = 3;
                yj0Var.H1();
                return;
            case 3:
                yj0Var.T0 = 1;
                yj0Var.H1();
                return;
            case 4:
                yj0Var.T0 = 4;
                yj0Var.H1();
                return;
            case 5:
                if (yj0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    yj0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                s9 s9Var = new s9(0);
                s9Var.N = new yi0(yj0Var);
                yj0Var.presentFragment(s9Var);
                return;
            case 6:
                yj0Var.f52298f = true;
                yj0Var.M.callOnClick();
                yj0Var.f52298f = false;
                return;
            case 7:
                yj0Var.T0 = 0;
                yj0Var.H1();
                return;
            case 8:
                yj0Var.T0 = 4;
                yj0Var.H1();
                return;
            case 9:
                yj0Var.h1();
                return;
            case 10:
                yj0.g0(yj0Var);
                return;
            case 11:
                yj0.h0(yj0Var);
                return;
            case 12:
                yj0Var.G1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131744242, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131744243, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new pi0(yj0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                yj0Var.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                    return;
                }
                return;
            case 14:
                yj0Var.G1();
                return;
            case 15:
                yj0.a0(yj0Var);
                return;
            default:
                yj0Var.f52298f = true;
                yj0Var.M.callOnClick();
                yj0Var.f52298f = false;
                return;
        }
    }
}
