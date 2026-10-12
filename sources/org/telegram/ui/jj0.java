package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jj0 implements RequestDelegate {
    public final int f37398a;
    public final qj0 f37399b;

    public jj0(qj0 qj0Var, int i10) {
        this.f37398a = i10;
        this.f37399b = qj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37398a) {
            case 0:
                final qj0 qj0Var = this.f37399b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qj0.U(qj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                qj0.W(qj0Var, tL_error, tLObject);
                                return;
                            default:
                                qj0.V(qj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final qj0 qj0Var2 = this.f37399b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qj0.U(qj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                qj0.W(qj0Var2, tL_error, tLObject);
                                return;
                            default:
                                qj0.V(qj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final qj0 qj0Var3 = this.f37399b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qj0.U(qj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                qj0.W(qj0Var3, tL_error, tLObject);
                                return;
                            default:
                                qj0.V(qj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
