package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class km0 implements RequestDelegate {
    public final int f38974a;
    public final mm0 f38975b;

    public km0(mm0 mm0Var, int i10) {
        this.f38974a = i10;
        this.f38975b = mm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38974a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lm0(this.f38975b, tLObject, tL_error));
                return;
            case 1:
                final mm0 mm0Var = this.f38975b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                mm0 mm0Var2 = mm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                an0 an0Var = mm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new km0(mm0Var2, 4), 8);
                                    return;
                                }
                                if (an0Var.f35756y == null) {
                                    an0Var.f35756y = new TL_account.authorizationForm();
                                }
                                mm0Var2.a();
                                return;
                            default:
                                mm0 mm0Var3 = mm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) mm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new km0(mm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new re0(mm0Var3, mm0Var3.f39628b, mm0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final mm0 mm0Var2 = this.f38975b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                mm0 mm0Var22 = mm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                an0 an0Var = mm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new km0(mm0Var22, 4), 8);
                                    return;
                                }
                                if (an0Var.f35756y == null) {
                                    an0Var.f35756y = new TL_account.authorizationForm();
                                }
                                mm0Var22.a();
                                return;
                            default:
                                mm0 mm0Var3 = mm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) mm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new km0(mm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new re0(mm0Var3, mm0Var3.f39628b, mm0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lm0(this.f38975b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lm0(this.f38975b, tL_error, tLObject, 2));
                return;
        }
    }
}
