package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s60 implements RequestDelegate {
    public final int f28068a;
    public final u60 f28069b;

    public s60(u60 u60Var, int i10) {
        this.f28068a = i10;
        this.f28069b = u60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28068a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f28069b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uw(14, this.f28069b, tL_error));
                return;
        }
    }
}
