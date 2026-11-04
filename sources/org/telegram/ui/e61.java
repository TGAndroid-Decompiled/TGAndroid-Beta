package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e61 implements RequestDelegate {
    public final int f44907a;
    public final l71 f44908b;

    public e61(l71 l71Var, int i3) {
        this.f44907a = i3;
        this.f44908b = l71Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44907a) {
            case 0:
                final l71 l71Var = this.f44908b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l71.b0(l71Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        l71 l71Var2 = l71Var;
                                        l71Var2.Y0 = tL_wallPaper;
                                        l71Var2.g1(false);
                                        l71Var2.o1();
                                        l71Var2.W0.add(0, l71Var2.Y0);
                                        j71 j71Var = l71Var2.S0;
                                        if (j71Var != null) {
                                            j71Var.f();
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
                final l71 l71Var2 = this.f44908b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l71.b0(l71Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        l71 l71Var22 = l71Var2;
                                        l71Var22.Y0 = tL_wallPaper;
                                        l71Var22.g1(false);
                                        l71Var22.o1();
                                        l71Var22.W0.add(0, l71Var22.Y0);
                                        j71 j71Var = l71Var22.S0;
                                        if (j71Var != null) {
                                            j71Var.f();
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
