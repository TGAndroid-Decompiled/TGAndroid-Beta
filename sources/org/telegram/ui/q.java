package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q implements Utilities.Callback {
    public final int f42551a;
    public final j4 f42552b;

    public q(j4 j4Var, int i10) {
        this.f42551a = i10;
        this.f42552b = j4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42551a) {
            case 0:
                j4 j4Var = this.f42552b;
                di.i4 i4Var = j4Var.f40410q0;
                float f7 = -((Integer) obj).intValue();
                j4Var.f40409p0 = f7;
                i4Var.setTranslationY(((1.0f - j4Var.Z0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    j4 j4Var2 = this.f42552b;
                    j4Var2.f40402h0.f44906b0.setText(str);
                    bi.t tVar = j4Var2.f40402h0.f44906b0;
                    tVar.setSelection(tVar.getText().length());
                    AndroidUtilities.showKeyboard(j4Var2.f40402h0.f44906b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                j4 j4Var3 = this.f42552b;
                if (j4Var3.L != null && str2 != null) {
                    j4Var3.f40402h0.k(false);
                    if (qf.d.e(Uri.parse(str2), false, null)) {
                        v3 v3Var = j4Var3.K;
                        if (v3Var != null) {
                            v3Var.dismiss(true);
                        }
                        qf.d.j(j4Var3.L, str2, false, false, null);
                        return;
                    } else if (!qf.d.k(j4Var3.L, str2, false)) {
                        m3 m3Var = j4Var3.f40414u0[0];
                        if (m3Var != null && m3Var.getWebView() != null) {
                            j4Var3.f40414u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            qf.d.m(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                j4 j4Var4 = this.f42552b;
                if (j4Var4.L != null && b1Var != null) {
                    j4Var4.f40402h0.k(false);
                    m3 m3Var2 = j4Var4.f40414u0[0];
                    if (m3Var2 != null && m3Var2.getWebView() != null) {
                        j4Var4.f40414u0[0].getWebView().e(b1Var.f44712c, b1Var.d);
                        return;
                    } else {
                        qf.d.m(b1Var.f44712c);
                        return;
                    }
                }
                return;
        }
    }
}
