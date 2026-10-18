package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21579b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21579b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f39648f;
            m3Var.L();
            this.f21579b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21579b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21579b.getTitle();
                this.F = this.f21579b.getFavicon();
                this.f21597x = this.f21579b.getUrl();
                this.f21591q = o3Var.f39652w;
                this.f21592r = o3Var.f39653x;
            }
        }
    }
}
