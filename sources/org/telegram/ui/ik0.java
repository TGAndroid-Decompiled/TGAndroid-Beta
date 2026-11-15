package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements Runnable {
    public final int f48069a;
    public final kl0 f48070b;
    public final TLObject f48071c;

    public ik0(kl0 kl0Var, TLObject tLObject, int i7) {
        this.f48069a = i7;
        this.f48070b = kl0Var;
        this.f48071c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f48069a) {
            case 0:
                kl0.j0(this.f48070b, this.f48071c);
                return;
            case 1:
                kl0 kl0Var = this.f48070b;
                org.telegram.messenger.z10 z10Var = kl0Var.f48687e1;
                TLObject tLObject = this.f48071c;
                if (z10Var != null) {
                    z10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                kl0Var.J0(false);
                kl0Var.A0 = true;
                kl0Var.N0(true, true);
                org.telegram.ui.Components.hq hqVar = kl0Var.f48703r;
                if (hqVar != null) {
                    hqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = kl0Var.f48698n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    kl0Var.f48698n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.o4 parentLayout = kl0Var.getParentLayout();
                Activity parentActivity = kl0Var.getParentActivity();
                kl0Var.getMessagesController().f25341m7 = new a7(kl0Var, parentLayout, parentActivity, 17);
                WebView webView = kl0Var.f48712x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = kl0Var.f48712x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    kl0Var.f48714y = str;
                    webView2.loadUrl(str);
                }
                kl0Var.f48679b1 = true;
                kl0Var.f48692g1 = 3;
                jl0 jl0Var = kl0Var.f48676a1;
                if (jl0Var != null) {
                    jl0Var.e(3);
                    return;
                }
                return;
            default:
                kl0.h0(this.f48070b, this.f48071c);
                return;
        }
    }
}
