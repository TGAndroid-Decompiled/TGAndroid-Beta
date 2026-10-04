package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f19973a;
    public final MediaDataController f19974b;
    public final TLObject f19975c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f19973a = i10;
        this.f19974b = mediaDataController;
        this.f19975c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19973a) {
            case 0:
                this.f19974b.lambda$checkPremiumGiftStickers$75(this.f19975c);
                return;
            case 1:
                this.f19974b.lambda$loadReactions$13(this.f19975c);
                return;
            case 2:
                this.f19974b.lambda$checkTonGiftStickers$77(this.f19975c);
                return;
            case 3:
                this.f19974b.lambda$checkDefaultTopicIcons$81(this.f19975c);
                return;
            case 4:
                this.f19974b.lambda$clearRecentStickers$18(this.f19975c);
                return;
            default:
                this.f19974b.lambda$checkGenericAnimations$79(this.f19975c);
                return;
        }
    }
}
