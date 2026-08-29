package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd0 implements RequestDelegate {
    public final int f38105a;
    public final pd0 f38106b;
    public final String f38107c;

    public fd0(pd0 pd0Var, String str, int i10) {
        this.f38105a = i10;
        this.f38106b = pd0Var;
        this.f38107c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38105a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hd0(this.f38106b, tL_error, this.f38107c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hd0(this.f38106b, tL_error, tLObject, this.f38107c));
                return;
        }
    }
}
