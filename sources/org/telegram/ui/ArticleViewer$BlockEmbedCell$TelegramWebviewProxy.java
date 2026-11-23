package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final q1 f30323a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(q1 q1Var) {
        this.f30323a = q1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new o1(this, str, str2, 0));
    }
}
