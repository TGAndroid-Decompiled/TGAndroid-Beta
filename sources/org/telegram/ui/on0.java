package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class on0 implements Runnable {
    public final int f40578a;
    public final vo0 f40579b;
    public final TLObject f40580c;

    public on0(vo0 vo0Var, TLObject tLObject, int i10) {
        this.f40578a = i10;
        this.f40579b = vo0Var;
        this.f40580c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40578a) {
            case 0:
                vo0.e0(this.f40579b, this.f40580c);
                return;
            case 1:
                vo0 vo0Var = this.f40579b;
                Utilities.Callback callback = vo0Var.f42923d1;
                TLObject tLObject = this.f40580c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                vo0Var.D0(false);
                vo0Var.f42954z0 = true;
                vo0Var.H0(true, true);
                org.telegram.ui.Components.jr jrVar = vo0Var.f42941r;
                if (jrVar != null) {
                    jrVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = vo0Var.f42936n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    vo0Var.f42936n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = vo0Var.getParentLayout();
                Activity parentActivity = vo0Var.getParentActivity();
                vo0Var.getMessagesController().newMessageCallback = new a7(vo0Var, parentLayout, parentActivity, 17);
                WebView webView = vo0Var.f42948w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = vo0Var.f42948w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    vo0Var.f42950x = str;
                    webView2.loadUrl(str);
                }
                vo0Var.f42915a1 = true;
                vo0Var.f42929f1 = 3;
                uo0 uo0Var = vo0Var.Z0;
                if (uo0Var != null) {
                    uo0Var.a(3);
                    return;
                }
                return;
            default:
                vo0.c0(this.f40579b, this.f40580c);
                return;
        }
    }
}
