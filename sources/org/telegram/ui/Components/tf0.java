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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yi1;
public final class tf0 extends WebViewClient {
    public final int f31334a;
    public final Object f31335b;

    public tf0(Object obj, int i10) {
        this.f31334a = i10;
        this.f31335b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((yi1) this.f31335b).getClass();
        ((yi1) this.f31335b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return true;
        }
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f31334a) {
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
        int i10 = this.f31334a;
        Object obj = this.f31335b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.pt0 pt0Var = (org.telegram.ui.pt0) obj;
                View view = pt0Var.f33065r;
                if (!pt0Var.f33068x) {
                    pt0Var.f33064n.setVisibility(4);
                    pt0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                yi1 yi1Var = (yi1) obj;
                tq tqVar = yi1Var.f43642c;
                if (tqVar != null && tqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    yi1Var.f43641b.getContentView().setVisibility(0);
                    yi1Var.f43641b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(yi1Var.f43642c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(yi1Var.f43642c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(yi1Var.f43642c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(yi1Var.f43641b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(yi1Var.f43641b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(yi1Var.f43641b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.ns0(this, 26));
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
        switch (this.f31334a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.j jVar = (sf.j) this.f31335b;
                    if (webView == jVar.f47338m) {
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
        switch (this.f31334a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.j jVar = (sf.j) this.f31335b;
                    if (webView == jVar.f47338m) {
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
        switch (this.f31334a) {
            case 2:
                sslErrorHandler.cancel();
                sf.j jVar = (sf.j) this.f31335b;
                if (webView == jVar.f47338m) {
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
        switch (this.f31334a) {
            case 2:
                sf.j jVar = (sf.j) this.f31335b;
                if (webView == jVar.f47338m) {
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
        switch (this.f31334a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.pt0) this.f31335b).f33068x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new jp(this, uri, webResourceRequest, 12));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f31334a) {
            case 0:
                if (((org.telegram.ui.pt0) this.f31335b).f33068x) {
                    af.g.s(webView.getContext(), str);
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
        switch (this.f31334a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.j jVar = (sf.j) this.f31335b;
                    Uri url = webResourceRequest.getUrl();
                    jVar.getClass();
                    if (url == null || !"https".equals(url.getScheme()) || !jVar.f47329b.equals(url.getHost()) || url.getPort() != -1 || !"/".equals(url.getPath()) || url.getQueryParameterNames().size() != 1 || !url.getQueryParameterNames().contains("bridge")) {
                        return true;
                    }
                }
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
