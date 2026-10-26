package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn0 implements Runnable {
    public final int f40702a;
    public final po0 f40703b;
    public final TLObject f40704c;

    public jn0(po0 po0Var, TLObject tLObject, int i10) {
        this.f40702a = i10;
        this.f40703b = po0Var;
        this.f40704c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40702a) {
            case 0:
                po0.f0(this.f40703b, this.f40704c);
                return;
            case 1:
                po0 po0Var = this.f40703b;
                Utilities.Callback callback = po0Var.f42596d1;
                TLObject tLObject = this.f40704c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                po0Var.E0(false);
                po0Var.f42626z0 = true;
                po0Var.I0(true, true);
                org.telegram.ui.Components.er erVar = po0Var.f42613r;
                if (erVar != null) {
                    erVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = po0Var.f42608n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    po0Var.f42608n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.j5 parentLayout = po0Var.getParentLayout();
                Activity parentActivity = po0Var.getParentActivity();
                po0Var.getMessagesController().newMessageCallback = new e7(po0Var, parentLayout, parentActivity, 17);
                WebView webView = po0Var.f42620w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = po0Var.f42620w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    po0Var.f42622x = str;
                    webView2.loadUrl(str);
                }
                po0Var.f42588a1 = true;
                po0Var.f42601f1 = 3;
                oo0 oo0Var = po0Var.Z0;
                if (oo0Var != null) {
                    oo0Var.a(3);
                    return;
                }
                return;
            default:
                po0.d0(this.f40703b, this.f40704c);
                return;
        }
    }
}
