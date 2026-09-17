package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class an0 implements RequestDelegate {
    public final int f31933a;
    public final cn0 f31934b;

    public an0(cn0 cn0Var, int i10) {
        this.f31933a = i10;
        this.f31934b = cn0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f31933a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bn0(this.f31934b, tLObject, tL_error));
                return;
            case 1:
                final cn0 cn0Var = this.f31934b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                cn0 cn0Var2 = cn0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                qn0 qn0Var = cn0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new an0(cn0Var2, 4), 8);
                                    return;
                                }
                                if (qn0Var.f36997y == null) {
                                    qn0Var.f36997y = new TL_account.authorizationForm();
                                }
                                cn0Var2.a();
                                return;
                            default:
                                cn0 cn0Var3 = cn0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) cn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new an0(cn0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new rf0(cn0Var3, cn0Var3.f32841b, cn0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final cn0 cn0Var2 = this.f31934b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                cn0 cn0Var22 = cn0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                qn0 qn0Var = cn0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new an0(cn0Var22, 4), 8);
                                    return;
                                }
                                if (qn0Var.f36997y == null) {
                                    qn0Var.f36997y = new TL_account.authorizationForm();
                                }
                                cn0Var22.a();
                                return;
                            default:
                                cn0 cn0Var3 = cn0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) cn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new an0(cn0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new rf0(cn0Var3, cn0Var3.f32841b, cn0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bn0(this.f31934b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bn0(this.f31934b, tL_error, tLObject, 2));
                return;
        }
    }
}
