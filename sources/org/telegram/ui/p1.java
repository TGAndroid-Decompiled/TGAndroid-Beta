package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f40670a;
    public final KeyEvent.Callback f40671b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f40670a = i10;
        this.f40671b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40670a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f40671b;
                i4 i4Var = t1Var.f41867x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f41867x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f41867x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f41867x.S.onCustomViewHidden();
                    }
                    t1Var.f41867x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.mv mvVar = (org.telegram.ui.Components.mv) this.f40671b;
                if (mvVar.d != null) {
                    mvVar.getSheetContainer().setVisibility(0);
                    mvVar.f28904e.setVisibility(4);
                    mvVar.f28904e.removeView(mvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = mvVar.f28905f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        mvVar.f28905f.onCustomViewHidden();
                    }
                    mvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40670a) {
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
        switch (this.f40670a) {
            case 0:
                i4 i4Var = ((t1) this.f40671b).f41867x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new nu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.mv mvVar = (org.telegram.ui.Components.mv) this.f40671b;
                FrameLayout frameLayout = mvVar.f28904e;
                if (mvVar.d == null && !org.telegram.ui.Components.hh0.f27011p0.P) {
                    mvVar.I();
                    mvVar.d = view;
                    mvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.d(-1.0f, -1));
                    mvVar.f28905f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
