package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class af0 implements RequestDelegate {
    public final int f36472a;
    public final jf0 f36473b;
    public final Bundle f36474c;

    public af0(jf0 jf0Var, Bundle bundle, int i9) {
        this.f36472a = i9;
        this.f36473b = jf0Var;
        this.f36474c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36472a) {
            case 0:
                jf0 jf0Var = this.f36473b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ye0(jf0Var, this.f36474c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new cf0(0, jf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(this.f36473b, tL_error, this.f36474c, tLObject, 19));
                return;
        }
    }
}
