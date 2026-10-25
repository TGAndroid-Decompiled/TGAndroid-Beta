package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ed0 implements RequestDelegate {
    public final int f39082a;
    public final od0 f39083b;
    public final String f39084c;

    public ed0(od0 od0Var, String str, int i10) {
        this.f39082a = i10;
        this.f39083b = od0Var;
        this.f39084c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39082a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gd0(this.f39083b, tL_error, this.f39084c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gd0(this.f39083b, tL_error, tLObject, this.f39084c));
                return;
        }
    }
}
