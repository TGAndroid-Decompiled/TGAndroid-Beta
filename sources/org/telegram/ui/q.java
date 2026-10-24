package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q implements Utilities.Callback {
    public final int f40668a;
    public final k4 f40669b;

    public q(k4 k4Var, int i10) {
        this.f40668a = i10;
        this.f40669b = k4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40668a) {
            case 0:
                k4 k4Var = this.f40669b;
                ci.h4 h4Var = k4Var.f38770q0;
                float f7 = -((Integer) obj).intValue();
                k4Var.f38769p0 = f7;
                h4Var.setTranslationY(((1.0f - k4Var.Z0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    k4 k4Var2 = this.f40669b;
                    k4Var2.f38762h0.f43260b0.setText(str);
                    ai.t tVar = k4Var2.f38762h0.f43260b0;
                    tVar.setSelection(tVar.getText().length());
                    AndroidUtilities.showKeyboard(k4Var2.f38762h0.f43260b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                k4 k4Var3 = this.f40669b;
                if (k4Var3.L != null && str2 != null) {
                    k4Var3.f38762h0.k(false);
                    if (pf.d.e(Uri.parse(str2), false, null)) {
                        w3 w3Var = k4Var3.K;
                        if (w3Var != null) {
                            w3Var.dismiss(true);
                        }
                        pf.d.j(k4Var3.L, str2, false, false, null);
                        return;
                    } else if (!pf.d.k(k4Var3.L, str2, false)) {
                        n3 n3Var = k4Var3.f38774u0[0];
                        if (n3Var != null && n3Var.getWebView() != null) {
                            k4Var3.f38774u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            pf.d.m(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                k4 k4Var4 = this.f40669b;
                if (k4Var4.L != null && c1Var != null) {
                    k4Var4.f38762h0.k(false);
                    n3 n3Var2 = k4Var4.f38774u0[0];
                    if (n3Var2 != null && n3Var2.getWebView() != null) {
                        k4Var4.f38774u0[0].getWebView().e(c1Var.f43078c, c1Var.d);
                        return;
                    } else {
                        pf.d.m(c1Var.f43078c);
                        return;
                    }
                }
                return;
        }
    }
}
