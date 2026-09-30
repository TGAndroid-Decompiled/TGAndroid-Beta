package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f18270a;
    public final ChatObject.Call f18271b;
    public final TLObject f18272c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18270a = i10;
        this.f18271b = call;
        this.f18272c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18270a) {
            case 0:
                this.f18271b.lambda$reloadGroupCall$8(this.f18272c);
                return;
            default:
                this.f18271b.lambda$loadGroupCall$10(this.f18272c);
                return;
        }
    }
}
