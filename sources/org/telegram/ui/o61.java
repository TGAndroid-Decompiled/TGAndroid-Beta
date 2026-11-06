package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o61 implements RequestDelegate {
    public final int f48259a;
    public final u71 f48260b;

    public o61(u71 u71Var, int i7) {
        this.f48259a = i7;
        this.f48260b = u71Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48259a) {
            case 0:
                final u71 u71Var = this.f48260b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u71.b0(u71Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        u71 u71Var2 = u71Var;
                                        u71Var2.X0 = tL_wallPaper;
                                        u71Var2.g1(false);
                                        u71Var2.o1();
                                        u71Var2.V0.add(0, u71Var2.X0);
                                        s71 s71Var = u71Var2.R0;
                                        if (s71Var != null) {
                                            s71Var.f();
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
                final u71 u71Var2 = this.f48260b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u71.b0(u71Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        u71 u71Var22 = u71Var2;
                                        u71Var22.X0 = tL_wallPaper;
                                        u71Var22.g1(false);
                                        u71Var22.o1();
                                        u71Var22.V0.add(0, u71Var22.X0);
                                        s71 s71Var = u71Var22.R0;
                                        if (s71Var != null) {
                                            s71Var.f();
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
