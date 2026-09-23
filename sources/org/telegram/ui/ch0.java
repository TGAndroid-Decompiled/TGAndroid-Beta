package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ch0 implements RequestDelegate {
    public final int f32352a;
    public final th0 f32353b;

    public ch0(th0 th0Var, int i10) {
        this.f32352a = i10;
        this.f32353b = th0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32352a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hh0(this.f32353b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ia0(22, this.f32353b, tL_error));
                return;
        }
    }
}
