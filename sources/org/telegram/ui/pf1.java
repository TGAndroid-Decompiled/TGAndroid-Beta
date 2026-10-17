package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pf1 implements RequestDelegate {
    public final int f40125a;
    public final xf1 f40126b;

    public pf1(xf1 xf1Var, int i10) {
        this.f40125a = i10;
        this.f40126b = xf1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40125a) {
            case 0:
                final xf1 xf1Var = this.f40126b;
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
                AndroidUtilities.runOnUIThread(new sf1(this.f40126b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new sf1(this.f40126b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new sf1(this.f40126b, tL_error, 2));
                return;
            default:
                final xf1 xf1Var2 = this.f40126b;
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
