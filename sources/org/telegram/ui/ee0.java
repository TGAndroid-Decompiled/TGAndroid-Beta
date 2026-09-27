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
public final class ee0 implements Runnable {
    public final int f33227a = 1;
    public final je0 f33228b;
    public final TLRPC.TL_error f33229c;
    public final String d;
    public final String e;
    public final TLObject f33230f;

    public ee0(je0 je0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f33228b = je0Var;
        this.f33229c = tL_error;
        this.d = str;
        this.e = str2;
        this.f33230f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f33227a;
        TLObject tLObject = this.f33230f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f33229c;
        je0 je0Var = this.f33228b;
        switch (i11) {
            case 0:
                je0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    je0Var.f34722s = password;
                    TwoStepVerificationActivity.m0(password);
                    je0Var.o(str2, str);
                    return;
                }
                return;
            default:
                tg0 tg0Var = je0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new he0(je0Var, str2, str, 1), 8);
                    return;
                }
                tg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new jy(17, je0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    if (isEmpty) {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    c2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = tg0Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    je0Var.f34723w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public ee0(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f33228b = je0Var;
        this.f33229c = tL_error;
        this.f33230f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
