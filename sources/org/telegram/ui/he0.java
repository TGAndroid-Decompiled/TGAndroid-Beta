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
    public final int f33362a = 1;
    public final me0 f33363b;
    public final TLRPC.TL_error f33364c;
    public final String d;
    public final String e;
    public final TLObject f33365f;

    public he0(me0 me0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f33363b = me0Var;
        this.f33364c = tL_error;
        this.d = str;
        this.e = str2;
        this.f33365f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f33362a;
        TLObject tLObject = this.f33365f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f33364c;
        me0 me0Var = this.f33363b;
        switch (i11) {
            case 0:
                me0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    me0Var.f34930s = password;
                    TwoStepVerificationActivity.m0(password);
                    me0Var.o(str2, str);
                    return;
                }
                return;
            default:
                xg0 xg0Var = me0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(me0Var, str2, str, 1), 8);
                    return;
                }
                xg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new l80(11, me0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    if (isEmpty) {
                        d2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        d2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    d2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = xg0Var.showDialog(d2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    me0Var.f34931w = false;
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

    public he0(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f33363b = me0Var;
        this.f33364c = tL_error;
        this.f33365f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
