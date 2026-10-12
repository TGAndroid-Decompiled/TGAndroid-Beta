package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f40827a;
    public final KeyEvent.Callback f40828b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f40827a = i10;
        this.f40828b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40827a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f40828b;
                i4 i4Var = t1Var.f42047x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f42047x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f42047x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f42047x.S.onCustomViewHidden();
                    }
                    t1Var.f42047x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ov ovVar = (org.telegram.ui.Components.ov) this.f40828b;
                if (ovVar.d != null) {
                    ovVar.getSheetContainer().setVisibility(0);
                    ovVar.f29298e.setVisibility(4);
                    ovVar.f29298e.removeView(ovVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = ovVar.f29299f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        ovVar.f29299f.onCustomViewHidden();
                    }
                    ovVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40827a) {
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
        switch (this.f40827a) {
            case 0:
                i4 i4Var = ((t1) this.f40828b).f42047x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new pu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.ov ovVar = (org.telegram.ui.Components.ov) this.f40828b;
                FrameLayout frameLayout = ovVar.f29298e;
                if (ovVar.d == null && !org.telegram.ui.Components.jh0.f27503p0.P) {
                    ovVar.I();
                    ovVar.d = view;
                    ovVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.w5.d(-1.0f, -1));
                    ovVar.f29299f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
