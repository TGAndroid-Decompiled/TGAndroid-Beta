package org.telegram.ui;

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
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o1 extends WebViewClient {
    public final int f48166a;
    public final Object f48167b;

    public o1(Object obj, int i3) {
        this.f48166a = i3;
        this.f48167b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((uc1) this.f48167b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(org.telegram.messenger.t0.f25457b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", org.telegram.messenger.t0.f25457b.getPackageName());
                    org.telegram.messenger.t0.f25457b.startActivity(intent);
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f48166a) {
            case 3:
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
        int i3 = this.f48166a;
        Object obj = this.f48167b;
        switch (i3) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) obj;
                ImageView imageView = utVar.f38871u1;
                if (!utVar.f38872v1) {
                    utVar.f38866p1.setVisibility(4);
                    utVar.f38865o1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                tp0 tp0Var = (tp0) obj;
                View view = tp0Var.f38725r;
                if (!tp0Var.f38729y) {
                    tp0Var.f38724n.setVisibility(4);
                    tp0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                super.onPageFinished(webView, str);
                uc1 uc1Var = (uc1) obj;
                org.telegram.ui.Components.aq aqVar = uc1Var.f50045c;
                if (aqVar != null && aqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    uc1Var.f50044b.getContentView().setVisibility(0);
                    uc1Var.f50044b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(uc1Var.f50045c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(uc1Var.f50045c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(uc1Var.f50045c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(uc1Var.f50044b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(uc1Var.f50044b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(uc1Var.f50044b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new i81(this, 12));
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
        switch (this.f48166a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.j jVar = (ui.j) this.f48167b;
                    if (webView == jVar.f56413o) {
                        jVar.h();
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
        switch (this.f48166a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.j jVar = (ui.j) this.f48167b;
                    if (webView == jVar.f56413o) {
                        jVar.h();
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
        switch (this.f48166a) {
            case 4:
                sslErrorHandler.cancel();
                ui.j jVar = (ui.j) this.f48167b;
                if (webView == jVar.f56413o) {
                    jVar.h();
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
        int i3 = this.f48166a;
        Object obj = this.f48167b;
        switch (i3) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((r1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = org.telegram.messenger.bd.M0(2131752104, null);
                        s1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new xp0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) obj;
                try {
                    if (org.telegram.messenger.g0.M1(utVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, utVar.getContext(), utVar.J0);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                        s1Var2.S = org.telegram.messenger.bd.M0(2131752104, null);
                        s1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new org.telegram.ui.Components.gp(this, 9));
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder2.p();
                    }
                    return true;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return false;
                }
            case 2:
            case 3:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 4:
                ui.j jVar = (ui.j) obj;
                if (webView == jVar.f56413o) {
                    jVar.h();
                }
                return true;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f48166a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((tp0) this.f48167b).f38729y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.f21391j.c(new org.telegram.ui.Components.e7(this, uri, webResourceRequest, 19));
                    return null;
                }
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    ui.j jVar = (ui.j) this.f48167b;
                    jVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !jVar.f56403c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(jVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f48166a) {
            case 0:
                r1 r1Var = (r1) this.f48167b;
                if (r1Var.f48996s) {
                    sf.c.t(r1Var.f48999y.M, str);
                    return true;
                }
                return false;
            case 1:
                if (((org.telegram.ui.Components.ut) this.f48167b).f38872v1) {
                    sf.c.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((tp0) this.f48167b).f38729y) {
                    sf.c.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 3:
                return a(str) || super.shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f48166a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.j jVar = (ui.j) this.f48167b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (jVar.f56406g.equals(url.toString())) {
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
