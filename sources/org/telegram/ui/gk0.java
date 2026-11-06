package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gk0 implements Runnable {
    public final int f46022a;
    public final hl0 f46023b;
    public final TLObject f46024c;

    public gk0(hl0 hl0Var, TLObject tLObject, int i7) {
        this.f46022a = i7;
        this.f46023b = hl0Var;
        this.f46024c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f46022a) {
            case 0:
                hl0.j0(this.f46023b, this.f46024c);
                return;
            case 1:
                hl0 hl0Var = this.f46023b;
                org.telegram.messenger.c20 c20Var = hl0Var.f46417d1;
                TLObject tLObject = this.f46024c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                hl0Var.J0(false);
                hl0Var.f46448z0 = true;
                hl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = hl0Var.f46435r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = hl0Var.f46430n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    hl0Var.f46430n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = hl0Var.getParentLayout();
                Activity parentActivity = hl0Var.getParentActivity();
                hl0Var.getMessagesController().f24819l7 = new a7(hl0Var, parentLayout, parentActivity, 17);
                WebView webView = hl0Var.f46444x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = hl0Var.f46444x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    hl0Var.f46446y = str;
                    webView2.loadUrl(str);
                }
                hl0Var.f46409a1 = true;
                hl0Var.f46423f1 = 3;
                gl0 gl0Var = hl0Var.Z0;
                if (gl0Var != null) {
                    gl0Var.b(3);
                    return;
                }
                return;
            default:
                hl0.h0(this.f46023b, this.f46024c);
                return;
        }
    }
}
