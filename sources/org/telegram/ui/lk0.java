package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lk0 implements Runnable {
    public final int f49588a;
    public final ml0 f49589b;
    public final TLObject f49590c;

    public lk0(ml0 ml0Var, TLObject tLObject, int i7) {
        this.f49588a = i7;
        this.f49589b = ml0Var;
        this.f49590c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f49588a) {
            case 0:
                ml0.j0(this.f49589b, this.f49590c);
                return;
            case 1:
                ml0 ml0Var = this.f49589b;
                org.telegram.messenger.x10 x10Var = ml0Var.f49866e1;
                TLObject tLObject = this.f49590c;
                if (x10Var != null) {
                    x10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ml0Var.J0(false);
                ml0Var.A0 = true;
                ml0Var.N0(true, true);
                org.telegram.ui.Components.oq oqVar = ml0Var.f49882r;
                if (oqVar != null) {
                    oqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = ml0Var.f49877n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    ml0Var.f49877n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.s4 parentLayout = ml0Var.getParentLayout();
                Activity parentActivity = ml0Var.getParentActivity();
                ml0Var.getMessagesController().f25724o7 = new z6(ml0Var, parentLayout, parentActivity, 17);
                WebView webView = ml0Var.f49891x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ml0Var.f49891x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ml0Var.f49893y = str;
                    webView2.loadUrl(str);
                }
                ml0Var.f49858b1 = true;
                ml0Var.f49871g1 = 3;
                ll0 ll0Var = ml0Var.f49855a1;
                if (ll0Var != null) {
                    ll0Var.d(3);
                    return;
                }
                return;
            default:
                ml0.h0(this.f49589b, this.f49590c);
                return;
        }
    }
}
