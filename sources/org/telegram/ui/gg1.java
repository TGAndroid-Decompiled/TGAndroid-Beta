package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gg1 implements RequestDelegate {
    public final int f34616a;
    public final og1 f34617b;

    public gg1(og1 og1Var, int i10) {
        this.f34616a = i10;
        this.f34617b = og1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34616a) {
            case 0:
                final og1 og1Var = this.f34617b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                og1.b0(og1Var, tL_error, tLObject);
                                return;
                            default:
                                og1.h0(og1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jg1(this.f34617b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jg1(this.f34617b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new jg1(this.f34617b, tL_error, 2));
                return;
            default:
                final og1 og1Var2 = this.f34617b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                og1.b0(og1Var2, tL_error, tLObject);
                                return;
                            default:
                                og1.h0(og1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
