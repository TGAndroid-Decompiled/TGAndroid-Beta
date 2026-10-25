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
import org.telegram.ui.ni1;
public final class ig0 extends WebViewClient {
    public final int f29287a;
    public final Object f29288b;

    public ig0(Object obj, int i10) {
        this.f29287a = i10;
        this.f29288b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((ni1) this.f29288b).getClass();
        ((ni1) this.f29288b).finishFragment(false);
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
        switch (this.f29287a) {
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
        int i10 = this.f29287a;
        Object obj = this.f29288b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.vt0 vt0Var = (org.telegram.ui.vt0) obj;
                View view = vt0Var.f30577r;
                if (!vt0Var.f30580x) {
                    vt0Var.f30576n.setVisibility(4);
                    vt0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                super.onPageFinished(webView, str);
                ni1 ni1Var = (ni1) obj;
                er erVar = ni1Var.f41937c;
                if (erVar != null && erVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ni1Var.f41936b.getContentView().setVisibility(0);
                    ni1Var.f41936b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ni1Var.f41937c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ni1Var.f41937c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ni1Var.f41937c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ni1Var.f41936b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ni1Var.f41936b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ni1Var.f41936b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.fc1(this, 13));
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
        switch (this.f29287a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    ti.j jVar = (ti.j) this.f29288b;
                    if (webView == jVar.f49203o) {
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
        switch (this.f29287a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    ti.j jVar = (ti.j) this.f29288b;
                    if (webView == jVar.f49203o) {
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
        switch (this.f29287a) {
            case 2:
                sslErrorHandler.cancel();
                ti.j jVar = (ti.j) this.f29288b;
                if (webView == jVar.f49203o) {
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
        switch (this.f29287a) {
            case 2:
                ti.j jVar = (ti.j) this.f29288b;
                if (webView == jVar.f49203o) {
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
        switch (this.f29287a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.vt0) this.f29288b).f30580x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new kg(this, uri, webResourceRequest, 17));
                    return null;
                }
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    ti.j jVar = (ti.j) this.f29288b;
                    jVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !jVar.f49194c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(jVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f29287a) {
            case 0:
                if (((org.telegram.ui.vt0) this.f29288b).f30580x) {
                    qf.d.r(webView.getContext(), str);
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
        switch (this.f29287a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    ti.j jVar = (ti.j) this.f29288b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (jVar.f49196g.equals(url.toString())) {
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
