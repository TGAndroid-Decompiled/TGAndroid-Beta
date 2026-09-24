package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class on0 implements RequestDelegate {
    public final int f36255a;
    public final oo0 f36256b;

    public on0(oo0 oo0Var, int i10) {
        this.f36255a = i10;
        this.f36256b = oo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36255a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xi0(13, this.f36256b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new nn0(this.f36256b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hn0(this.f36256b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hn0(this.f36256b, tLObject, 0));
                return;
        }
    }
}
