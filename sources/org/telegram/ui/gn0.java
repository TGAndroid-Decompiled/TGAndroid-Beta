package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gn0 implements Runnable {
    public final int f34481a;
    public final lo0 f34482b;
    public final TLObject f34483c;

    public gn0(lo0 lo0Var, TLObject tLObject, int i10) {
        this.f34481a = i10;
        this.f34482b = lo0Var;
        this.f34483c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34481a) {
            case 0:
                lo0.e0(this.f34482b, this.f34483c);
                return;
            case 1:
                lo0 lo0Var = this.f34482b;
                Utilities.Callback callback = lo0Var.f35817a1;
                TLObject tLObject = this.f34483c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                lo0Var.D0(false);
                lo0Var.f35847w0 = true;
                lo0Var.H0(true, true);
                org.telegram.ui.Components.qq qqVar = lo0Var.f35839r;
                if (qqVar != null) {
                    qqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = lo0Var.f35834n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    lo0Var.f35834n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.e5 parentLayout = lo0Var.getParentLayout();
                Activity parentActivity = lo0Var.getParentActivity();
                lo0Var.getMessagesController().newMessageCallback = new f7(lo0Var, parentLayout, parentActivity, 17);
                WebView webView = lo0Var.f35846w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = lo0Var.f35846w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    lo0Var.f35848x = str;
                    webView2.loadUrl(str);
                }
                lo0Var.X0 = true;
                lo0Var.f35823c1 = 3;
                ko0 ko0Var = lo0Var.W0;
                if (ko0Var != null) {
                    ko0Var.a(3);
                    return;
                }
                return;
            default:
                lo0.c0(this.f34482b, this.f34483c);
                return;
        }
    }
}
