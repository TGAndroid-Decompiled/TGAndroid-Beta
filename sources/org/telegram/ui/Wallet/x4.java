package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
public final class x4 implements y10 {
    public final int f45295a;
    public final hi.e f45296b;
    public final org.telegram.ui.ActionBar.w2 f45297c;
    public final org.telegram.ui.ActionBar.h6 d;

    public x4(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f45295a = i7;
        this.f45296b = eVar;
        this.f45297c = w2Var;
        this.d = h6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f45295a) {
            case 0:
                this.f45296b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.f45297c;
                if (!isEmpty) {
                    new lc(w2Var.F, this.d).f0(str, false);
                    return;
                } else {
                    w2Var.dismiss();
                    return;
                }
            default:
                this.f45296b.setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f45297c;
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
