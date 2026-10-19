package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f21580b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f21580b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f39749f;
            m3Var.L();
            this.f21580b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f21580b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f21580b.getTitle();
                this.F = this.f21580b.getFavicon();
                this.f21598x = this.f21580b.getUrl();
                this.f21592q = o3Var.f39753w;
                this.f21593r = o3Var.f39754x;
            }
        }
    }
}
