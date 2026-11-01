package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements RequestDelegate {
    public final int f38883a;
    public final qh0 f38884b;

    public kh0(qh0 qh0Var, int i10) {
        this.f38883a = i10;
        this.f38884b = qh0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38883a) {
            case 0:
                final qh0 qh0Var = this.f38884b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qh0.Z(qh0Var, tL_error, tLObject);
                                return;
                            case 1:
                                qh0.b0(qh0Var, tL_error, tLObject);
                                return;
                            default:
                                qh0.a0(qh0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final qh0 qh0Var2 = this.f38884b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qh0.Z(qh0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                qh0.b0(qh0Var2, tL_error, tLObject);
                                return;
                            default:
                                qh0.a0(qh0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final qh0 qh0Var3 = this.f38884b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qh0.Z(qh0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                qh0.b0(qh0Var3, tL_error, tLObject);
                                return;
                            default:
                                qh0.a0(qh0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
