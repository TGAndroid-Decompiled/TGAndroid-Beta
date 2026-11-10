package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 {
    public final TLObject f33899a;
    public final long f33900b;
    public int f33901c;

    public gh0(int i7, TLObject tLObject) {
        this.f33899a = tLObject;
        this.f33901c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f33900b = ((TLRPC.User) tLObject).f27109id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f33900b = -((TLRPC.Chat) tLObject).f26960id;
        }
    }
}
