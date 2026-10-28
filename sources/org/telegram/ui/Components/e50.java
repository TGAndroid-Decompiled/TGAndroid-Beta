package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e50 {
    public final TLObject f27713a;
    public TLRPC.User f27714b;
    public final int f27715c;
    public final boolean d;
    public boolean e;

    public e50(int i10, TLObject tLObject) {
        boolean z10;
        this.f27713a = tLObject;
        this.f27715c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
