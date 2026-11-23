package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jk0 implements Runnable {
    public final int f49149a;
    public final kl0 f49150b;
    public final TLObject f49151c;

    public jk0(kl0 kl0Var, TLObject tLObject, int i7) {
        this.f49149a = i7;
        this.f49150b = kl0Var;
        this.f49151c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f49149a) {
            case 0:
                kl0.j0(this.f49150b, this.f49151c);
                return;
            case 1:
                kl0 kl0Var = this.f49150b;
                org.telegram.messenger.w10 w10Var = kl0Var.f49466e1;
                TLObject tLObject = this.f49151c;
                if (w10Var != null) {
                    w10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                kl0Var.J0(false);
                kl0Var.A0 = true;
                kl0Var.N0(true, true);
                org.telegram.ui.Components.nq nqVar = kl0Var.f49482r;
                if (nqVar != null) {
                    nqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = kl0Var.f49477n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    kl0Var.f49477n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.r4 parentLayout = kl0Var.getParentLayout();
                Activity parentActivity = kl0Var.getParentActivity();
                kl0Var.getMessagesController().f25819o7 = new a7(kl0Var, parentLayout, parentActivity, 17);
                WebView webView = kl0Var.f49491x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = kl0Var.f49491x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    kl0Var.f49493y = str;
                    webView2.loadUrl(str);
                }
                kl0Var.f49458b1 = true;
                kl0Var.f49471g1 = 3;
                jl0 jl0Var = kl0Var.f49455a1;
                if (jl0Var != null) {
                    jl0Var.e(3);
                    return;
                }
                return;
            default:
                kl0.h0(this.f49150b, this.f49151c);
                return;
        }
    }
}
