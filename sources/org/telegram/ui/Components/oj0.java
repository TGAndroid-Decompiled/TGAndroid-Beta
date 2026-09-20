package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj0 {
    public final TLObject f26954a;
    public final long f26955b;
    public int f26956c;

    public oj0(int i10, TLObject tLObject) {
        this.f26954a = tLObject;
        this.f26956c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f26955b = ((TLRPC.User) tLObject).f18475id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f26955b = -((TLRPC.Chat) tLObject).f18328id;
        }
    }
}
