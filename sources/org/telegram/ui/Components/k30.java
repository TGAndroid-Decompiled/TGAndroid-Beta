package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k30 {
    public final TLObject f36258a;
    public TLRPC.User f36259b;
    public final int f36260c;
    public final boolean d;
    public boolean f36261e;

    public k30(int i7, TLObject tLObject) {
        boolean z10;
        this.f36258a = tLObject;
        this.f36260c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
