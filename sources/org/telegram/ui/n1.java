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
    public final int f49357a;
    public final Object f49358b;

    public n1(Object obj, int i7) {
        this.f49357a = i7;
        this.f49358b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((zc1) this.f49358b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(org.telegram.messenger.t0.f26600b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", org.telegram.messenger.t0.f26600b.getPackageName());
                    org.telegram.messenger.t0.f26600b.startActivity(intent);
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
        switch (this.f49357a) {
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
        int i7 = this.f49357a;
        Object obj = this.f49358b;
        switch (i7) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.bu buVar = (org.telegram.ui.Components.bu) obj;
                ImageView imageView = buVar.f33386x1;
                if (!buVar.f33387y1) {
                    buVar.f33381s1.setVisibility(4);
                    buVar.f33380r1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                bq0 bq0Var = (bq0) obj;
                View view = bq0Var.f32974r;
                if (!bq0Var.f32978y) {
                    bq0Var.f32973n.setVisibility(4);
                    bq0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                super.onPageFinished(webView, str);
                zc1 zc1Var = (zc1) obj;
                org.telegram.ui.Components.hq hqVar = zc1Var.f53938c;
                if (hqVar != null && hqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    zc1Var.f53937b.getContentView().setVisibility(0);
                    zc1Var.f53937b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zc1Var.f53938c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(zc1Var.f53938c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(zc1Var.f53938c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(zc1Var.f53937b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(zc1Var.f53937b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(zc1Var.f53937b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new g71(this, 13));
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
        switch (this.f49357a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    xi.i iVar = (xi.i) this.f49358b;
                    if (webView == iVar.f60078o) {
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
        switch (this.f49357a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    xi.i iVar = (xi.i) this.f49358b;
                    if (webView == iVar.f60078o) {
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
        switch (this.f49357a) {
            case 4:
                sslErrorHandler.cancel();
                xi.i iVar = (xi.i) this.f49358b;
                if (webView == iVar.f60078o) {
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
        int i7 = this.f49357a;
        Object obj = this.f49358b;
        switch (i7) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((q1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = org.telegram.messenger.hd.M0(2131752104, null);
                        t1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new fq0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.bu buVar = (org.telegram.ui.Components.bu) obj;
                try {
                    if (org.telegram.messenger.g0.M1(buVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, buVar.getContext(), buVar.J0);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                        t1Var2.S = org.telegram.messenger.hd.M0(2131752104, null);
                        t1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new org.telegram.ui.Components.fo(this, 11));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
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
                xi.i iVar = (xi.i) obj;
                if (webView == iVar.f60078o) {
                    iVar.h();
                }
                return true;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f49357a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((bq0) this.f49358b).f32978y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.f22420j.c(new org.telegram.ui.Components.yf(this, uri, webResourceRequest, 17));
                    return null;
                }
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    xi.i iVar = (xi.i) this.f49358b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.f60068c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f49357a) {
            case 0:
                q1 q1Var = (q1) this.f49358b;
                if (q1Var.f50435s) {
                    vf.c.t(q1Var.f50438y.M, str);
                    return true;
                }
                return false;
            case 1:
                if (((org.telegram.ui.Components.bu) this.f49358b).f33387y1) {
                    vf.c.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((bq0) this.f49358b).f32978y) {
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
        switch (this.f49357a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    xi.i iVar = (xi.i) this.f49358b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.f60071g.equals(url.toString())) {
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
