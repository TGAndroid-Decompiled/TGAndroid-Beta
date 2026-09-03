package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de0 implements RequestDelegate {
    public final int f36172a;
    public final ee0 f36173b;
    public final String f36174c;
    public final String d;

    public de0(ee0 ee0Var, String str, String str2, int i10) {
        this.f36172a = i10;
        this.f36173b = ee0Var;
        this.f36174c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36172a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ae0(this.f36173b, tL_error, this.f36174c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ae0(this.f36173b, tL_error, tLObject, this.f36174c, this.d));
                return;
        }
    }
}
