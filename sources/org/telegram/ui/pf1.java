package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pf1 implements RequestDelegate {
    public final int f40144a;
    public final xf1 f40145b;

    public pf1(xf1 xf1Var, int i10) {
        this.f40144a = i10;
        this.f40145b = xf1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40144a) {
            case 0:
                final xf1 xf1Var = this.f40145b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xf1.b0(xf1Var, tL_error, tLObject);
                                return;
                            default:
                                xf1.h0(xf1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new sf1(this.f40145b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new sf1(this.f40145b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new sf1(this.f40145b, tL_error, 2));
                return;
            default:
                final xf1 xf1Var2 = this.f40145b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xf1.b0(xf1Var2, tL_error, tLObject);
                                return;
                            default:
                                xf1.h0(xf1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
