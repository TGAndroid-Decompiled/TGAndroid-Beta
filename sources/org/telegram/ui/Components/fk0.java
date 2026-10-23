package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk0 {
    public final TLObject f26369a;
    public final long f26370b;
    public int f26371c;

    public fk0(int i10, TLObject tLObject) {
        this.f26369a = tLObject;
        this.f26371c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f26370b = ((TLRPC.User) tLObject).f20490id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f26370b = -((TLRPC.Chat) tLObject).f20343id;
        }
    }
}
