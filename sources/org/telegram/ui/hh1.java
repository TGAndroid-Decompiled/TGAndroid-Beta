package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh1 implements RequestDelegate {
    public final int f36822a;
    public final oh1 f36823b;

    public hh1(oh1 oh1Var, int i10) {
        this.f36822a = i10;
        this.f36823b = oh1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36822a) {
            case 0:
                final oh1 oh1Var = this.f36823b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                oh1.b0(oh1Var, tL_error, tLObject);
                                return;
                            default:
                                oh1.h0(oh1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kh1(this.f36823b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kh1(this.f36823b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new kh1(this.f36823b, tL_error, 2));
                return;
            default:
                final oh1 oh1Var2 = this.f36823b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                oh1.b0(oh1Var2, tL_error, tLObject);
                                return;
                            default:
                                oh1.h0(oh1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
