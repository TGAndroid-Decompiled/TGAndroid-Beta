package org.telegram.ui;

import android.text.TextUtils;
public final class a3 extends org.telegram.ui.ActionBar.p3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f18541b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f18541b.getTitle();
        }
        return super.b();
    }

    public final void c(n3 n3Var) {
        if (n3Var != null) {
            l3 l3Var = n3Var.f35104f;
            l3Var.M();
            this.f18541b = l3Var.getWebView();
            this.d = l3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f18541b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f18541b.getTitle();
                this.F = this.f18541b.getFavicon();
                this.f18559x = this.f18541b.getUrl();
                this.f18553q = n3Var.f35108w;
                this.f18554r = n3Var.f35109x;
            }
        }
    }
}
