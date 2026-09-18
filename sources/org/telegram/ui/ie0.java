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
public final class ie0 implements Runnable {
    public final int f34507a = 1;
    public final ne0 f34508b;
    public final TLRPC.TL_error f34509c;
    public final String d;
    public final String e;
    public final TLObject f34510f;

    public ie0(ne0 ne0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f34508b = ne0Var;
        this.f34509c = tL_error;
        this.d = str;
        this.e = str2;
        this.f34510f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f34507a;
        TLObject tLObject = this.f34510f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f34509c;
        ne0 ne0Var = this.f34508b;
        switch (i11) {
            case 0:
                ne0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ne0Var.f35919s = password;
                    TwoStepVerificationActivity.m0(password);
                    ne0Var.o(str2, str);
                    return;
                }
                return;
            default:
                xg0 xg0Var = ne0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new le0(ne0Var, str2, str, 1), 8);
                    return;
                }
                xg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z10(16, ne0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                    if (isEmpty) {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = xg0Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ne0Var.f35920w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public ie0(ne0 ne0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f34508b = ne0Var;
        this.f34509c = tL_error;
        this.f34510f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
