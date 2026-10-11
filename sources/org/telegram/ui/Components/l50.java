package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l50 {
    public final TLObject f28181a;
    public TLRPC.User f28182b;
    public final int f28183c;
    public final boolean d;
    public boolean f28184e;

    public l50(int i10, TLObject tLObject) {
        boolean z10;
        this.f28181a = tLObject;
        this.f28183c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
