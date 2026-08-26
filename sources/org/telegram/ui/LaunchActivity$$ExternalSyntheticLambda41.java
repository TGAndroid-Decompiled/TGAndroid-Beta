package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class LaunchActivity$$ExternalSyntheticLambda41 implements Runnable {
    public final int $r8$classId;
    public final TLObject f$0;
    public final int f$1;

    public LaunchActivity$$ExternalSyntheticLambda41(int i, int i2, TLObject tLObject) {
        this.$r8$classId = i2;
        this.f$0 = tLObject;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$runLinkRequest$64(this.f$0, this.f$1);
                break;
            default:
                LaunchActivity.lambda$runLinkRequest$67(this.f$0, this.f$1);
                break;
        }
    }
}
