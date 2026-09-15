package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd implements RequestDelegate {
    public final int f32136a;
    public final ld f32137b;

    public bd(ld ldVar, int i10) {
        this.f32136a = i10;
        this.f32137b = ldVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32136a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(17, this.f32137b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.f32137b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new l4(15, this.f32137b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f32137b, tL_error, tLObject, 11));
                return;
        }
    }
}
