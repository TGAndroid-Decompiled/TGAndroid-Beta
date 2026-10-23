package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hd0 implements RequestDelegate {
    public final int f37824a;
    public final rd0 f37825b;
    public final String f37826c;

    public hd0(rd0 rd0Var, String str, int i10) {
        this.f37824a = i10;
        this.f37825b = rd0Var;
        this.f37826c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37824a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jd0(this.f37825b, tL_error, this.f37826c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jd0(this.f37825b, tL_error, tLObject, this.f37826c));
                return;
        }
    }
}
