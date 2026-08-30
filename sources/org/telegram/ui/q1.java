package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q1 extends WebChromeClient {
    public final int f37570a;
    public final KeyEvent.Callback f37571b;

    public q1(KeyEvent.Callback callback, int i10) {
        this.f37570a = i10;
        this.f37571b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f37570a) {
            case 0:
                super.onHideCustomView();
                u1 u1Var = (u1) this.f37571b;
                l4 l4Var = u1Var.f38817x;
                if (l4Var.L != null) {
                    l4Var.M.setVisibility(4);
                    l4 l4Var2 = u1Var.f38817x;
                    l4Var2.M.removeView(l4Var2.L);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.f38817x.P;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.f38817x.P.onCustomViewHidden();
                    }
                    u1Var.f38817x.L = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.pu puVar = (org.telegram.ui.Components.pu) this.f37571b;
                if (puVar.d != null) {
                    puVar.getSheetContainer().setVisibility(0);
                    puVar.e.setVisibility(4);
                    puVar.e.removeView(puVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = puVar.f27986f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        puVar.f27986f.onCustomViewHidden();
                    }
                    puVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f37570a) {
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
        switch (this.f37570a) {
            case 0:
                l4 l4Var = ((u1) this.f37571b).f38817x;
                if (l4Var.L != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                l4Var.L = view;
                l4Var.P = customViewCallback;
                AndroidUtilities.runOnUIThread(new rt0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.pu puVar = (org.telegram.ui.Components.pu) this.f37571b;
                FrameLayout frameLayout = puVar.e;
                if (puVar.d == null && !org.telegram.ui.Components.lg0.m0.M) {
                    puVar.H();
                    puVar.d = view;
                    puVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, k7.b6.c(-1.0f, -1));
                    puVar.f27986f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
