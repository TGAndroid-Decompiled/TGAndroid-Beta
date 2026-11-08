package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h30 {
    public final TLObject f34102a;
    public TLRPC.User f34103b;
    public final int f34104c;
    public final boolean d;
    public boolean f34105e;

    public h30(int i7, TLObject tLObject) {
        boolean z9;
        this.f34102a = tLObject;
        this.f34104c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
    }
}
