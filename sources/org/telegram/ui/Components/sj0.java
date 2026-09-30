package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sj0 {
    public final TLObject f28274a;
    public final long f28275b;
    public int f28276c;

    public sj0(int i10, TLObject tLObject) {
        this.f28274a = tLObject;
        this.f28276c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28275b = ((TLRPC.User) tLObject).f18499id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28275b = -((TLRPC.Chat) tLObject).f18352id;
        }
    }
}
