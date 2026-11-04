package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
public final class q implements org.telegram.messenger.u10 {
    public final int f48712a;
    public final i4 f48713b;

    public q(i4 i4Var, int i3) {
        this.f48712a = i3;
        this.f48713b = i4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48712a) {
            case 0:
                i4 i4Var = this.f48713b;
                ai.d2 d2Var = i4Var.f46096r0;
                float f10 = -((Integer) obj).intValue();
                i4Var.f46095q0 = f10;
                d2Var.setTranslationY(((1.0f - i4Var.f46078a1) * org.telegram.messenger.g0.L(51.0f)) + f10);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    i4 i4Var2 = this.f48713b;
                    i4Var2.f46088i0.f50875c0.setText(str);
                    ci.s sVar = i4Var2.f46088i0.f50875c0;
                    sVar.setSelection(sVar.getText().length());
                    org.telegram.messenger.g0.K3(i4Var2.f46088i0.f50875c0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                i4 i4Var3 = this.f48713b;
                if (i4Var3.M != null && str2 != null) {
                    i4Var3.f46088i0.k(false);
                    if (sf.c.g(Uri.parse(str2), false, null)) {
                        u3 u3Var = i4Var3.L;
                        if (u3Var != null) {
                            u3Var.a(true);
                        }
                        sf.c.l(i4Var3.M, str2, false, false, null);
                        return;
                    } else if (!sf.c.m(i4Var3.M, str2, false)) {
                        l3 l3Var = i4Var3.f46100v0[0];
                        if (l3Var != null && l3Var.getWebView() != null) {
                            i4Var3.f46100v0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            sf.c.o(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                i4 i4Var4 = this.f48713b;
                if (i4Var4.M != null && x0Var != null) {
                    i4Var4.f46088i0.k(false);
                    l3 l3Var2 = i4Var4.f46100v0[0];
                    if (l3Var2 != null && l3Var2.getWebView() != null) {
                        i4Var4.f46100v0[0].getWebView().e(x0Var.f51104c, x0Var.d);
                        return;
                    } else {
                        sf.c.o(x0Var.f51104c);
                        return;
                    }
                }
                return;
        }
    }
}
