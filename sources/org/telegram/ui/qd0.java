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
public final class qd0 implements Runnable {
    public final int f41692a = 1;
    public final ud0 f41693b;
    public final TLRPC.TL_error f41694c;
    public final String d;
    public final String f41695e;
    public final TLObject f41696f;

    public qd0(ud0 ud0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f41693b = ud0Var;
        this.f41694c = tL_error;
        this.d = str;
        this.f41695e = str2;
        this.f41696f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f41692a;
        TLObject tLObject = this.f41696f;
        String str = this.f41695e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f41694c;
        ud0 ud0Var = this.f41693b;
        switch (i11) {
            case 0:
                ud0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ud0Var.f43237s = password;
                    TwoStepVerificationActivity.m0(password);
                    ud0Var.o(str2, str);
                    return;
                }
                return;
            default:
                fg0 fg0Var = ud0Var.A;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new td0(ud0Var, str2, str, 1), 8);
                    return;
                }
                fg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new xr(25, ud0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    if (isEmpty) {
                        c2Var.P = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    c2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = fg0Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ud0Var.f43238w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public qd0(ud0 ud0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f41693b = ud0Var;
        this.f41694c = tL_error;
        this.f41696f = tLObject;
        this.d = str;
        this.f41695e = str2;
    }
}
