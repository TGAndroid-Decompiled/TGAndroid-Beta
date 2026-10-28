package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk0 {
    public final TLObject f28202a;
    public final long f28203b;
    public int f28204c;

    public fk0(int i10, TLObject tLObject) {
        this.f28202a = tLObject;
        this.f28204c = i10;
        if (tLObject instanceof TLRPC.User) {
            this.f28203b = ((TLRPC.User) tLObject).f22177id;
        } else if (tLObject instanceof TLRPC.Chat) {
            this.f28203b = -((TLRPC.Chat) tLObject).f22028id;
        }
    }
}
