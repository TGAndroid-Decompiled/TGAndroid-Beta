package org.telegram.ui;

import android.view.View;
import org.telegram.ui.web.BotWebViewContainer;

public final class ArticleViewer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final int f$1;
    public final View f$2;

    public ArticleViewer$$ExternalSyntheticLambda5(int i, int i2, BotWebViewContainer.MyWebView myWebView) {
        this.$r8$classId = 0;
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = myWebView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.lambda$setParentActivity$27(this.f$0, this.f$1, (BotWebViewContainer.MyWebView) this.f$2);
                break;
            case 1:
                ((QrActivity.QrView) this.f$2).lambda$setData$1(this.f$0, this.f$1);
                break;
            case 2:
                ((QrActivity.QrView) this.f$2).lambda$onSizeChanged$0(this.f$0, this.f$1);
                break;
            default:
                ((QrActivity.QrView) this.f$2).lambda$new$2(this.f$0, this.f$1);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda5(QrActivity.QrView qrView, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = qrView;
        this.f$0 = i;
        this.f$1 = i2;
    }
}
