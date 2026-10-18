package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fn0 implements RequestDelegate {
    public final int f36951a;
    public final go0 f36952b;

    public fn0(go0 go0Var, int i10) {
        this.f36951a = i10;
        this.f36952b = go0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36951a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yg0(15, this.f36952b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new en0(this.f36952b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ym0(this.f36952b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ym0(this.f36952b, tLObject, 0));
                return;
        }
    }
}
