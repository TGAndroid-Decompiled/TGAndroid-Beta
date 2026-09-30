package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn0 implements Runnable {
    public final int f34263a;
    public final oo0 f34264b;
    public final TLObject f34265c;

    public hn0(oo0 oo0Var, TLObject tLObject, int i10) {
        this.f34263a = i10;
        this.f34264b = oo0Var;
        this.f34265c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34263a) {
            case 0:
                oo0.e0(this.f34264b, this.f34265c);
                return;
            case 1:
                oo0 oo0Var = this.f34264b;
                Utilities.Callback callback = oo0Var.f36289d1;
                TLObject tLObject = this.f34265c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                oo0Var.D0(false);
                oo0Var.f36319z0 = true;
                oo0Var.H0(true, true);
                org.telegram.ui.Components.vq vqVar = oo0Var.f36306r;
                if (vqVar != null) {
                    vqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = oo0Var.f36301n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    oo0Var.f36301n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = oo0Var.getParentLayout();
                Activity parentActivity = oo0Var.getParentActivity();
                oo0Var.getMessagesController().newMessageCallback = new b7(oo0Var, parentLayout, parentActivity, 17);
                WebView webView = oo0Var.f36313w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = oo0Var.f36313w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    oo0Var.f36315x = str;
                    webView2.loadUrl(str);
                }
                oo0Var.f36281a1 = true;
                oo0Var.f36294f1 = 3;
                no0 no0Var = oo0Var.Z0;
                if (no0Var != null) {
                    no0Var.a(3);
                    return;
                }
                return;
            default:
                oo0.c0(this.f34264b, this.f34265c);
                return;
        }
    }
}
