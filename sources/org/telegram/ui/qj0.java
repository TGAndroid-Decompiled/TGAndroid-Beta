package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qj0 implements RequestDelegate {
    public final int f50632a;
    public final sj0 f50633b;

    public qj0(sj0 sj0Var, int i7) {
        this.f50632a = i7;
        this.f50633b = sj0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50632a) {
            case 0:
                org.telegram.messenger.g0.h3(new rj0(this.f50633b, tLObject, tL_error));
                return;
            case 1:
                final sj0 sj0Var = this.f50633b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                sj0 sj0Var2 = sj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ek0 ek0Var = sj0Var2.f51237e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new qj0(sj0Var2, 4), 8);
                                    return;
                                }
                                if (ek0Var.E == null) {
                                    ek0Var.E = new TL_account.authorizationForm();
                                }
                                sj0Var2.a();
                                return;
                            default:
                                sj0 sj0Var3 = sj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.e2) sj0Var3.f51237e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new qj0(sj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f22416e.c(new lc0(sj0Var3, sj0Var3.f51235b, sj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final sj0 sj0Var2 = this.f50633b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                sj0 sj0Var22 = sj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ek0 ek0Var = sj0Var22.f51237e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new qj0(sj0Var22, 4), 8);
                                    return;
                                }
                                if (ek0Var.E == null) {
                                    ek0Var.E = new TL_account.authorizationForm();
                                }
                                sj0Var22.a();
                                return;
                            default:
                                sj0 sj0Var3 = sj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.e2) sj0Var3.f51237e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new qj0(sj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f22416e.c(new lc0(sj0Var3, sj0Var3.f51235b, sj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.g0.h3(new rj0(this.f50633b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new rj0(this.f50633b, tL_error, tLObject, 2));
                return;
        }
    }
}
