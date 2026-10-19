package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pg0 implements RequestDelegate {
    public final int f40225a;
    public final hh0 f40226b;

    public pg0(hh0 hh0Var, int i10) {
        this.f40225a = i10;
        this.f40226b = hh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40225a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ug0(this.f40226b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z70(29, this.f40226b, tL_error));
                return;
        }
    }
}
