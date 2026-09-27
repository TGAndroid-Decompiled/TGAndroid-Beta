package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aj0 implements RequestDelegate {
    public final int f32083a;
    public final gj0 f32084b;

    public aj0(gj0 gj0Var, int i10) {
        this.f32083a = i10;
        this.f32084b = gj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32083a) {
            case 0:
                final gj0 gj0Var = this.f32084b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gj0.U(gj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                gj0.W(gj0Var, tL_error, tLObject);
                                return;
                            default:
                                gj0.V(gj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final gj0 gj0Var2 = this.f32084b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gj0.U(gj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                gj0.W(gj0Var2, tL_error, tLObject);
                                return;
                            default:
                                gj0.V(gj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final gj0 gj0Var3 = this.f32084b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                gj0.U(gj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                gj0.W(gj0Var3, tL_error, tLObject);
                                return;
                            default:
                                gj0.V(gj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
