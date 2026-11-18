package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class w4 implements x10 {
    public final int f45211a;
    public final hi.d f45212b;
    public final org.telegram.ui.ActionBar.x2 f45213c;
    public final org.telegram.ui.ActionBar.i6 d;

    public w4(hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f45211a = i7;
        this.f45212b = dVar;
        this.f45213c = x2Var;
        this.d = i6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f45211a) {
            case 0:
                this.f45212b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.x2 x2Var = this.f45213c;
                if (!isEmpty) {
                    new lc(x2Var.F, this.d).f0(str, false);
                    return;
                } else {
                    x2Var.dismiss();
                    return;
                }
            default:
                this.f45212b.setLoading(false);
                org.telegram.ui.ActionBar.x2 x2Var2 = this.f45213c;
                if (str != null) {
                    new lc(x2Var2.F, this.d).f0(str, false);
                    return;
                } else {
                    x2Var2.dismiss();
                    return;
                }
        }
    }
}
