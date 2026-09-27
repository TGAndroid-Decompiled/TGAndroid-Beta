package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q1 extends WebChromeClient {
    public final int f36596a;
    public final KeyEvent.Callback f36597b;

    public q1(KeyEvent.Callback callback, int i10) {
        this.f36596a = i10;
        this.f36597b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f36596a) {
            case 0:
                super.onHideCustomView();
                u1 u1Var = (u1) this.f36597b;
                j4 j4Var = u1Var.f38103x;
                if (j4Var.O != null) {
                    j4Var.P.setVisibility(4);
                    j4 j4Var2 = u1Var.f38103x;
                    j4Var2.P.removeView(j4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.f38103x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.f38103x.S.onCustomViewHidden();
                    }
                    u1Var.f38103x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.xu xuVar = (org.telegram.ui.Components.xu) this.f36597b;
                if (xuVar.d != null) {
                    xuVar.getSheetContainer().setVisibility(0);
                    xuVar.e.setVisibility(4);
                    xuVar.e.removeView(xuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = xuVar.f30485f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        xuVar.f30485f.onCustomViewHidden();
                    }
                    xuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f36596a) {
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
        switch (this.f36596a) {
            case 0:
                j4 j4Var = ((u1) this.f36597b).f38103x;
                if (j4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                j4Var.O = view;
                j4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new hu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.xu xuVar = (org.telegram.ui.Components.xu) this.f36597b;
                FrameLayout frameLayout = xuVar.e;
                if (xuVar.d == null && !org.telegram.ui.Components.rg0.f27977p0.P) {
                    xuVar.I();
                    xuVar.d = view;
                    xuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.y5.c(-1.0f, -1));
                    xuVar.f30485f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
