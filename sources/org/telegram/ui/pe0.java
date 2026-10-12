package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe0 implements RequestDelegate {
    public final int f39204a;
    public final re0 f39205b;
    public final String f39206c;
    public final String d;

    public pe0(re0 re0Var, String str, String str2, int i10) {
        this.f39204a = i10;
        this.f39205b = re0Var;
        this.f39206c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39204a) {
            case 0:
                AndroidUtilities.runOnUIThread(new me0(this.f39205b, tL_error, this.f39206c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new me0(this.f39205b, tL_error, tLObject, this.f39206c, this.d));
                return;
        }
    }
}
