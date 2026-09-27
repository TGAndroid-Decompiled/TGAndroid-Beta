package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eh0 implements RequestDelegate {
    public final int f33266a;
    public final vh0 f33267b;

    public eh0(vh0 vh0Var, int i10) {
        this.f33266a = i10;
        this.f33267b = vh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33266a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jh0(this.f33267b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ea0(23, this.f33267b, tL_error));
                return;
        }
    }
}
