package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v40 {
    public final TLObject f29378a;
    public TLRPC.User f29379b;
    public final int f29380c;
    public final boolean d;
    public boolean e;

    public v40(int i10, TLObject tLObject) {
        boolean z4;
        this.f29378a = tLObject;
        this.f29380c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
    }
}
