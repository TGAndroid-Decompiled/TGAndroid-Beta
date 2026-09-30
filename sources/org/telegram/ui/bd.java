package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd implements RequestDelegate {
    public final int f32391a;
    public final ld f32392b;

    public bd(ld ldVar, int i10) {
        this.f32391a = i10;
        this.f32392b = ldVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32391a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(23, this.f32392b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.f32392b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(21, this.f32392b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f32392b, tL_error, tLObject, 11));
                return;
        }
    }
}
