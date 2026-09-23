package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f35994a;
    public final KeyEvent.Callback f35995b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f35994a = i10;
        this.f35995b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f35994a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f35995b;
                i4 i4Var = t1Var.f37503x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f37503x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f37503x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f37503x.S.onCustomViewHidden();
                    }
                    t1Var.f37503x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.wu wuVar = (org.telegram.ui.Components.wu) this.f35995b;
                if (wuVar.d != null) {
                    wuVar.getSheetContainer().setVisibility(0);
                    wuVar.e.setVisibility(4);
                    wuVar.e.removeView(wuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = wuVar.f29812f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        wuVar.f29812f.onCustomViewHidden();
                    }
                    wuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f35994a) {
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
        switch (this.f35994a) {
            case 0:
                i4 i4Var = ((t1) this.f35995b).f37503x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new fu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.wu wuVar = (org.telegram.ui.Components.wu) this.f35995b;
                FrameLayout frameLayout = wuVar.e;
                if (wuVar.d == null && !org.telegram.ui.Components.eg0.f23661p0.P) {
                    wuVar.I();
                    wuVar.d = view;
                    wuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.c(-1.0f, -1));
                    wuVar.f29812f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
