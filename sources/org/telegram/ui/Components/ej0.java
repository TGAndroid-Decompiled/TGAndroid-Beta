package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f25719a;
    public final long f25720b;
    public int f25721c;

    public ej0(int i10, TLObject tLObject) {
        this.f25719a = tLObject;
        this.f25721c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25720b = ((TLRPC.User) tLObject).f20016id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25720b = -((TLRPC.Chat) tLObject).f19869id;
        }
    }
}
