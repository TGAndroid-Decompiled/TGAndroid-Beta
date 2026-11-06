package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nj0 implements RequestDelegate {
    public final int f48032a;
    public final pj0 f48033b;

    public nj0(pj0 pj0Var, int i7) {
        this.f48032a = i7;
        this.f48033b = pj0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f48032a) {
            case 0:
                org.telegram.messenger.g0.h3(new oj0(this.f48033b, tLObject, tL_error));
                return;
            case 1:
                final pj0 pj0Var = this.f48033b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                pj0 pj0Var2 = pj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                bk0 bk0Var = pj0Var2.f48850e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new nj0(pj0Var2, 4), 8);
                                    return;
                                }
                                if (bk0Var.D == null) {
                                    bk0Var.D = new TL_account.authorizationForm();
                                }
                                pj0Var2.a();
                                return;
                            default:
                                pj0 pj0Var3 = pj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) pj0Var3.f48850e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new nj0(pj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f21333e.c(new mc0(pj0Var3, pj0Var3.f48848b, pj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final pj0 pj0Var2 = this.f48033b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                pj0 pj0Var22 = pj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                bk0 bk0Var = pj0Var22.f48850e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new nj0(pj0Var22, 4), 8);
                                    return;
                                }
                                if (bk0Var.D == null) {
                                    bk0Var.D = new TL_account.authorizationForm();
                                }
                                pj0Var22.a();
                                return;
                            default:
                                pj0 pj0Var3 = pj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) pj0Var3.f48850e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new nj0(pj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f21333e.c(new mc0(pj0Var3, pj0Var3.f48848b, pj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.g0.h3(new oj0(this.f48033b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new oj0(this.f48033b, tL_error, tLObject, 2));
                return;
        }
    }
}
