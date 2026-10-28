package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ln0 implements Runnable {
    public final int f41217a;
    public final ro0 f41218b;
    public final TLObject f41219c;

    public ln0(ro0 ro0Var, TLObject tLObject, int i10) {
        this.f41217a = i10;
        this.f41218b = ro0Var;
        this.f41219c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f41217a) {
            case 0:
                ro0.f0(this.f41218b, this.f41219c);
                return;
            case 1:
                ro0 ro0Var = this.f41218b;
                Utilities.Callback callback = ro0Var.f43107d1;
                TLObject tLObject = this.f41219c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ro0Var.E0(false);
                ro0Var.f43137z0 = true;
                ro0Var.I0(true, true);
                org.telegram.ui.Components.er erVar = ro0Var.f43124r;
                if (erVar != null) {
                    erVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = ro0Var.f43119n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    ro0Var.f43119n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.j5 parentLayout = ro0Var.getParentLayout();
                Activity parentActivity = ro0Var.getParentActivity();
                ro0Var.getMessagesController().newMessageCallback = new e7(ro0Var, parentLayout, parentActivity, 17);
                WebView webView = ro0Var.f43131w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ro0Var.f43131w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ro0Var.f43133x = str;
                    webView2.loadUrl(str);
                }
                ro0Var.f43099a1 = true;
                ro0Var.f43112f1 = 3;
                qo0 qo0Var = ro0Var.Z0;
                if (qo0Var != null) {
                    qo0Var.a(3);
                    return;
                }
                return;
            default:
                ro0.d0(this.f41218b, this.f41219c);
                return;
        }
    }
}
