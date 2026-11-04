package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d30 {
    public final TLObject f32923a;
    public TLRPC.User f32924b;
    public final int f32925c;
    public final boolean d;
    public boolean f32926e;

    public d30(int i3, TLObject tLObject) {
        boolean z10;
        this.f32923a = tLObject;
        this.f32925c = i3;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
