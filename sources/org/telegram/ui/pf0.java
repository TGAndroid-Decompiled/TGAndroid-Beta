package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pf0 implements RequestDelegate {
    public final int f39568a;
    public final xf0 f39569b;
    public final Bundle f39570c;

    public pf0(xf0 xf0Var, Bundle bundle, int i10) {
        this.f39568a = i10;
        this.f39569b = xf0Var;
        this.f39570c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39568a) {
            case 0:
                xf0 xf0Var = this.f39569b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new nf0(xf0Var, this.f39570c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new h90(21, xf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(this.f39569b, tL_error, this.f39570c, tLObject, 20));
                return;
        }
    }
}
