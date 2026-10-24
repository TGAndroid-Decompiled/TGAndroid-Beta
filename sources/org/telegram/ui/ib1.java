package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib1 implements RequestDelegate {
    public final int f38224a;
    public final pc1 f38225b;

    public ib1(pc1 pc1Var, int i10) {
        this.f38224a = i10;
        this.f38225b = pc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38224a) {
            case 0:
                final pc1 pc1Var = this.f38225b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                pc1.W(pc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pc1 pc1Var2 = pc1Var;
                                        pc1Var2.X0 = tL_wallPaper;
                                        pc1Var2.b1(false);
                                        pc1Var2.j1();
                                        pc1Var2.V0.add(0, pc1Var2.X0);
                                        nc1 nc1Var = pc1Var2.R0;
                                        if (nc1Var != null) {
                                            nc1Var.l();
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
                final pc1 pc1Var2 = this.f38225b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                pc1.W(pc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pc1 pc1Var22 = pc1Var2;
                                        pc1Var22.X0 = tL_wallPaper;
                                        pc1Var22.b1(false);
                                        pc1Var22.j1();
                                        pc1Var22.V0.add(0, pc1Var22.X0);
                                        nc1 nc1Var = pc1Var22.R0;
                                        if (nc1Var != null) {
                                            nc1Var.l();
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
