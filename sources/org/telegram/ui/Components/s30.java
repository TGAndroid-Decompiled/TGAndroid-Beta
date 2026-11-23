package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s30 {
    public final TLObject f39481a;
    public TLRPC.User f39482b;
    public final int f39483c;
    public final boolean d;
    public boolean f39484e;

    public s30(int i7, TLObject tLObject) {
        boolean z10;
        this.f39481a = tLObject;
        this.f39483c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
