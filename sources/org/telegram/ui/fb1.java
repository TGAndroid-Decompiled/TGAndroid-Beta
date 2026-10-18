package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb1 implements RequestDelegate {
    public final int f36868a;
    public final mc1 f36869b;

    public fb1(mc1 mc1Var, int i10) {
        this.f36868a = i10;
        this.f36869b = mc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36868a) {
            case 0:
                final mc1 mc1Var = this.f36869b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                mc1.W(mc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        mc1 mc1Var2 = mc1Var;
                                        mc1Var2.W0 = tL_wallPaper;
                                        mc1Var2.b1(false);
                                        mc1Var2.j1();
                                        mc1Var2.U0.add(0, mc1Var2.W0);
                                        kc1 kc1Var = mc1Var2.Q0;
                                        if (kc1Var != null) {
                                            kc1Var.l();
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
                final mc1 mc1Var2 = this.f36869b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                mc1.W(mc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        mc1 mc1Var22 = mc1Var2;
                                        mc1Var22.W0 = tL_wallPaper;
                                        mc1Var22.b1(false);
                                        mc1Var22.j1();
                                        mc1Var22.U0.add(0, mc1Var22.W0);
                                        kc1 kc1Var = mc1Var22.Q0;
                                        if (kc1Var != null) {
                                            kc1Var.l();
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
