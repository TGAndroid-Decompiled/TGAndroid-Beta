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
public final class je0 implements Runnable {
    public final int f34855a = 1;
    public final oe0 f34856b;
    public final TLRPC.TL_error f34857c;
    public final String d;
    public final String e;
    public final TLObject f34858f;

    public je0(oe0 oe0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f34856b = oe0Var;
        this.f34857c = tL_error;
        this.d = str;
        this.e = str2;
        this.f34858f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f34855a;
        TLObject tLObject = this.f34858f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f34857c;
        oe0 oe0Var = this.f34856b;
        switch (i11) {
            case 0:
                oe0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    oe0Var.f36322s = password;
                    TwoStepVerificationActivity.m0(password);
                    oe0Var.o(str2, str);
                    return;
                }
                return;
            default:
                yg0 yg0Var = oe0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new me0(oe0Var, str2, str, 1), 8);
                    return;
                }
                yg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new f20(15, oe0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    if (isEmpty) {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    c2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = yg0Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    oe0Var.f36323w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public je0(oe0 oe0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f34856b = oe0Var;
        this.f34857c = tL_error;
        this.f34858f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
