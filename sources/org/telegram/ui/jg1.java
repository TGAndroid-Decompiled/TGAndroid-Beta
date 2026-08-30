package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jg1 implements Runnable {
    public final int f35344a;
    public final og1 f35345b;
    public final TLRPC.TL_error f35346c;

    public jg1(og1 og1Var, TLRPC.TL_error tL_error, int i10) {
        this.f35344a = i10;
        this.f35345b = og1Var;
        this.f35346c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f35344a;
        TLRPC.TL_error tL_error = this.f35346c;
        og1 og1Var = this.f35345b;
        switch (i10) {
            case 0:
                og1Var.w0();
                if (tL_error == null) {
                    og1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new eg1(og1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.Q = string;
                    d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = og1Var.showDialog(d2Var);
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
                    og1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    og1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                og1Var.w0();
                if (tL_error == null) {
                    if (og1Var.getParentActivity() != null) {
                        og1Var.u0(new fg1(og1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    og1Var.y0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    og1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    og1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                og1.e0(og1Var, tL_error);
                return;
            default:
                og1.Z(og1Var, tL_error);
                return;
        }
    }
}
