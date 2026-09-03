package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kf0 implements RequestDelegate {
    public final int f38297a;
    public final sf0 f38298b;
    public final Bundle f38299c;

    public kf0(sf0 sf0Var, Bundle bundle, int i10) {
        this.f38297a = i10;
        this.f38298b = sf0Var;
        this.f38299c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38297a) {
            case 0:
                sf0 sf0Var = this.f38298b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new if0(sf0Var, this.f38299c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ue0(4, sf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new b30(this.f38298b, tL_error, this.f38299c, tLObject));
                return;
        }
    }
}
