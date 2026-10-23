package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class df0 implements RequestDelegate {
    public final int f36613a;
    public final mf0 f36614b;
    public final Bundle f36615c;

    public df0(mf0 mf0Var, Bundle bundle, int i10) {
        this.f36613a = i10;
        this.f36614b = mf0Var;
        this.f36615c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36613a) {
            case 0:
                mf0 mf0Var = this.f36614b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new re0(mf0Var, this.f36615c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new f80(23, mf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(this.f36614b, tL_error, this.f36615c, tLObject));
                return;
        }
    }
}
