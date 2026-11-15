package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements Runnable {
    public final int f48079a;
    public final jl0 f48080b;
    public final TLObject f48081c;

    public ik0(jl0 jl0Var, TLObject tLObject, int i7) {
        this.f48079a = i7;
        this.f48080b = jl0Var;
        this.f48081c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f48079a) {
            case 0:
                jl0.j0(this.f48080b, this.f48081c);
                return;
            case 1:
                jl0 jl0Var = this.f48080b;
                org.telegram.messenger.z10 z10Var = jl0Var.f48395e1;
                TLObject tLObject = this.f48081c;
                if (z10Var != null) {
                    z10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                jl0Var.J0(false);
                jl0Var.A0 = true;
                jl0Var.N0(true, true);
                org.telegram.ui.Components.hq hqVar = jl0Var.f48411r;
                if (hqVar != null) {
                    hqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = jl0Var.f48406n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    jl0Var.f48406n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.o4 parentLayout = jl0Var.getParentLayout();
                Activity parentActivity = jl0Var.getParentActivity();
                jl0Var.getMessagesController().f25338m7 = new a7(jl0Var, parentLayout, parentActivity, 17);
                WebView webView = jl0Var.f48420x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = jl0Var.f48420x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    jl0Var.f48422y = str;
                    webView2.loadUrl(str);
                }
                jl0Var.f48387b1 = true;
                jl0Var.f48400g1 = 3;
                il0 il0Var = jl0Var.f48384a1;
                if (il0Var != null) {
                    il0Var.e(3);
                    return;
                }
                return;
            default:
                jl0.h0(this.f48080b, this.f48081c);
                return;
        }
    }
}
