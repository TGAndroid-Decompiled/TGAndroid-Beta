package org.telegram.ui;

public final class ReportBottomSheet$Page$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ReportBottomSheet.Page f$0;

    public ReportBottomSheet$Page$$ExternalSyntheticLambda0(ReportBottomSheet.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setOption$1();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
