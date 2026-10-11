package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h00 implements RequestDelegate {
    public final int f38229a;
    public final e10 f38230b;

    public h00(e10 e10Var, int i10) {
        this.f38229a = i10;
        this.f38230b = e10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38229a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(20, this.f38230b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vq(this.f38230b, tL_error, tLObject, 6));
                return;
        }
    }
}
