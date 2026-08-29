package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hb1 implements RequestDelegate {
    public final int f38845a;
    public final qc1 f38846b;

    public hb1(qc1 qc1Var, int i10) {
        this.f38845a = i10;
        this.f38846b = qc1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38845a) {
            case 0:
                final qc1 qc1Var = this.f38846b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                qc1.V(qc1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qc1 qc1Var2 = qc1Var;
                                        qc1Var2.S0 = tL_wallPaper;
                                        qc1Var2.b1(false);
                                        qc1Var2.j1();
                                        qc1Var2.Q0.add(0, qc1Var2.S0);
                                        oc1 oc1Var = qc1Var2.M0;
                                        if (oc1Var != null) {
                                            oc1Var.l();
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
                final qc1 qc1Var2 = this.f38846b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                qc1.V(qc1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        qc1 qc1Var22 = qc1Var2;
                                        qc1Var22.S0 = tL_wallPaper;
                                        qc1Var22.b1(false);
                                        qc1Var22.j1();
                                        qc1Var22.Q0.add(0, qc1Var22.S0);
                                        oc1 oc1Var = qc1Var22.M0;
                                        if (oc1Var != null) {
                                            oc1Var.l();
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
