package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class db1 implements RequestDelegate {
    public final int f36329a;
    public final kc1 f36330b;

    public db1(kc1 kc1Var, int i10) {
        this.f36329a = i10;
        this.f36330b = kc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36329a) {
            case 0:
                final kc1 kc1Var = this.f36330b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                kc1.W(kc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        kc1 kc1Var2 = kc1Var;
                                        kc1Var2.W0 = tL_wallPaper;
                                        kc1Var2.b1(false);
                                        kc1Var2.j1();
                                        kc1Var2.U0.add(0, kc1Var2.W0);
                                        ic1 ic1Var = kc1Var2.Q0;
                                        if (ic1Var != null) {
                                            ic1Var.l();
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
                final kc1 kc1Var2 = this.f36330b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                kc1.W(kc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        kc1 kc1Var22 = kc1Var2;
                                        kc1Var22.W0 = tL_wallPaper;
                                        kc1Var22.b1(false);
                                        kc1Var22.j1();
                                        kc1Var22.U0.add(0, kc1Var22.W0);
                                        ic1 ic1Var = kc1Var22.Q0;
                                        if (ic1Var != null) {
                                            ic1Var.l();
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
