package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v40 {
    public final TLObject f29027a;
    public TLRPC.User f29028b;
    public final int f29029c;
    public final boolean d;
    public boolean e;

    public v40(int i10, TLObject tLObject) {
        boolean z10;
        this.f29027a = tLObject;
        this.f29029c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
