package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pb0 implements Runnable {
    public final int f50871a = 1;
    public final tb0 f50872b;
    public final TLRPC.TL_error f50873c;
    public final String d;
    public final String f50874e;
    public final TLObject f50875f;

    public pb0(tb0 tb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f50872b = tb0Var;
        this.f50873c = tL_error;
        this.d = str;
        this.f50874e = str2;
        this.f50875f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f50871a;
        TLObject tLObject = this.f50875f;
        String str = this.f50874e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f50873c;
        tb0 tb0Var = this.f50872b;
        switch (i10) {
            case 0:
                tb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    tb0Var.f52245s = password;
                    TwoStepVerificationActivity.r0(password);
                    tb0Var.n(str2, str);
                    return;
                }
                return;
            default:
                de0 de0Var = tb0Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new sb0(tb0Var, str2, str, 1), 8);
                    return;
                }
                de0Var.C1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new at(22, tb0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    if (isEmpty) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131742541, null);
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131742546, null);
                    }
                    u1Var.S = org.telegram.messenger.gd.M0(2131743694, null);
                    Dialog showDialog = de0Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    tb0Var.f52247x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, G));
                        return;
                    }
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public pb0(tb0 tb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f50872b = tb0Var;
        this.f50873c = tL_error;
        this.f50875f = tLObject;
        this.d = str;
        this.f50874e = str2;
    }
}
