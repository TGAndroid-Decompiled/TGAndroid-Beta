package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s50 implements RequestDelegate {
    public final int f32367a;
    public final u50 f32368b;

    public s50(u50 u50Var, int i9) {
        this.f32367a = i9;
        this.f32368b = u50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32367a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this.f32368b, tL_error, tLObject, 24));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zq(22, this.f32368b, tL_error));
                return;
        }
    }
}
