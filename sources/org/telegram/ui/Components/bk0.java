package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bk0 {
    public final TLObject f25005a;
    public final long f25006b;
    public int f25007c;

    public bk0(int i10, TLObject tLObject) {
        this.f25005a = tLObject;
        this.f25007c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f25006b = ((TLRPC.User) tLObject).f20426id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f25006b = -((TLRPC.Chat) tLObject).f20279id;
        }
    }
}
