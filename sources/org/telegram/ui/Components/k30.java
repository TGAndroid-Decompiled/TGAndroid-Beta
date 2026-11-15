package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k30 {
    public final TLObject f36268a;
    public TLRPC.User f36269b;
    public final int f36270c;
    public final boolean d;
    public boolean f36271e;

    public k30(int i7, TLObject tLObject) {
        boolean z10;
        this.f36268a = tLObject;
        this.f36270c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }
}
