package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pn0 implements Runnable {
    public final int f36620a;
    public final wo0 f36621b;
    public final TLObject f36622c;

    public pn0(wo0 wo0Var, TLObject tLObject, int i10) {
        this.f36620a = i10;
        this.f36621b = wo0Var;
        this.f36622c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36620a) {
            case 0:
                wo0.e0(this.f36621b, this.f36622c);
                return;
            case 1:
                wo0 wo0Var = this.f36621b;
                Utilities.Callback callback = wo0Var.f39316d1;
                TLObject tLObject = this.f36622c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                wo0Var.D0(false);
                wo0Var.f39346z0 = true;
                wo0Var.H0(true, true);
                org.telegram.ui.Components.tq tqVar = wo0Var.f39333r;
                if (tqVar != null) {
                    tqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = wo0Var.f39328n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    wo0Var.f39328n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = wo0Var.getParentLayout();
                Activity parentActivity = wo0Var.getParentActivity();
                wo0Var.getMessagesController().newMessageCallback = new b7(wo0Var, parentLayout, parentActivity, 17);
                WebView webView = wo0Var.f39340w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = wo0Var.f39340w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    wo0Var.f39342x = str;
                    webView2.loadUrl(str);
                }
                wo0Var.f39308a1 = true;
                wo0Var.f39321f1 = 3;
                vo0 vo0Var = wo0Var.Z0;
                if (vo0Var != null) {
                    vo0Var.a(3);
                    return;
                }
                return;
            default:
                wo0.c0(this.f36621b, this.f36622c);
                return;
        }
    }
}
