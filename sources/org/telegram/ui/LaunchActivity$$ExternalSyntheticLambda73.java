package org.telegram.ui;

import org.telegram.messenger.browser.Browser;

public final class LaunchActivity$$ExternalSyntheticLambda73 implements Runnable {
    public final int $r8$classId;
    public final Browser.Progress f$0;

    public LaunchActivity$$ExternalSyntheticLambda73(int i, Browser.Progress progress) {
        this.$r8$classId = i;
        this.f$0 = progress;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$openMessage$37(this.f$0);
                break;
            case 1:
                this.f$0.end();
                break;
            case 2:
                LaunchActivity.lambda$openMessage$38(this.f$0);
                break;
            default:
                LaunchActivity.lambda$checkAppUpdate$137(this.f$0);
                break;
        }
    }
}
