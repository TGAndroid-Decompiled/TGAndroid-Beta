package org.telegram.ui;

public final class ArticleViewer$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda9(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showRestrictedWebsiteToast();
                break;
            case 1:
                this.f$0.lambda$new$67();
                break;
            case 2:
                this.f$0.lambda$new$68();
                break;
            case 3:
                this.f$0.updateSearchButtons();
                break;
            case 4:
                this.f$0.lambda$open$55();
                break;
            case 5:
                this.f$0.updatePages();
                break;
            case 6:
                this.f$0.lambda$onClosed$58();
                break;
            case 7:
                this.f$0.lambda$setParentActivity$25();
                break;
            case 8:
                this.f$0.lambda$close$57();
                break;
            case 9:
                this.f$0.lambda$setParentActivity$33();
                break;
            case 10:
                this.f$0.lambda$setParentActivity$34();
                break;
            default:
                this.f$0.openWebSettings();
                break;
        }
    }
}
