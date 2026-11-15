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
    public final int f50233a = 1;
    public final tb0 f50234b;
    public final TLRPC.TL_error f50235c;
    public final String d;
    public final String f50236e;
    public final TLObject f50237f;

    public pb0(tb0 tb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f50234b = tb0Var;
        this.f50235c = tL_error;
        this.d = str;
        this.f50236e = str2;
        this.f50237f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f50233a;
        TLObject tLObject = this.f50237f;
        String str = this.f50236e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f50235c;
        tb0 tb0Var = this.f50234b;
        switch (i10) {
            case 0:
                tb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    tb0Var.f51530s = password;
                    TwoStepVerificationActivity.r0(password);
                    tb0Var.n(str2, str);
                    return;
                }
                return;
            default:
                ce0 ce0Var = tb0Var.H;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new sb0(tb0Var, str2, str, 1), 8);
                    return;
                }
                ce0Var.C1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new tr(23, tb0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    if (isEmpty) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131742799, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131742804, null);
                    }
                    t1Var.S = org.telegram.messenger.hd.M0(2131743931, null);
                    Dialog showDialog = ce0Var.showDialog(t1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    tb0Var.f51532x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
                        return;
                    }
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public pb0(tb0 tb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f50234b = tb0Var;
        this.f50235c = tL_error;
        this.f50237f = tLObject;
        this.d = str;
        this.f50236e = str2;
    }
}
