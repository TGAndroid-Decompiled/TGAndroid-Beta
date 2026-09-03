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
import org.telegram.ui.ej1;
public final class tf0 extends WebViewClient {
    public final int f31349a;
    public final Object f31350b;

    public tf0(Object obj, int i10) {
        this.f31349a = i10;
        this.f31350b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((ej1) this.f31350b).getClass();
        ((ej1) this.f31350b).finishFragment(false);
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
        switch (this.f31349a) {
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
        int i10 = this.f31349a;
        Object obj = this.f31350b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) obj;
                View view = ut0Var.f33059r;
                if (!ut0Var.f33062x) {
                    ut0Var.f33058n.setVisibility(4);
                    ut0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                ej1 ej1Var = (ej1) obj;
                tq tqVar = ej1Var.f36514c;
                if (tqVar != null && tqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ej1Var.f36513b.getContentView().setVisibility(0);
                    ej1Var.f36513b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ej1Var.f36514c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ej1Var.f36514c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ej1Var.f36514c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ej1Var.f36513b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ej1Var.f36513b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ej1Var.f36513b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.ss0(this, 26));
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
        switch (this.f31349a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.k kVar = (sf.k) this.f31350b;
                    if (webView == kVar.f47374m) {
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
        switch (this.f31349a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.k kVar = (sf.k) this.f31350b;
                    if (webView == kVar.f47374m) {
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
        switch (this.f31349a) {
            case 2:
                sslErrorHandler.cancel();
                sf.k kVar = (sf.k) this.f31350b;
                if (webView == kVar.f47374m) {
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
        switch (this.f31349a) {
            case 2:
                sf.k kVar = (sf.k) this.f31350b;
                if (webView == kVar.f47374m) {
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
        switch (this.f31349a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.ut0) this.f31350b).f33062x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
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
        switch (this.f31349a) {
            case 0:
                if (((org.telegram.ui.ut0) this.f31350b).f33062x) {
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
        switch (this.f31349a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.k kVar = (sf.k) this.f31350b;
                    Uri url = webResourceRequest.getUrl();
                    kVar.getClass();
                    if (url == null || !"https".equals(url.getScheme()) || !kVar.f47365b.equals(url.getHost()) || url.getPort() != -1 || !"/".equals(url.getPath()) || url.getQueryParameterNames().size() != 1 || !url.getQueryParameterNames().contains("bridge")) {
                        return true;
                    }
                }
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
