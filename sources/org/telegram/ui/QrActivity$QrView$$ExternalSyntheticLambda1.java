package org.telegram.ui;

public final class QrActivity$QrView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final QrActivity.QrView f$0;
    public final int f$1;
    public final int f$2;

    public QrActivity$QrView$$ExternalSyntheticLambda1(QrActivity.QrView qrView, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = qrView;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.prepareContent(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.prepareContent(this.f$1, this.f$2);
                break;
            default:
                this.f$0.prepareContent(this.f$1, this.f$2);
                break;
        }
    }
}
