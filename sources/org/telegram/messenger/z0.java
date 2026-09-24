package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class z0 implements Runnable {
    public final int f18238a;
    public final ChatObject.Call f18239b;
    public final TLObject f18240c;

    public z0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18238a = i10;
        this.f18239b = call;
        this.f18240c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18238a) {
            case 0:
                this.f18239b.lambda$reloadGroupCall$8(this.f18240c);
                return;
            default:
                this.f18239b.lambda$loadGroupCall$10(this.f18240c);
                return;
        }
    }
}
