package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ni0 implements RequestDelegate {
    public final int f40745a;
    public final ti0 f40746b;

    public ni0(ti0 ti0Var, int i9) {
        this.f40745a = i9;
        this.f40746b = ti0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40745a) {
            case 0:
                final ti0 ti0Var = this.f40746b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ti0.T(ti0Var, tL_error, tLObject);
                                return;
                            case 1:
                                ti0.V(ti0Var, tL_error, tLObject);
                                return;
                            default:
                                ti0.U(ti0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final ti0 ti0Var2 = this.f40746b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ti0.T(ti0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                ti0.V(ti0Var2, tL_error, tLObject);
                                return;
                            default:
                                ti0.U(ti0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final ti0 ti0Var3 = this.f40746b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ti0.T(ti0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                ti0.V(ti0Var3, tL_error, tLObject);
                                return;
                            default:
                                ti0.U(ti0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
