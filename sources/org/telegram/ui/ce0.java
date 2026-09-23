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
public final class ce0 implements Runnable {
    public final int f32321a = 1;
    public final he0 f32322b;
    public final TLRPC.TL_error f32323c;
    public final String d;
    public final String e;
    public final TLObject f32324f;

    public ce0(he0 he0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f32322b = he0Var;
        this.f32323c = tL_error;
        this.d = str;
        this.e = str2;
        this.f32324f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f32321a;
        TLObject tLObject = this.f32324f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f32323c;
        he0 he0Var = this.f32322b;
        switch (i11) {
            case 0:
                he0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    he0Var.f33834s = password;
                    TwoStepVerificationActivity.m0(password);
                    he0Var.o(str2, str);
                    return;
                }
                return;
            default:
                rg0 rg0Var = he0Var.E;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fe0(he0Var, str2, str, 1), 8);
                    return;
                }
                rg0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new w10(16, he0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    if (isEmpty) {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = rg0Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    he0Var.f33835w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public ce0(he0 he0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f32322b = he0Var;
        this.f32323c = tL_error;
        this.f32324f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
