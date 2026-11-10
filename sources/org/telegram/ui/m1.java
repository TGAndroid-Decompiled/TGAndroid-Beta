package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f47770a;
    public final KeyEvent.Callback f47771b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f47770a = i7;
        this.f47771b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f47770a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f47771b;
                g4 g4Var = q1Var.f48912y;
                if (g4Var.O != null) {
                    g4Var.P.setVisibility(4);
                    g4 g4Var2 = q1Var.f48912y;
                    g4Var2.P.removeView(g4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f48912y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f48912y.S.onCustomViewHidden();
                    }
                    q1Var.f48912y.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) this.f47771b;
                if (vtVar.n1 != null) {
                    vtVar.f28672b.setVisibility(0);
                    vtVar.f39735o1.setVisibility(4);
                    vtVar.f39735o1.removeView(vtVar.n1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = vtVar.f39736p1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        vtVar.f39736p1.onCustomViewHidden();
                    }
                    vtVar.n1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f47770a) {
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
        switch (this.f47770a) {
            case 0:
                g4 g4Var = ((q1) this.f47771b).f48912y;
                if (g4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.O = view;
                g4Var.S = customViewCallback;
                org.telegram.messenger.g0.i3(new jq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) this.f47771b;
                if (vtVar.n1 == null && !vtVar.M0()) {
                    vtVar.L0();
                    vtVar.n1 = view;
                    vtVar.f28672b.setVisibility(4);
                    vtVar.f39735o1.setVisibility(0);
                    vtVar.f39735o1.addView(view, c8.ha.c(-1.0f, -1));
                    vtVar.f39736p1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
