package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fg0 implements RequestDelegate {
    public final int f45715a;
    public final lg0 f45716b;

    public fg0(lg0 lg0Var, int i7) {
        this.f45715a = i7;
        this.f45716b = lg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45715a) {
            case 0:
                final lg0 lg0Var = this.f45716b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lg0.Z(lg0Var, tL_error, tLObject);
                                return;
                            case 1:
                                lg0.b0(lg0Var, tL_error, tLObject);
                                return;
                            default:
                                lg0.a0(lg0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final lg0 lg0Var2 = this.f45716b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lg0.Z(lg0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                lg0.b0(lg0Var2, tL_error, tLObject);
                                return;
                            default:
                                lg0.a0(lg0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final lg0 lg0Var3 = this.f45716b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                lg0.Z(lg0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                lg0.b0(lg0Var3, tL_error, tLObject);
                                return;
                            default:
                                lg0.a0(lg0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
