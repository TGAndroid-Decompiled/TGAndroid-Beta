package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pj0 implements RequestDelegate {
    public final int f48728a;
    public final rj0 f48729b;

    public pj0(rj0 rj0Var, int i7) {
        this.f48728a = i7;
        this.f48729b = rj0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f48728a) {
            case 0:
                org.telegram.messenger.g0.h3(new qj0(this.f48729b, tLObject, tL_error));
                return;
            case 1:
                final rj0 rj0Var = this.f48729b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                rj0 rj0Var2 = rj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                dk0 dk0Var = rj0Var2.f49497e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new pj0(rj0Var2, 4), 8);
                                    return;
                                }
                                if (dk0Var.D == null) {
                                    dk0Var.D = new TL_account.authorizationForm();
                                }
                                rj0Var2.a();
                                return;
                            default:
                                rj0 rj0Var3 = rj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) rj0Var3.f49497e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new pj0(rj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f21336e.c(new oc0(rj0Var3, rj0Var3.f49495b, rj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final rj0 rj0Var2 = this.f48729b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                rj0 rj0Var22 = rj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                dk0 dk0Var = rj0Var22.f49497e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new pj0(rj0Var22, 4), 8);
                                    return;
                                }
                                if (dk0Var.D == null) {
                                    dk0Var.D = new TL_account.authorizationForm();
                                }
                                rj0Var22.a();
                                return;
                            default:
                                rj0 rj0Var3 = rj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) rj0Var3.f49497e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new pj0(rj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f21336e.c(new oc0(rj0Var3, rj0Var3.f49495b, rj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.g0.h3(new qj0(this.f48729b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new qj0(this.f48729b, tL_error, tLObject, 2));
                return;
        }
    }
}
