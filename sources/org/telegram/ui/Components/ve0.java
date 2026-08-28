package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ii1;
import org.telegram.ui.te1;
public final class ve0 extends WebViewClient {
    public final int f33355a;
    public final Object f33356b;

    public ve0(Object obj, int i9) {
        this.f33355a = i9;
        this.f33356b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((ii1) this.f33356b).getClass();
        ((ii1) this.f33356b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return true;
        }
    }

    @Override
    public void onLoadResource(WebView webView, String str) {
        switch (this.f33355a) {
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
    public final void onPageFinished(WebView webView, String str) {
        int i9 = this.f33355a;
        Object obj = this.f33356b;
        switch (i9) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) obj;
                View view = gt0Var.f35292r;
                if (!gt0Var.f35295x) {
                    gt0Var.f35291n.setVisibility(4);
                    gt0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                ii1 ii1Var = (ii1) obj;
                jq jqVar = ii1Var.f39169c;
                if (jqVar != null && jqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ii1Var.f39168b.getContentView().setVisibility(0);
                    ii1Var.f39168b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ii1Var.f39169c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ii1Var.f39169c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ii1Var.f39169c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ii1Var.f39168b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ii1Var.f39168b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ii1Var.f39168b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new te1(this, 3));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    return;
                }
                return;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f33355a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.gt0) this.f33356b).f35295x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new ue0(this, uri, webResourceRequest, 0));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f33355a) {
            case 0:
                if (((org.telegram.ui.gt0) this.f33356b).f35295x) {
                    ve.e.s(webView.getContext(), str);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            default:
                if (!a(str) && !super.shouldOverrideUrlLoading(webView, str)) {
                    return false;
                }
                return true;
        }
    }
}
