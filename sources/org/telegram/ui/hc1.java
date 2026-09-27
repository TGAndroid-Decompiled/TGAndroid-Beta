package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hc1 implements RequestDelegate {
    public final int f34193a;
    public final pd1 f34194b;

    public hc1(pd1 pd1Var, int i10) {
        this.f34193a = i10;
        this.f34194b = pd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34193a) {
            case 0:
                final pd1 pd1Var = this.f34194b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                pd1.W(pd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pd1 pd1Var2 = pd1Var;
                                        pd1Var2.W0 = tL_wallPaper;
                                        pd1Var2.b1(false);
                                        pd1Var2.j1();
                                        pd1Var2.U0.add(0, pd1Var2.W0);
                                        nd1 nd1Var = pd1Var2.Q0;
                                        if (nd1Var != null) {
                                            nd1Var.l();
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
                final pd1 pd1Var2 = this.f34194b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                pd1.W(pd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        pd1 pd1Var22 = pd1Var2;
                                        pd1Var22.W0 = tL_wallPaper;
                                        pd1Var22.b1(false);
                                        pd1Var22.j1();
                                        pd1Var22.U0.add(0, pd1Var22.W0);
                                        nd1 nd1Var = pd1Var22.Q0;
                                        if (nd1Var != null) {
                                            nd1Var.l();
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
