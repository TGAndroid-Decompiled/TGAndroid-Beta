package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qc1 implements RequestDelegate {
    public final int f36905a;
    public final xd1 f36906b;

    public qc1(xd1 xd1Var, int i10) {
        this.f36905a = i10;
        this.f36906b = xd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36905a) {
            case 0:
                final xd1 xd1Var = this.f36906b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                xd1.W(xd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        xd1 xd1Var2 = xd1Var;
                                        xd1Var2.W0 = tL_wallPaper;
                                        xd1Var2.b1(false);
                                        xd1Var2.j1();
                                        xd1Var2.U0.add(0, xd1Var2.W0);
                                        vd1 vd1Var = xd1Var2.Q0;
                                        if (vd1Var != null) {
                                            vd1Var.l();
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
                final xd1 xd1Var2 = this.f36906b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                xd1.W(xd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        xd1 xd1Var22 = xd1Var2;
                                        xd1Var22.W0 = tL_wallPaper;
                                        xd1Var22.b1(false);
                                        xd1Var22.j1();
                                        xd1Var22.U0.add(0, xd1Var22.W0);
                                        vd1 vd1Var = xd1Var22.Q0;
                                        if (vd1Var != null) {
                                            vd1Var.l();
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
