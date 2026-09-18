package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bh1 implements RequestDelegate {
    public final int f32185a;
    public final ih1 f32186b;

    public bh1(ih1 ih1Var, int i10) {
        this.f32185a = i10;
        this.f32186b = ih1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32185a) {
            case 0:
                final ih1 ih1Var = this.f32186b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ih1.b0(ih1Var, tL_error, tLObject);
                                return;
                            default:
                                ih1.h0(ih1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new eh1(this.f32186b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new eh1(this.f32186b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new eh1(this.f32186b, tL_error, 2));
                return;
            default:
                final ih1 ih1Var2 = this.f32186b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ih1.b0(ih1Var2, tL_error, tLObject);
                                return;
                            default:
                                ih1.h0(ih1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
