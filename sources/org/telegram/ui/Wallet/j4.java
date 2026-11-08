package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
public final class j4 implements c20 {
    public final int f42674a;
    public final fi.d f42675b;
    public final org.telegram.ui.ActionBar.v2 f42676c;
    public final org.telegram.ui.ActionBar.f6 d;

    public j4(fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.f42674a = i7;
        this.f42675b = dVar;
        this.f42676c = v2Var;
        this.d = f6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f42674a) {
            case 0:
                this.f42675b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.v2 v2Var = this.f42676c;
                if (!isEmpty) {
                    new hc(v2Var.E, this.d).e0(str, false);
                    return;
                } else {
                    v2Var.dismiss();
                    return;
                }
            default:
                this.f42675b.setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var2 = this.f42676c;
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
