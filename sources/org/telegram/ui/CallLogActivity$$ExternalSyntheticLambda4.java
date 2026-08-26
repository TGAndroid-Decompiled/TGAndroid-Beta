package org.telegram.ui;

public final class CallLogActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final CallLogActivity f$0;

    public CallLogActivity$$ExternalSyntheticLambda4(CallLogActivity callLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showItemOptions$42();
                break;
            case 1:
                this.f$0.lambda$showItemOptions$41();
                break;
            case 2:
                this.f$0.lambda$createView$1();
                break;
            case 3:
                this.f$0.lambda$createView$2();
                break;
            case 4:
                this.f$0.lambda$createView$4();
                break;
            case 5:
                this.f$0.lambda$onClick$9();
                break;
            default:
                this.f$0.lambda$showItemOptions$43();
                break;
        }
    }
}
