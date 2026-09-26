package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lf0 implements RequestDelegate {
    public final int f35352a;
    public final tf0 f35353b;
    public final Bundle f35354c;

    public lf0(tf0 tf0Var, Bundle bundle, int i10) {
        this.f35352a = i10;
        this.f35353b = tf0Var;
        this.f35354c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35352a) {
            case 0:
                tf0 tf0Var = this.f35353b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new jf0(tf0Var, this.f35354c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new n80(23, tf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(this.f35353b, tL_error, this.f35354c, tLObject, 21));
                return;
        }
    }
}
