package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q1 extends WebChromeClient {
    public final int f40685a;
    public final KeyEvent.Callback f40686b;

    public q1(KeyEvent.Callback callback, int i10) {
        this.f40685a = i10;
        this.f40686b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40685a) {
            case 0:
                super.onHideCustomView();
                u1 u1Var = (u1) this.f40686b;
                k4 k4Var = u1Var.f42179x;
                if (k4Var.O != null) {
                    k4Var.P.setVisibility(4);
                    k4 k4Var2 = u1Var.f42179x;
                    k4Var2.P.removeView(k4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.f42179x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.f42179x.S.onCustomViewHidden();
                    }
                    u1Var.f42179x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.av avVar = (org.telegram.ui.Components.av) this.f40686b;
                if (avVar.d != null) {
                    avVar.getSheetContainer().setVisibility(0);
                    avVar.e.setVisibility(4);
                    avVar.e.removeView(avVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = avVar.f24812f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        avVar.f24812f.onCustomViewHidden();
                    }
                    avVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40685a) {
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
        switch (this.f40685a) {
            case 0:
                k4 k4Var = ((u1) this.f40686b).f42179x;
                if (k4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                k4Var.O = view;
                k4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new ut0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.av avVar = (org.telegram.ui.Components.av) this.f40686b;
                FrameLayout frameLayout = avVar.e;
                if (avVar.d == null && !org.telegram.ui.Components.ch0.f25313p0.P) {
                    avVar.G();
                    avVar.d = view;
                    avVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.c(-1.0f, -1));
                    avVar.f24812f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
