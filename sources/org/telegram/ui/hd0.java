package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class hd0 implements RequestDelegate {

    public final int f38783a;

    public final sd0 f38784b;

    public final String f38785c;

    public hd0(sd0 sd0Var, String str, int i10) {
        this.f38783a = i10;
        this.f38784b = sd0Var;
        this.f38785c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38783a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jd0(this.f38784b, tL_error, this.f38785c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jd0(this.f38784b, tL_error, tLObject, this.f38785c));
                break;
        }
    }
}
