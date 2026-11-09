package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
public final class q implements org.telegram.messenger.c20 {
    public final int f48837a;
    public final g4 f48838b;

    public q(g4 g4Var, int i7) {
        this.f48837a = i7;
        this.f48838b = g4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48837a) {
            case 0:
                g4 g4Var = this.f48838b;
                di.b4 b4Var = g4Var.f45898q0;
                float f10 = -((Integer) obj).intValue();
                g4Var.f45897p0 = f10;
                b4Var.setTranslationY(((1.0f - g4Var.Z0) * org.telegram.messenger.g0.L(51.0f)) + f10);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    g4 g4Var2 = this.f48838b;
                    g4Var2.f45890h0.f51170b0.setText(str);
                    bi.v vVar = g4Var2.f45890h0.f51170b0;
                    vVar.setSelection(vVar.getText().length());
                    org.telegram.messenger.g0.K3(g4Var2.f45890h0.f51170b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                g4 g4Var3 = this.f48838b;
                if (g4Var3.L != null && str2 != null) {
                    g4Var3.f45890h0.k(false);
                    if (vf.c.g(Uri.parse(str2), false, null)) {
                        t3 t3Var = g4Var3.K;
                        if (t3Var != null) {
                            t3Var.a(true);
                        }
                        vf.c.l(g4Var3.L, str2, false, false, null);
                        return;
                    } else if (!vf.c.m(g4Var3.L, str2, false)) {
                        k3 k3Var = g4Var3.f45902u0[0];
                        if (k3Var != null && k3Var.getWebView() != null) {
                            g4Var3.f45902u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            vf.c.o(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                g4 g4Var4 = this.f48838b;
                if (g4Var4.L != null && y0Var != null) {
                    g4Var4.f45890h0.k(false);
                    k3 k3Var2 = g4Var4.f45902u0[0];
                    if (k3Var2 != null && k3Var2.getWebView() != null) {
                        g4Var4.f45902u0[0].getWebView().e(y0Var.f51385c, y0Var.d);
                        return;
                    } else {
                        vf.c.o(y0Var.f51385c);
                        return;
                    }
                }
                return;
        }
    }
}
