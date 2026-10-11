package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bm0 implements RequestDelegate {
    public final int f36416a;
    public final mn0 f36417b;

    public bm0(mn0 mn0Var, int i10) {
        this.f36416a = i10;
        this.f36417b = mn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36416a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nf0(this.f36417b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new uf0(17, this.f36417b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xl0(this.f36417b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uf0(16, this.f36417b, tLObject));
                return;
        }
    }
}
