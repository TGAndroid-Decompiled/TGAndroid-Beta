package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk0 {
    public final TLObject f24771a;
    public final long f24772b;
    public int f24773c;

    public fk0(int i10, TLObject tLObject) {
        this.f24771a = tLObject;
        this.f24773c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f24772b = ((TLRPC.User) tLObject).f19063id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f24772b = -((TLRPC.Chat) tLObject).f18916id;
        }
    }
}
