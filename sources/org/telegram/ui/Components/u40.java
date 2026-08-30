package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u40 {
    public final TLObject f29104a;
    public TLRPC.User f29105b;
    public final int f29106c;
    public final boolean d;
    public boolean e;

    public u40(int i10, TLObject tLObject) {
        boolean z4;
        this.f29104a = tLObject;
        this.f29106c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
    }
}
