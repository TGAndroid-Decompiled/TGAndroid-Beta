package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hm0 implements RequestDelegate {
    public final int f38831a;
    public final jm0 f38832b;

    public hm0(jm0 jm0Var, int i9) {
        this.f38831a = i9;
        this.f38832b = jm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38831a) {
            case 0:
                AndroidUtilities.runOnUIThread(new im0(this.f38832b, tLObject, tL_error));
                return;
            case 1:
                final jm0 jm0Var = this.f38832b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9;
                        int i10;
                        switch (r3) {
                            case 0:
                                jm0 jm0Var2 = jm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                wm0 wm0Var = jm0Var2.f39531e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i9).sendRequest(getpassword, new hm0(jm0Var2, 4), 8);
                                    return;
                                }
                                if (wm0Var.f44204y == null) {
                                    wm0Var.f44204y = new TL_account.authorizationForm();
                                }
                                jm0Var2.a();
                                return;
                            default:
                                jm0 jm0Var3 = jm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) jm0Var3.f39531e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new hm0(jm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.f39529b, jm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final jm0 jm0Var2 = this.f38832b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9;
                        int i10;
                        switch (r3) {
                            case 0:
                                jm0 jm0Var22 = jm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                wm0 wm0Var = jm0Var22.f39531e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i9).sendRequest(getpassword, new hm0(jm0Var22, 4), 8);
                                    return;
                                }
                                if (wm0Var.f44204y == null) {
                                    wm0Var.f44204y = new TL_account.authorizationForm();
                                }
                                jm0Var22.a();
                                return;
                            default:
                                jm0 jm0Var3 = jm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) jm0Var3.f39531e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new hm0(jm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.f39529b, jm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new im0(this.f38832b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new im0(this.f38832b, tL_error, tLObject, 2));
                return;
        }
    }
}
