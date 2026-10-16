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
import org.telegram.ui.fi1;
import org.telegram.ui.xj1;
public final class ng0 extends WebViewClient {
    public final int f27354a;
    public final Object f27355b;

    public ng0(Object obj, int i10) {
        this.f27354a = i10;
        this.f27355b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((xj1) this.f27355b).getClass();
        ((xj1) this.f27355b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f27354a) {
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
        int i10 = this.f27354a;
        Object obj = this.f27355b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.ou0 ou0Var = (org.telegram.ui.ou0) obj;
                View view = ou0Var.f28528r;
                if (!ou0Var.f28531x) {
                    ou0Var.f28527n.setVisibility(4);
                    ou0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                xj1 xj1Var = (xj1) obj;
                gr grVar = xj1Var.f41585c;
                if (grVar != null && grVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    xj1Var.f41584b.getContentView().setVisibility(0);
                    xj1Var.f41584b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xj1Var.f41585c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(xj1Var.f41585c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(xj1Var.f41585c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(xj1Var.f41584b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(xj1Var.f41584b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(xj1Var.f41584b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new fi1(this, 8));
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
        switch (this.f27354a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    pi.j jVar = (pi.j) this.f27355b;
                    if (webView == jVar.f42968o) {
                        jVar.f();
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
        switch (this.f27354a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    pi.j jVar = (pi.j) this.f27355b;
                    if (webView == jVar.f42968o) {
                        jVar.f();
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
        switch (this.f27354a) {
            case 2:
                sslErrorHandler.cancel();
                pi.j jVar = (pi.j) this.f27355b;
                if (webView == jVar.f42968o) {
                    jVar.f();
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
        switch (this.f27354a) {
            case 2:
                pi.j jVar = (pi.j) this.f27355b;
                if (webView == jVar.f42968o) {
                    jVar.f();
                    return true;
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f27354a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.ou0) this.f27355b).f28531x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new ze0(this, uri, webResourceRequest, 1));
                    return null;
                }
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    pi.j jVar = (pi.j) this.f27355b;
                    jVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !jVar.f42959c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(jVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f27354a) {
            case 0:
                if (((org.telegram.ui.ou0) this.f27355b).f28531x) {
                    pf.d.r(webView.getContext(), str);
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
        switch (this.f27354a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    pi.j jVar = (pi.j) this.f27355b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (jVar.f42961g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        jVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
