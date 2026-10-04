package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ln0 implements Runnable {
    public final int f38312a;
    public final so0 f38313b;
    public final TLObject f38314c;

    public ln0(so0 so0Var, TLObject tLObject, int i10) {
        this.f38312a = i10;
        this.f38313b = so0Var;
        this.f38314c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f38312a) {
            case 0:
                so0.e0(this.f38313b, this.f38314c);
                return;
            case 1:
                so0 so0Var = this.f38313b;
                Utilities.Callback callback = so0Var.f40556d1;
                TLObject tLObject = this.f38314c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                so0Var.D0(false);
                so0Var.f40587z0 = true;
                so0Var.H0(true, true);
                org.telegram.ui.Components.wq wqVar = so0Var.f40574r;
                if (wqVar != null) {
                    wqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = so0Var.f40569n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    so0Var.f40569n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.c5 parentLayout = so0Var.getParentLayout();
                Activity parentActivity = so0Var.getParentActivity();
                so0Var.getMessagesController().newMessageCallback = new c7(so0Var, parentLayout, parentActivity, 17);
                WebView webView = so0Var.f40581w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = so0Var.f40581w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    so0Var.f40583x = str;
                    webView2.loadUrl(str);
                }
                so0Var.f40548a1 = true;
                so0Var.f40562f1 = 3;
                ro0 ro0Var = so0Var.Z0;
                if (ro0Var != null) {
                    ro0Var.a(3);
                    return;
                }
                return;
            default:
                so0.c0(this.f38313b, this.f38314c);
                return;
        }
    }
}
