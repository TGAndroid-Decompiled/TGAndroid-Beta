package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l50 {
    public final TLObject f28165a;
    public TLRPC.User f28166b;
    public final int f28167c;
    public final boolean d;
    public boolean f28168e;

    public l50(int i10, TLObject tLObject) {
        boolean z10;
        this.f28165a = tLObject;
        this.f28167c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
