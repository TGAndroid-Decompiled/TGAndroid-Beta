package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q40 {
    public final TLObject f31852a;
    public TLRPC.User f31853b;
    public final int f31854c;
    public final boolean d;
    public boolean f31855e;

    public q40(int i10, TLObject tLObject) {
        boolean z10;
        this.f31852a = tLObject;
        this.f31854c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
