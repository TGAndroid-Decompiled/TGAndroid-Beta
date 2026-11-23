package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kc;
public final class x4 implements w10 {
    public final int f45383a;
    public final hi.e f45384b;
    public final org.telegram.ui.ActionBar.w2 f45385c;
    public final org.telegram.ui.ActionBar.i6 d;

    public x4(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f45383a = i7;
        this.f45384b = eVar;
        this.f45385c = w2Var;
        this.d = i6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f45383a) {
            case 0:
                this.f45384b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.f45385c;
                if (!isEmpty) {
                    new kc(w2Var.F, this.d).f0(str, false);
                    return;
                } else {
                    w2Var.dismiss();
                    return;
                }
            default:
                this.f45384b.setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f45385c;
                if (str != null) {
                    new kc(w2Var2.F, this.d).f0(str, false);
                    return;
                } else {
                    w2Var2.dismiss();
                    return;
                }
        }
    }
}
