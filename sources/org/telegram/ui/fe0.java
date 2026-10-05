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
public final class fe0 implements Runnable {
    public final int f36283a = 1;
    public final ke0 f36284b;
    public final TLRPC.TL_error f36285c;
    public final String d;
    public final String f36286e;
    public final TLObject f36287f;

    public fe0(ke0 ke0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f36284b = ke0Var;
        this.f36285c = tL_error;
        this.d = str;
        this.f36286e = str2;
        this.f36287f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f36283a;
        TLObject tLObject = this.f36287f;
        String str = this.f36286e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f36285c;
        ke0 ke0Var = this.f36284b;
        switch (i11) {
            case 0:
                ke0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ke0Var.f37988s = password;
                    TwoStepVerificationActivity.m0(password);
                    ke0Var.o(str2, str);
                    return;
                }
                return;
            default:
                ug0 ug0Var = ke0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ie0(ke0Var, str2, str, 1), 8);
                    return;
                }
                ug0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new pw(18, ke0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                    if (isEmpty) {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ug0Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ke0Var.f37989w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public fe0(ke0 ke0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f36284b = ke0Var;
        this.f36285c = tL_error;
        this.f36287f = tLObject;
        this.d = str;
        this.f36286e = str2;
    }
}
