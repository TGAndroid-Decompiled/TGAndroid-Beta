package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f21583b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f21583b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f39755f;
            m3Var.L();
            this.f21583b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f21583b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f21583b.getTitle();
                this.F = this.f21583b.getFavicon();
                this.f21601x = this.f21583b.getUrl();
                this.f21595q = o3Var.f39759w;
                this.f21596r = o3Var.f39760x;
            }
        }
    }
}
