package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.cc;
public final class o4 implements z10 {
    public final int f44234a;
    public final hi.d f44235b;
    public final org.telegram.ui.ActionBar.u2 f44236c;
    public final org.telegram.ui.ActionBar.e6 d;

    public o4(hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.f44234a = i7;
        this.f44235b = dVar;
        this.f44236c = u2Var;
        this.d = e6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f44234a) {
            case 0:
                this.f44235b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.u2 u2Var = this.f44236c;
                if (!isEmpty) {
                    new cc(u2Var.F, this.d).e0(str, false);
                    return;
                } else {
                    u2Var.dismiss();
                    return;
                }
            default:
                this.f44235b.setLoading(false);
                org.telegram.ui.ActionBar.u2 u2Var2 = this.f44236c;
                if (str != null) {
                    new cc(u2Var2.F, this.d).e0(str, false);
                    return;
                } else {
                    u2Var2.dismiss();
                    return;
                }
        }
    }
}
