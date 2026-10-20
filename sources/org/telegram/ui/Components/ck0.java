package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck0 {
    public final TLObject f25211a;
    public final long f25212b;
    public int f25213c;

    public ck0(int i10, TLObject tLObject) {
        this.f25211a = tLObject;
        this.f25213c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25212b = ((TLRPC.User) tLObject).f20423id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25212b = -((TLRPC.Chat) tLObject).f20276id;
        }
    }
}
