package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e00 implements RequestDelegate {
    public final int f33228a;
    public final b10 f33229b;

    public e00(b10 b10Var, int i10) {
        this.f33228a = i10;
        this.f33229b = b10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33228a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tt(16, this.f33229b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sq(this.f33229b, tL_error, tLObject, 6));
                return;
        }
    }
}
