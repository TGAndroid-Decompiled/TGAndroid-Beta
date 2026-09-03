package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class be0 implements Runnable {
    public final int f32854a = 1;
    public final fe0 f32855b;
    public final TLRPC.TL_error f32856c;
    public final String d;
    public final String e;
    public final TLObject f32857f;

    public be0(fe0 fe0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f32855b = fe0Var;
        this.f32856c = tL_error;
        this.d = str;
        this.e = str2;
        this.f32857f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f32854a;
        TLObject tLObject = this.f32857f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f32856c;
        fe0 fe0Var = this.f32855b;
        switch (i11) {
            case 0:
                fe0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    fe0Var.f34055s = password;
                    TwoStepVerificationActivity.m0(password);
                    fe0Var.o(str2, str);
                    return;
                }
                return;
            default:
                pg0 pg0Var = fe0Var.B;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ee0(fe0Var, str2, str, 1), 8);
                    return;
                }
                pg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ss(24, fe0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    if (isEmpty) {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = pg0Var.showDialog(d2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    fe0Var.f34056w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public be0(fe0 fe0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f32855b = fe0Var;
        this.f32856c = tL_error;
        this.f32857f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
