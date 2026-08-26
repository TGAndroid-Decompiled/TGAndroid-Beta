package org.telegram.ui;

public final class QrActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final QrActivity f$0;

    public QrActivity$$ExternalSyntheticLambda1(QrActivity qrActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = qrActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onItemSelected$11();
                break;
            case 1:
                this.f$0.lambda$createView$6();
                break;
            case 2:
                this.f$0.lambda$createView$7();
                break;
            case 3:
                this.f$0.lambda$createView$5();
                break;
            case 4:
                this.f$0.lambda$onItemSelected$13();
                break;
            default:
                this.f$0.lambda$performShare$15();
                break;
        }
    }
}
