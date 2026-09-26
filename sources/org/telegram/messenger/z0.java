package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f18252a;
    public final ChatObject.Call f18253b;
    public final TLObject f18254c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18252a = i10;
        this.f18253b = call;
        this.f18254c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18252a) {
            case 0:
                this.f18253b.lambda$reloadGroupCall$8(this.f18254c);
                return;
            default:
                this.f18253b.lambda$loadGroupCall$10(this.f18254c);
                return;
        }
    }
}
