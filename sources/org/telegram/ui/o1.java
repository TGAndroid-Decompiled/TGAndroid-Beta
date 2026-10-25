package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o1 extends WebChromeClient {
    public final int f42065a;
    public final KeyEvent.Callback f42066b;

    public o1(KeyEvent.Callback callback, int i10) {
        this.f42065a = i10;
        this.f42066b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f42065a) {
            case 0:
                super.onHideCustomView();
                s1 s1Var = (s1) this.f42066b;
                j4 j4Var = s1Var.f43334x;
                if (j4Var.O != null) {
                    j4Var.P.setVisibility(4);
                    j4 j4Var2 = s1Var.f43334x;
                    j4Var2.P.removeView(j4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = s1Var.f43334x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        s1Var.f43334x.S.onCustomViewHidden();
                    }
                    s1Var.f43334x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.dv dvVar = (org.telegram.ui.Components.dv) this.f42066b;
                if (dvVar.d != null) {
                    dvVar.getSheetContainer().setVisibility(0);
                    dvVar.e.setVisibility(4);
                    dvVar.e.removeView(dvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = dvVar.f27607f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        dvVar.f27607f.onCustomViewHidden();
                    }
                    dvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f42065a) {
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
        switch (this.f42065a) {
            case 0:
                j4 j4Var = ((s1) this.f42066b).f43334x;
                if (j4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                j4Var.O = view;
                j4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new zt0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.dv dvVar = (org.telegram.ui.Components.dv) this.f42066b;
                FrameLayout frameLayout = dvVar.e;
                if (dvVar.d == null && !org.telegram.ui.Components.ch0.f27157p0.P) {
                    dvVar.H();
                    dvVar.d = view;
                    dvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                    dvVar.f27607f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
