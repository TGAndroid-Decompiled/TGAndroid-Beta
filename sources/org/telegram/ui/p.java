package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
public final class p implements org.telegram.messenger.q20 {
    public final int f40403a;
    public final h4 f40404b;

    public p(h4 h4Var, int i10) {
        this.f40403a = i10;
        this.f40404b = h4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40403a) {
            case 0:
                h4 h4Var = this.f40404b;
                org.telegram.ui.Cells.a5 a5Var = h4Var.f37742q0;
                float f7 = -((Integer) obj).intValue();
                h4Var.f37741p0 = f7;
                a5Var.setTranslationY(((1.0f - h4Var.Z0) * org.telegram.messenger.i0.L(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    h4 h4Var2 = this.f40404b;
                    h4Var2.f37734h0.f43095b0.setText(str);
                    zd zdVar = h4Var2.f37734h0.f43095b0;
                    zdVar.setSelection(zdVar.getText().length());
                    org.telegram.messenger.i0.J3(h4Var2.f37734h0.f43095b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                h4 h4Var3 = this.f40404b;
                if (h4Var3.L != null && str2 != null) {
                    h4Var3.f37734h0.k(false);
                    if (gf.f.e(Uri.parse(str2), false, null)) {
                        u3 u3Var = h4Var3.K;
                        if (u3Var != null) {
                            u3Var.a(true);
                        }
                        gf.f.j(h4Var3.L, str2, false, false, null);
                        return;
                    } else if (!gf.f.k(h4Var3.L, str2, false)) {
                        l3 l3Var = h4Var3.f37746u0[0];
                        if (l3Var != null && l3Var.getWebView() != null) {
                            h4Var3.f37746u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            gf.f.m(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                h4 h4Var4 = this.f40404b;
                if (h4Var4.L != null && a1Var != null) {
                    h4Var4.f37734h0.k(false);
                    l3 l3Var2 = h4Var4.f37746u0[0];
                    if (l3Var2 != null && l3Var2.getWebView() != null) {
                        h4Var4.f37746u0[0].getWebView().e(a1Var.f42984c, a1Var.d);
                        return;
                    } else {
                        gf.f.m(a1Var.f42984c);
                        return;
                    }
                }
                return;
        }
    }
}
