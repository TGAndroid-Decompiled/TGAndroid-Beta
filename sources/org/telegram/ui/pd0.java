package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd0 implements RequestDelegate {
    public final int f40017a;
    public final zd0 f40018b;
    public final String f40019c;

    public pd0(zd0 zd0Var, String str, int i10) {
        this.f40017a = i10;
        this.f40018b = zd0Var;
        this.f40019c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40017a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rd0(this.f40018b, tL_error, this.f40019c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rd0(this.f40018b, tL_error, tLObject, this.f40019c));
                return;
        }
    }
}
