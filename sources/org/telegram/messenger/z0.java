package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f18255a;
    public final ChatObject.Call f18256b;
    public final TLObject f18257c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18255a = i10;
        this.f18256b = call;
        this.f18257c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18255a) {
            case 0:
                this.f18256b.lambda$reloadGroupCall$8(this.f18257c);
                return;
            default:
                this.f18256b.lambda$loadGroupCall$10(this.f18257c);
                return;
        }
    }
}
