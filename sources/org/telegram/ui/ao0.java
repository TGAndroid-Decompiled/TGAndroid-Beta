package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ao0 implements RequestDelegate {
    public final int f34001a;
    public final ap0 f34002b;

    public ao0(ap0 ap0Var, int i10) {
        this.f34001a = i10;
        this.f34002b = ap0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34001a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se0(27, this.f34002b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zn0(this.f34002b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new tn0(this.f34002b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tn0(this.f34002b, tLObject, 0));
                return;
        }
    }
}
