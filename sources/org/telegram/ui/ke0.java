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
public final class ke0 implements Runnable {
    public final int f37359a = 1;
    public final pe0 f37360b;
    public final TLRPC.TL_error f37361c;
    public final String d;
    public final String e;
    public final TLObject f37362f;

    public ke0(pe0 pe0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f37360b = pe0Var;
        this.f37361c = tL_error;
        this.d = str;
        this.e = str2;
        this.f37362f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f37359a;
        TLObject tLObject = this.f37362f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f37361c;
        pe0 pe0Var = this.f37360b;
        switch (i11) {
            case 0:
                pe0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    pe0Var.f38900s = password;
                    TwoStepVerificationActivity.m0(password);
                    pe0Var.o(str2, str);
                    return;
                }
                return;
            default:
                ah0 ah0Var = pe0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ne0(pe0Var, str2, str, 1), 8);
                    return;
                }
                ah0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qw(19, pe0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    if (isEmpty) {
                        a2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    a2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ah0Var.showDialog(a2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    pe0Var.f38901w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public ke0(pe0 pe0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f37360b = pe0Var;
        this.f37361c = tL_error;
        this.f37362f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
