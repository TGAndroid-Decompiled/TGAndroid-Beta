package org.telegram.ui;

import org.telegram.messenger.BaseController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ArticleViewer$$ExternalSyntheticLambda44 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final long f$2;

    public ArticleViewer$$ExternalSyntheticLambda44(BaseController baseController, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$2 = j;
        this.f$1 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$17(this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$approveOrRejectSuggestedMessageImpl$506(this.f$2, this.f$1, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.f$0).lambda$loadTopics$7(this.f$2, this.f$1, tLObject, tL_error);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda44(ArticleViewer articleViewer, int i, long j) {
        this.$r8$classId = 0;
        this.f$0 = articleViewer;
        this.f$1 = i;
        this.f$2 = j;
    }
}
