package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q61 implements RequestDelegate {
    public final int f48939a;
    public final w71 f48940b;

    public q61(w71 w71Var, int i7) {
        this.f48939a = i7;
        this.f48940b = w71Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48939a) {
            case 0:
                final w71 w71Var = this.f48940b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w71.b0(w71Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        w71 w71Var2 = w71Var;
                                        w71Var2.X0 = tL_wallPaper;
                                        w71Var2.g1(false);
                                        w71Var2.o1();
                                        w71Var2.V0.add(0, w71Var2.X0);
                                        u71 u71Var = w71Var2.R0;
                                        if (u71Var != null) {
                                            u71Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final w71 w71Var2 = this.f48940b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w71.b0(w71Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        w71 w71Var22 = w71Var2;
                                        w71Var22.X0 = tL_wallPaper;
                                        w71Var22.g1(false);
                                        w71Var22.o1();
                                        w71Var22.V0.add(0, w71Var22.X0);
                                        u71 u71Var = w71Var22.R0;
                                        if (u71Var != null) {
                                            u71Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
