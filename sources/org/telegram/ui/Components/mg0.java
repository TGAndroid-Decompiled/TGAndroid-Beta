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
import org.telegram.ui.yj1;
public final class mg0 extends WebViewClient {
    public final int f27392a;
    public final Object f27393b;

    public mg0(Object obj, int i10) {
        this.f27392a = i10;
        this.f27393b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((yj1) this.f27393b).getClass();
        ((yj1) this.f27393b).finishFragment(false);
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
        switch (this.f27392a) {
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
        int i10 = this.f27392a;
        Object obj = this.f27393b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.pu0 pu0Var = (org.telegram.ui.pu0) obj;
                View view = pu0Var.f28596r;
                if (!pu0Var.f28599x) {
                    pu0Var.f28595n.setVisibility(4);
                    pu0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                yj1 yj1Var = (yj1) obj;
                gr grVar = yj1Var.f42181c;
                if (grVar != null && grVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    yj1Var.f42180b.getContentView().setVisibility(0);
                    yj1Var.f42180b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(yj1Var.f42181c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(yj1Var.f42181c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(yj1Var.f42181c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(yj1Var.f42180b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(yj1Var.f42180b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(yj1Var.f42180b.getContentView(), "alpha", 0.0f, 1.0f));
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
        switch (this.f27392a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.i iVar = (qi.i) this.f27393b;
                    if (webView == iVar.f43683o) {
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
        switch (this.f27392a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.i iVar = (qi.i) this.f27393b;
                    if (webView == iVar.f43683o) {
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
        switch (this.f27392a) {
            case 2:
                sslErrorHandler.cancel();
                qi.i iVar = (qi.i) this.f27393b;
                if (webView == iVar.f43683o) {
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
        switch (this.f27392a) {
            case 2:
                qi.i iVar = (qi.i) this.f27393b;
                if (webView == iVar.f43683o) {
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
        switch (this.f27392a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.pu0) this.f27393b).f28599x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new v70(this, uri, webResourceRequest, 4));
                    return null;
                }
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    qi.i iVar = (qi.i) this.f27393b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.f43674c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f27392a) {
            case 0:
                if (((org.telegram.ui.pu0) this.f27393b).f28599x) {
                    pf.d.s(webView.getContext(), str);
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
        switch (this.f27392a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    qi.i iVar = (qi.i) this.f27393b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.f43676g.equals(url.toString())) {
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
