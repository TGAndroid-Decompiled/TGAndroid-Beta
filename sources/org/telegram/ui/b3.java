package org.telegram.ui;

import android.text.TextUtils;
public final class b3 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f20486b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f20486b.getTitle();
        }
        return super.b();
    }

    public final void c(o3 o3Var) {
        if (o3Var != null) {
            m3 m3Var = o3Var.f38849f;
            m3Var.L();
            this.f20486b = m3Var.getWebView();
            this.d = m3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f20486b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f20486b.getTitle();
                this.F = this.f20486b.getFavicon();
                this.f20504x = this.f20486b.getUrl();
                this.f20498q = o3Var.f38853w;
                this.f20499r = o3Var.f38854x;
            }
        }
    }
}
