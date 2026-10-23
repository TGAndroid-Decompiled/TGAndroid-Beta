package org.telegram.ui;

import android.text.TextUtils;
public final class a3 extends org.telegram.ui.ActionBar.p3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21755b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21755b.getTitle();
        }
        return super.b();
    }

    public final void c(n3 n3Var) {
        if (n3Var != null) {
            l3 l3Var = n3Var.f39754f;
            l3Var.L();
            this.f21755b = l3Var.getWebView();
            this.d = l3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21755b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21755b.getTitle();
                this.F = this.f21755b.getFavicon();
                this.f21773x = this.f21755b.getUrl();
                this.f21767q = n3Var.f39758w;
                this.f21768r = n3Var.f39759x;
            }
        }
    }
}
