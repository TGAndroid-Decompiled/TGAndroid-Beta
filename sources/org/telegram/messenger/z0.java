package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f18253a;
    public final ChatObject.Call f18254b;
    public final TLObject f18255c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18253a = i10;
        this.f18254b = call;
        this.f18255c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18253a) {
            case 0:
                this.f18254b.lambda$reloadGroupCall$8(this.f18255c);
                return;
            default:
                this.f18254b.lambda$loadGroupCall$10(this.f18255c);
                return;
        }
    }
}
