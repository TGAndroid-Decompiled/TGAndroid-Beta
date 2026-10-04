package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bj0 implements RequestDelegate {
    public final int f35121a;
    public final hj0 f35122b;

    public bj0(hj0 hj0Var, int i10) {
        this.f35121a = i10;
        this.f35122b = hj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35121a) {
            case 0:
                final hj0 hj0Var = this.f35122b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hj0.S(hj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                hj0.U(hj0Var, tL_error, tLObject);
                                return;
                            default:
                                hj0.T(hj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final hj0 hj0Var2 = this.f35122b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hj0.S(hj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                hj0.U(hj0Var2, tL_error, tLObject);
                                return;
                            default:
                                hj0.T(hj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final hj0 hj0Var3 = this.f35122b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hj0.S(hj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                hj0.U(hj0Var3, tL_error, tLObject);
                                return;
                            default:
                                hj0.T(hj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
