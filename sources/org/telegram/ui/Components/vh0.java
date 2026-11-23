package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public final TLObject f40782a;
    public final long f40783b;
    public int f40784c;

    public vh0(int i7, TLObject tLObject) {
        this.f40782a = tLObject;
        this.f40784c = i7;
        if (tLObject instanceof TLRPC.User) {
            this.f40783b = ((TLRPC.User) tLObject).f28547id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f40783b = -((TLRPC.Chat) tLObject).f28398id;
        }
    }
}
