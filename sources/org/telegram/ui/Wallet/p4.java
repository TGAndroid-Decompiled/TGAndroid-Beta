package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.gc;
public final class p4 implements c20 {
    public final int f42976a;
    public final fi.d f42977b;
    public final org.telegram.ui.ActionBar.w2 f42978c;
    public final org.telegram.ui.ActionBar.h6 d;

    public p4(fi.d dVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f42976a = i7;
        this.f42977b = dVar;
        this.f42978c = w2Var;
        this.d = h6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f42976a) {
            case 0:
                this.f42977b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.f42978c;
                if (!isEmpty) {
                    new gc(w2Var.E, this.d).e0(str, false);
                    return;
                } else {
                    w2Var.dismiss();
                    return;
                }
            default:
                this.f42977b.setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f42978c;
                if (str != null) {
                    new gc(w2Var2.E, this.d).e0(str, false);
                    return;
                } else {
                    w2Var2.dismiss();
                    return;
                }
        }
    }
}
