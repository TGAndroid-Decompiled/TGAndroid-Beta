package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements Runnable {
    public final int f46684a;
    public final jl0 f46685b;
    public final TLObject f46686c;

    public ik0(jl0 jl0Var, TLObject tLObject, int i7) {
        this.f46684a = i7;
        this.f46685b = jl0Var;
        this.f46686c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f46684a) {
            case 0:
                jl0.j0(this.f46685b, this.f46686c);
                return;
            case 1:
                jl0 jl0Var = this.f46685b;
                org.telegram.messenger.c20 c20Var = jl0Var.f47003d1;
                TLObject tLObject = this.f46686c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                jl0Var.J0(false);
                jl0Var.f47034z0 = true;
                jl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = jl0Var.f47021r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = jl0Var.f47016n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    jl0Var.f47016n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = jl0Var.getParentLayout();
                Activity parentActivity = jl0Var.getParentActivity();
                jl0Var.getMessagesController().f24834l7 = new a7(jl0Var, parentLayout, parentActivity, 17);
                WebView webView = jl0Var.f47030x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = jl0Var.f47030x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    jl0Var.f47032y = str;
                    webView2.loadUrl(str);
                }
                jl0Var.f46995a1 = true;
                jl0Var.f47009f1 = 3;
                il0 il0Var = jl0Var.Z0;
                if (il0Var != null) {
                    il0Var.b(3);
                    return;
                }
                return;
            default:
                jl0.h0(this.f46685b, this.f46686c);
                return;
        }
    }
}
