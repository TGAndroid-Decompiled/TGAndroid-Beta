package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class og1 implements RequestDelegate {
    public final int f39736a;
    public final vg1 f39737b;

    public og1(vg1 vg1Var, int i10) {
        this.f39736a = i10;
        this.f39737b = vg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39736a) {
            case 0:
                final vg1 vg1Var = this.f39737b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vg1.b0(vg1Var, tL_error, tLObject);
                                return;
                            default:
                                vg1.h0(vg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rg1(this.f39737b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new rg1(this.f39737b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new rg1(this.f39737b, tL_error, 2));
                return;
            default:
                final vg1 vg1Var2 = this.f39737b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vg1.b0(vg1Var2, tL_error, tLObject);
                                return;
                            default:
                                vg1.h0(vg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
