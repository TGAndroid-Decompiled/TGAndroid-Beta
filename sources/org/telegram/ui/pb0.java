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
    public final int f48769a = 1;
    public final ub0 f48770b;
    public final TLRPC.TL_error f48771c;
    public final String d;
    public final String f48772e;
    public final TLObject f48773f;

    public pb0(ub0 ub0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f48770b = ub0Var;
        this.f48771c = tL_error;
        this.d = str;
        this.f48772e = str2;
        this.f48773f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f48769a;
        TLObject tLObject = this.f48773f;
        String str = this.f48772e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f48771c;
        ub0 ub0Var = this.f48770b;
        switch (i10) {
            case 0:
                ub0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ub0Var.f50384s = password;
                    TwoStepVerificationActivity.r0(password);
                    ub0Var.n(str2, str);
                    return;
                }
                return;
            default:
                ce0 ce0Var = ub0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new sb0(ub0Var, str2, str, 1), 8);
                    return;
                }
                ce0Var.C1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new pu(19, ub0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    if (isEmpty) {
                        u1Var.T = org.telegram.messenger.hd.M0(2131742800, null);
                    } else {
                        u1Var.T = org.telegram.messenger.hd.M0(2131742805, null);
                    }
                    u1Var.R = org.telegram.messenger.hd.M0(2131743932, null);
                    Dialog showDialog = ce0Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ub0Var.f50386x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public pb0(ub0 ub0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f48770b = ub0Var;
        this.f48771c = tL_error;
        this.f48773f = tLObject;
        this.d = str;
        this.f48772e = str2;
    }
}
