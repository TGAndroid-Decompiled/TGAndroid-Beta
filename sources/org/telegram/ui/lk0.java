package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lk0 implements Runnable {
    public final int f49620a;
    public final ml0 f49621b;
    public final TLObject f49622c;

    public lk0(ml0 ml0Var, TLObject tLObject, int i7) {
        this.f49620a = i7;
        this.f49621b = ml0Var;
        this.f49622c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f49620a) {
            case 0:
                ml0.j0(this.f49621b, this.f49622c);
                return;
            case 1:
                ml0 ml0Var = this.f49621b;
                org.telegram.messenger.y10 y10Var = ml0Var.f49880e1;
                TLObject tLObject = this.f49622c;
                if (y10Var != null) {
                    y10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ml0Var.J0(false);
                ml0Var.A0 = true;
                ml0Var.N0(true, true);
                org.telegram.ui.Components.qq qqVar = ml0Var.f49896r;
                if (qqVar != null) {
                    qqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = ml0Var.f49891n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    ml0Var.f49891n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.r4 parentLayout = ml0Var.getParentLayout();
                Activity parentActivity = ml0Var.getParentActivity();
                ml0Var.getMessagesController().f25887o7 = new z6(ml0Var, parentLayout, parentActivity, 17);
                WebView webView = ml0Var.f49905x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ml0Var.f49905x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ml0Var.f49907y = str;
                    webView2.loadUrl(str);
                }
                ml0Var.f49872b1 = true;
                ml0Var.f49885g1 = 3;
                ll0 ll0Var = ml0Var.f49869a1;
                if (ll0Var != null) {
                    ll0Var.d(3);
                    return;
                }
                return;
            default:
                ml0.h0(this.f49621b, this.f49622c);
                return;
        }
    }
}
