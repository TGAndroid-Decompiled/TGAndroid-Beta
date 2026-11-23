package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
public final class q implements org.telegram.messenger.w10 {
    public final int f51199a;
    public final g4 f51200b;

    public q(g4 g4Var, int i7) {
        this.f51199a = i7;
        this.f51200b = g4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51199a) {
            case 0:
                g4 g4Var = this.f51200b;
                bi.v2 v2Var = g4Var.f48080r0;
                float f10 = -((Integer) obj).intValue();
                g4Var.f48079q0 = f10;
                v2Var.setTranslationY(((1.0f - g4Var.f48062a1) * org.telegram.messenger.g0.L(51.0f)) + f10);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    g4 g4Var2 = this.f51200b;
                    g4Var2.f48072i0.f53414c0.setText(str);
                    di.q qVar = g4Var2.f48072i0.f53414c0;
                    qVar.setSelection(qVar.getText().length());
                    org.telegram.messenger.g0.I3(g4Var2.f48072i0.f53414c0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                g4 g4Var3 = this.f51200b;
                if (g4Var3.M != null && str2 != null) {
                    g4Var3.f48072i0.k(false);
                    if (vf.c.g(Uri.parse(str2), false, null)) {
                        t3 t3Var = g4Var3.L;
                        if (t3Var != null) {
                            t3Var.a(true);
                        }
                        vf.c.l(g4Var3.M, str2, false, false, null);
                        return;
                    } else if (!vf.c.m(g4Var3.M, str2, false)) {
                        k3 k3Var = g4Var3.f48084v0[0];
                        if (k3Var != null && k3Var.getWebView() != null) {
                            g4Var3.f48084v0[0].getWebView().loadUrl(str2);
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
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                g4 g4Var4 = this.f51200b;
                if (g4Var4.M != null && w0Var != null) {
                    g4Var4.f48072i0.k(false);
                    k3 k3Var2 = g4Var4.f48084v0[0];
                    if (k3Var2 != null && k3Var2.getWebView() != null) {
                        g4Var4.f48084v0[0].getWebView().e(w0Var.f53620c, w0Var.d);
                        return;
                    } else {
                        vf.c.o(w0Var.f53620c);
                        return;
                    }
                }
                return;
        }
    }
}
