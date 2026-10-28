package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bg1 implements Runnable {
    public final int f38033a;
    public final fg1 f38034b;
    public final TLRPC.TL_error f38035c;

    public bg1(fg1 fg1Var, TLRPC.TL_error tL_error, int i10) {
        this.f38033a = i10;
        this.f38034b = fg1Var;
        this.f38035c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f38033a;
        TLRPC.TL_error tL_error = this.f38035c;
        fg1 fg1Var = this.f38034b;
        switch (i10) {
            case 0:
                fg1Var.x0();
                if (tL_error == null) {
                    fg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wf1(fg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.T = string;
                    e2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = fg1Var.showDialog(e2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    fg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    fg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                fg1Var.x0();
                if (tL_error == null) {
                    if (fg1Var.getParentActivity() != null) {
                        fg1Var.v0(new xf1(fg1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    fg1Var.z0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    fg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    fg1Var.H0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                fg1.f0(fg1Var, tL_error);
                return;
            default:
                fg1.a0(fg1Var, tL_error);
                return;
        }
    }
}
