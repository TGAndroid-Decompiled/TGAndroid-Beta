package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f36376a;
    public final KeyEvent.Callback f36377b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f36376a = i10;
        this.f36377b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f36376a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f36377b;
                i4 i4Var = t1Var.f37916x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f37916x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f37916x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f37916x.S.onCustomViewHidden();
                    }
                    t1Var.f37916x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.xu xuVar = (org.telegram.ui.Components.xu) this.f36377b;
                if (xuVar.d != null) {
                    xuVar.getSheetContainer().setVisibility(0);
                    xuVar.e.setVisibility(4);
                    xuVar.e.removeView(xuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = xuVar.f30470f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        xuVar.f30470f.onCustomViewHidden();
                    }
                    xuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f36376a) {
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
        switch (this.f36376a) {
            case 0:
                i4 i4Var = ((t1) this.f36377b).f37916x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new eu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.xu xuVar = (org.telegram.ui.Components.xu) this.f36377b;
                FrameLayout frameLayout = xuVar.e;
                if (xuVar.d == null && !org.telegram.ui.Components.pg0.f27353p0.P) {
                    xuVar.I();
                    xuVar.d = view;
                    xuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.y5.c(-1.0f, -1));
                    xuVar.f30470f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
