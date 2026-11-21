package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
public final class m1 extends WebChromeClient {
    public final int f49735a;
    public final KeyEvent.Callback f49736b;

    public m1(KeyEvent.Callback callback, int i7) {
        this.f49735a = i7;
        this.f49736b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f49735a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.f49736b;
                g4 g4Var = q1Var.f51029y;
                if (g4Var.P != null) {
                    g4Var.Q.setVisibility(4);
                    g4 g4Var2 = q1Var.f51029y;
                    g4Var2.Q.removeView(g4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.f51029y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.f51029y.T.onCustomViewHidden();
                    }
                    q1Var.f51029y.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) this.f49736b;
                if (iuVar.f36319o1 != null) {
                    iuVar.f30173b.setVisibility(0);
                    iuVar.f36320p1.setVisibility(4);
                    iuVar.f36320p1.removeView(iuVar.f36319o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = iuVar.f36321q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        iuVar.f36321q1.onCustomViewHidden();
                    }
                    iuVar.f36319o1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f49735a) {
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
        switch (this.f49735a) {
            case 0:
                g4 g4Var = ((q1) this.f49736b).f51029y;
                if (g4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                g4Var.P = view;
                g4Var.T = customViewCallback;
                org.telegram.messenger.g0.h3(new hq0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) this.f49736b;
                if (iuVar.f36319o1 == null && !iuVar.N0()) {
                    iuVar.M0();
                    iuVar.f36319o1 = view;
                    iuVar.f30173b.setVisibility(4);
                    iuVar.f36320p1.setVisibility(0);
                    iuVar.f36320p1.addView(view, c8.ma.c(-1.0f, -1));
                    iuVar.f36321q1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
