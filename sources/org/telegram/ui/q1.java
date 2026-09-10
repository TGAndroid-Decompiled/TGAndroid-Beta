package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q1 extends WebChromeClient {
    public final int f35948a;
    public final KeyEvent.Callback f35949b;

    public q1(KeyEvent.Callback callback, int i10) {
        this.f35948a = i10;
        this.f35949b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f35948a) {
            case 0:
                super.onHideCustomView();
                u1 u1Var = (u1) this.f35949b;
                j4 j4Var = u1Var.f37081x;
                if (j4Var.O != null) {
                    j4Var.P.setVisibility(4);
                    j4 j4Var2 = u1Var.f37081x;
                    j4Var2.P.removeView(j4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.f37081x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.f37081x.S.onCustomViewHidden();
                    }
                    u1Var.f37081x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) this.f35949b;
                if (zuVar.d != null) {
                    zuVar.getSheetContainer().setVisibility(0);
                    zuVar.e.setVisibility(4);
                    zuVar.e.removeView(zuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = zuVar.f29812f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        zuVar.f29812f.onCustomViewHidden();
                    }
                    zuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f35948a) {
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
        switch (this.f35948a) {
            case 0:
                j4 j4Var = ((u1) this.f35949b).f37081x;
                if (j4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                j4Var.O = view;
                j4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new mu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) this.f35949b;
                FrameLayout frameLayout = zuVar.e;
                if (zuVar.d == null && !org.telegram.ui.Components.og0.f25781p0.P) {
                    zuVar.I();
                    zuVar.d = view;
                    zuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.a6.c(-1.0f, -1));
                    zuVar.f29812f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
