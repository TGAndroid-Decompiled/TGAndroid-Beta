package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 implements RequestDelegate {
    public final int f32224a;
    public final kj0 f32225b;

    public ej0(kj0 kj0Var, int i10) {
        this.f32224a = i10;
        this.f32225b = kj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32224a) {
            case 0:
                final kj0 kj0Var = this.f32225b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                kj0.U(kj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                kj0.W(kj0Var, tL_error, tLObject);
                                return;
                            default:
                                kj0.V(kj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final kj0 kj0Var2 = this.f32225b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                kj0.U(kj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                kj0.W(kj0Var2, tL_error, tLObject);
                                return;
                            default:
                                kj0.V(kj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final kj0 kj0Var3 = this.f32225b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                kj0.U(kj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                kj0.W(kj0Var3, tL_error, tLObject);
                                return;
                            default:
                                kj0.V(kj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
