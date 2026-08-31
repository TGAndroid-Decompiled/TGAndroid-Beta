package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn0 implements RequestDelegate {
    public final int f39494a;
    public final lo0 f39495b;

    public nn0(lo0 lo0Var, int i10) {
        this.f39494a = i10;
        this.f39495b = lo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39494a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(24, this.f39495b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mn0(this.f39495b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gn0(this.f39495b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gn0(this.f39495b, tLObject, 0));
                return;
        }
    }
}
