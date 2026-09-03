package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gn0 implements Runnable {
    public final int f37138a;
    public final lo0 f37139b;
    public final TLObject f37140c;

    public gn0(lo0 lo0Var, TLObject tLObject, int i10) {
        this.f37138a = i10;
        this.f37139b = lo0Var;
        this.f37140c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37138a) {
            case 0:
                lo0.e0(this.f37139b, this.f37140c);
                return;
            case 1:
                lo0 lo0Var = this.f37139b;
                Utilities.Callback callback = lo0Var.f38709a1;
                TLObject tLObject = this.f37140c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                lo0Var.D0(false);
                lo0Var.f38740w0 = true;
                lo0Var.H0(true, true);
                org.telegram.ui.Components.tq tqVar = lo0Var.f38732r;
                if (tqVar != null) {
                    tqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = lo0Var.f38727n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    lo0Var.f38727n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.f5 parentLayout = lo0Var.getParentLayout();
                Activity parentActivity = lo0Var.getParentActivity();
                lo0Var.getMessagesController().newMessageCallback = new d7(lo0Var, parentLayout, parentActivity, 17);
                WebView webView = lo0Var.f38739w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = lo0Var.f38739w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    lo0Var.f38741x = str;
                    webView2.loadUrl(str);
                }
                lo0Var.X0 = true;
                lo0Var.f38715c1 = 3;
                ko0 ko0Var = lo0Var.W0;
                if (ko0Var != null) {
                    ko0Var.a(3);
                    return;
                }
                return;
            default:
                lo0.c0(this.f37139b, this.f37140c);
                return;
        }
    }
}
