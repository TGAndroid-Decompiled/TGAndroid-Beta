package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class df0 implements RequestDelegate {
    public final int f38600a;
    public final lf0 f38601b;
    public final Bundle f38602c;

    public df0(lf0 lf0Var, Bundle bundle, int i10) {
        this.f38600a = i10;
        this.f38601b = lf0Var;
        this.f38602c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38600a) {
            case 0:
                lf0 lf0Var = this.f38601b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ne0(lf0Var, this.f38602c, tLObject, false, 4));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new kb0(11, lf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(this.f38601b, tL_error, this.f38602c, tLObject, 27));
                return;
        }
    }
}
