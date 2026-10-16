package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f20186b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f20186b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f38531f;
            m3Var.L();
            this.f20186b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f20186b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f20186b.getTitle();
                this.F = this.f20186b.getFavicon();
                this.f20204x = this.f20186b.getUrl();
                this.f20198q = o3Var.f38535w;
                this.f20199r = o3Var.f38536x;
            }
        }
    }
}
