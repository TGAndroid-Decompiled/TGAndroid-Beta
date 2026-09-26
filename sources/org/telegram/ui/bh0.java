package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements RequestDelegate {
    public final int f32422a;
    public final sh0 f32423b;

    public bh0(sh0 sh0Var, int i10) {
        this.f32422a = i10;
        this.f32423b = sh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32422a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gh0(this.f32423b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n80(27, this.f32423b, tL_error));
                return;
        }
    }
}
