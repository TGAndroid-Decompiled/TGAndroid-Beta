package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj0 implements RequestDelegate {
    public final int f38077a;
    public final mj0 f38078b;

    public gj0(mj0 mj0Var, int i10) {
        this.f38077a = i10;
        this.f38078b = mj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38077a) {
            case 0:
                final mj0 mj0Var = this.f38078b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mj0.U(mj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                mj0.W(mj0Var, tL_error, tLObject);
                                return;
                            default:
                                mj0.V(mj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final mj0 mj0Var2 = this.f38078b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mj0.U(mj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                mj0.W(mj0Var2, tL_error, tLObject);
                                return;
                            default:
                                mj0.V(mj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final mj0 mj0Var3 = this.f38078b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                mj0.U(mj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                mj0.W(mj0Var3, tL_error, tLObject);
                                return;
                            default:
                                mj0.V(mj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
