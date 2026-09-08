package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ah1 implements RequestDelegate {
    public final int f34478a;
    public final hh1 f34479b;

    public ah1(hh1 hh1Var, int i10) {
        this.f34478a = i10;
        this.f34479b = hh1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34478a) {
            case 0:
                final hh1 hh1Var = this.f34479b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hh1.b0(hh1Var, tL_error, tLObject);
                                return;
                            default:
                                hh1.h0(hh1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new dh1(this.f34479b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new dh1(this.f34479b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new dh1(this.f34479b, tL_error, 2));
                return;
            default:
                final hh1 hh1Var2 = this.f34479b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                hh1.b0(hh1Var2, tL_error, tLObject);
                                return;
                            default:
                                hh1.h0(hh1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
