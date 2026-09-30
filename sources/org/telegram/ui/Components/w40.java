package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w40 {
    public final TLObject f29815a;
    public TLRPC.User f29816b;
    public final int f29817c;
    public final boolean d;
    public boolean e;

    public w40(int i10, TLObject tLObject) {
        boolean z10;
        this.f29815a = tLObject;
        this.f29817c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
