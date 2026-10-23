package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f21587b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f21587b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f39759f;
            m3Var.L();
            this.f21587b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f21587b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f21587b.getTitle();
                this.F = this.f21587b.getFavicon();
                this.f21605x = this.f21587b.getUrl();
                this.f21599q = o3Var.f39763w;
                this.f21600r = o3Var.f39764x;
            }
        }
    }
}
