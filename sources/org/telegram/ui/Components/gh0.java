package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 {
    public final TLObject f33917a;
    public final long f33918b;
    public int f33919c;

    public gh0(int i7, TLObject tLObject) {
        this.f33917a = tLObject;
        this.f33919c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f33918b = ((TLRPC.User) tLObject).f27102id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f33918b = -((TLRPC.Chat) tLObject).f26953id;
        }
    }
}
