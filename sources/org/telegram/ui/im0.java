package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class im0 implements RequestDelegate {
    public final int f37921a;
    public final km0 f37922b;

    public im0(km0 km0Var, int i10) {
        this.f37921a = i10;
        this.f37922b = km0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37921a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jm0(this.f37922b, tLObject, tL_error));
                return;
            case 1:
                final km0 km0Var = this.f37922b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                km0 km0Var2 = km0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xm0 xm0Var = km0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new im0(km0Var2, 4), 8);
                                    return;
                                }
                                if (xm0Var.f43218y == null) {
                                    xm0Var.f43218y = new TL_account.authorizationForm();
                                }
                                km0Var2.a();
                                return;
                            default:
                                km0 km0Var3 = km0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) km0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new im0(km0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new xe0(km0Var3, km0Var3.f38578b, km0Var3.d, 13));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final km0 km0Var2 = this.f37922b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                km0 km0Var22 = km0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xm0 xm0Var = km0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new im0(km0Var22, 4), 8);
                                    return;
                                }
                                if (xm0Var.f43218y == null) {
                                    xm0Var.f43218y = new TL_account.authorizationForm();
                                }
                                km0Var22.a();
                                return;
                            default:
                                km0 km0Var3 = km0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) km0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new im0(km0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new xe0(km0Var3, km0Var3.f38578b, km0Var3.d, 13));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new jm0(this.f37922b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jm0(this.f37922b, tL_error, tLObject, 2));
                return;
        }
    }
}
