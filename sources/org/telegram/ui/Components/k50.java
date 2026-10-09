package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k50 {
    public final TLObject f27847a;
    public TLRPC.User f27848b;
    public final int f27849c;
    public final boolean d;
    public boolean f27850e;

    public k50(int i10, TLObject tLObject) {
        boolean z10;
        this.f27847a = tLObject;
        this.f27849c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
