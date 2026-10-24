package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class an0 implements Runnable {
    public final int f35812a;
    public final ho0 f35813b;
    public final TLObject f35814c;

    public an0(ho0 ho0Var, TLObject tLObject, int i10) {
        this.f35812a = i10;
        this.f35813b = ho0Var;
        this.f35814c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35812a) {
            case 0:
                ho0.e0(this.f35813b, this.f35814c);
                return;
            case 1:
                ho0 ho0Var = this.f35813b;
                Utilities.Callback callback = ho0Var.f37924d1;
                TLObject tLObject = this.f35814c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ho0Var.D0(false);
                ho0Var.f37954z0 = true;
                ho0Var.H0(true, true);
                org.telegram.ui.Components.ar arVar = ho0Var.f37941r;
                if (arVar != null) {
                    arVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = ho0Var.f37936n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    ho0Var.f37936n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.h5 parentLayout = ho0Var.getParentLayout();
                Activity parentActivity = ho0Var.getParentActivity();
                ho0Var.getMessagesController().newMessageCallback = new e7(ho0Var, parentLayout, parentActivity, 17);
                WebView webView = ho0Var.f37948w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ho0Var.f37948w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ho0Var.f37950x = str;
                    webView2.loadUrl(str);
                }
                ho0Var.f37916a1 = true;
                ho0Var.f37929f1 = 3;
                go0 go0Var = ho0Var.Z0;
                if (go0Var != null) {
                    go0Var.a(3);
                    return;
                }
                return;
            default:
                ho0.c0(this.f35813b, this.f35814c);
                return;
        }
    }
}
