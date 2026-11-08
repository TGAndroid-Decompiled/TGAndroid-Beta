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
public final class n1 extends WebViewClient {
    public final int f47934a;
    public final Object f47935b;

    public n1(Object obj, int i7) {
        this.f47934a = i7;
        this.f47935b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((zc1) this.f47935b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(org.telegram.messenger.t0.f25566b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", org.telegram.messenger.t0.f25566b.getPackageName());
                    org.telegram.messenger.t0.f25566b.startActivity(intent);
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
        switch (this.f47934a) {
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
        int i7 = this.f47934a;
        Object obj = this.f47935b;
        switch (i7) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) obj;
                ImageView imageView = wtVar.f40050t1;
                if (!wtVar.f40051u1) {
                    wtVar.f40045o1.setVisibility(4);
                    wtVar.n1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                cq0 cq0Var = (cq0) obj;
                View view = cq0Var.f31798r;
                if (!cq0Var.f31802y) {
                    cq0Var.f31797n.setVisibility(4);
                    cq0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                super.onPageFinished(webView, str);
                zc1 zc1Var = (zc1) obj;
                org.telegram.ui.Components.zp zpVar = zc1Var.f52525c;
                if (zpVar != null && zpVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    zc1Var.f52524b.getContentView().setVisibility(0);
                    zc1Var.f52524b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zc1Var.f52525c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(zc1Var.f52525c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(zc1Var.f52525c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(zc1Var.f52524b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(zc1Var.f52524b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(zc1Var.f52524b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new s81(this, 12));
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
        switch (this.f47934a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.i iVar = (ui.i) this.f47935b;
                    if (webView == iVar.f56954o) {
                        iVar.h();
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
        switch (this.f47934a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.i iVar = (ui.i) this.f47935b;
                    if (webView == iVar.f56954o) {
                        iVar.h();
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
        switch (this.f47934a) {
            case 4:
                sslErrorHandler.cancel();
                ui.i iVar = (ui.i) this.f47935b;
                if (webView == iVar.f56954o) {
                    iVar.h();
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
        int i7 = this.f47934a;
        Object obj = this.f47935b;
        switch (i7) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((q1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = org.telegram.messenger.id.M0(2131752104, null);
                        u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new gq0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) obj;
                try {
                    if (org.telegram.messenger.g0.M1(wtVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.I0);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                        u1Var2.R = org.telegram.messenger.id.M0(2131752104, null);
                        u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752105, null), new org.telegram.ui.Components.gp(this, 9));
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
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
                ui.i iVar = (ui.i) obj;
                if (webView == iVar.f56954o) {
                    iVar.h();
                }
                return true;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f47934a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((cq0) this.f47935b).f31802y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.f21340j.c(new org.telegram.ui.Components.ng(this, uri, webResourceRequest, 15));
                    return null;
                }
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    ui.i iVar = (ui.i) this.f47935b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.f56944c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f47934a) {
            case 0:
                q1 q1Var = (q1) this.f47935b;
                if (q1Var.f49008s) {
                    vf.c.t(q1Var.f49011y.L, str);
                    return true;
                }
                return false;
            case 1:
                if (((org.telegram.ui.Components.wt) this.f47935b).f40051u1) {
                    vf.c.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((cq0) this.f47935b).f31802y) {
                    vf.c.t(webView.getContext(), str);
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
        switch (this.f47934a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.i iVar = (ui.i) this.f47935b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.f56947g.equals(url.toString())) {
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
