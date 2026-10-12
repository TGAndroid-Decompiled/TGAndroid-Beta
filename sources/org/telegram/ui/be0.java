package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class be0 implements RequestDelegate {
    public final int f34523a;
    public final le0 f34524b;
    public final String f34525c;

    public be0(le0 le0Var, String str, int i10) {
        this.f34523a = i10;
        this.f34524b = le0Var;
        this.f34525c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34523a) {
            case 0:
                AndroidUtilities.runOnUIThread(new de0(this.f34524b, tL_error, this.f34525c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new de0(this.f34524b, tL_error, tLObject, this.f34525c));
                return;
        }
    }
}
