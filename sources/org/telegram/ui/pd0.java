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
public final class pd0 implements Runnable {
    public final int f42464a = 1;
    public final ud0 f42465b;
    public final TLRPC.TL_error f42466c;
    public final String d;
    public final String e;
    public final TLObject f42467f;

    public pd0(ud0 ud0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f42465b = ud0Var;
        this.f42466c = tL_error;
        this.d = str;
        this.e = str2;
        this.f42467f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f42464a;
        TLObject tLObject = this.f42467f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f42466c;
        ud0 ud0Var = this.f42465b;
        switch (i11) {
            case 0:
                ud0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ud0Var.f44105s = password;
                    TwoStepVerificationActivity.n0(password);
                    ud0Var.n(str2, str);
                    return;
                }
                return;
            default:
                gg0 gg0Var = ud0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new sd0(ud0Var, str2, str, 1), 8);
                    return;
                }
                gg0Var.p1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.voip.k1(27, ud0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    if (isEmpty) {
                        e2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    e2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = gg0Var.showDialog(e2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ud0Var.f44106w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public pd0(ud0 ud0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f42465b = ud0Var;
        this.f42466c = tL_error;
        this.f42467f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
