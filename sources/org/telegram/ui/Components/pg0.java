package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pj1;
public final class pg0 extends WebViewClient {
    public final int f29868a;
    public final Object f29869b;

    public pg0(Object obj, int i10) {
        this.f29868a = i10;
        this.f29869b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((pj1) this.f29869b).getClass();
        ((pj1) this.f29869b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return true;
        }
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f29868a) {
            case 1:
                if (!a(str)) {
                    super.onLoadResource(webView, str);
                    return;
                }
                return;
            default:
                super.onLoadResource(webView, str);
                return;
        }
    }

    @Override
    public void onPageFinished(WebView webView, String str) {
        int i10 = this.f29868a;
        Object obj = this.f29869b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) obj;
                View view = iu0Var.f31245r;
                if (!iu0Var.f31248x) {
                    iu0Var.f31244n.setVisibility(4);
                    iu0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                pj1 pj1Var = (pj1) obj;
                jr jrVar = pj1Var.f40928c;
                if (jrVar != null && jrVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    pj1Var.f40927b.getContentView().setVisibility(0);
                    pj1Var.f40927b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(pj1Var.f40928c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(pj1Var.f40928c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(pj1Var.f40928c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(pj1Var.f40927b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(pj1Var.f40927b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(pj1Var.f40927b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.Wallet.z4(this, 5));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f29868a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    pi.k kVar = (pi.k) this.f29869b;
                    if (webView == kVar.f45998o) {
                        kVar.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
        }
    }

    @Override
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f29868a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    pi.k kVar = (pi.k) this.f29869b;
                    if (webView == kVar.f45998o) {
                        kVar.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                return;
        }
    }

    @Override
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f29868a) {
            case 2:
                sslErrorHandler.cancel();
                pi.k kVar = (pi.k) this.f29869b;
                if (webView == kVar.f45998o) {
                    kVar.f();
                    return;
                }
                return;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
        }
    }

    @Override
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f29868a) {
            case 2:
                pi.k kVar = (pi.k) this.f29869b;
                if (webView == kVar.f45998o) {
                    kVar.f();
                    return true;
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f29868a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.iu0) this.f29869b).f31248x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new bf0(this, uri, webResourceRequest, 1));
                    return null;
                }
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    pi.k kVar = (pi.k) this.f29869b;
                    kVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !kVar.f45988c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(kVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f29868a) {
            case 0:
                if (((org.telegram.ui.iu0) this.f29869b).f31248x) {
                    of.f.s(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 1:
                return a(str) || super.shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f29868a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    pi.k kVar = (pi.k) this.f29869b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (kVar.f45991g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        kVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
