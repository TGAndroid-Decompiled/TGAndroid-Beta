package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ig1 implements RequestDelegate {
    public final int f37855a;
    public final qg1 f37856b;

    public ig1(qg1 qg1Var, int i10) {
        this.f37855a = i10;
        this.f37856b = qg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37855a) {
            case 0:
                final qg1 qg1Var = this.f37856b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qg1.b0(qg1Var, tL_error, tLObject);
                                return;
                            default:
                                qg1.h0(qg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lg1(this.f37856b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new lg1(this.f37856b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lg1(this.f37856b, tL_error, 2));
                return;
            default:
                final qg1 qg1Var2 = this.f37856b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                qg1.b0(qg1Var2, tL_error, tLObject);
                                return;
                            default:
                                qg1.h0(qg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
