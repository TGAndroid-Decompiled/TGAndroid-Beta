package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck0 implements Runnable {
    public final int f44381a;
    public final dl0 f44382b;
    public final TLObject f44383c;

    public ck0(dl0 dl0Var, TLObject tLObject, int i3) {
        this.f44381a = i3;
        this.f44382b = dl0Var;
        this.f44383c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f44381a) {
            case 0:
                dl0.j0(this.f44382b, this.f44383c);
                return;
            case 1:
                dl0 dl0Var = this.f44382b;
                org.telegram.messenger.u10 u10Var = dl0Var.f44749e1;
                TLObject tLObject = this.f44383c;
                if (u10Var != null) {
                    u10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                dl0Var.J0(false);
                dl0Var.A0 = true;
                dl0Var.N0(true, true);
                org.telegram.ui.Components.aq aqVar = dl0Var.f44765r;
                if (aqVar != null) {
                    aqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = dl0Var.f44760n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    dl0Var.f44760n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = dl0Var.getParentLayout();
                Activity parentActivity = dl0Var.getParentActivity();
                dl0Var.getMessagesController().f23059l7 = new b7(dl0Var, parentLayout, parentActivity, 17);
                WebView webView = dl0Var.f44774x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = dl0Var.f44774x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    dl0Var.f44776y = str;
                    webView2.loadUrl(str);
                }
                dl0Var.f44741b1 = true;
                dl0Var.f44754g1 = 3;
                cl0 cl0Var = dl0Var.f44738a1;
                if (cl0Var != null) {
                    cl0Var.e(3);
                    return;
                }
                return;
            default:
                dl0.h0(this.f44382b, this.f44383c);
                return;
        }
    }
}
