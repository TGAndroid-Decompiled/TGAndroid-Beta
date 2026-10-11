package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o1 extends WebChromeClient {
    public final int f40378a;
    public final KeyEvent.Callback f40379b;

    public o1(KeyEvent.Callback callback, int i10) {
        this.f40378a = i10;
        this.f40379b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40378a) {
            case 0:
                super.onHideCustomView();
                s1 s1Var = (s1) this.f40379b;
                h4 h4Var = s1Var.f41563x;
                if (h4Var.O != null) {
                    h4Var.P.setVisibility(4);
                    h4 h4Var2 = s1Var.f41563x;
                    h4Var2.P.removeView(h4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = s1Var.f41563x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        s1Var.f41563x.S.onCustomViewHidden();
                    }
                    s1Var.f41563x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.mv mvVar = (org.telegram.ui.Components.mv) this.f40379b;
                if (mvVar.d != null) {
                    mvVar.getSheetContainer().setVisibility(0);
                    mvVar.f28866e.setVisibility(4);
                    mvVar.f28866e.removeView(mvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = mvVar.f28867f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        mvVar.f28867f.onCustomViewHidden();
                    }
                    mvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40378a) {
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
        switch (this.f40378a) {
            case 0:
                h4 h4Var = ((s1) this.f40379b).f41563x;
                if (h4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                h4Var.O = view;
                h4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new mu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.mv mvVar = (org.telegram.ui.Components.mv) this.f40379b;
                FrameLayout frameLayout = mvVar.f28866e;
                if (mvVar.d == null && !org.telegram.ui.Components.ih0.f27325p0.P) {
                    mvVar.I();
                    mvVar.d = view;
                    mvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.d(-1.0f, -1));
                    mvVar.f28867f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
