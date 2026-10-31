package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ee0 implements RequestDelegate {
    public final int f37037a;
    public final me0 f37038b;
    public final Bundle f37039c;

    public ee0(me0 me0Var, Bundle bundle, int i10) {
        this.f37037a = i10;
        this.f37038b = me0Var;
        this.f37039c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37037a) {
            case 0:
                me0 me0Var = this.f37038b;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new qd0(me0Var, this.f37039c, tLObject, false, 4));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.i0.g3(new f70(24, me0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.i0.g3(new w50(this.f37038b, tL_error, this.f37039c, tLObject, 9));
                return;
        }
    }
}
