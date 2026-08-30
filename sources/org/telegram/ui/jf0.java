package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jf0 implements RequestDelegate {
    public final int f35339a;
    public final rf0 f35340b;
    public final Bundle f35341c;

    public jf0(rf0 rf0Var, Bundle bundle, int i10) {
        this.f35339a = i10;
        this.f35340b = rf0Var;
        this.f35341c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35339a) {
            case 0:
                rf0 rf0Var = this.f35340b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new hf0(rf0Var, this.f35341c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new fe0(6, rf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new a30(this.f35340b, tL_error, this.f35341c, tLObject));
                return;
        }
    }
}
