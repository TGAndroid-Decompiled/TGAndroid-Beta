package org.telegram.ui;

import android.text.TextUtils;

public final class d3 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.w0 w0Var = this.f23624b;
        return (w0Var == null || TextUtils.isEmpty(w0Var.getTitle())) ? super.b() : this.f23624b.getTitle();
    }

    public final void c(q3 q3Var) {
        if (q3Var == null) {
            return;
        }
        o3 o3Var = q3Var.f41499f;
        o3Var.g("preserveWebView");
        o3Var.f44085v0 = true;
        if (o3Var.f44072k0) {
            o3Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.FALSE, "is_visible"));
        }
        this.f23624b = o3Var.getWebView();
        this.d = o3Var.getProxy();
        org.telegram.ui.web.w0 w0Var = this.f23624b;
        if (w0Var != null) {
            w0Var.onPause();
            this.C = this.f23624b.getTitle();
            this.D = this.f23624b.getFavicon();
            this.v = this.f23624b.getUrl();
            this.f23635o = q3Var.f41503w;
            this.f23636p = q3Var.f41504x;
        }
    }
}
