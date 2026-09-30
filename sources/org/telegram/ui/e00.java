package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e00 implements RequestDelegate {
    public final int f33322a;
    public final b10 f33323b;

    public e00(b10 b10Var, int i10) {
        this.f33322a = i10;
        this.f33323b = b10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33322a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tt(15, this.f33323b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sq(this.f33323b, tL_error, tLObject, 6));
                return;
        }
    }
}
