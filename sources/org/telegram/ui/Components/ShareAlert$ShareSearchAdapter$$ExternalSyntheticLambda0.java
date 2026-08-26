package org.telegram.ui.Components;

public final class ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ShareAlert.ShareSearchAdapter f$0;
    public final int f$1;
    public final String f$2;

    public ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(int i, String str, ShareAlert.ShareSearchAdapter shareSearchAdapter) {
        this.$r8$classId = 0;
        this.f$0 = shareSearchAdapter;
        this.f$1 = i;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchDialogs$3(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$searchDialogs$4(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$searchDialogsInternal$1(this.f$2, this.f$1);
                break;
        }
    }

    public ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(ShareAlert.ShareSearchAdapter shareSearchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shareSearchAdapter;
        this.f$2 = str;
        this.f$1 = i;
    }
}
