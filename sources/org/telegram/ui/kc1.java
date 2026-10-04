package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc1 implements RequestDelegate {
    public final int f37941a;
    public final rd1 f37942b;

    public kc1(rd1 rd1Var, int i10) {
        this.f37941a = i10;
        this.f37942b = rd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37941a) {
            case 0:
                final rd1 rd1Var = this.f37942b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                rd1.U(rd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        rd1 rd1Var2 = rd1Var;
                                        rd1Var2.W0 = tL_wallPaper;
                                        rd1Var2.b1(false);
                                        rd1Var2.j1();
                                        rd1Var2.U0.add(0, rd1Var2.W0);
                                        pd1 pd1Var = rd1Var2.Q0;
                                        if (pd1Var != null) {
                                            pd1Var.l();
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
                final rd1 rd1Var2 = this.f37942b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                rd1.U(rd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        rd1 rd1Var22 = rd1Var2;
                                        rd1Var22.W0 = tL_wallPaper;
                                        rd1Var22.b1(false);
                                        rd1Var22.j1();
                                        rd1Var22.U0.add(0, rd1Var22.W0);
                                        pd1 pd1Var = rd1Var22.Q0;
                                        if (pd1Var != null) {
                                            pd1Var.l();
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
