package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cf0 implements RequestDelegate {
    public final int f36323a;
    public final lf0 f36324b;
    public final Bundle f36325c;

    public cf0(lf0 lf0Var, Bundle bundle, int i10) {
        this.f36323a = i10;
        this.f36324b = lf0Var;
        this.f36325c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36323a) {
            case 0:
                lf0 lf0Var = this.f36324b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new qe0(lf0Var, this.f36325c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new f80(23, lf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90(this.f36324b, tL_error, this.f36325c, tLObject));
                return;
        }
    }
}
