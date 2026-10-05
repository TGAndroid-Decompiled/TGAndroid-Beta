package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements RequestDelegate {
    public final int f36320a;
    public final wh0 f36321b;

    public fh0(wh0 wh0Var, int i10) {
        this.f36320a = i10;
        this.f36321b = wh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36320a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh0(this.f36321b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h90(25, this.f36321b, tL_error));
                return;
        }
    }
}
