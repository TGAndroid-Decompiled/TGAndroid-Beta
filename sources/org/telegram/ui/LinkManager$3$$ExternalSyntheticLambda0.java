package org.telegram.ui;

import org.telegram.messenger.SharedConfig;

public final class LinkManager$3$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public LinkManager$3$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager.AnonymousClass3) this.f$0).lambda$onBecomeFullyVisible$0(this.f$1);
                break;
            case 1:
                ArticleViewer.lambda$addBookmark$47((ArticleViewer.Sheet) this.f$0, this.f$1);
                break;
            case 2:
                ((CacheControlActivity) this.f$0).lambda$cleanupFoldersInternal$15(this.f$1);
                break;
            case 3:
                ((GroupCallActivity) this.f$0).lambda$processSelectedOption$70(this.f$1);
                break;
            case 4:
                ((MessageAuthorView) this.f$0).lambda$updateView$2(this.f$1);
                break;
            default:
                ProxyListActivity.lambda$checkProxyList$5((SharedConfig.ProxyInfo) this.f$0, this.f$1);
                break;
        }
    }
}
