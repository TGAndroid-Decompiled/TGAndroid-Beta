package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dh1 implements RequestDelegate {
    public final int f36830a;
    public final kh1 f36831b;

    public dh1(kh1 kh1Var, int i10) {
        this.f36830a = i10;
        this.f36831b = kh1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36830a) {
            case 0:
                final kh1 kh1Var = this.f36831b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                kh1.b0(kh1Var, tL_error, tLObject);
                                return;
                            default:
                                kh1.h0(kh1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gh1(this.f36831b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gh1(this.f36831b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gh1(this.f36831b, tL_error, 2));
                return;
            default:
                final kh1 kh1Var2 = this.f36831b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                kh1.b0(kh1Var2, tL_error, tLObject);
                                return;
                            default:
                                kh1.h0(kh1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
