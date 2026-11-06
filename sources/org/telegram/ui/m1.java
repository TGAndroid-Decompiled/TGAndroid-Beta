package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f47618a;
    public final KeyEvent.Callback f47619b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f47618a = i7;
        this.f47619b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f47618a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f47619b;
                g4 g4Var = q1Var.f49008y;
                if (g4Var.O != null) {
                    g4Var.P.setVisibility(4);
                    g4 g4Var2 = q1Var.f49008y;
                    g4Var2.P.removeView(g4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f49008y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f49008y.S.onCustomViewHidden();
                    }
                    q1Var.f49008y.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) this.f47619b;
                if (vtVar.f39687k1 != null) {
                    vtVar.f28616b.setVisibility(0);
                    vtVar.l1.setVisibility(4);
                    vtVar.l1.removeView(vtVar.f39687k1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = vtVar.f39688m1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        vtVar.f39688m1.onCustomViewHidden();
                    }
                    vtVar.f39687k1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f47618a) {
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
        switch (this.f47618a) {
            case 0:
                g4 g4Var = ((q1) this.f47619b).f49008y;
                if (g4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.O = view;
                g4Var.S = customViewCallback;
                org.telegram.messenger.g0.i3(new gq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) this.f47619b;
                if (vtVar.f39687k1 == null && !vtVar.M0()) {
                    vtVar.L0();
                    vtVar.f39687k1 = view;
                    vtVar.f28616b.setVisibility(4);
                    vtVar.l1.setVisibility(0);
                    vtVar.l1.addView(view, c8.ha.c(-1.0f, -1));
                    vtVar.f39688m1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
