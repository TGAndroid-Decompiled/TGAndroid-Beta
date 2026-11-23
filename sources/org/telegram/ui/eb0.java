package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eb0 implements RequestDelegate {
    public final int f47488a;
    public final ob0 f47489b;
    public final String f47490c;

    public eb0(ob0 ob0Var, String str, int i7) {
        this.f47488a = i7;
        this.f47489b = ob0Var;
        this.f47490c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47488a) {
            case 0:
                org.telegram.messenger.g0.g3(new gb0(this.f47489b, tL_error, this.f47490c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new gb0(this.f47489b, tL_error, tLObject, this.f47490c));
                return;
        }
    }
}
