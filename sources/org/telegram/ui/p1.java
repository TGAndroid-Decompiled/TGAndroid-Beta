package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f39314a;
    public final KeyEvent.Callback f39315b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f39314a = i10;
        this.f39315b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f39314a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f39315b;
                i4 i4Var = t1Var.f40672x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f40672x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f40672x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f40672x.S.onCustomViewHidden();
                    }
                    t1Var.f40672x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) this.f39315b;
                if (zuVar.d != null) {
                    zuVar.getSheetContainer().setVisibility(0);
                    zuVar.f33653e.setVisibility(4);
                    zuVar.f33653e.removeView(zuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = zuVar.f33654f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        zuVar.f33654f.onCustomViewHidden();
                    }
                    zuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f39314a) {
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
        switch (this.f39314a) {
            case 0:
                i4 i4Var = ((t1) this.f39315b).f40672x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new hu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) this.f39315b;
                FrameLayout frameLayout = zuVar.f33653e;
                if (zuVar.d == null && !org.telegram.ui.Components.rg0.f30384p0.P) {
                    zuVar.G();
                    zuVar.d = view;
                    zuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.c(-1.0f, -1));
                    zuVar.f33654f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
