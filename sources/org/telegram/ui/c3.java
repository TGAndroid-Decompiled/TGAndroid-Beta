package org.telegram.ui;

import android.text.TextUtils;
public final class c3 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.v0 v0Var = this.f23620b;
        if (v0Var != null && !TextUtils.isEmpty(v0Var.getTitle())) {
            return this.f23620b.getTitle();
        }
        return super.b();
    }

    public final void c(p3 p3Var) {
        if (p3Var != null) {
            n3 n3Var = p3Var.f41323f;
            n3Var.g("preserveWebView");
            n3Var.f44098v0 = true;
            if (n3Var.f44085k0) {
                n3Var.v("visibility_changed", org.telegram.ui.web.y0.x(Boolean.FALSE, "is_visible"));
            }
            this.f23620b = n3Var.getWebView();
            this.d = n3Var.getProxy();
            org.telegram.ui.web.v0 v0Var = this.f23620b;
            if (v0Var != null) {
                v0Var.onPause();
                this.C = this.f23620b.getTitle();
                this.D = this.f23620b.getFavicon();
                this.v = this.f23620b.getUrl();
                this.f23631o = p3Var.f41327w;
                this.f23632p = p3Var.f41328x;
            }
        }
    }
}
