package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19942a;
    public final ChatObject.Call f19943b;
    public final TLObject f19944c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19942a = i10;
        this.f19943b = call;
        this.f19944c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19942a) {
            case 0:
                this.f19943b.lambda$reloadGroupCall$8(this.f19944c);
                return;
            default:
                this.f19943b.lambda$loadGroupCall$10(this.f19944c);
                return;
        }
    }
}
