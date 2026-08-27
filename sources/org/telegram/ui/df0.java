package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class df0 implements RequestDelegate {

    public final int f37389a;

    public final mf0 f37390b;

    public final Bundle f37391c;

    public df0(mf0 mf0Var, Bundle bundle, int i10) {
        this.f37389a = i10;
        this.f37390b = mf0Var;
        this.f37391c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37389a) {
            case 0:
                mf0 mf0Var = this.f37390b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new ff0(0, mf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new bf0(mf0Var, this.f37391c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(this.f37390b, tL_error, this.f37391c, tLObject, 15));
                break;
        }
    }
}
