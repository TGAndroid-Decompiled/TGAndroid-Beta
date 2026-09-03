package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc1 implements RequestDelegate {
    public final int f35434a;
    public final jd1 f35435b;

    public bc1(jd1 jd1Var, int i10) {
        this.f35434a = i10;
        this.f35435b = jd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35434a) {
            case 0:
                final jd1 jd1Var = this.f35435b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                jd1.V(jd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        jd1 jd1Var2 = jd1Var;
                                        jd1Var2.T0 = tL_wallPaper;
                                        jd1Var2.b1(false);
                                        jd1Var2.j1();
                                        jd1Var2.R0.add(0, jd1Var2.T0);
                                        hd1 hd1Var = jd1Var2.N0;
                                        if (hd1Var != null) {
                                            hd1Var.l();
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
                final jd1 jd1Var2 = this.f35435b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                jd1.V(jd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        jd1 jd1Var22 = jd1Var2;
                                        jd1Var22.T0 = tL_wallPaper;
                                        jd1Var22.b1(false);
                                        jd1Var22.j1();
                                        jd1Var22.R0.add(0, jd1Var22.T0);
                                        hd1 hd1Var = jd1Var22.N0;
                                        if (hd1Var != null) {
                                            hd1Var.l();
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
