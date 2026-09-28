package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd implements RequestDelegate {
    public final int f32388a;
    public final ld f32389b;

    public bd(ld ldVar, int i10) {
        this.f32388a = i10;
        this.f32389b = ldVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32388a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(22, this.f32389b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.f32389b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(20, this.f32389b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f32389b, tL_error, tLObject, 11));
                return;
        }
    }
}
