package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f18278a;
    public final MediaDataController f18279b;
    public final TLObject f18280c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18278a = i10;
        this.f18279b = mediaDataController;
        this.f18280c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18278a) {
            case 0:
                this.f18279b.lambda$checkPremiumGiftStickers$75(this.f18280c);
                return;
            case 1:
                this.f18279b.lambda$loadReactions$13(this.f18280c);
                return;
            case 2:
                this.f18279b.lambda$checkTonGiftStickers$77(this.f18280c);
                return;
            case 3:
                this.f18279b.lambda$checkDefaultTopicIcons$81(this.f18280c);
                return;
            case 4:
                this.f18279b.lambda$clearRecentStickers$18(this.f18280c);
                return;
            default:
                this.f18279b.lambda$checkGenericAnimations$79(this.f18280c);
                return;
        }
    }
}
