package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eb0 implements RequestDelegate {
    public final int f46653a;
    public final ob0 f46654b;
    public final String f46655c;

    public eb0(ob0 ob0Var, String str, int i7) {
        this.f46653a = i7;
        this.f46654b = ob0Var;
        this.f46655c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46653a) {
            case 0:
                org.telegram.messenger.g0.h3(new gb0(this.f46654b, tL_error, this.f46655c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new gb0(this.f46654b, tL_error, tLObject, this.f46655c));
                return;
        }
    }
}
