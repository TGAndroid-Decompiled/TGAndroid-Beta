package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gg0 implements RequestDelegate {
    public final int f48102a;
    public final ng0 f48103b;

    public gg0(ng0 ng0Var, int i7) {
        this.f48102a = i7;
        this.f48103b = ng0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f48102a) {
            case 0:
                final ng0 ng0Var = this.f48103b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ng0.Z(ng0Var, tL_error, tLObject);
                                return;
                            case 1:
                                ng0.b0(ng0Var, tL_error, tLObject);
                                return;
                            default:
                                ng0.a0(ng0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final ng0 ng0Var2 = this.f48103b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ng0.Z(ng0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                ng0.b0(ng0Var2, tL_error, tLObject);
                                return;
                            default:
                                ng0.a0(ng0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final ng0 ng0Var3 = this.f48103b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ng0.Z(ng0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                ng0.b0(ng0Var3, tL_error, tLObject);
                                return;
                            default:
                                ng0.a0(ng0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
