package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements RequestDelegate {
    public final int f36864a;
    public final ae0 f36865b;
    public final String f36866c;

    public qd0(ae0 ae0Var, String str, int i10) {
        this.f36864a = i10;
        this.f36865b = ae0Var;
        this.f36866c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36864a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sd0(this.f36865b, tL_error, this.f36866c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sd0(this.f36865b, tL_error, tLObject, this.f36866c));
                return;
        }
    }
}
