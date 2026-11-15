package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f49089a;
    public final KeyEvent.Callback f49090b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f49089a = i7;
        this.f49090b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f49089a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f49090b;
                g4 g4Var = q1Var.f50438y;
                if (g4Var.P != null) {
                    g4Var.Q.setVisibility(4);
                    g4 g4Var2 = q1Var.f50438y;
                    g4Var2.Q.removeView(g4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f50438y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f50438y.T.onCustomViewHidden();
                    }
                    q1Var.f50438y.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.bu buVar = (org.telegram.ui.Components.bu) this.f49090b;
                if (buVar.f33377o1 != null) {
                    buVar.f29682b.setVisibility(0);
                    buVar.f33378p1.setVisibility(4);
                    buVar.f33378p1.removeView(buVar.f33377o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = buVar.f33379q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        buVar.f33379q1.onCustomViewHidden();
                    }
                    buVar.f33377o1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f49089a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                return;
            default:
                onShowCustomView(view, customViewCallback);
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f49089a) {
            case 0:
                g4 g4Var = ((q1) this.f49090b).f50438y;
                if (g4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.P = view;
                g4Var.T = customViewCallback;
                org.telegram.messenger.g0.i3(new fq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.bu buVar = (org.telegram.ui.Components.bu) this.f49090b;
                if (buVar.f33377o1 == null && !buVar.M0()) {
                    buVar.L0();
                    buVar.f33377o1 = view;
                    buVar.f29682b.setVisibility(4);
                    buVar.f33378p1.setVisibility(0);
                    buVar.f33378p1.addView(view, c8.ja.c(-1.0f, -1));
                    buVar.f33379q1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
