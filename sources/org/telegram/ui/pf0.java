package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pf0 implements RequestDelegate {
    public final int f39469a;
    public final xf0 f39470b;
    public final Bundle f39471c;

    public pf0(xf0 xf0Var, Bundle bundle, int i10) {
        this.f39469a = i10;
        this.f39470b = xf0Var;
        this.f39471c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39469a) {
            case 0:
                xf0 xf0Var = this.f39470b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new nf0(xf0Var, this.f39471c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new h90(21, xf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(this.f39470b, tL_error, this.f39471c, tLObject, 20));
                return;
        }
    }
}
