package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck0 {
    public final TLObject f25215a;
    public final long f25216b;
    public int f25217c;

    public ck0(int i10, TLObject tLObject) {
        this.f25215a = tLObject;
        this.f25217c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25216b = ((TLRPC.User) tLObject).f20427id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25216b = -((TLRPC.Chat) tLObject).f20280id;
        }
    }
}
