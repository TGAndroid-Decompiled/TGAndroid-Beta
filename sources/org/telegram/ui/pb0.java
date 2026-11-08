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
    public final int f48763a = 1;
    public final ub0 f48764b;
    public final TLRPC.TL_error f48765c;
    public final String d;
    public final String f48766e;
    public final TLObject f48767f;

    public pb0(ub0 ub0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f48764b = ub0Var;
        this.f48765c = tL_error;
        this.d = str;
        this.f48766e = str2;
        this.f48767f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f48763a;
        TLObject tLObject = this.f48767f;
        String str = this.f48766e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f48765c;
        ub0 ub0Var = this.f48764b;
        switch (i10) {
            case 0:
                ub0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ub0Var.f50299s = password;
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
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new pu(19, ub0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    if (isEmpty) {
                        u1Var.T = org.telegram.messenger.id.M0(2131742802, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131742807, null);
                    }
                    u1Var.R = org.telegram.messenger.id.M0(2131743934, null);
                    Dialog showDialog = ce0Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ub0Var.f50301x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public pb0(ub0 ub0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f48764b = ub0Var;
        this.f48765c = tL_error;
        this.f48767f = tLObject;
        this.d = str;
        this.f48766e = str2;
    }
}
