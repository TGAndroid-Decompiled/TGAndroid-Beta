package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek0 {
    public final TLObject f26070a;
    public final long f26071b;
    public int f26072c;

    public ek0(int i10, TLObject tLObject) {
        this.f26070a = tLObject;
        this.f26072c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f26071b = ((TLRPC.User) tLObject).f20491id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f26071b = -((TLRPC.Chat) tLObject).f20344id;
        }
    }
}
