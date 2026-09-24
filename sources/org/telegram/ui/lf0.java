package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lf0 implements RequestDelegate {
    public final int f35320a;
    public final tf0 f35321b;
    public final Bundle f35322c;

    public lf0(tf0 tf0Var, Bundle bundle, int i10) {
        this.f35320a = i10;
        this.f35321b = tf0Var;
        this.f35322c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35320a) {
            case 0:
                tf0 tf0Var = this.f35321b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new jf0(tf0Var, this.f35322c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new m80(24, tf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(this.f35321b, tL_error, this.f35322c, tLObject, 20));
                return;
        }
    }
}
