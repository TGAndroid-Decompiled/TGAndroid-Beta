package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hc1 implements RequestDelegate {
    public final int f34190a;
    public final od1 f34191b;

    public hc1(od1 od1Var, int i10) {
        this.f34190a = i10;
        this.f34191b = od1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34190a) {
            case 0:
                final od1 od1Var = this.f34191b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                od1.W(od1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        od1 od1Var2 = od1Var;
                                        od1Var2.W0 = tL_wallPaper;
                                        od1Var2.b1(false);
                                        od1Var2.j1();
                                        od1Var2.U0.add(0, od1Var2.W0);
                                        md1 md1Var = od1Var2.Q0;
                                        if (md1Var != null) {
                                            md1Var.l();
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
                final od1 od1Var2 = this.f34191b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                od1.W(od1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        od1 od1Var22 = od1Var2;
                                        od1Var22.W0 = tL_wallPaper;
                                        od1Var22.b1(false);
                                        od1Var22.j1();
                                        od1Var22.U0.add(0, od1Var22.W0);
                                        md1 md1Var = od1Var22.Q0;
                                        if (md1Var != null) {
                                            md1Var.l();
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
