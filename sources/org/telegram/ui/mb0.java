package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mb0 implements Runnable {
    public final int f47637a = 1;
    public final qb0 f47638b;
    public final TLRPC.TL_error f47639c;
    public final String d;
    public final String f47640e;
    public final TLObject f47641f;

    public mb0(qb0 qb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f47638b = qb0Var;
        this.f47639c = tL_error;
        this.d = str;
        this.f47640e = str2;
        this.f47641f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i3;
        int i10 = this.f47637a;
        TLObject tLObject = this.f47641f;
        String str = this.f47640e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f47639c;
        qb0 qb0Var = this.f47638b;
        switch (i10) {
            case 0:
                qb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    qb0Var.f48842s = password;
                    TwoStepVerificationActivity.r0(password);
                    qb0Var.n(str2, str);
                    return;
                }
                return;
            default:
                xd0 xd0Var = qb0Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new pb0(qb0Var, str2, str, 1), 8);
                    return;
                }
                xd0Var.t1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new org.telegram.ui.Components.i41(29, qb0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    if (isEmpty) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131742809, null);
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131742814, null);
                    }
                    s1Var.S = org.telegram.messenger.bd.M0(2131743941, null);
                    Dialog showDialog = xd0Var.showDialog(s1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    qb0Var.f48844x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public mb0(qb0 qb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f47638b = qb0Var;
        this.f47639c = tL_error;
        this.f47641f = tLObject;
        this.d = str;
        this.f47640e = str2;
    }
}
