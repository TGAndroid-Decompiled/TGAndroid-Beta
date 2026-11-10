package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jk0 implements Runnable {
    public final int f47029a;
    public final kl0 f47030b;
    public final TLObject f47031c;

    public jk0(kl0 kl0Var, TLObject tLObject, int i7) {
        this.f47029a = i7;
        this.f47030b = kl0Var;
        this.f47031c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f47029a) {
            case 0:
                kl0.j0(this.f47030b, this.f47031c);
                return;
            case 1:
                kl0 kl0Var = this.f47030b;
                org.telegram.messenger.c20 c20Var = kl0Var.f47335d1;
                TLObject tLObject = this.f47031c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                kl0Var.J0(false);
                kl0Var.f47366z0 = true;
                kl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = kl0Var.f47353r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = kl0Var.f47348n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    kl0Var.f47348n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.r4 parentLayout = kl0Var.getParentLayout();
                Activity parentActivity = kl0Var.getParentActivity();
                kl0Var.getMessagesController().f24838l7 = new a7(kl0Var, parentLayout, parentActivity, 17);
                WebView webView = kl0Var.f47362x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = kl0Var.f47362x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    kl0Var.f47364y = str;
                    webView2.loadUrl(str);
                }
                kl0Var.f47327a1 = true;
                kl0Var.f47341f1 = 3;
                jl0 jl0Var = kl0Var.Z0;
                if (jl0Var != null) {
                    jl0Var.b(3);
                    return;
                }
                return;
            default:
                kl0.h0(this.f47030b, this.f47031c);
                return;
        }
    }
}
