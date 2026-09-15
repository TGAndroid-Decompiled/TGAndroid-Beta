package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oc1 implements RequestDelegate {
    public final int f36188a;
    public final vd1 f36189b;

    public oc1(vd1 vd1Var, int i10) {
        this.f36188a = i10;
        this.f36189b = vd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36188a) {
            case 0:
                final vd1 vd1Var = this.f36189b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                vd1.W(vd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vd1 vd1Var2 = vd1Var;
                                        vd1Var2.W0 = tL_wallPaper;
                                        vd1Var2.b1(false);
                                        vd1Var2.j1();
                                        vd1Var2.U0.add(0, vd1Var2.W0);
                                        td1 td1Var = vd1Var2.Q0;
                                        if (td1Var != null) {
                                            td1Var.l();
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
                final vd1 vd1Var2 = this.f36189b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                vd1.W(vd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        vd1 vd1Var22 = vd1Var2;
                                        vd1Var22.W0 = tL_wallPaper;
                                        vd1Var22.b1(false);
                                        vd1Var22.j1();
                                        vd1Var22.U0.add(0, vd1Var22.W0);
                                        td1 td1Var = vd1Var22.Q0;
                                        if (td1Var != null) {
                                            td1Var.l();
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
