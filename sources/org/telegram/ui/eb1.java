package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class eb1 implements RequestDelegate {

    public final int f37726a;

    public final nc1 f37727b;

    public eb1(nc1 nc1Var, int i10) {
        this.f37726a = i10;
        this.f37727b = nc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37726a) {
            case 0:
                final int i10 = 1;
                final nc1 nc1Var = this.f37727b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nc1.V(nc1Var, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        nc1 nc1Var2 = nc1Var;
                                        nc1Var2.S0 = tL_wallPaper;
                                        nc1Var2.b1(false);
                                        nc1Var2.j1();
                                        nc1Var2.Q0.add(0, nc1Var2.S0);
                                        lc1 lc1Var = nc1Var2.M0;
                                        if (lc1Var != null) {
                                            lc1Var.l();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final nc1 nc1Var2 = this.f37727b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nc1.V(nc1Var2, tLObject);
                                break;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        nc1 nc1Var3 = nc1Var2;
                                        nc1Var3.S0 = tL_wallPaper;
                                        nc1Var3.b1(false);
                                        nc1Var3.j1();
                                        nc1Var3.Q0.add(0, nc1Var3.S0);
                                        lc1 lc1Var = nc1Var3.M0;
                                        if (lc1Var != null) {
                                            lc1Var.l();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
