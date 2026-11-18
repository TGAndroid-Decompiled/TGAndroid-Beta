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
    public final int f51146a = 1;
    public final ub0 f51147b;
    public final TLRPC.TL_error f51148c;
    public final String d;
    public final String f51149e;
    public final TLObject f51150f;

    public qb0(ub0 ub0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f51147b = ub0Var;
        this.f51148c = tL_error;
        this.d = str;
        this.f51149e = str2;
        this.f51150f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f51146a;
        TLObject tLObject = this.f51150f;
        String str = this.f51149e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f51148c;
        ub0 ub0Var = this.f51147b;
        switch (i10) {
            case 0:
                ub0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ub0Var.f52509s = password;
                    TwoStepVerificationActivity.r0(password);
                    ub0Var.n(str2, str);
                    return;
                }
                return;
            default:
                ee0 ee0Var = ub0Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new tb0(ub0Var, str2, str, 1), 8);
                    return;
                }
                ee0Var.C1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new at(22, ub0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    if (isEmpty) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131742541, null);
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131742546, null);
                    }
                    u1Var.S = org.telegram.messenger.gd.M0(2131743694, null);
                    Dialog showDialog = ee0Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ub0Var.f52511x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, G));
                        return;
                    }
                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public qb0(ub0 ub0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f51147b = ub0Var;
        this.f51148c = tL_error;
        this.f51150f = tLObject;
        this.d = str;
        this.f51149e = str2;
    }
}
