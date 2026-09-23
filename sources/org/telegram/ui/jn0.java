package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn0 implements Runnable {
    public final int f34488a;
    public final qo0 f34489b;
    public final TLObject f34490c;

    public jn0(qo0 qo0Var, TLObject tLObject, int i10) {
        this.f34488a = i10;
        this.f34489b = qo0Var;
        this.f34490c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34488a) {
            case 0:
                qo0.e0(this.f34489b, this.f34490c);
                return;
            case 1:
                qo0 qo0Var = this.f34489b;
                Utilities.Callback callback = qo0Var.f36493d1;
                TLObject tLObject = this.f34490c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                qo0Var.D0(false);
                qo0Var.f36523z0 = true;
                qo0Var.H0(true, true);
                org.telegram.ui.Components.uq uqVar = qo0Var.f36510r;
                if (uqVar != null) {
                    uqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = qo0Var.f36505n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    qo0Var.f36505n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.c5 parentLayout = qo0Var.getParentLayout();
                Activity parentActivity = qo0Var.getParentActivity();
                qo0Var.getMessagesController().newMessageCallback = new b7(qo0Var, parentLayout, parentActivity, 17);
                WebView webView = qo0Var.f36517w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = qo0Var.f36517w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    qo0Var.f36519x = str;
                    webView2.loadUrl(str);
                }
                qo0Var.f36485a1 = true;
                qo0Var.f36498f1 = 3;
                po0 po0Var = qo0Var.Z0;
                if (po0Var != null) {
                    po0Var.a(3);
                    return;
                }
                return;
            default:
                qo0.c0(this.f34489b, this.f34490c);
                return;
        }
    }
}
