package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LaunchActivity$14$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity.AnonymousClass14 f$0;
    public final AccountInstance f$1;
    public final long f$2;
    public final BaseFragment f$3;

    public LaunchActivity$14$$ExternalSyntheticLambda0(LaunchActivity.AnonymousClass14 anonymousClass14, AccountInstance accountInstance, long j, BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass14;
        this.f$1 = accountInstance;
        this.f$2 = j;
        this.f$3 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onMessagesLoaded$1(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$onMessagesLoaded$0(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
