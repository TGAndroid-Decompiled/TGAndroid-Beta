package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mf0 implements RequestDelegate {
    public final int f35284a;
    public final uf0 f35285b;
    public final Bundle f35286c;

    public mf0(uf0 uf0Var, Bundle bundle, int i10) {
        this.f35284a = i10;
        this.f35285b = uf0Var;
        this.f35286c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35284a) {
            case 0:
                uf0 uf0Var = this.f35285b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new kf0(uf0Var, this.f35286c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ia0(18, uf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0(this.f35285b, tL_error, this.f35286c, tLObject, 20));
                return;
        }
    }
}
