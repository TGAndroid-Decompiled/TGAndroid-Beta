package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf0 implements RequestDelegate {
    public final int f38082a;
    public final jf0 f38083b;
    public final Bundle f38084c;

    public bf0(jf0 jf0Var, Bundle bundle, int i10) {
        this.f38082a = i10;
        this.f38083b = jf0Var;
        this.f38084c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38082a) {
            case 0:
                jf0 jf0Var = this.f38083b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new oe0(jf0Var, this.f38084c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new wb0(10, jf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(this.f38083b, tL_error, this.f38084c, tLObject, 27));
                return;
        }
    }
}
