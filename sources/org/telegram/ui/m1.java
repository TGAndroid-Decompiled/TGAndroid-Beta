package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f49727a;
    public final KeyEvent.Callback f49728b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f49727a = i7;
        this.f49728b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f49727a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f49728b;
                g4 g4Var = q1Var.f51061y;
                if (g4Var.P != null) {
                    g4Var.Q.setVisibility(4);
                    g4 g4Var2 = q1Var.f51061y;
                    g4Var2.Q.removeView(g4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f51061y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f51061y.T.onCustomViewHidden();
                    }
                    q1Var.f51061y.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.f49728b;
                if (guVar.f35646o1 != null) {
                    guVar.f30192b.setVisibility(0);
                    guVar.f35647p1.setVisibility(4);
                    guVar.f35647p1.removeView(guVar.f35646o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = guVar.f35648q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        guVar.f35648q1.onCustomViewHidden();
                    }
                    guVar.f35646o1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f49727a) {
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
        switch (this.f49727a) {
            case 0:
                g4 g4Var = ((q1) this.f49728b).f51061y;
                if (g4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.P = view;
                g4Var.T = customViewCallback;
                org.telegram.messenger.g0.h3(new hq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.f49728b;
                if (guVar.f35646o1 == null && !guVar.N0()) {
                    guVar.M0();
                    guVar.f35646o1 = view;
                    guVar.f30192b.setVisibility(4);
                    guVar.f35647p1.setVisibility(0);
                    guVar.f35647p1.addView(view, c8.ma.c(-1.0f, -1));
                    guVar.f35648q1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
