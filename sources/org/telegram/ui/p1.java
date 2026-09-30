package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f36482a;
    public final KeyEvent.Callback f36483b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f36482a = i10;
        this.f36483b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f36482a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f36483b;
                i4 i4Var = t1Var.f38025x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f38025x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f38025x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f38025x.S.onCustomViewHidden();
                    }
                    t1Var.f38025x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.yu yuVar = (org.telegram.ui.Components.yu) this.f36483b;
                if (yuVar.d != null) {
                    yuVar.getSheetContainer().setVisibility(0);
                    yuVar.e.setVisibility(4);
                    yuVar.e.removeView(yuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = yuVar.f30811f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        yuVar.f30811f.onCustomViewHidden();
                    }
                    yuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f36482a) {
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
        switch (this.f36482a) {
            case 0:
                i4 i4Var = ((t1) this.f36483b).f38025x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new eu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.yu yuVar = (org.telegram.ui.Components.yu) this.f36483b;
                FrameLayout frameLayout = yuVar.e;
                if (yuVar.d == null && !org.telegram.ui.Components.rg0.f27987p0.P) {
                    yuVar.I();
                    yuVar.d = view;
                    yuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.y5.c(-1.0f, -1));
                    yuVar.f30811f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
