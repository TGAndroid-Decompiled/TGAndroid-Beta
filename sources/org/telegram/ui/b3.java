package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.w0 w0Var = this.f20449b;
        if (w0Var != null && !TextUtils.isEmpty(w0Var.getTitle())) {
            return this.f20449b.getTitle();
        }
        return super.b();
    }

    public final void c(p3 p3Var) {
        if (p3Var != null) {
            n3 n3Var = p3Var.f37161f;
            n3Var.g("preserveWebView");
            n3Var.f39449w0 = true;
            if (n3Var.f39435l0) {
                n3Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.FALSE, "is_visible"));
            }
            this.f20449b = n3Var.getWebView();
            this.d = n3Var.getProxy();
            org.telegram.ui.web.w0 w0Var = this.f20449b;
            if (w0Var != null) {
                w0Var.onPause();
                this.C = this.f20449b.getTitle();
                this.D = this.f20449b.getFavicon();
                this.v = this.f20449b.getUrl();
                this.f20459o = p3Var.f37165w;
                this.f20460p = p3Var.f37166x;
            }
        }
    }
}
