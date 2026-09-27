package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he0 implements RequestDelegate {
    public final int f34204a;
    public final je0 f34205b;
    public final String f34206c;
    public final String d;

    public he0(je0 je0Var, String str, String str2, int i10) {
        this.f34204a = i10;
        this.f34205b = je0Var;
        this.f34206c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34204a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ee0(this.f34205b, tL_error, this.f34206c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ee0(this.f34205b, tL_error, tLObject, this.f34206c, this.d));
                return;
        }
    }
}
