package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c40 {
    public final TLObject f27360a;
    public TLRPC.User f27361b;
    public final int f27362c;
    public final boolean d;
    public boolean f27363e;

    public c40(int i9, TLObject tLObject) {
        boolean z10;
        this.f27360a = tLObject;
        this.f27362c = i9;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
