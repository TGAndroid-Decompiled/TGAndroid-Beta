package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l61 implements RequestDelegate {
    public final int f48876a;
    public final t71 f48877b;

    public l61(t71 t71Var, int i7) {
        this.f48876a = i7;
        this.f48877b = t71Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48876a) {
            case 0:
                final t71 t71Var = this.f48877b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t71.b0(t71Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        t71 t71Var2 = t71Var;
                                        t71Var2.Y0 = tL_wallPaper;
                                        t71Var2.g1(false);
                                        t71Var2.o1();
                                        t71Var2.W0.add(0, t71Var2.Y0);
                                        r71 r71Var = t71Var2.S0;
                                        if (r71Var != null) {
                                            r71Var.f();
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
                final t71 t71Var2 = this.f48877b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t71.b0(t71Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        t71 t71Var22 = t71Var2;
                                        t71Var22.Y0 = tL_wallPaper;
                                        t71Var22.g1(false);
                                        t71Var22.o1();
                                        t71Var22.W0.add(0, t71Var22.Y0);
                                        r71 r71Var = t71Var22.S0;
                                        if (r71Var != null) {
                                            r71Var.f();
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
