package org.telegram.ui;

public final class FilterCreateActivity$LinkCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final FilterCreateActivity.LinkCell f$0;

    public FilterCreateActivity$LinkCell$$ExternalSyntheticLambda0(FilterCreateActivity.LinkCell linkCell, int i) {
        this.$r8$classId = i;
        this.f$0 = linkCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteLink$4();
                break;
            case 1:
                this.f$0.qrcode();
                break;
            default:
                this.f$0.deleteLink();
                break;
        }
    }
}
