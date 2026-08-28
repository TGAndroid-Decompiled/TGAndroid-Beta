package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gb1 implements RequestDelegate {
    public final int f38498a;
    public final oc1 f38499b;

    public gb1(oc1 oc1Var, int i9) {
        this.f38498a = i9;
        this.f38499b = oc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38498a) {
            case 0:
                final oc1 oc1Var = this.f38499b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                oc1.U(oc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        oc1 oc1Var2 = oc1Var;
                                        oc1Var2.S0 = tL_wallPaper;
                                        oc1Var2.b1(false);
                                        oc1Var2.j1();
                                        oc1Var2.Q0.add(0, oc1Var2.S0);
                                        mc1 mc1Var = oc1Var2.M0;
                                        if (mc1Var != null) {
                                            mc1Var.l();
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
                final oc1 oc1Var2 = this.f38499b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                oc1.U(oc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        oc1 oc1Var22 = oc1Var2;
                                        oc1Var22.S0 = tL_wallPaper;
                                        oc1Var22.b1(false);
                                        oc1Var22.j1();
                                        oc1Var22.Q0.add(0, oc1Var22.S0);
                                        mc1 mc1Var = oc1Var22.M0;
                                        if (mc1Var != null) {
                                            mc1Var.l();
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
