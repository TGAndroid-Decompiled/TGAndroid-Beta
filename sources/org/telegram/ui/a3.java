package org.telegram.ui;

import android.text.TextUtils;
public final class a3 extends org.telegram.ui.ActionBar.n3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f19650b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f19650b.getTitle();
        }
        return super.b();
    }

    public final void c(n3 n3Var) {
        if (n3Var != null) {
            l3 l3Var = n3Var.f35797f;
            l3Var.M();
            this.f19650b = l3Var.getWebView();
            this.d = l3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f19650b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f19650b.getTitle();
                this.F = this.f19650b.getFavicon();
                this.f19668x = this.f19650b.getUrl();
                this.f19662q = n3Var.f35801w;
                this.f19663r = n3Var.f35802x;
            }
        }
    }
}
