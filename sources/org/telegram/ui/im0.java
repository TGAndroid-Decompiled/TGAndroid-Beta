package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class im0 implements RequestDelegate {

    public final int f39131a;

    public final km0 f39132b;

    public im0(km0 km0Var, int i10) {
        this.f39131a = i10;
        this.f39132b = km0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39131a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jm0(this.f39132b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final km0 km0Var = this.f39132b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                km0 km0Var2 = km0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xm0 xm0Var = km0Var2.f39810e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(new TL_account.getPassword(), new im0(km0Var2, 4), 8);
                                } else {
                                    if (xm0Var.f44535y == null) {
                                        xm0Var.f44535y = new TL_account.authorizationForm();
                                    }
                                    km0Var2.a();
                                }
                                break;
                            default:
                                km0 km0Var3 = km0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) km0Var3.f39810e).currentAccount).sendRequest(new TL_account.getPassword(), new im0(km0Var3, 3), 8);
                                } else {
                                    Utilities.globalQueue.postRunnable(new bf0(km0Var3, km0Var3.f39808b, km0Var3.d, 12));
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final km0 km0Var2 = this.f39132b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                km0 km0Var3 = km0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xm0 xm0Var = km0Var3.f39810e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(new TL_account.getPassword(), new im0(km0Var3, 4), 8);
                                } else {
                                    if (xm0Var.f44535y == null) {
                                        xm0Var.f44535y = new TL_account.authorizationForm();
                                    }
                                    km0Var3.a();
                                }
                                break;
                            default:
                                km0 km0Var4 = km0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) km0Var4.f39810e).currentAccount).sendRequest(new TL_account.getPassword(), new im0(km0Var4, 3), 8);
                                } else {
                                    Utilities.globalQueue.postRunnable(new bf0(km0Var4, km0Var4.f39808b, km0Var4.d, 12));
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new jm0(this.f39132b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jm0(this.f39132b, tL_error, tLObject, 2));
                break;
        }
    }
}
