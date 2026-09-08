package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc1 implements RequestDelegate {
    public final int f39502a;
    public final wd1 f39503b;

    public pc1(wd1 wd1Var, int i10) {
        this.f39502a = i10;
        this.f39503b = wd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39502a) {
            case 0:
                final wd1 wd1Var = this.f39503b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                wd1.W(wd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        wd1 wd1Var2 = wd1Var;
                                        wd1Var2.W0 = tL_wallPaper;
                                        wd1Var2.b1(false);
                                        wd1Var2.j1();
                                        wd1Var2.U0.add(0, wd1Var2.W0);
                                        ud1 ud1Var = wd1Var2.Q0;
                                        if (ud1Var != null) {
                                            ud1Var.l();
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
                final wd1 wd1Var2 = this.f39503b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                wd1.W(wd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        wd1 wd1Var22 = wd1Var2;
                                        wd1Var22.W0 = tL_wallPaper;
                                        wd1Var22.b1(false);
                                        wd1Var22.j1();
                                        wd1Var22.U0.add(0, wd1Var22.W0);
                                        ud1 ud1Var = wd1Var22.Q0;
                                        if (ud1Var != null) {
                                            ud1Var.l();
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
