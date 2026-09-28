package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f18277a;
    public final MediaDataController f18278b;
    public final TLObject f18279c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18277a = i10;
        this.f18278b = mediaDataController;
        this.f18279c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18277a) {
            case 0:
                this.f18278b.lambda$checkPremiumGiftStickers$75(this.f18279c);
                return;
            case 1:
                this.f18278b.lambda$loadReactions$13(this.f18279c);
                return;
            case 2:
                this.f18278b.lambda$checkTonGiftStickers$77(this.f18279c);
                return;
            case 3:
                this.f18278b.lambda$checkDefaultTopicIcons$81(this.f18279c);
                return;
            case 4:
                this.f18278b.lambda$clearRecentStickers$18(this.f18279c);
                return;
            default:
                this.f18278b.lambda$checkGenericAnimations$79(this.f18279c);
                return;
        }
    }
}
