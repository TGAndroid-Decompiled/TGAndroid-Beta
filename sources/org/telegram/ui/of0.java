package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class of0 implements RequestDelegate {
    public final int f36198a;
    public final wf0 f36199b;
    public final Bundle f36200c;

    public of0(wf0 wf0Var, Bundle bundle, int i10) {
        this.f36198a = i10;
        this.f36199b = wf0Var;
        this.f36200c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36198a) {
            case 0:
                wf0 wf0Var = this.f36199b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new mf0(wf0Var, this.f36200c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ea0(19, wf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(this.f36199b, tL_error, this.f36200c, tLObject, 20));
                return;
        }
    }
}
