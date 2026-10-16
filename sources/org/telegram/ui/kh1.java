package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kh1 implements Runnable {
    public final int f37430a;
    public final oh1 f37431b;
    public final TLRPC.TL_error f37432c;

    public kh1(oh1 oh1Var, TLRPC.TL_error tL_error, int i10) {
        this.f37430a = i10;
        this.f37431b = oh1Var;
        this.f37432c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f37430a;
        TLRPC.TL_error tL_error = this.f37432c;
        oh1 oh1Var = this.f37431b;
        switch (i10) {
            case 0:
                oh1Var.w0();
                if (tL_error == null) {
                    oh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new fh1(oh1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.T = string;
                    a2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = oh1Var.showDialog(a2Var);
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
                    oh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    oh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                oh1Var.w0();
                if (tL_error == null) {
                    if (oh1Var.getParentActivity() != null) {
                        oh1Var.u0(new gh1(oh1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    oh1Var.y0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    oh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    oh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                oh1.e0(oh1Var, tL_error);
                return;
            default:
                oh1.Z(oh1Var, tL_error);
                return;
        }
    }
}
