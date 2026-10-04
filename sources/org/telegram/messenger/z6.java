package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f19972a;
    public final MediaDataController f19973b;
    public final TLObject f19974c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f19972a = i10;
        this.f19973b = mediaDataController;
        this.f19974c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19972a) {
            case 0:
                this.f19973b.lambda$checkPremiumGiftStickers$75(this.f19974c);
                return;
            case 1:
                this.f19973b.lambda$loadReactions$13(this.f19974c);
                return;
            case 2:
                this.f19973b.lambda$checkTonGiftStickers$77(this.f19974c);
                return;
            case 3:
                this.f19973b.lambda$checkDefaultTopicIcons$81(this.f19974c);
                return;
            case 4:
                this.f19973b.lambda$clearRecentStickers$18(this.f19974c);
                return;
            default:
                this.f19973b.lambda$checkGenericAnimations$79(this.f19974c);
                return;
        }
    }
}
