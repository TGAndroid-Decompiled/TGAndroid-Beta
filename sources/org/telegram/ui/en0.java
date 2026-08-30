package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class en0 implements Runnable {
    public final int f34050a;
    public final jo0 f34051b;
    public final TLObject f34052c;

    public en0(jo0 jo0Var, TLObject tLObject, int i10) {
        this.f34050a = i10;
        this.f34051b = jo0Var;
        this.f34052c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34050a) {
            case 0:
                jo0.e0(this.f34051b, this.f34052c);
                return;
            case 1:
                jo0 jo0Var = this.f34051b;
                Utilities.Callback callback = jo0Var.f35390a1;
                TLObject tLObject = this.f34052c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                jo0Var.D0(false);
                jo0Var.f35420w0 = true;
                jo0Var.H0(true, true);
                org.telegram.ui.Components.rq rqVar = jo0Var.f35412r;
                if (rqVar != null) {
                    rqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = jo0Var.f35407n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    jo0Var.f35407n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.e5 parentLayout = jo0Var.getParentLayout();
                Activity parentActivity = jo0Var.getParentActivity();
                jo0Var.getMessagesController().newMessageCallback = new d7(jo0Var, parentLayout, parentActivity, 17);
                WebView webView = jo0Var.f35419w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = jo0Var.f35419w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    jo0Var.f35421x = str;
                    webView2.loadUrl(str);
                }
                jo0Var.X0 = true;
                jo0Var.f35396c1 = 3;
                io0 io0Var = jo0Var.W0;
                if (io0Var != null) {
                    io0Var.a(3);
                    return;
                }
                return;
            default:
                jo0.c0(this.f34051b, this.f34052c);
                return;
        }
    }
}
