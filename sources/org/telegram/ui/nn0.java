package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn0 implements Runnable {
    public final int f40326a;
    public final uo0 f40327b;
    public final TLObject f40328c;

    public nn0(uo0 uo0Var, TLObject tLObject, int i10) {
        this.f40326a = i10;
        this.f40327b = uo0Var;
        this.f40328c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40326a) {
            case 0:
                uo0.e0(this.f40327b, this.f40328c);
                return;
            case 1:
                uo0 uo0Var = this.f40327b;
                Utilities.Callback callback = uo0Var.f42736d1;
                TLObject tLObject = this.f40328c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                uo0Var.D0(false);
                uo0Var.f42767z0 = true;
                uo0Var.H0(true, true);
                org.telegram.ui.Components.jr jrVar = uo0Var.f42754r;
                if (jrVar != null) {
                    jrVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = uo0Var.f42749n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    uo0Var.f42749n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = uo0Var.getParentLayout();
                Activity parentActivity = uo0Var.getParentActivity();
                uo0Var.getMessagesController().newMessageCallback = new z6(uo0Var, parentLayout, parentActivity, 17);
                WebView webView = uo0Var.f42761w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = uo0Var.f42761w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    uo0Var.f42763x = str;
                    webView2.loadUrl(str);
                }
                uo0Var.f42728a1 = true;
                uo0Var.f42742f1 = 3;
                to0 to0Var = uo0Var.Z0;
                if (to0Var != null) {
                    to0Var.a(3);
                    return;
                }
                return;
            default:
                uo0.c0(this.f40327b, this.f40328c);
                return;
        }
    }
}
