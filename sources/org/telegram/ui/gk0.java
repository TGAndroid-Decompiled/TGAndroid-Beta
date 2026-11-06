package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gk0 implements Runnable {
    public final int f45995a;
    public final hl0 f45996b;
    public final TLObject f45997c;

    public gk0(hl0 hl0Var, TLObject tLObject, int i7) {
        this.f45995a = i7;
        this.f45996b = hl0Var;
        this.f45997c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f45995a) {
            case 0:
                hl0.j0(this.f45996b, this.f45997c);
                return;
            case 1:
                hl0 hl0Var = this.f45996b;
                org.telegram.messenger.c20 c20Var = hl0Var.f46397d1;
                TLObject tLObject = this.f45997c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                hl0Var.J0(false);
                hl0Var.f46428z0 = true;
                hl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = hl0Var.f46415r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = hl0Var.f46410n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    hl0Var.f46410n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = hl0Var.getParentLayout();
                Activity parentActivity = hl0Var.getParentActivity();
                hl0Var.getMessagesController().f24819l7 = new a7(hl0Var, parentLayout, parentActivity, 17);
                WebView webView = hl0Var.f46424x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = hl0Var.f46424x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    hl0Var.f46426y = str;
                    webView2.loadUrl(str);
                }
                hl0Var.f46389a1 = true;
                hl0Var.f46403f1 = 3;
                gl0 gl0Var = hl0Var.Z0;
                if (gl0Var != null) {
                    gl0Var.b(3);
                    return;
                }
                return;
            default:
                hl0.h0(this.f45996b, this.f45997c);
                return;
        }
    }
}
