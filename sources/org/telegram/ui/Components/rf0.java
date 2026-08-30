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
import org.telegram.ui.vi1;
public final class rf0 extends WebViewClient {
    public final int f28460a;
    public final Object f28461b;

    public rf0(Object obj, int i10) {
        this.f28460a = i10;
        this.f28461b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((vi1) this.f28461b).getClass();
        ((vi1) this.f28461b).finishFragment(false);
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
        switch (this.f28460a) {
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
        int i10 = this.f28460a;
        Object obj = this.f28461b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) obj;
                View view = nt0Var.f29453r;
                if (!nt0Var.f29456x) {
                    nt0Var.f29452n.setVisibility(4);
                    nt0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                vi1 vi1Var = (vi1) obj;
                rq rqVar = vi1Var.f39190c;
                if (rqVar != null && rqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    vi1Var.f39189b.getContentView().setVisibility(0);
                    vi1Var.f39189b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(vi1Var.f39190c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(vi1Var.f39190c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(vi1Var.f39190c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(vi1Var.f39189b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(vi1Var.f39189b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(vi1Var.f39189b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.ls0(this, 26));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    return;
                }
                return;
        }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f28460a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (((org.telegram.ui.nt0) this.f28461b).f29456x && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    Utilities.externalNetworkQueue.postRunnable(new hp(this, uri, webResourceRequest, 12));
                    return null;
                }
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f28460a) {
            case 0:
                if (((org.telegram.ui.nt0) this.f28461b).f29456x) {
                    af.g.s(webView.getContext(), str);
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
