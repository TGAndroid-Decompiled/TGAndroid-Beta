package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nl0 implements Runnable {
    public final int f39926a;
    public final qm0 f39927b;
    public final TLObject f39928c;

    public nl0(qm0 qm0Var, TLObject tLObject, int i10) {
        this.f39926a = i10;
        this.f39927b = qm0Var;
        this.f39928c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39926a) {
            case 0:
                qm0.j0(this.f39927b, this.f39928c);
                return;
            case 1:
                qm0 qm0Var = this.f39927b;
                org.telegram.messenger.r20 r20Var = qm0Var.f40822d1;
                TLObject tLObject = this.f39928c;
                if (r20Var != null) {
                    r20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                qm0Var.J0(false);
                qm0Var.f40852z0 = true;
                qm0Var.N0(true, true);
                org.telegram.ui.Components.iq iqVar = qm0Var.f40839r;
                if (iqVar != null) {
                    iqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.t0 t0Var = qm0Var.f40834n;
                if (t0Var != null) {
                    t0Var.setEnabled(false);
                    qm0Var.f40834n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.z4 parentLayout = qm0Var.getParentLayout();
                Activity parentActivity = qm0Var.getParentActivity();
                qm0Var.getMessagesController().f19189m7 = new a7(qm0Var, parentLayout, parentActivity, 17);
                WebView webView = qm0Var.f40848x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = qm0Var.f40848x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    qm0Var.f40850y = str;
                    webView2.loadUrl(str);
                }
                qm0Var.f40814a1 = true;
                qm0Var.f40827f1 = 3;
                pm0 pm0Var = qm0Var.Z0;
                if (pm0Var != null) {
                    pm0Var.e(3);
                    return;
                }
                return;
            default:
                qm0.h0(this.f39927b, this.f39928c);
                return;
        }
    }
}
