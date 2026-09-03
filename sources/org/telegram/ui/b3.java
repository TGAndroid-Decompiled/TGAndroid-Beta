package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.n3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f22163b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f22163b.getTitle();
        }
        return super.b();
    }

    public final void c(p3 p3Var) {
        if (p3Var != null) {
            n3 n3Var = p3Var.f39865f;
            n3Var.g("preserveWebView");
            n3Var.f42459w0 = true;
            if (n3Var.f42445l0) {
                n3Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.FALSE, "is_visible"));
            }
            this.f22163b = n3Var.getWebView();
            this.d = n3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f22163b;
            if (x0Var != null) {
                x0Var.onPause();
                this.C = this.f22163b.getTitle();
                this.D = this.f22163b.getFavicon();
                this.v = this.f22163b.getUrl();
                this.f22174o = p3Var.f39869w;
                this.f22175p = p3Var.f39870x;
            }
        }
    }
}
