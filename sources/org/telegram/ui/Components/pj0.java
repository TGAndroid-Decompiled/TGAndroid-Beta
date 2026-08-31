package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj0 {
    public final TLObject f30094a;
    public final long f30095b;
    public int f30096c;

    public pj0(int i10, TLObject tLObject) {
        this.f30094a = tLObject;
        this.f30096c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f30095b = ((TLRPC.User) tLObject).f20990id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f30095b = -((TLRPC.Chat) tLObject).f20843id;
        }
    }
}
