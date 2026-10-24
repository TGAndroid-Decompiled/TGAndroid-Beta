package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final u1 f22046a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(u1 u1Var) {
        this.f22046a = u1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new s1(this, str, str2, 0));
    }
}
