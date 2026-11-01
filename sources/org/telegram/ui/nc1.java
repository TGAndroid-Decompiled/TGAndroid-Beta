package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nc1 implements Runnable {
    public final int f39853a;
    public final rc1 f39854b;
    public final TLRPC.TL_error f39855c;

    public nc1(rc1 rc1Var, TLRPC.TL_error tL_error, int i10) {
        this.f39853a = i10;
        this.f39854b = rc1Var;
        this.f39855c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i10 = this.f39853a;
        TLRPC.TL_error tL_error = this.f39855c;
        rc1 rc1Var = this.f39854b;
        switch (i10) {
            case 0:
                rc1Var.B0();
                if (tL_error == null) {
                    rc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new jc1(rc1Var, 3));
                    String L0 = org.telegram.messenger.dd.L0(2131747452, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.T = L0;
                    x1Var.R = org.telegram.messenger.dd.L0(2131743956, null);
                    Dialog showDialog = rc1Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    rc1Var.L0(org.telegram.messenger.dd.L0(2131743956, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    rc1Var.L0(org.telegram.messenger.dd.L0(2131743956, null), tL_error.text);
                    return;
                }
            case 1:
                rc1Var.B0();
                if (tL_error == null) {
                    if (rc1Var.getParentActivity() != null) {
                        rc1Var.z0(new ic1(rc1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    rc1Var.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    rc1Var.L0(org.telegram.messenger.dd.L0(2131689472, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G2));
                    return;
                } else {
                    rc1Var.L0(org.telegram.messenger.dd.L0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                rc1.j0(rc1Var, tL_error);
                return;
            default:
                rc1.e0(rc1Var, tL_error);
                return;
        }
    }
}
