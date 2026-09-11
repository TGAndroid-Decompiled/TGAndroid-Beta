package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final t1 f21564a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(t1 t1Var) {
        this.f21564a = t1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new r1(this, str, str2, 0));
    }
}
