package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kn0 implements Runnable {
    public final int f35121a;
    public final ro0 f35122b;
    public final TLObject f35123c;

    public kn0(ro0 ro0Var, TLObject tLObject, int i10) {
        this.f35121a = i10;
        this.f35122b = ro0Var;
        this.f35123c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35121a) {
            case 0:
                ro0.e0(this.f35122b, this.f35123c);
                return;
            case 1:
                ro0 ro0Var = this.f35122b;
                Utilities.Callback callback = ro0Var.f37177d1;
                TLObject tLObject = this.f35123c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ro0Var.D0(false);
                ro0Var.f37207z0 = true;
                ro0Var.H0(true, true);
                org.telegram.ui.Components.vq vqVar = ro0Var.f37194r;
                if (vqVar != null) {
                    vqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = ro0Var.f37189n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    ro0Var.f37189n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = ro0Var.getParentLayout();
                Activity parentActivity = ro0Var.getParentActivity();
                ro0Var.getMessagesController().newMessageCallback = new d7(ro0Var, parentLayout, parentActivity, 17);
                WebView webView = ro0Var.f37201w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ro0Var.f37201w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ro0Var.f37203x = str;
                    webView2.loadUrl(str);
                }
                ro0Var.f37169a1 = true;
                ro0Var.f37182f1 = 3;
                qo0 qo0Var = ro0Var.Z0;
                if (qo0Var != null) {
                    qo0Var.a(3);
                    return;
                }
                return;
            default:
                ro0.c0(this.f35122b, this.f35123c);
                return;
        }
    }
}
