package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final r1 f21629a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(r1 r1Var) {
        this.f21629a = r1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new p1(this, str, str2, 0));
    }
}
