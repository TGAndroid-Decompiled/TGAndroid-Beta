package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd0 implements RequestDelegate {
    public final int f36170a;
    public final od0 f36171b;
    public final String f36172c;

    public dd0(od0 od0Var, String str, int i10) {
        this.f36170a = i10;
        this.f36171b = od0Var;
        this.f36172c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36170a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fd0(this.f36171b, tL_error, this.f36172c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fd0(this.f36171b, tL_error, tLObject, this.f36172c));
                return;
        }
    }
}
