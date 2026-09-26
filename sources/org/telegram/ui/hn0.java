package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn0 implements Runnable {
    public final int f34260a;
    public final oo0 f34261b;
    public final TLObject f34262c;

    public hn0(oo0 oo0Var, TLObject tLObject, int i10) {
        this.f34260a = i10;
        this.f34261b = oo0Var;
        this.f34262c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34260a) {
            case 0:
                oo0.e0(this.f34261b, this.f34262c);
                return;
            case 1:
                oo0 oo0Var = this.f34261b;
                Utilities.Callback callback = oo0Var.f36287d1;
                TLObject tLObject = this.f34262c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                oo0Var.D0(false);
                oo0Var.f36317z0 = true;
                oo0Var.H0(true, true);
                org.telegram.ui.Components.uq uqVar = oo0Var.f36304r;
                if (uqVar != null) {
                    uqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = oo0Var.f36299n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    oo0Var.f36299n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = oo0Var.getParentLayout();
                Activity parentActivity = oo0Var.getParentActivity();
                oo0Var.getMessagesController().newMessageCallback = new b7(oo0Var, parentLayout, parentActivity, 17);
                WebView webView = oo0Var.f36311w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = oo0Var.f36311w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    oo0Var.f36313x = str;
                    webView2.loadUrl(str);
                }
                oo0Var.f36279a1 = true;
                oo0Var.f36292f1 = 3;
                no0 no0Var = oo0Var.Z0;
                if (no0Var != null) {
                    no0Var.a(3);
                    return;
                }
                return;
            default:
                oo0.c0(this.f34261b, this.f34262c);
                return;
        }
    }
}
