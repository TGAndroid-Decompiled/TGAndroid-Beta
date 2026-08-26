package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.web.BrowserHistory;

public final class ArticleViewer$$ExternalSyntheticLambda28 implements Utilities.Callback {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda28(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParentActivity$21((String) obj);
                break;
            case 1:
                this.f$0.openBookmark((String) obj);
                break;
            case 2:
                this.f$0.openHistoryEntry((BrowserHistory.Entry) obj);
                break;
            default:
                this.f$0.lambda$setParentActivity$42((Integer) obj);
                break;
        }
    }
}
