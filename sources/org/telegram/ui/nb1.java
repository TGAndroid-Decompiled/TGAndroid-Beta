package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nb1 implements RequestDelegate {
    public final int f41735a;
    public final vc1 f41736b;

    public nb1(vc1 vc1Var, int i10) {
        this.f41735a = i10;
        this.f41736b = vc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41735a) {
            case 0:
                final vc1 vc1Var = this.f41736b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                vc1.X(vc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vc1 vc1Var2 = vc1Var;
                                        vc1Var2.X0 = tL_wallPaper;
                                        vc1Var2.c1(false);
                                        vc1Var2.k1();
                                        vc1Var2.V0.add(0, vc1Var2.X0);
                                        tc1 tc1Var = vc1Var2.R0;
                                        if (tc1Var != null) {
                                            tc1Var.l();
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
                final vc1 vc1Var2 = this.f41736b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                vc1.X(vc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vc1 vc1Var22 = vc1Var2;
                                        vc1Var22.X0 = tL_wallPaper;
                                        vc1Var22.c1(false);
                                        vc1Var22.k1();
                                        vc1Var22.V0.add(0, vc1Var22.X0);
                                        tc1 tc1Var = vc1Var22.R0;
                                        if (tc1Var != null) {
                                            tc1Var.l();
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
