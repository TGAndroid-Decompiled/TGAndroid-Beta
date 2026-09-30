package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f18279a;
    public final MediaDataController f18280b;
    public final TLObject f18281c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f18279a = i10;
        this.f18280b = mediaDataController;
        this.f18281c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18279a) {
            case 0:
                this.f18280b.lambda$checkPremiumGiftStickers$75(this.f18281c);
                return;
            case 1:
                this.f18280b.lambda$loadReactions$13(this.f18281c);
                return;
            case 2:
                this.f18280b.lambda$checkTonGiftStickers$77(this.f18281c);
                return;
            case 3:
                this.f18280b.lambda$checkDefaultTopicIcons$81(this.f18281c);
                return;
            case 4:
                this.f18280b.lambda$clearRecentStickers$18(this.f18281c);
                return;
            default:
                this.f18280b.lambda$checkGenericAnimations$79(this.f18281c);
                return;
        }
    }
}
