package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class AlertsCreator$$ExternalSyntheticLambda163 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public AlertsCreator$$ExternalSyntheticLambda163(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$ensurePaidMessageConfirmation$63((Utilities.Callback) this.f$0, this.f$1);
                break;
            case 1:
                ((ChatActivityEnterView.AnonymousClass77) this.f$0).lambda$onBecomeFullyVisible$0(this.f$1);
                break;
            default:
                ((PostsSearchContainer) this.f$0).lambda$load$2(this.f$1);
                break;
        }
    }
}
