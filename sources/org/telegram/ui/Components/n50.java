package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n50 {
    public final TLObject f28723a;
    public TLRPC.User f28724b;
    public final int f28725c;
    public final boolean d;
    public boolean f28726e;

    public n50(int i10, TLObject tLObject) {
        boolean z10;
        this.f28723a = tLObject;
        this.f28725c = i10;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
