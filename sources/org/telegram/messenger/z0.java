package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f19960a;
    public final ChatObject.Call f19961b;
    public final TLObject f19962c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19960a = i10;
        this.f19961b = call;
        this.f19962c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19960a) {
            case 0:
                this.f19961b.lambda$reloadGroupCall$8(this.f19962c);
                return;
            default:
                this.f19961b.lambda$loadGroupCall$10(this.f19962c);
                return;
        }
    }
}
