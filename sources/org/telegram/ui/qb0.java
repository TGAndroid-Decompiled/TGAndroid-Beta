package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qb0 implements Runnable {
    public final int f51196a = 1;
    public final ub0 f51197b;
    public final TLRPC.TL_error f51198c;
    public final String d;
    public final String f51199e;
    public final TLObject f51200f;

    public qb0(ub0 ub0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f51197b = ub0Var;
        this.f51198c = tL_error;
        this.d = str;
        this.f51199e = str2;
        this.f51200f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f51196a;
        TLObject tLObject = this.f51200f;
        String str = this.f51199e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f51198c;
        ub0 ub0Var = this.f51197b;
        switch (i10) {
            case 0:
                ub0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ub0Var.f52527s = password;
                    TwoStepVerificationActivity.r0(password);
                    ub0Var.n(str2, str);
                    return;
                }
                return;
            default:
                de0 de0Var = ub0Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new tb0(ub0Var, str2, str, 1), 8);
                    return;
                }
                de0Var.C1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751759, null), new at(22, ub0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    if (isEmpty) {
                        t1Var.U = org.telegram.messenger.hd.N0(2131742533, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.N0(2131742538, null);
                    }
                    t1Var.S = org.telegram.messenger.hd.N0(2131743686, null);
                    Dialog showDialog = de0Var.showDialog(t1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ub0Var.f52529x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750669, G));
                        return;
                    }
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public qb0(ub0 ub0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f51197b = ub0Var;
        this.f51198c = tL_error;
        this.f51200f = tLObject;
        this.d = str;
        this.f51199e = str2;
    }
}
