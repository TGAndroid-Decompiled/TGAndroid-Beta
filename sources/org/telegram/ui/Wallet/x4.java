package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class x4 implements x10 {
    public final int f45291a;
    public final hi.e f45292b;
    public final org.telegram.ui.ActionBar.w2 f45293c;
    public final org.telegram.ui.ActionBar.h6 d;

    public x4(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f45291a = i7;
        this.f45292b = eVar;
        this.f45293c = w2Var;
        this.d = h6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f45291a) {
            case 0:
                this.f45292b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.f45293c;
                if (!isEmpty) {
                    new lc(w2Var.F, this.d).f0(str, false);
                    return;
                } else {
                    w2Var.dismiss();
                    return;
                }
            default:
                this.f45292b.setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f45293c;
                if (str != null) {
                    new lc(w2Var2.F, this.d).f0(str, false);
                    return;
                } else {
                    w2Var2.dismiss();
                    return;
                }
        }
    }
}
