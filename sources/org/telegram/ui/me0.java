package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class me0 implements RequestDelegate {
    public final int f35693a;
    public final oe0 f35694b;
    public final String f35695c;
    public final String d;

    public me0(oe0 oe0Var, String str, String str2, int i10) {
        this.f35693a = i10;
        this.f35694b = oe0Var;
        this.f35695c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35693a) {
            case 0:
                AndroidUtilities.runOnUIThread(new je0(this.f35694b, tL_error, this.f35695c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new je0(this.f35694b, tL_error, tLObject, this.f35695c, this.d));
                return;
        }
    }
}
