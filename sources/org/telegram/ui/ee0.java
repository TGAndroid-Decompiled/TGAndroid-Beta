package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ee0 implements RequestDelegate {
    public final int f33385a;
    public final ge0 f33386b;
    public final String f33387c;
    public final String d;

    public ee0(ge0 ge0Var, String str, String str2, int i10) {
        this.f33385a = i10;
        this.f33386b = ge0Var;
        this.f33387c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33385a) {
            case 0:
                AndroidUtilities.runOnUIThread(new be0(this.f33386b, tL_error, this.f33387c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new be0(this.f33386b, tL_error, tLObject, this.f33387c, this.d));
                return;
        }
    }
}
