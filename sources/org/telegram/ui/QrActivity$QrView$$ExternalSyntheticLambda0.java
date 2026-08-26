package org.telegram.ui;

public final class QrActivity$QrView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final QrActivity.QrView f$0;

    public QrActivity$QrView$$ExternalSyntheticLambda0(QrActivity.QrView qrView, int i) {
        this.$r8$classId = i;
        this.f$0 = qrView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$5();
                break;
            default:
                this.f$0.lambda$prepareContent$6();
                break;
        }
    }
}
