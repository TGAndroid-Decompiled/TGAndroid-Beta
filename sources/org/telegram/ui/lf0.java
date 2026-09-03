package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lf0 implements RequestDelegate {
    public final int f35756a;
    public final tf0 f35757b;
    public final Bundle f35758c;

    public lf0(tf0 tf0Var, Bundle bundle, int i10) {
        this.f35756a = i10;
        this.f35757b = tf0Var;
        this.f35758c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35756a) {
            case 0:
                tf0 tf0Var = this.f35757b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new jf0(tf0Var, this.f35758c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ie0(5, tf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new c30(this.f35757b, tL_error, this.f35758c, tLObject));
                return;
        }
    }
}
