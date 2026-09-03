package org.telegram.messenger;
public final class z3 implements Runnable {
    public final int f19078a;
    public final boolean f19079b;

    public z3(int i10, boolean z4) {
        this.f19078a = i10;
        this.f19079b = z4;
    }

    @Override
    public final void run() {
        int i10 = this.f19078a;
        boolean z4 = this.f19079b;
        switch (i10) {
            case 0:
                FingerprintController.b(z4);
                return;
            case 1:
                FingerprintController.a(z4);
                return;
            case 2:
                LiteMode.lambda$onPowerSaverApplied$0(z4);
                return;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z4));
                return;
        }
    }
}
