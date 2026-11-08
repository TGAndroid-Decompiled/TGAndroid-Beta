package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p61 implements RequestDelegate {
    public final int f48667a;
    public final v71 f48668b;

    public p61(v71 v71Var, int i7) {
        this.f48667a = i7;
        this.f48668b = v71Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48667a) {
            case 0:
                final v71 v71Var = this.f48668b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v71.b0(v71Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        v71 v71Var2 = v71Var;
                                        v71Var2.X0 = tL_wallPaper;
                                        v71Var2.g1(false);
                                        v71Var2.o1();
                                        v71Var2.V0.add(0, v71Var2.X0);
                                        t71 t71Var = v71Var2.R0;
                                        if (t71Var != null) {
                                            t71Var.f();
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
                final v71 v71Var2 = this.f48668b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v71.b0(v71Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        v71 v71Var22 = v71Var2;
                                        v71Var22.X0 = tL_wallPaper;
                                        v71Var22.g1(false);
                                        v71Var22.o1();
                                        v71Var22.V0.add(0, v71Var22.X0);
                                        t71 t71Var = v71Var22.R0;
                                        if (t71Var != null) {
                                            t71Var.f();
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
