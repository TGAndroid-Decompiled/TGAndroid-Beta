package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q1 extends WebChromeClient {
    public final int f40318a;
    public final KeyEvent.Callback f40319b;

    public q1(KeyEvent.Callback callback, int i10) {
        this.f40318a = i10;
        this.f40319b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40318a) {
            case 0:
                super.onHideCustomView();
                u1 u1Var = (u1) this.f40319b;
                l4 l4Var = u1Var.f41765x;
                if (l4Var.L != null) {
                    l4Var.M.setVisibility(4);
                    l4 l4Var2 = u1Var.f41765x;
                    l4Var2.M.removeView(l4Var2.L);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.f41765x.P;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.f41765x.P.onCustomViewHidden();
                    }
                    u1Var.f41765x.L = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.f40319b;
                if (ruVar.d != null) {
                    ruVar.getSheetContainer().setVisibility(0);
                    ruVar.f30857e.setVisibility(4);
                    ruVar.f30857e.removeView(ruVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = ruVar.f30858f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        ruVar.f30858f.onCustomViewHidden();
                    }
                    ruVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40318a) {
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
        switch (this.f40318a) {
            case 0:
                l4 l4Var = ((u1) this.f40319b).f41765x;
                if (l4Var.L != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                l4Var.L = view;
                l4Var.P = customViewCallback;
                AndroidUtilities.runOnUIThread(new tt0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.f40319b;
                FrameLayout frameLayout = ruVar.f30857e;
                if (ruVar.d == null && !org.telegram.ui.Components.ng0.m0.M) {
                    ruVar.H();
                    ruVar.d = view;
                    ruVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, k7.c6.c(-1.0f, -1));
                    ruVar.f30858f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
