package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qf0 implements RequestDelegate {
    public final int f41102a;
    public final zf0 f41103b;
    public final Bundle f41104c;

    public qf0(zf0 zf0Var, Bundle bundle, int i10) {
        this.f41102a = i10;
        this.f41103b = zf0Var;
        this.f41104c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41102a) {
            case 0:
                zf0 zf0Var = this.f41103b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new of0(zf0Var, this.f41104c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new m70(29, zf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0(this.f41103b, tL_error, this.f41104c, tLObject, 21));
                return;
        }
    }
}
