package org.telegram.ui.Components;

public final class AlertsCreator$$ExternalSyntheticLambda145 implements Runnable {
    public final int $r8$classId;
    public final boolean[] f$0;
    public final Runnable f$1;

    public AlertsCreator$$ExternalSyntheticLambda145(int i, Runnable runnable, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = zArr;
        this.f$1 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$showDisableSharingInfo$268(this.f$0, this.f$1);
                break;
            default:
                BulletinFactory.lambda$createForwardedBulletin$6(this.f$0, this.f$1);
                break;
        }
    }
}
