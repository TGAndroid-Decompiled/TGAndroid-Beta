package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends WebChromeClient {
    public final int f39379a;
    public final KeyEvent.Callback f39380b;

    public p1(KeyEvent.Callback callback, int i10) {
        this.f39379a = i10;
        this.f39380b = callback;
    }

    @Override
    public final void onHideCustomView() {
        switch (this.f39379a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.f39380b;
                i4 i4Var = t1Var.f40596x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.f40596x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.f40596x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.f40596x.S.onCustomViewHidden();
                    }
                    t1Var.f40596x.O = null;
                    return;
                }
                return;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.tu tuVar = (org.telegram.ui.Components.tu) this.f39380b;
                if (tuVar.d != null) {
                    tuVar.getSheetContainer().setVisibility(0);
                    tuVar.f30709e.setVisibility(4);
                    tuVar.f30709e.removeView(tuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = tuVar.f30710f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        tuVar.f30710f.onCustomViewHidden();
                    }
                    tuVar.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f39379a) {
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
        switch (this.f39379a) {
            case 0:
                i4 i4Var = ((t1) this.f39380b).f40596x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                i4Var.O = view;
                i4Var.S = customViewCallback;
                AndroidUtilities.runOnUIThread(new lu0(this, 7), 100L);
                return;
            default:
                org.telegram.ui.Components.tu tuVar = (org.telegram.ui.Components.tu) this.f39380b;
                FrameLayout frameLayout = tuVar.f30709e;
                if (tuVar.d == null && !org.telegram.ui.Components.eg0.f25675p0.P) {
                    tuVar.I();
                    tuVar.d = view;
                    tuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.c(-1.0f, -1));
                    tuVar.f30710f = customViewCallback;
                    return;
                }
                customViewCallback.onCustomViewHidden();
                return;
        }
    }
}
