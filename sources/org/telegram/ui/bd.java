package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd implements RequestDelegate {
    public final int f32118a;
    public final ld f32119b;

    public bd(ld ldVar, int i10) {
        this.f32118a = i10;
        this.f32119b = ldVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32118a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(17, this.f32119b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.f32119b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new l4(15, this.f32119b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f32119b, tL_error, tLObject, 11));
                return;
        }
    }
}
