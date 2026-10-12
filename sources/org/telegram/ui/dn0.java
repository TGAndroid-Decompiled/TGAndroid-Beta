package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class dn0 implements RequestDelegate {
    public final int f35336a;
    public final fn0 f35337b;

    public dn0(fn0 fn0Var, int i10) {
        this.f35336a = i10;
        this.f35337b = fn0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35336a) {
            case 0:
                AndroidUtilities.runOnUIThread(new en0(this.f35337b, tLObject, tL_error));
                return;
            case 1:
                final fn0 fn0Var = this.f35337b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                fn0 fn0Var2 = fn0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                un0 un0Var = fn0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new dn0(fn0Var2, 4), 8);
                                    return;
                                }
                                if (un0Var.f40774y == null) {
                                    un0Var.f40774y = new TL_account.authorizationForm();
                                }
                                fn0Var2.a();
                                return;
                            default:
                                fn0 fn0Var3 = fn0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) fn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new dn0(fn0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new uf0(fn0Var3, fn0Var3.f35868b, fn0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final fn0 fn0Var2 = this.f35337b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                fn0 fn0Var22 = fn0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                un0 un0Var = fn0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new dn0(fn0Var22, 4), 8);
                                    return;
                                }
                                if (un0Var.f40774y == null) {
                                    un0Var.f40774y = new TL_account.authorizationForm();
                                }
                                fn0Var22.a();
                                return;
                            default:
                                fn0 fn0Var3 = fn0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) fn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new dn0(fn0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new uf0(fn0Var3, fn0Var3.f35868b, fn0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new en0(this.f35337b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new en0(this.f35337b, tL_error, tLObject, 2));
                return;
        }
    }
}
