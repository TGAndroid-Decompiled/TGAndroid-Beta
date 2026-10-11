package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lk0 {
    public final TLObject f28358a;
    public final long f28359b;
    public int f28360c;

    public lk0(int i10, TLObject tLObject) {
        this.f28358a = tLObject;
        this.f28360c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28359b = ((TLRPC.User) tLObject).f20179id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28359b = -((TLRPC.Chat) tLObject).f20032id;
        }
    }
}
