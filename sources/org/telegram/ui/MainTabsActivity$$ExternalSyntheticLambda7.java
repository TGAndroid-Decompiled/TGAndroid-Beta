package org.telegram.ui;

public final class MainTabsActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final MainTabsActivity f$0;

    public MainTabsActivity$$ExternalSyntheticLambda7(MainTabsActivity mainTabsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = mainTabsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showAccountChangeHint$14();
                break;
            case 1:
                this.f$0.lambda$openCallsSelector$4();
                break;
            case 2:
                this.f$0.lambda$openCallsSelector$5();
                break;
            case 3:
                this.f$0.lambda$openCallsSelector$6();
                break;
            case 4:
                this.f$0.lambda$showAccountChangeHint$13();
                break;
            case 5:
                this.f$0.dumpCanvas();
                break;
            case 6:
                this.f$0.lambda$openContactsSelector$2();
                break;
            case 7:
                this.f$0.lambda$openContactsSelector$3();
                break;
            default:
                this.f$0.lambda$openAccountSelector$9();
                break;
        }
    }
}
