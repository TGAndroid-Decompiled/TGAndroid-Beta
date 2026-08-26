package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;
    public final TLObject f$1;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda3(ChannelMonetizationLayout channelMonetizationLayout, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStarsStats$26(this.f$1);
                break;
            default:
                this.f$0.lambda$initLevel$32(this.f$1);
                break;
        }
    }
}
