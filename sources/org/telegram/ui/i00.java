package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i00 implements RequestDelegate {
    public final int f38469a;
    public final f10 f38470b;

    public i00(f10 f10Var, int i10) {
        this.f38469a = i10;
        this.f38470b = f10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38469a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fa1(21, this.f38470b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vq(this.f38470b, tL_error, tLObject, 6));
                return;
        }
    }
}
