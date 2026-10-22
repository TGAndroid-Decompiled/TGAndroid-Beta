package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oi0 implements RequestDelegate {
    public final int f39906a;
    public final ui0 f39907b;

    public oi0(ui0 ui0Var, int i10) {
        this.f39906a = i10;
        this.f39907b = ui0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39906a) {
            case 0:
                final ui0 ui0Var = this.f39907b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ui0.U(ui0Var, tL_error, tLObject);
                                return;
                            case 1:
                                ui0.W(ui0Var, tL_error, tLObject);
                                return;
                            default:
                                ui0.V(ui0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final ui0 ui0Var2 = this.f39907b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ui0.U(ui0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                ui0.W(ui0Var2, tL_error, tLObject);
                                return;
                            default:
                                ui0.V(ui0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final ui0 ui0Var3 = this.f39907b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ui0.U(ui0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                ui0.W(ui0Var3, tL_error, tLObject);
                                return;
                            default:
                                ui0.V(ui0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
