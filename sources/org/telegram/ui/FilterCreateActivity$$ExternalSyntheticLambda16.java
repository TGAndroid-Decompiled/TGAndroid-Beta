package org.telegram.ui;

public final class FilterCreateActivity$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final FilterCreateActivity f$0;

    public FilterCreateActivity$$ExternalSyntheticLambda16(FilterCreateActivity filterCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterCreateActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processDone$23();
                break;
            default:
                this.f$0.lambda$onClickCreateLink$13();
                break;
        }
    }
}
