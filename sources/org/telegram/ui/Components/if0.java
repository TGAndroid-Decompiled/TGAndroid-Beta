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
import org.telegram.ui.cc1;
import org.telegram.ui.ji1;
public final class if0 extends WebViewClient {
    public final int f29384a;
    public final Object f29385b;

    public if0(Object obj, int i10) {
        this.f29384a = i10;
        this.f29385b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((ji1) this.f29385b).getClass();
        ((ji1) this.f29385b).finishFragment(false);
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
        switch (this.f29384a) {
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
        int i10 = this.f29384a;
        Object obj = this.f29385b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.et0 et0Var = (org.telegram.ui.et0) obj;
                View view = et0Var.f30677r;
                if (!et0Var.f30680x) {
                    et0Var.f30676n.setVisibility(4);
                    et0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                ji1 ji1Var = (ji1) obj;
                nq nqVar = ji1Var.f39563c;
                if (nqVar != null && nqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ji1Var.f39562b.getContentView().setVisibility(0);
                    ji1Var.f39562b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ji1Var.f39563c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ji1Var.f39563c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ji1Var.f39563c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ji1Var.f39562b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ji1Var.f39562b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ji1Var.f39562b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new cc1(this, 5));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    return;
                }
                return;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f29384a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.et0) this.f29385b).f30680x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new g(this, uri, webResourceRequest, 19));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f29384a) {
            case 0:
                if (((org.telegram.ui.et0) this.f29385b).f30680x) {
                    ye.d.s(webView.getContext(), str);
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
