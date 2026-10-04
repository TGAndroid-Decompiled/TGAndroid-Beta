package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f19982a;
    public final MediaDataController f19983b;
    public final TLObject f19984c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f19982a = i10;
        this.f19983b = mediaDataController;
        this.f19984c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19982a) {
            case 0:
                this.f19983b.lambda$checkPremiumGiftStickers$75(this.f19984c);
                return;
            case 1:
                this.f19983b.lambda$loadReactions$13(this.f19984c);
                return;
            case 2:
                this.f19983b.lambda$checkTonGiftStickers$77(this.f19984c);
                return;
            case 3:
                this.f19983b.lambda$checkDefaultTopicIcons$81(this.f19984c);
                return;
            case 4:
                this.f19983b.lambda$clearRecentStickers$18(this.f19984c);
                return;
            default:
                this.f19983b.lambda$checkGenericAnimations$79(this.f19984c);
                return;
        }
    }
}
