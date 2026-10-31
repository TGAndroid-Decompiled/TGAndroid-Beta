package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pc1 implements Runnable {
    public final int f40628a;
    public final tc1 f40629b;
    public final TLRPC.TL_error f40630c;

    public pc1(tc1 tc1Var, TLRPC.TL_error tL_error, int i10) {
        this.f40628a = i10;
        this.f40629b = tc1Var;
        this.f40630c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i10 = this.f40628a;
        TLRPC.TL_error tL_error = this.f40630c;
        tc1 tc1Var = this.f40629b;
        switch (i10) {
            case 0:
                tc1Var.A0();
                if (tL_error == null) {
                    tc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new lc1(tc1Var, 3));
                    String L0 = org.telegram.messenger.cd.L0(2131747452, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.T = L0;
                    x1Var.R = org.telegram.messenger.cd.L0(2131743956, null);
                    Dialog showDialog = tc1Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131743956, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131743956, null), tL_error.text);
                    return;
                }
            case 1:
                tc1Var.A0();
                if (tL_error == null) {
                    if (tc1Var.getParentActivity() != null) {
                        tc1Var.y0(new kc1(tc1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    tc1Var.C0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G2));
                    return;
                } else {
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                tc1.i0(tc1Var, tL_error);
                return;
            default:
                tc1.d0(tc1Var, tL_error);
                return;
        }
    }
}
