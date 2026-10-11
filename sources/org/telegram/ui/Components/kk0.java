package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kk0 {
    public final TLObject f28100a;
    public final long f28101b;
    public int f28102c;

    public kk0(int i10, TLObject tLObject) {
        this.f28100a = tLObject;
        this.f28102c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28101b = ((TLRPC.User) tLObject).f20215id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28101b = -((TLRPC.Chat) tLObject).f20068id;
        }
    }
}
