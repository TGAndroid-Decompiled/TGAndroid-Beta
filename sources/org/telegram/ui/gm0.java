package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gm0 implements RequestDelegate {
    public final int f37360a;
    public final im0 f37361b;

    public gm0(im0 im0Var, int i10) {
        this.f37360a = i10;
        this.f37361b = im0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37360a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hm0(this.f37361b, tLObject, tL_error));
                return;
            case 1:
                final im0 im0Var = this.f37361b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                im0 im0Var2 = im0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vm0 vm0Var = im0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) vm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new gm0(im0Var2, 4), 8);
                                    return;
                                }
                                if (vm0Var.f42340y == null) {
                                    vm0Var.f42340y = new TL_account.authorizationForm();
                                }
                                im0Var2.a();
                                return;
                            default:
                                im0 im0Var3 = im0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) im0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new gm0(im0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new ve0(im0Var3, im0Var3.f38033b, im0Var3.d, 13));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final im0 im0Var2 = this.f37361b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                im0 im0Var22 = im0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vm0 vm0Var = im0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) vm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new gm0(im0Var22, 4), 8);
                                    return;
                                }
                                if (vm0Var.f42340y == null) {
                                    vm0Var.f42340y = new TL_account.authorizationForm();
                                }
                                im0Var22.a();
                                return;
                            default:
                                im0 im0Var3 = im0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) im0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new gm0(im0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new ve0(im0Var3, im0Var3.f38033b, im0Var3.d, 13));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hm0(this.f37361b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hm0(this.f37361b, tL_error, tLObject, 2));
                return;
        }
    }
}
