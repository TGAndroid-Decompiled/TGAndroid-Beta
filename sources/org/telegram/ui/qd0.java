package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements RequestDelegate {
    public final int f36863a;
    public final ae0 f36864b;
    public final String f36865c;

    public qd0(ae0 ae0Var, String str, int i10) {
        this.f36863a = i10;
        this.f36864b = ae0Var;
        this.f36865c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36863a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sd0(this.f36864b, tL_error, this.f36865c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sd0(this.f36864b, tL_error, tLObject, this.f36865c));
                return;
        }
    }
}
