package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mi0 implements RequestDelegate {
    public final int f40576a;
    public final si0 f40577b;

    public mi0(si0 si0Var, int i10) {
        this.f40576a = i10;
        this.f40577b = si0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40576a) {
            case 0:
                final si0 si0Var = this.f40577b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                si0.U(si0Var, tL_error, tLObject);
                                return;
                            case 1:
                                si0.W(si0Var, tL_error, tLObject);
                                return;
                            default:
                                si0.V(si0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final si0 si0Var2 = this.f40577b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                si0.U(si0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                si0.W(si0Var2, tL_error, tLObject);
                                return;
                            default:
                                si0.V(si0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final si0 si0Var3 = this.f40577b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                si0.U(si0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                si0.W(si0Var3, tL_error, tLObject);
                                return;
                            default:
                                si0.V(si0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
