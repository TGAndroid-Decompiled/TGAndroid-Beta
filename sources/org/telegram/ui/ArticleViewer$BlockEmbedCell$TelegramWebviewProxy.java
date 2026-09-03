package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final w1 f20763a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(w1 w1Var) {
        this.f20763a = w1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new u1(this, str, str2, 0));
    }
}
