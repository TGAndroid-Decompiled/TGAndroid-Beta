package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cn0 implements RequestDelegate {
    public final int f34735a;
    public final en0 f34736b;

    public cn0(en0 en0Var, int i10) {
        this.f34735a = i10;
        this.f34736b = en0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34735a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dn0(this.f34736b, tLObject, tL_error));
                return;
            case 1:
                final en0 en0Var = this.f34736b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                en0 en0Var2 = en0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                sn0 sn0Var = en0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new cn0(en0Var2, 4), 8);
                                    return;
                                }
                                if (sn0Var.f39909y == null) {
                                    sn0Var.f39909y = new TL_account.authorizationForm();
                                }
                                en0Var2.a();
                                return;
                            default:
                                en0 en0Var3 = en0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) en0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new cn0(en0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new tf0(en0Var3, en0Var3.f35339b, en0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final en0 en0Var2 = this.f34736b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                en0 en0Var22 = en0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                sn0 sn0Var = en0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new cn0(en0Var22, 4), 8);
                                    return;
                                }
                                if (sn0Var.f39909y == null) {
                                    sn0Var.f39909y = new TL_account.authorizationForm();
                                }
                                en0Var22.a();
                                return;
                            default:
                                en0 en0Var3 = en0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) en0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new cn0(en0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new tf0(en0Var3, en0Var3.f35339b, en0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new dn0(this.f34736b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dn0(this.f34736b, tL_error, tLObject, 2));
                return;
        }
    }
}
