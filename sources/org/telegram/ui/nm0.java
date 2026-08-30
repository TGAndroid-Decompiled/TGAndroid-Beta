package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nm0 implements RequestDelegate {
    public final int f36689a;
    public final pm0 f36690b;

    public nm0(pm0 pm0Var, int i10) {
        this.f36689a = i10;
        this.f36690b = pm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36689a) {
            case 0:
                AndroidUtilities.runOnUIThread(new om0(this.f36690b, tLObject, tL_error));
                return;
            case 1:
                final pm0 pm0Var = this.f36690b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                pm0 pm0Var2 = pm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                dn0 dn0Var = pm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new nm0(pm0Var2, 4), 8);
                                    return;
                                }
                                if (dn0Var.f33737y == null) {
                                    dn0Var.f33737y = new TL_account.authorizationForm();
                                }
                                pm0Var2.a();
                                return;
                            default:
                                pm0 pm0Var3 = pm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.p2) pm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new nm0(pm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new hf0(pm0Var3, pm0Var3.f37376b, pm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final pm0 pm0Var2 = this.f36690b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                pm0 pm0Var22 = pm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                dn0 dn0Var = pm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new nm0(pm0Var22, 4), 8);
                                    return;
                                }
                                if (dn0Var.f33737y == null) {
                                    dn0Var.f33737y = new TL_account.authorizationForm();
                                }
                                pm0Var22.a();
                                return;
                            default:
                                pm0 pm0Var3 = pm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.p2) pm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new nm0(pm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new hf0(pm0Var3, pm0Var3.f37376b, pm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new om0(this.f36690b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new om0(this.f36690b, tL_error, tLObject, 2));
                return;
        }
    }
}
