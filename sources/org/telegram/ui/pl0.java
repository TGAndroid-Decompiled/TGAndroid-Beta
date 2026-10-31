package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl0 implements Runnable {
    public final int f40684a;
    public final sm0 f40685b;
    public final TLObject f40686c;

    public pl0(sm0 sm0Var, TLObject tLObject, int i10) {
        this.f40684a = i10;
        this.f40685b = sm0Var;
        this.f40686c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40684a) {
            case 0:
                sm0.i0(this.f40685b, this.f40686c);
                return;
            case 1:
                sm0 sm0Var = this.f40685b;
                org.telegram.messenger.q20 q20Var = sm0Var.f41556d1;
                TLObject tLObject = this.f40686c;
                if (q20Var != null) {
                    q20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                sm0Var.I0(false);
                sm0Var.f41586z0 = true;
                sm0Var.M0(true, true);
                org.telegram.ui.Components.iq iqVar = sm0Var.f41573r;
                if (iqVar != null) {
                    iqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.t0 t0Var = sm0Var.f41568n;
                if (t0Var != null) {
                    t0Var.setEnabled(false);
                    sm0Var.f41568n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.z4 parentLayout = sm0Var.getParentLayout();
                Activity parentActivity = sm0Var.getParentActivity();
                sm0Var.getMessagesController().f18846m7 = new a7(sm0Var, parentLayout, parentActivity, 17);
                WebView webView = sm0Var.f41582x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = sm0Var.f41582x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    sm0Var.f41584y = str;
                    webView2.loadUrl(str);
                }
                sm0Var.f41548a1 = true;
                sm0Var.f41561f1 = 3;
                rm0 rm0Var = sm0Var.Z0;
                if (rm0Var != null) {
                    rm0Var.e(3);
                    return;
                }
                return;
            default:
                sm0.g0(this.f40685b, this.f40686c);
                return;
        }
    }
}
