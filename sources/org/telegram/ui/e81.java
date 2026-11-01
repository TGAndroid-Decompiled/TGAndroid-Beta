package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e81 implements RequestDelegate {
    public final int f36779a;
    public final k91 f36780b;

    public e81(k91 k91Var, int i10) {
        this.f36779a = i10;
        this.f36780b = k91Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36779a) {
            case 0:
                final k91 k91Var = this.f36780b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k91.b0(k91Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        k91 k91Var2 = k91Var;
                                        k91Var2.X0 = tL_wallPaper;
                                        k91Var2.g1(false);
                                        k91Var2.o1();
                                        k91Var2.V0.add(0, k91Var2.X0);
                                        i91 i91Var = k91Var2.R0;
                                        if (i91Var != null) {
                                            i91Var.f();
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
                final k91 k91Var2 = this.f36780b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k91.b0(k91Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        k91 k91Var22 = k91Var2;
                                        k91Var22.X0 = tL_wallPaper;
                                        k91Var22.g1(false);
                                        k91Var22.o1();
                                        k91Var22.V0.add(0, k91Var22.X0);
                                        i91 i91Var = k91Var22.R0;
                                        if (i91Var != null) {
                                            i91Var.f();
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
