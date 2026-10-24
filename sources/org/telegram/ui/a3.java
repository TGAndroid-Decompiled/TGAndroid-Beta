package org.telegram.ui;

import android.text.TextUtils;
public final class a3 extends org.telegram.ui.ActionBar.p3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21756b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21756b.getTitle();
        }
        return super.b();
    }

    public final void c(n3 n3Var) {
        if (n3Var != null) {
            l3 l3Var = n3Var.f39704f;
            l3Var.L();
            this.f21756b = l3Var.getWebView();
            this.d = l3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21756b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21756b.getTitle();
                this.F = this.f21756b.getFavicon();
                this.f21774x = this.f21756b.getUrl();
                this.f21768q = n3Var.f39708w;
                this.f21769r = n3Var.f39709x;
            }
        }
    }
}
