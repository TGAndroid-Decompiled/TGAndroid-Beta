package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kf0 implements RequestDelegate {
    public final int f38394a;
    public final sf0 f38395b;
    public final Bundle f38396c;

    public kf0(sf0 sf0Var, Bundle bundle, int i10) {
        this.f38394a = i10;
        this.f38395b = sf0Var;
        this.f38396c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38394a) {
            case 0:
                sf0 sf0Var = this.f38395b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new if0(sf0Var, this.f38396c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new he0(5, sf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new b30(this.f38395b, tL_error, this.f38396c, tLObject));
                return;
        }
    }
}
