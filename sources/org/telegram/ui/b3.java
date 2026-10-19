package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f21582b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f21582b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f39750f;
            m3Var.L();
            this.f21582b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f21582b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f21582b.getTitle();
                this.F = this.f21582b.getFavicon();
                this.f21600x = this.f21582b.getUrl();
                this.f21594q = o3Var.f39754w;
                this.f21595r = o3Var.f39755x;
            }
        }
    }
}
