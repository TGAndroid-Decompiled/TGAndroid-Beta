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
public final class nd0 implements Runnable {
    public final int f39541a = 1;
    public final sd0 f39542b;
    public final TLRPC.TL_error f39543c;
    public final String d;
    public final String e;
    public final TLObject f39544f;

    public nd0(sd0 sd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f39542b = sd0Var;
        this.f39543c = tL_error;
        this.d = str;
        this.e = str2;
        this.f39544f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f39541a;
        TLObject tLObject = this.f39544f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f39543c;
        sd0 sd0Var = this.f39542b;
        switch (i11) {
            case 0:
                sd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    sd0Var.f41446s = password;
                    TwoStepVerificationActivity.m0(password);
                    sd0Var.o(str2, str);
                    return;
                }
                return;
            default:
                dg0 dg0Var = sd0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qd0(sd0Var, str2, str, 1), 8);
                    return;
                }
                dg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new xu(21, sd0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                    if (isEmpty) {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = dg0Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    sd0Var.f41447w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public nd0(sd0 sd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f39542b = sd0Var;
        this.f39543c = tL_error;
        this.f39544f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
