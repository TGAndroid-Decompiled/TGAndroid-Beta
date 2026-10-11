package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pf0 implements RequestDelegate {
    public final int f40845a;
    public final yf0 f40846b;
    public final Bundle f40847c;

    public pf0(yf0 yf0Var, Bundle bundle, int i10) {
        this.f40845a = i10;
        this.f40846b = yf0Var;
        this.f40847c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40845a) {
            case 0:
                yf0 yf0Var = this.f40846b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new nf0(yf0Var, this.f40847c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new n70(28, yf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0(this.f40846b, tL_error, this.f40847c, tLObject, 20));
                return;
        }
    }
}
