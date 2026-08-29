package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class fm0 implements RequestDelegate {
    public final int f38210a;
    public final hm0 f38211b;

    public fm0(hm0 hm0Var, int i10) {
        this.f38210a = i10;
        this.f38211b = hm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38210a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gm0(this.f38211b, tLObject, tL_error));
                return;
            case 1:
                final hm0 hm0Var = this.f38211b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                hm0 hm0Var2 = hm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vm0 vm0Var = hm0Var2.f38964e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fm0(hm0Var2, 4), 8);
                                    return;
                                }
                                if (vm0Var.f43678y == null) {
                                    vm0Var.f43678y = new TL_account.authorizationForm();
                                }
                                hm0Var2.a();
                                return;
                            default:
                                hm0 hm0Var3 = hm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) hm0Var3.f38964e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new fm0(hm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.f38962b, hm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final hm0 hm0Var2 = this.f38211b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                hm0 hm0Var22 = hm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vm0 vm0Var = hm0Var22.f38964e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fm0(hm0Var22, 4), 8);
                                    return;
                                }
                                if (vm0Var.f43678y == null) {
                                    vm0Var.f43678y = new TL_account.authorizationForm();
                                }
                                hm0Var22.a();
                                return;
                            default:
                                hm0 hm0Var3 = hm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) hm0Var3.f38964e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new fm0(hm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.f38962b, hm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gm0(this.f38211b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gm0(this.f38211b, tL_error, tLObject, 2));
                return;
        }
    }
}
