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
public final class he0 implements Runnable {
    public final int f36969a = 1;
    public final me0 f36970b;
    public final TLRPC.TL_error f36971c;
    public final String d;
    public final String f36972e;
    public final TLObject f36973f;

    public he0(me0 me0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f36970b = me0Var;
        this.f36971c = tL_error;
        this.d = str;
        this.f36972e = str2;
        this.f36973f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f36969a;
        TLObject tLObject = this.f36973f;
        String str = this.f36972e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f36971c;
        me0 me0Var = this.f36970b;
        switch (i11) {
            case 0:
                me0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    me0Var.f38685s = password;
                    TwoStepVerificationActivity.m0(password);
                    me0Var.o(str2, str);
                    return;
                }
                return;
            default:
                wg0 wg0Var = me0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(me0Var, str2, str, 1), 8);
                    return;
                }
                wg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z10(16, me0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    if (isEmpty) {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = wg0Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    me0Var.f38686w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public he0(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f36970b = me0Var;
        this.f36971c = tL_error;
        this.f36973f = tLObject;
        this.d = str;
        this.f36972e = str2;
    }
}
