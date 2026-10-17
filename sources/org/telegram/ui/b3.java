package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f21579b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f21579b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f39635f;
            m3Var.L();
            this.f21579b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f21579b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f21579b.getTitle();
                this.F = this.f21579b.getFavicon();
                this.f21597x = this.f21579b.getUrl();
                this.f21591q = o3Var.f39639w;
                this.f21592r = o3Var.f39640x;
            }
        }
    }
}
