package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ej0 {
    public final TLObject f25718a;
    public final long f25719b;
    public int f25720c;

    public ej0(int i10, TLObject tLObject) {
        this.f25718a = tLObject;
        this.f25720c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25719b = ((TLRPC.User) tLObject).f20016id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25719b = -((TLRPC.Chat) tLObject).f19869id;
        }
    }
}
