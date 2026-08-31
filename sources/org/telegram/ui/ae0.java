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
public final class ae0 implements Runnable {
    public final int f35139a = 1;
    public final ee0 f35140b;
    public final TLRPC.TL_error f35141c;
    public final String d;
    public final String f35142e;
    public final TLObject f35143f;

    public ae0(ee0 ee0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f35140b = ee0Var;
        this.f35141c = tL_error;
        this.d = str;
        this.f35142e = str2;
        this.f35143f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f35139a;
        TLObject tLObject = this.f35143f;
        String str = this.f35142e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f35141c;
        ee0 ee0Var = this.f35140b;
        switch (i11) {
            case 0:
                ee0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ee0Var.f36565s = password;
                    TwoStepVerificationActivity.m0(password);
                    ee0Var.o(str2, str);
                    return;
                }
                return;
            default:
                og0 og0Var = ee0Var.B;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new de0(ee0Var, str2, str, 1), 8);
                    return;
                }
                og0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rs(24, ee0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    if (isEmpty) {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = og0Var.showDialog(d2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ee0Var.f36566w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public ae0(ee0 ee0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f35140b = ee0Var;
        this.f35141c = tL_error;
        this.f35143f = tLObject;
        this.d = str;
        this.f35142e = str2;
    }
}
