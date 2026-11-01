package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de0 implements RequestDelegate {
    public final int f36581a;
    public final le0 f36582b;
    public final Bundle f36583c;

    public de0(le0 le0Var, Bundle bundle, int i10) {
        this.f36581a = i10;
        this.f36582b = le0Var;
        this.f36583c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36581a) {
            case 0:
                le0 le0Var = this.f36582b;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new pd0(le0Var, this.f36583c, tLObject, false, 4));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.i0.g3(new y60(25, le0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.i0.g3(new v50(this.f36582b, tL_error, this.f36583c, tLObject, 9));
                return;
        }
    }
}
