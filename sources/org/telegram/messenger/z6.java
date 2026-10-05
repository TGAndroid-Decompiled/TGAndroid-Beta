package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class z6 implements Runnable {
    public final int f19987a;
    public final MediaDataController f19988b;
    public final TLObject f19989c;

    public z6(MediaDataController mediaDataController, TLObject tLObject, int i10) {
        this.f19987a = i10;
        this.f19988b = mediaDataController;
        this.f19989c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19987a) {
            case 0:
                this.f19988b.lambda$checkPremiumGiftStickers$75(this.f19989c);
                return;
            case 1:
                this.f19988b.lambda$loadReactions$13(this.f19989c);
                return;
            case 2:
                this.f19988b.lambda$checkTonGiftStickers$77(this.f19989c);
                return;
            case 3:
                this.f19988b.lambda$checkDefaultTopicIcons$81(this.f19989c);
                return;
            case 4:
                this.f19988b.lambda$clearRecentStickers$18(this.f19989c);
                return;
            default:
                this.f19988b.lambda$checkGenericAnimations$79(this.f19989c);
                return;
        }
    }
}
