package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class og1 implements RequestDelegate {
    public final int f36806a;
    public final wg1 f36807b;

    public og1(wg1 wg1Var, int i10) {
        this.f36806a = i10;
        this.f36807b = wg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36806a) {
            case 0:
                final wg1 wg1Var = this.f36807b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                wg1.b0(wg1Var, tL_error, tLObject);
                                return;
                            default:
                                wg1.h0(wg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rg1(this.f36807b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new rg1(this.f36807b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new rg1(this.f36807b, tL_error, 2));
                return;
            default:
                final wg1 wg1Var2 = this.f36807b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                wg1.b0(wg1Var2, tL_error, tLObject);
                                return;
                            default:
                                wg1.h0(wg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
