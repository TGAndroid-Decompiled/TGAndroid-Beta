package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gn0 implements Runnable {
    public final int f34117a;
    public final no0 f34118b;
    public final TLObject f34119c;

    public gn0(no0 no0Var, TLObject tLObject, int i10) {
        this.f34117a = i10;
        this.f34118b = no0Var;
        this.f34119c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34117a) {
            case 0:
                no0.e0(this.f34118b, this.f34119c);
                return;
            case 1:
                no0 no0Var = this.f34118b;
                Utilities.Callback callback = no0Var.f36059d1;
                TLObject tLObject = this.f34119c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                no0Var.D0(false);
                no0Var.f36089z0 = true;
                no0Var.H0(true, true);
                org.telegram.ui.Components.wq wqVar = no0Var.f36076r;
                if (wqVar != null) {
                    wqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = no0Var.f36071n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    no0Var.f36071n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = no0Var.getParentLayout();
                Activity parentActivity = no0Var.getParentActivity();
                no0Var.getMessagesController().newMessageCallback = new b7(no0Var, parentLayout, parentActivity, 17);
                WebView webView = no0Var.f36083w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = no0Var.f36083w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    no0Var.f36085x = str;
                    webView2.loadUrl(str);
                }
                no0Var.f36051a1 = true;
                no0Var.f36064f1 = 3;
                mo0 mo0Var = no0Var.Z0;
                if (mo0Var != null) {
                    mo0Var.a(3);
                    return;
                }
                return;
            default:
                no0.c0(this.f34118b, this.f34119c);
                return;
        }
    }
}
