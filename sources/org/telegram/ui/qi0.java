package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qi0 implements RequestDelegate {
    public final int f40448a;
    public final wi0 f40449b;

    public qi0(wi0 wi0Var, int i10) {
        this.f40448a = i10;
        this.f40449b = wi0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40448a) {
            case 0:
                final wi0 wi0Var = this.f40449b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                wi0.U(wi0Var, tL_error, tLObject);
                                return;
                            case 1:
                                wi0.W(wi0Var, tL_error, tLObject);
                                return;
                            default:
                                wi0.V(wi0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final wi0 wi0Var2 = this.f40449b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                wi0.U(wi0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                wi0.W(wi0Var2, tL_error, tLObject);
                                return;
                            default:
                                wi0.V(wi0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final wi0 wi0Var3 = this.f40449b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                wi0.U(wi0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                wi0.W(wi0Var3, tL_error, tLObject);
                                return;
                            default:
                                wi0.V(wi0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
