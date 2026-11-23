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
    public final int f50064a;
    public final Object f50065b;

    public n1(Object obj, int i7) {
        this.f50064a = i7;
        this.f50065b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((cd1) this.f50065b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(org.telegram.messenger.t0.f26931b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", org.telegram.messenger.t0.f26931b.getPackageName());
                    org.telegram.messenger.t0.f26931b.startActivity(intent);
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
        switch (this.f50064a) {
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
        int i7 = this.f50064a;
        Object obj = this.f50065b;
        switch (i7) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) obj;
                ImageView imageView = iuVar.f36322x1;
                if (!iuVar.f36323y1) {
                    iuVar.f36317s1.setVisibility(4);
                    iuVar.f36316r1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                super.onPageFinished(webView, str);
                dq0 dq0Var = (dq0) obj;
                View view = dq0Var.f37174r;
                if (!dq0Var.f37178y) {
                    dq0Var.f37173n.setVisibility(4);
                    dq0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                super.onPageFinished(webView, str);
                cd1 cd1Var = (cd1) obj;
                org.telegram.ui.Components.qq qqVar = cd1Var.f46522c;
                if (qqVar != null && qqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    cd1Var.f46521b.getContentView().setVisibility(0);
                    cd1Var.f46521b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(cd1Var.f46522c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(cd1Var.f46522c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(cd1Var.f46522c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(cd1Var.f46521b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(cd1Var.f46521b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(cd1Var.f46521b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new k71(this, 13));
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
        switch (this.f50064a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    xi.i iVar = (xi.i) this.f50065b;
                    if (webView == iVar.f60689o) {
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
        switch (this.f50064a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    xi.i iVar = (xi.i) this.f50065b;
                    if (webView == iVar.f60689o) {
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
        switch (this.f50064a) {
            case 4:
                sslErrorHandler.cancel();
                xi.i iVar = (xi.i) this.f50065b;
                if (webView == iVar.f60689o) {
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
        int i7 = this.f50064a;
        Object obj = this.f50065b;
        switch (i7) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((q1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = org.telegram.messenger.hd.N0(2131752092, null);
                        t1Var.U = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752093, null), new hq0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) obj;
                try {
                    if (org.telegram.messenger.g0.M1(iuVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, iuVar.getContext(), iuVar.J0);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                        t1Var2.S = org.telegram.messenger.hd.N0(2131752092, null);
                        t1Var2.U = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752093, null), new org.telegram.ui.Components.oo(this, 11));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
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
                if (webView == iVar.f60689o) {
                    iVar.h();
                }
                return true;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f50064a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (((dq0) this.f50065b).f37178y && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.f22814j.c(new org.telegram.ui.Components.g(this, uri, webResourceRequest, 21));
                    return null;
                }
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    xi.i iVar = (xi.i) this.f50065b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.f60679c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f50064a) {
            case 0:
                q1 q1Var = (q1) this.f50065b;
                if (q1Var.f51030s) {
                    vf.c.t(q1Var.f51033y.M, str);
                    return true;
                }
                return false;
            case 1:
                if (((org.telegram.ui.Components.iu) this.f50065b).f36323y1) {
                    vf.c.t(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (((dq0) this.f50065b).f37178y) {
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
        switch (this.f50064a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    xi.i iVar = (xi.i) this.f50065b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.f60682g.equals(url.toString())) {
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
