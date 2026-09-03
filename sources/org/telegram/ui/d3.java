package org.telegram.ui;

import android.text.TextUtils;
public final class d3 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f20424b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f20424b.getTitle();
        }
        return super.b();
    }

    public final void c(r3 r3Var) {
        if (r3Var != null) {
            p3 p3Var = r3Var.f37686f;
            p3Var.M();
            this.f20424b = p3Var.getWebView();
            this.d = p3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f20424b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f20424b.getTitle();
                this.F = this.f20424b.getFavicon();
                this.f20442x = this.f20424b.getUrl();
                this.f20436q = r3Var.f37690w;
                this.f20437r = r3Var.f37691x;
            }
        }
    }
}
