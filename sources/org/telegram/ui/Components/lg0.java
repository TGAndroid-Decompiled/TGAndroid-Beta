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
import org.telegram.ui.ki1;
import org.telegram.ui.ve1;
public final class lg0 extends WebViewClient {
    public final int f28360a;
    public final Object f28361b;

    public lg0(Object obj, int i10) {
        this.f28360a = i10;
        this.f28361b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((ki1) this.f28361b).getClass();
        ((ki1) this.f28361b).finishFragment(false);
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
        switch (this.f28360a) {
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
        int i10 = this.f28360a;
        Object obj = this.f28361b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.rt0 rt0Var = (org.telegram.ui.rt0) obj;
                View view = rt0Var.f29555r;
                if (!rt0Var.f29558x) {
                    rt0Var.f29554n.setVisibility(4);
                    rt0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                ki1 ki1Var = (ki1) obj;
                cr crVar = ki1Var.f38958c;
                if (crVar != null && crVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ki1Var.f38957b.getContentView().setVisibility(0);
                    ki1Var.f38957b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ki1Var.f38958c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ki1Var.f38958c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ki1Var.f38958c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ki1Var.f38957b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ki1Var.f38957b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ki1Var.f38957b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new ve1(this, 11));
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
        switch (this.f28360a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.i iVar = (qi.i) this.f28361b;
                    if (webView == iVar.f45197o) {
                        iVar.f();
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
        switch (this.f28360a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.i iVar = (qi.i) this.f28361b;
                    if (webView == iVar.f45197o) {
                        iVar.f();
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
        switch (this.f28360a) {
            case 2:
                sslErrorHandler.cancel();
                qi.i iVar = (qi.i) this.f28361b;
                if (webView == iVar.f45197o) {
                    iVar.f();
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
        switch (this.f28360a) {
            case 2:
                qi.i iVar = (qi.i) this.f28361b;
                if (webView == iVar.f45197o) {
                    iVar.f();
                    return true;
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f28360a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.rt0) this.f28361b).f29558x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new lg(this, uri, webResourceRequest, 16));
                    return null;
                }
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    qi.i iVar = (qi.i) this.f28361b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.f45188c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f28360a) {
            case 0:
                if (((org.telegram.ui.rt0) this.f28361b).f29558x) {
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
        switch (this.f28360a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.i iVar = (qi.i) this.f28361b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.f45190g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        iVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
