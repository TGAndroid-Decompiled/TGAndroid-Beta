package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bn0 implements Runnable {
    public final int f36140a;
    public final io0 f36141b;
    public final TLObject f36142c;

    public bn0(io0 io0Var, TLObject tLObject, int i10) {
        this.f36140a = i10;
        this.f36141b = io0Var;
        this.f36142c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36140a) {
            case 0:
                io0.e0(this.f36141b, this.f36142c);
                return;
            case 1:
                io0 io0Var = this.f36141b;
                Utilities.Callback callback = io0Var.f38297d1;
                TLObject tLObject = this.f36142c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                io0Var.D0(false);
                io0Var.f38327z0 = true;
                io0Var.H0(true, true);
                org.telegram.ui.Components.cr crVar = io0Var.f38314r;
                if (crVar != null) {
                    crVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = io0Var.f38309n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    io0Var.f38309n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.h5 parentLayout = io0Var.getParentLayout();
                Activity parentActivity = io0Var.getParentActivity();
                io0Var.getMessagesController().newMessageCallback = new e7(io0Var, parentLayout, parentActivity, 17);
                WebView webView = io0Var.f38321w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = io0Var.f38321w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    io0Var.f38323x = str;
                    webView2.loadUrl(str);
                }
                io0Var.f38289a1 = true;
                io0Var.f38302f1 = 3;
                ho0 ho0Var = io0Var.Z0;
                if (ho0Var != null) {
                    ho0Var.a(3);
                    return;
                }
                return;
            default:
                io0.c0(this.f36141b, this.f36142c);
                return;
        }
    }
}
