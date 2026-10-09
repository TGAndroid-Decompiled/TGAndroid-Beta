package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj0 implements RequestDelegate {
    public final int f37620a;
    public final lj0 f37621b;

    public fj0(lj0 lj0Var, int i10) {
        this.f37620a = i10;
        this.f37621b = lj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37620a) {
            case 0:
                final lj0 lj0Var = this.f37621b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lj0.U(lj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                lj0.W(lj0Var, tL_error, tLObject);
                                return;
                            default:
                                lj0.V(lj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final lj0 lj0Var2 = this.f37621b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lj0.U(lj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                lj0.W(lj0Var2, tL_error, tLObject);
                                return;
                            default:
                                lj0.V(lj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final lj0 lj0Var3 = this.f37621b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lj0.U(lj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                lj0.W(lj0Var3, tL_error, tLObject);
                                return;
                            default:
                                lj0.V(lj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
