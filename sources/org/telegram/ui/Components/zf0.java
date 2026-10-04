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
import org.telegram.ui.hj1;
public final class zf0 extends WebViewClient {
    public final int f33489a;
    public final Object f33490b;

    public zf0(Object obj, int i10) {
        this.f33489a = i10;
        this.f33490b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((hj1) this.f33490b).getClass();
        ((hj1) this.f33490b).finishFragment(false);
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
        switch (this.f33489a) {
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
        int i10 = this.f33489a;
        Object obj = this.f33490b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) obj;
                View view = du0Var.f25721r;
                if (!du0Var.f25724x) {
                    du0Var.f25720n.setVisibility(4);
                    du0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                hj1 hj1Var = (hj1) obj;
                wq wqVar = hj1Var.f37106c;
                if (wqVar != null && wqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    hj1Var.f37105b.getContentView().setVisibility(0);
                    hj1Var.f37105b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hj1Var.f37106c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(hj1Var.f37106c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(hj1Var.f37106c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(hj1Var.f37105b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(hj1Var.f37105b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(hj1Var.f37105b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.ap0(this, 28));
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
        switch (this.f33489a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.j jVar = (qi.j) this.f33490b;
                    if (webView == jVar.f45550o) {
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
        switch (this.f33489a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.j jVar = (qi.j) this.f33490b;
                    if (webView == jVar.f45550o) {
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
        switch (this.f33489a) {
            case 2:
                sslErrorHandler.cancel();
                qi.j jVar = (qi.j) this.f33490b;
                if (webView == jVar.f45550o) {
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
        switch (this.f33489a) {
            case 2:
                qi.j jVar = (qi.j) this.f33490b;
                if (webView == jVar.f45550o) {
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
        switch (this.f33489a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.du0) this.f33490b).f25724x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new org.telegram.messenger.video.o(this, uri, webResourceRequest, 28));
                    return null;
                }
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    qi.j jVar = (qi.j) this.f33490b;
                    jVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !jVar.f45540c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(jVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f33489a) {
            case 0:
                if (((org.telegram.ui.du0) this.f33490b).f25724x) {
                    nf.f.s(webView.getContext(), str);
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
        switch (this.f33489a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.j jVar = (qi.j) this.f33490b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (jVar.f45543g.equals(url.toString())) {
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
