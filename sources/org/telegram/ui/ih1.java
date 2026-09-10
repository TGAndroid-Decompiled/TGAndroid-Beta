package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ih1 implements Runnable {
    public final int f33736a;
    public final mh1 f33737b;
    public final TLRPC.TL_error f33738c;

    public ih1(mh1 mh1Var, TLRPC.TL_error tL_error, int i10) {
        this.f33736a = i10;
        this.f33737b = mh1Var;
        this.f33738c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f33736a;
        TLRPC.TL_error tL_error = this.f33738c;
        mh1 mh1Var = this.f33737b;
        switch (i10) {
            case 0:
                mh1Var.w0();
                if (tL_error == null) {
                    mh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new dh1(mh1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.T = string;
                    d2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = mh1Var.showDialog(d2Var);
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
                    mh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    mh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                mh1Var.w0();
                if (tL_error == null) {
                    if (mh1Var.getParentActivity() != null) {
                        mh1Var.u0(new eh1(mh1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    mh1Var.y0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    mh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    mh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                mh1.e0(mh1Var, tL_error);
                return;
            default:
                mh1.Z(mh1Var, tL_error);
                return;
        }
    }
}
