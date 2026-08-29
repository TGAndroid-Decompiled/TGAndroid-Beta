package org.telegram.ui;

import android.text.TextUtils;
public final class d3 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.w0 w0Var = this.f23642b;
        if (w0Var != null && !TextUtils.isEmpty(w0Var.getTitle())) {
            return this.f23642b.getTitle();
        }
        return super.b();
    }

    public final void c(q3 q3Var) {
        if (q3Var != null) {
            o3 o3Var = q3Var.f41516f;
            o3Var.g("preserveWebView");
            o3Var.f44288v0 = true;
            if (o3Var.f44275k0) {
                o3Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.FALSE, "is_visible"));
            }
            this.f23642b = o3Var.getWebView();
            this.d = o3Var.getProxy();
            org.telegram.ui.web.w0 w0Var = this.f23642b;
            if (w0Var != null) {
                w0Var.onPause();
                this.C = this.f23642b.getTitle();
                this.D = this.f23642b.getFavicon();
                this.v = this.f23642b.getUrl();
                this.f23653o = q3Var.f41520w;
                this.f23654p = q3Var.f41521x;
            }
        }
    }
}
