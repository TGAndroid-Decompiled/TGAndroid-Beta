package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf0 implements RequestDelegate {
    public final int f38079a;
    public final jf0 f38080b;
    public final Bundle f38081c;

    public bf0(jf0 jf0Var, Bundle bundle, int i10) {
        this.f38079a = i10;
        this.f38080b = jf0Var;
        this.f38081c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38079a) {
            case 0:
                jf0 jf0Var = this.f38080b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new oe0(jf0Var, this.f38081c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new wb0(10, jf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(this.f38080b, tL_error, this.f38081c, tLObject, 27));
                return;
        }
    }
}
