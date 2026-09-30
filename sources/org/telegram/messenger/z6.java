package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f18294a;
    public final MediaDataController f18295b;
    public final TLObject f18296c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18294a = i10;
        this.f18295b = mediaDataController;
        this.f18296c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18294a) {
            case 0:
                this.f18295b.lambda$checkPremiumGiftStickers$75(this.f18296c);
                return;
            case 1:
                this.f18295b.lambda$loadReactions$13(this.f18296c);
                return;
            case 2:
                this.f18295b.lambda$checkTonGiftStickers$77(this.f18296c);
                return;
            case 3:
                this.f18295b.lambda$checkDefaultTopicIcons$81(this.f18296c);
                return;
            case 4:
                this.f18295b.lambda$clearRecentStickers$18(this.f18296c);
                return;
            default:
                this.f18295b.lambda$checkGenericAnimations$79(this.f18296c);
                return;
        }
    }
}
