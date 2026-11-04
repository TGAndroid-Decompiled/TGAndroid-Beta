package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
public final class n1 extends WebChromeClient {
    public final int f47850a;
    public final KeyEvent.Callback f47851b;

    public n1(KeyEvent.Callback callback, int i3) {
        this.f47850a = i3;
        this.f47851b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f47850a) {
            case 0:
                super.onHideCustomView();
                r1 r1Var = (r1) this.f47851b;
                i4 i4Var = r1Var.f48999y;
                if (i4Var.P != null) {
                    i4Var.Q.setVisibility(4);
                    i4 i4Var2 = r1Var.f48999y;
                    i4Var2.Q.removeView(i4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = r1Var.f48999y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        r1Var.f48999y.T.onCustomViewHidden();
                    }
                    r1Var.f48999y.P = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) this.f47851b;
                if (utVar.f38863l1 != null) {
                    utVar.f28586b.setVisibility(0);
                    utVar.m1.setVisibility(4);
                    utVar.m1.removeView(utVar.f38863l1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = utVar.f38864n1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        utVar.f38864n1.onCustomViewHidden();
                    }
                    utVar.f38863l1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i3, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f47850a) {
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
        switch (this.f47850a) {
            case 0:
                i4 i4Var = ((r1) this.f47851b).f48999y;
                if (i4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.P = view;
                i4Var.T = customViewCallback;
                org.telegram.messenger.g0.i3(new xp0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) this.f47851b;
                FrameLayout frameLayout = utVar.m1;
                if (utVar.f38863l1 == null && !org.telegram.ui.Components.ie0.f34683q0.Q) {
                    utVar.J0();
                    utVar.f38863l1 = view;
                    utVar.f28586b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, b8.mf.c(-1.0f, -1));
                    utVar.f38864n1 = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
