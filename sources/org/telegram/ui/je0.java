package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class je0 implements RequestDelegate {
    public final int f38924a;
    public final le0 f38925b;
    public final String f38926c;
    public final String d;

    public je0(le0 le0Var, String str, String str2, int i10) {
        this.f38924a = i10;
        this.f38925b = le0Var;
        this.f38926c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38924a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ge0(this.f38925b, tL_error, this.f38926c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ge0(this.f38925b, tL_error, tLObject, this.f38926c, this.d));
                return;
        }
    }
}
