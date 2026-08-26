package org.telegram.ui.Components;

public final class ShareAlert$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ShareAlert f$0;

    public ShareAlert$$ExternalSyntheticLambda2(ShareAlert shareAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = shareAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPremiumBlockedToast$20();
                break;
            default:
                this.f$0.lambda$new$3();
                break;
        }
    }
}
