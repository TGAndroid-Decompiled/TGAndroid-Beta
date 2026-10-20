package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qg0 implements RequestDelegate {
    public final int f40569a;
    public final ih0 f40570b;

    public qg0(ih0 ih0Var, int i10) {
        this.f40569a = i10;
        this.f40570b = ih0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40569a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vg0(this.f40570b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z70(29, this.f40570b, tL_error));
                return;
        }
    }
}
