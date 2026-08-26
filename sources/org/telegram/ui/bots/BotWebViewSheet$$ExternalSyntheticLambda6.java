package org.telegram.ui.bots;

import android.view.View;
import org.telegram.ui.web.BotWebViewContainer;

public final class BotWebViewSheet$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final int $r8$classId;
    public final BotWebViewSheet f$0;

    public BotWebViewSheet$$ExternalSyntheticLambda6(BotWebViewSheet botWebViewSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.openOptions();
                break;
            default:
                BotWebViewContainer.MyWebView webView = getWebView();
                if (webView != null) {
                    webView.reload();
                }
                break;
        }
    }
}
