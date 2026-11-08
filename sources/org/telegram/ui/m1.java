package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f47615a;
    public final KeyEvent.Callback f47616b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f47615a = i7;
        this.f47616b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f47615a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f47616b;
                g4 g4Var = q1Var.f49011y;
                if (g4Var.O != null) {
                    g4Var.P.setVisibility(4);
                    g4 g4Var2 = q1Var.f49011y;
                    g4Var2.P.removeView(g4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f49011y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f49011y.S.onCustomViewHidden();
                    }
                    q1Var.f49011y.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) this.f47616b;
                if (wtVar.f40043k1 != null) {
                    wtVar.f28619b.setVisibility(0);
                    wtVar.l1.setVisibility(4);
                    wtVar.l1.removeView(wtVar.f40043k1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = wtVar.f40044m1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        wtVar.f40044m1.onCustomViewHidden();
                    }
                    wtVar.f40043k1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f47615a) {
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
        switch (this.f47615a) {
            case 0:
                g4 g4Var = ((q1) this.f47616b).f49011y;
                if (g4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.O = view;
                g4Var.S = customViewCallback;
                org.telegram.messenger.g0.i3(new gq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) this.f47616b;
                if (wtVar.f40043k1 == null && !wtVar.M0()) {
                    wtVar.L0();
                    wtVar.f40043k1 = view;
                    wtVar.f28619b.setVisibility(4);
                    wtVar.l1.setVisibility(0);
                    wtVar.l1.addView(view, c8.ha.c(-1.0f, -1));
                    wtVar.f40044m1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
