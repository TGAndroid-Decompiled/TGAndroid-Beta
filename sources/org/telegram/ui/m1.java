package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f47719a;
    public final KeyEvent.Callback f47720b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f47719a = i7;
        this.f47720b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f47719a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f47720b;
                g4 g4Var = q1Var.f48863y;
                if (g4Var.O != null) {
                    g4Var.P.setVisibility(4);
                    g4 g4Var2 = q1Var.f48863y;
                    g4Var2.P.removeView(g4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f48863y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f48863y.S.onCustomViewHidden();
                    }
                    q1Var.f48863y.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) this.f47720b;
                if (wtVar.f40151k1 != null) {
                    wtVar.f28624b.setVisibility(0);
                    wtVar.l1.setVisibility(4);
                    wtVar.l1.removeView(wtVar.f40151k1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = wtVar.f40152m1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        wtVar.f40152m1.onCustomViewHidden();
                    }
                    wtVar.f40151k1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f47719a) {
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
        switch (this.f47719a) {
            case 0:
                g4 g4Var = ((q1) this.f47720b).f48863y;
                if (g4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.O = view;
                g4Var.S = customViewCallback;
                org.telegram.messenger.g0.i3(new iq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) this.f47720b;
                if (wtVar.f40151k1 == null && !wtVar.M0()) {
                    wtVar.L0();
                    wtVar.f40151k1 = view;
                    wtVar.f28624b.setVisibility(4);
                    wtVar.l1.setVisibility(0);
                    wtVar.l1.addView(view, c8.ha.c(-1.0f, -1));
                    wtVar.f40152m1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
