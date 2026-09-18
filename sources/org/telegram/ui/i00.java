package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i00 implements RequestDelegate {
    public final int f34277a;
    public final f10 f34278b;

    public i00(f10 f10Var, int i10) {
        this.f34277a = i10;
        this.f34278b = f10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34277a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cu(14, this.f34278b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vq(this.f34278b, tL_error, tLObject, 6));
                return;
        }
    }
}
