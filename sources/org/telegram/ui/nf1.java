package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nf1 implements RequestDelegate {
    public final int f39586a;
    public final vf1 f39587b;

    public nf1(vf1 vf1Var, int i10) {
        this.f39586a = i10;
        this.f39587b = vf1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39586a) {
            case 0:
                final vf1 vf1Var = this.f39587b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vf1.b0(vf1Var, tL_error, tLObject);
                                return;
                            default:
                                vf1.h0(vf1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qf1(this.f39587b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qf1(this.f39587b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qf1(this.f39587b, tL_error, 2));
                return;
            default:
                final vf1 vf1Var2 = this.f39587b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vf1.b0(vf1Var2, tL_error, tLObject);
                                return;
                            default:
                                vf1.h0(vf1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
