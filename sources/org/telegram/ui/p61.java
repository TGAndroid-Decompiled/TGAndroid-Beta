package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p61 implements RequestDelegate {
    public final int f50765a;
    public final x71 f50766b;

    public p61(x71 x71Var, int i7) {
        this.f50765a = i7;
        this.f50766b = x71Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50765a) {
            case 0:
                final x71 x71Var = this.f50766b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x71.b0(x71Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        x71 x71Var2 = x71Var;
                                        x71Var2.Y0 = tL_wallPaper;
                                        x71Var2.g1(false);
                                        x71Var2.o1();
                                        x71Var2.W0.add(0, x71Var2.Y0);
                                        v71 v71Var = x71Var2.S0;
                                        if (v71Var != null) {
                                            v71Var.f();
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
                final x71 x71Var2 = this.f50766b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x71.b0(x71Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        x71 x71Var22 = x71Var2;
                                        x71Var22.Y0 = tL_wallPaper;
                                        x71Var22.g1(false);
                                        x71Var22.o1();
                                        x71Var22.W0.add(0, x71Var22.Y0);
                                        v71 v71Var = x71Var22.S0;
                                        if (v71Var != null) {
                                            v71Var.f();
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
