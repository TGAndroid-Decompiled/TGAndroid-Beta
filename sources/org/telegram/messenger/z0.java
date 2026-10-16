package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z0 implements RequestDelegate {
    public final int f18826a;
    public final ChatObject.Call f18827b;

    public z0(ChatObject.Call call, int i10) {
        this.f18826a = i10;
        this.f18827b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18826a) {
            case 0:
                this.f18827b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f18827b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f18827b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f18827b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
