package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f49921a;
    public final KeyEvent.Callback f49922b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f49921a = i7;
        this.f49922b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f49921a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f49922b;
                g4 g4Var = q1Var.f51219y;
                if (g4Var.P != null) {
                    g4Var.Q.setVisibility(4);
                    g4 g4Var2 = q1Var.f51219y;
                    g4Var2.Q.removeView(g4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f51219y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f51219y.T.onCustomViewHidden();
                    }
                    q1Var.f51219y.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.f49922b;
                if (guVar.f35537o1 != null) {
                    guVar.f30226b.setVisibility(0);
                    guVar.f35538p1.setVisibility(4);
                    guVar.f35538p1.removeView(guVar.f35537o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = guVar.f35539q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        guVar.f35539q1.onCustomViewHidden();
                    }
                    guVar.f35537o1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f49921a) {
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
        switch (this.f49921a) {
            case 0:
                g4 g4Var = ((q1) this.f49922b).f51219y;
                if (g4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.P = view;
                g4Var.T = customViewCallback;
                org.telegram.messenger.g0.h3(new hq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.f49922b;
                if (guVar.f35537o1 == null && !guVar.N0()) {
                    guVar.M0();
                    guVar.f35537o1 = view;
                    guVar.f30226b.setVisibility(4);
                    guVar.f35538p1.setVisibility(0);
                    guVar.f35538p1.addView(view, c8.na.c(-1.0f, -1));
                    guVar.f35539q1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
