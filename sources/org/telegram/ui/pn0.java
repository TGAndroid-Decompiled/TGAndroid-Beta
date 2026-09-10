package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pn0 implements Runnable {
    public final int f35882a;
    public final wo0 f35883b;
    public final TLObject f35884c;

    public pn0(wo0 wo0Var, TLObject tLObject, int i10) {
        this.f35882a = i10;
        this.f35883b = wo0Var;
        this.f35884c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35882a) {
            case 0:
                wo0.e0(this.f35883b, this.f35884c);
                return;
            case 1:
                wo0 wo0Var = this.f35883b;
                Utilities.Callback callback = wo0Var.f38264d1;
                TLObject tLObject = this.f35884c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                wo0Var.D0(false);
                wo0Var.f38294z0 = true;
                wo0Var.H0(true, true);
                org.telegram.ui.Components.zq zqVar = wo0Var.f38281r;
                if (zqVar != null) {
                    zqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = wo0Var.f38276n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    wo0Var.f38276n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.f5 parentLayout = wo0Var.getParentLayout();
                Activity parentActivity = wo0Var.getParentActivity();
                wo0Var.getMessagesController().newMessageCallback = new a7(wo0Var, parentLayout, parentActivity, 17);
                WebView webView = wo0Var.f38288w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = wo0Var.f38288w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    wo0Var.f38290x = str;
                    webView2.loadUrl(str);
                }
                wo0Var.f38256a1 = true;
                wo0Var.f38269f1 = 3;
                vo0 vo0Var = wo0Var.Z0;
                if (vo0Var != null) {
                    vo0Var.a(3);
                    return;
                }
                return;
            default:
                wo0.c0(this.f35883b, this.f35884c);
                return;
        }
    }
}
