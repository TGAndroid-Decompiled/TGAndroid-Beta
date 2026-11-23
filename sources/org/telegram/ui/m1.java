package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f49739a;
    public final KeyEvent.Callback f49740b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f49739a = i7;
        this.f49740b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f49739a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f49740b;
                g4 g4Var = q1Var.f51033y;
                if (g4Var.P != null) {
                    g4Var.Q.setVisibility(4);
                    g4 g4Var2 = q1Var.f51033y;
                    g4Var2.Q.removeView(g4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f51033y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f51033y.T.onCustomViewHidden();
                    }
                    q1Var.f51033y.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) this.f49740b;
                if (iuVar.f36313o1 != null) {
                    iuVar.f30176b.setVisibility(0);
                    iuVar.f36314p1.setVisibility(4);
                    iuVar.f36314p1.removeView(iuVar.f36313o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = iuVar.f36315q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        iuVar.f36315q1.onCustomViewHidden();
                    }
                    iuVar.f36313o1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f49739a) {
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
        switch (this.f49739a) {
            case 0:
                g4 g4Var = ((q1) this.f49740b).f51033y;
                if (g4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.P = view;
                g4Var.T = customViewCallback;
                org.telegram.messenger.g0.h3(new hq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) this.f49740b;
                if (iuVar.f36313o1 == null && !iuVar.N0()) {
                    iuVar.M0();
                    iuVar.f36313o1 = view;
                    iuVar.f30176b.setVisibility(4);
                    iuVar.f36314p1.setVisibility(0);
                    iuVar.f36314p1.addView(view, c8.ma.c(-1.0f, -1));
                    iuVar.f36315q1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
