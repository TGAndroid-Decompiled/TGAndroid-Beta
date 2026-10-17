package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fn0 implements RequestDelegate {
    public final int f36963a;
    public final fo0 f36964b;

    public fn0(fo0 fo0Var, int i10) {
        this.f36963a = i10;
        this.f36964b = fo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36963a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zg0(15, this.f36964b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new en0(this.f36964b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ym0(this.f36964b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ym0(this.f36964b, tLObject, 0));
                return;
        }
    }
}
