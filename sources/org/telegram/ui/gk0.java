package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gk0 implements Runnable {
    public final int f46021a;
    public final hl0 f46022b;
    public final TLObject f46023c;

    public gk0(hl0 hl0Var, TLObject tLObject, int i7) {
        this.f46021a = i7;
        this.f46022b = hl0Var;
        this.f46023c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f46021a) {
            case 0:
                hl0.j0(this.f46022b, this.f46023c);
                return;
            case 1:
                hl0 hl0Var = this.f46022b;
                org.telegram.messenger.c20 c20Var = hl0Var.f46416d1;
                TLObject tLObject = this.f46023c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                hl0Var.J0(false);
                hl0Var.f46447z0 = true;
                hl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = hl0Var.f46434r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = hl0Var.f46429n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    hl0Var.f46429n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = hl0Var.getParentLayout();
                Activity parentActivity = hl0Var.getParentActivity();
                hl0Var.getMessagesController().f24827l7 = new a7(hl0Var, parentLayout, parentActivity, 17);
                WebView webView = hl0Var.f46443x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = hl0Var.f46443x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    hl0Var.f46445y = str;
                    webView2.loadUrl(str);
                }
                hl0Var.f46408a1 = true;
                hl0Var.f46422f1 = 3;
                gl0 gl0Var = hl0Var.Z0;
                if (gl0Var != null) {
                    gl0Var.b(3);
                    return;
                }
                return;
            default:
                hl0.h0(this.f46022b, this.f46023c);
                return;
        }
    }
}
