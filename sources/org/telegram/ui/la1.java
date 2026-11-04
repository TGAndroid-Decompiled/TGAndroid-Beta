package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class la1 implements Runnable {
    public final int f47275a;
    public final ra1 f47276b;
    public final TLRPC.TL_error f47277c;

    public la1(ra1 ra1Var, TLRPC.TL_error tL_error, int i3) {
        this.f47275a = i3;
        this.f47276b = ra1Var;
        this.f47277c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i3 = this.f47275a;
        TLRPC.TL_error tL_error = this.f47277c;
        ra1 ra1Var = this.f47276b;
        switch (i3) {
            case 0:
                ra1Var.B0();
                if (tL_error == null) {
                    ra1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new ha1(ra1Var, 3));
                    String M0 = org.telegram.messenger.bd.M0(2131747444, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.U = M0;
                    s1Var.S = org.telegram.messenger.bd.M0(2131743941, null);
                    Dialog showDialog = ra1Var.showDialog(s1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    ra1Var.L0(org.telegram.messenger.bd.M0(2131743941, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    ra1Var.L0(org.telegram.messenger.bd.M0(2131743941, null), tL_error.text);
                    return;
                }
            case 1:
                ra1Var.B0();
                if (tL_error == null) {
                    if (ra1Var.getParentActivity() != null) {
                        ra1Var.z0(new ga1(ra1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    ra1Var.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    ra1Var.L0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G2));
                    return;
                } else {
                    ra1Var.L0(org.telegram.messenger.bd.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                ra1.j0(ra1Var, tL_error);
                return;
            default:
                ra1.e0(ra1Var, tL_error);
                return;
        }
    }
}
