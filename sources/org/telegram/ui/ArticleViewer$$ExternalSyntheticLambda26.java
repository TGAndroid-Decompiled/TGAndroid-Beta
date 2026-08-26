package org.telegram.ui;

public final class ArticleViewer$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final ArticleViewer f$0;
    public final String f$1;

    public ArticleViewer$$ExternalSyntheticLambda26(ArticleViewer articleViewer, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParentActivity$19(this.f$1);
                break;
            default:
                this.f$0.lambda$setParentActivity$35(this.f$1);
                break;
        }
    }
}
