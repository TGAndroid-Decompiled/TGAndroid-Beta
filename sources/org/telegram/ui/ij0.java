package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij0 implements RequestDelegate {
    public final int f36825a;
    public final pj0 f36826b;

    public ij0(pj0 pj0Var, int i10) {
        this.f36825a = i10;
        this.f36826b = pj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36825a) {
            case 0:
                final pj0 pj0Var = this.f36826b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                pj0.U(pj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                pj0.W(pj0Var, tL_error, tLObject);
                                return;
                            default:
                                pj0.V(pj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final pj0 pj0Var2 = this.f36826b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                pj0.U(pj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                pj0.W(pj0Var2, tL_error, tLObject);
                                return;
                            default:
                                pj0.V(pj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final pj0 pj0Var3 = this.f36826b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                pj0.U(pj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                pj0.W(pj0Var3, tL_error, tLObject);
                                return;
                            default:
                                pj0.V(pj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
