package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
public final class o1 extends WebChromeClient {
    public final int f40091a;
    public final KeyEvent.Callback f40092b;

    public o1(KeyEvent.Callback callback, int i10) {
        this.f40091a = i10;
        this.f40092b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40091a) {
            case 0:
                super.onHideCustomView();
                r1 r1Var = (r1) this.f40092b;
                h4 h4Var = r1Var.f41114y;
                if (h4Var.O != null) {
                    h4Var.P.setVisibility(4);
                    h4 h4Var2 = r1Var.f41114y;
                    h4Var2.P.removeView(h4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = r1Var.f41114y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        r1Var.f41114y.S.onCustomViewHidden();
                    }
                    r1Var.f41114y.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.hu huVar = (org.telegram.ui.Components.hu) this.f40092b;
                if (huVar.f26813k1 != null) {
                    huVar.f21586b.setVisibility(0);
                    huVar.l1.setVisibility(4);
                    huVar.l1.removeView(huVar.f26813k1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = huVar.f26814m1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        huVar.f26814m1.onCustomViewHidden();
                    }
                    huVar.f26813k1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40091a) {
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
        switch (this.f40091a) {
            case 0:
                h4 h4Var = ((r1) this.f40092b).f41114y;
                if (h4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                h4Var.O = view;
                h4Var.S = customViewCallback;
                org.telegram.messenger.i0.h3(new rr0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.hu huVar = (org.telegram.ui.Components.hu) this.f40092b;
                FrameLayout frameLayout = huVar.l1;
                if (huVar.f26813k1 == null && !org.telegram.ui.Components.jf0.f27345p0.P) {
                    huVar.J0();
                    huVar.f26813k1 = view;
                    huVar.f21586b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.b6.c(-1.0f, -1));
                    huVar.f26814m1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
