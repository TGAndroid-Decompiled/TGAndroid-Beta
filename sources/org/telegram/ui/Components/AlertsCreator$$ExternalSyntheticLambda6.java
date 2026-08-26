package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class AlertsCreator$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final long f$1;
    public final long f$2;
    public final Utilities.Callback f$3;
    public final long f$4;

    public AlertsCreator$$ExternalSyntheticLambda6(int i, long j, long j2, Utilities.Callback callback, long j3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = callback;
        this.f$4 = j3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback callback = this.f$3;
                AlertsCreator.lambda$ensurePaidMessageConfirmation$65(this.f$0, this.f$1, this.f$2, callback, this.f$4);
                break;
            default:
                AlertsCreator.lambda$ensurePaidMessageConfirmation$64(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
