package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
public final class i4 implements c20 {
    public final int f42592a;
    public final fi.d f42593b;
    public final org.telegram.ui.ActionBar.v2 f42594c;
    public final org.telegram.ui.ActionBar.g6 d;

    public i4(fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        this.f42592a = i7;
        this.f42593b = dVar;
        this.f42594c = v2Var;
        this.d = g6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f42592a) {
            case 0:
                this.f42593b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.v2 v2Var = this.f42594c;
                if (!isEmpty) {
                    new hc(v2Var.E, this.d).e0(str, false);
                    return;
                } else {
                    v2Var.dismiss();
                    return;
                }
            default:
                this.f42593b.setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var2 = this.f42594c;
                if (str != null) {
                    new hc(v2Var2.E, this.d).e0(str, false);
                    return;
                } else {
                    v2Var2.dismiss();
                    return;
                }
        }
    }
}
