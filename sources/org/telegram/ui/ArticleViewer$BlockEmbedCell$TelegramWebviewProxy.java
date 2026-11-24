package org.telegram.ui;

import android.webkit.JavascriptInterface;
public class ArticleViewer$BlockEmbedCell$TelegramWebviewProxy {
    public final j a;

    public ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(j jVar) {
        this.a = jVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        gl.c3(new h(this, str, str2, (byte) 0));
    }
}
