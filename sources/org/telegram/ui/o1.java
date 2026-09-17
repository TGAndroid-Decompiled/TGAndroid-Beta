package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o1 extends WebChromeClient {
    public final int f36199a;
    public final KeyEvent.Callback f36200b;

    public o1(KeyEvent.Callback callback, int i10) {
        this.f36199a = i10;
        this.f36200b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f36199a) {
            case 0:
                super.onHideCustomView();
                s1 s1Var = (s1) this.f36200b;
                h4 h4Var = s1Var.f37358x;
                if (h4Var.O != null) {
                    h4Var.P.setVisibility(4);
                    h4 h4Var2 = s1Var.f37358x;
                    h4Var2.P.removeView(h4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = s1Var.f37358x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        s1Var.f37358x.S.onCustomViewHidden();
                    }
                    s1Var.f37358x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.vu vuVar = (org.telegram.ui.Components.vu) this.f36200b;
                if (vuVar.d != null) {
                    vuVar.getSheetContainer().setVisibility(0);
                    vuVar.e.setVisibility(4);
                    vuVar.e.removeView(vuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = vuVar.f29411f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        vuVar.f29411f.onCustomViewHidden();
                    }
                    vuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f36199a) {
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
        switch (this.f36199a) {
            case 0:
                h4 h4Var = ((s1) this.f36200b).f37358x;
                if (h4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                h4Var.O = view;
                h4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new ou0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.vu vuVar = (org.telegram.ui.Components.vu) this.f36200b;
                FrameLayout frameLayout = vuVar.e;
                if (vuVar.d == null && !org.telegram.ui.Components.fg0.f23911p0.P) {
                    vuVar.I();
                    vuVar.d = view;
                    vuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.c(-1.0f, -1));
                    vuVar.f29411f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
