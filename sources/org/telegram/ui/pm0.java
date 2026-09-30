package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pm0 implements RequestDelegate {
    public final int f36684a;
    public final rm0 f36685b;

    public pm0(rm0 rm0Var, int i10) {
        this.f36684a = i10;
        this.f36685b = rm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36684a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qm0(this.f36685b, tLObject, tL_error));
                return;
            case 1:
                final rm0 rm0Var = this.f36685b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                rm0 rm0Var2 = rm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                fn0 fn0Var = rm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) fn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new pm0(rm0Var2, 4), 8);
                                    return;
                                }
                                if (fn0Var.f33842y == null) {
                                    fn0Var.f33842y = new TL_account.authorizationForm();
                                }
                                rm0Var2.a();
                                return;
                            default:
                                rm0 rm0Var3 = rm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) rm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new pm0(rm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new jf0(rm0Var3, rm0Var3.f37479b, rm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final rm0 rm0Var2 = this.f36685b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                rm0 rm0Var22 = rm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                fn0 fn0Var = rm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) fn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new pm0(rm0Var22, 4), 8);
                                    return;
                                }
                                if (fn0Var.f33842y == null) {
                                    fn0Var.f33842y = new TL_account.authorizationForm();
                                }
                                rm0Var22.a();
                                return;
                            default:
                                rm0 rm0Var3 = rm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) rm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new pm0(rm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new jf0(rm0Var3, rm0Var3.f37479b, rm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qm0(this.f36685b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qm0(this.f36685b, tL_error, tLObject, 2));
                return;
        }
    }
}
