package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SharedMediaLayout$$ExternalSyntheticLambda42 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;
    public final TLRPC.TL_error f$1;
    public final int f$2;
    public final int f$3;
    public final TLObject f$4;

    public SharedMediaLayout$$ExternalSyntheticLambda42(SharedMediaLayout sharedMediaLayout, TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject, int i3) {
        this.$r8$classId = i3;
        this.f$0 = sharedMediaLayout;
        this.f$1 = tL_error;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadFastScrollData$38(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$loadFastScrollData$37(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
