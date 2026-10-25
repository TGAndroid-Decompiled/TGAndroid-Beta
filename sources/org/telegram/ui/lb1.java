package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lb1 implements RequestDelegate {
    public final int f41242a;
    public final tc1 f41243b;

    public lb1(tc1 tc1Var, int i10) {
        this.f41242a = i10;
        this.f41243b = tc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41242a) {
            case 0:
                final tc1 tc1Var = this.f41243b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                tc1.X(tc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        tc1 tc1Var2 = tc1Var;
                                        tc1Var2.X0 = tL_wallPaper;
                                        tc1Var2.c1(false);
                                        tc1Var2.k1();
                                        tc1Var2.V0.add(0, tc1Var2.X0);
                                        rc1 rc1Var = tc1Var2.R0;
                                        if (rc1Var != null) {
                                            rc1Var.l();
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
                final tc1 tc1Var2 = this.f41243b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                tc1.X(tc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        tc1 tc1Var22 = tc1Var2;
                                        tc1Var22.X0 = tL_wallPaper;
                                        tc1Var22.c1(false);
                                        tc1Var22.k1();
                                        tc1Var22.V0.add(0, tc1Var22.X0);
                                        rc1 rc1Var = tc1Var22.R0;
                                        if (rc1Var != null) {
                                            rc1Var.l();
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
