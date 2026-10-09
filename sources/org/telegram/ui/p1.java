package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f40626a;
    public final KeyEvent.Callback f40627b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f40626a = i10;
        this.f40627b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f40626a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f40627b;
                i4 i4Var = t1Var.f41823x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f41823x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f41823x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f41823x.S.onCustomViewHidden();
                    }
                    t1Var.f41823x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.lv lvVar = (org.telegram.ui.Components.lv) this.f40627b;
                if (lvVar.d != null) {
                    lvVar.getSheetContainer().setVisibility(0);
                    lvVar.f28600e.setVisibility(4);
                    lvVar.f28600e.removeView(lvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = lvVar.f28601f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        lvVar.f28601f.onCustomViewHidden();
                    }
                    lvVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f40626a) {
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
        switch (this.f40626a) {
            case 0:
                i4 i4Var = ((t1) this.f40627b).f41823x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new nu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.lv lvVar = (org.telegram.ui.Components.lv) this.f40627b;
                FrameLayout frameLayout = lvVar.f28600e;
                if (lvVar.d == null && !org.telegram.ui.Components.gh0.f26700p0.P) {
                    lvVar.I();
                    lvVar.d = view;
                    lvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.d(-1.0f, -1));
                    lvVar.f28601f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
