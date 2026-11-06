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
    public final int f47935a;
    public final Object f47936b;

    public n1(Object obj, int i7) {
        this.f47935a = i7;
        this.f47936b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((yc1) this.f47936b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(org.telegram.messenger.t0.f25555b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", org.telegram.messenger.t0.f25555b.getPackageName());
                    org.telegram.messenger.t0.f25555b.startActivity(intent);
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
        switch (this.f47935a) {
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
        int i7 = this.f47935a;
        Object obj = this.f47936b;
        switch (i7) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) obj;
                ImageView imageView = vtVar.f39673t1;
                if (!vtVar.f39674u1) {
                    vtVar.f39668o1.setVisibility(4);
                    vtVar.n1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                cq0 cq0Var = (cq0) obj;
                View view = cq0Var.f31793r;
                if (!cq0Var.f31797y) {
                    cq0Var.f31792n.setVisibility(4);
                    cq0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                super.onPageFinished(webView, str);
                yc1 yc1Var = (yc1) obj;
                org.telegram.ui.Components.zp zpVar = yc1Var.f52215c;
                if (zpVar != null && zpVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    yc1Var.f52214b.getContentView().setVisibility(0);
                    yc1Var.f52214b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(yc1Var.f52215c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(yc1Var.f52215c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(yc1Var.f52215c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(yc1Var.f52214b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(yc1Var.f52214b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(yc1Var.f52214b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new r81(this, 12));
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
        switch (this.f47935a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.i iVar = (ui.i) this.f47936b;
                    if (webView == iVar.f56862o) {
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
        switch (this.f47935a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.i iVar = (ui.i) this.f47936b;
                    if (webView == iVar.f56862o) {
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
        switch (this.f47935a) {
            case 4:
                sslErrorHandler.cancel();
                ui.i iVar = (ui.i) this.f47936b;
                if (webView == iVar.f56862o) {
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
        int i7 = this.f47935a;
        Object obj = this.f47936b;
        switch (i7) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((q1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = org.telegram.messenger.hd.M0(2131752104, null);
                        u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new gq0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) obj;
                try {
                    if (org.telegram.messenger.g0.M1(vtVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vtVar.getContext(), vtVar.I0);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                        u1Var2.R = org.telegram.messenger.hd.M0(2131752104, null);
                        u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new org.telegram.ui.Components.gp(this, 9));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), null);
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
                if (webView == iVar.f56862o) {
                    iVar.h();
                }
                return true;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f47935a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((cq0) this.f47936b).f31797y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.f21337j.c(new org.telegram.ui.Components.ng(this, uri, webResourceRequest, 15));
                    return null;
                }
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    ui.i iVar = (ui.i) this.f47936b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.f56852c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f47935a) {
            case 0:
                q1 q1Var = (q1) this.f47936b;
                if (q1Var.f49006s) {
                    vf.c.t(q1Var.f49009y.L, str);
                    return true;
                }
                return false;
            case 1:
                if (((org.telegram.ui.Components.vt) this.f47936b).f39674u1) {
                    vf.c.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((cq0) this.f47936b).f31797y) {
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
        switch (this.f47935a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.i iVar = (ui.i) this.f47936b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.f56855g.equals(url.toString())) {
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
