package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
public final class w4 implements y10 {
    public final int f45221a;
    public final hi.d f45222b;
    public final org.telegram.ui.ActionBar.w2 f45223c;
    public final org.telegram.ui.ActionBar.h6 d;

    public w4(hi.d dVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f45221a = i7;
        this.f45222b = dVar;
        this.f45223c = w2Var;
        this.d = h6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f45221a) {
            case 0:
                this.f45222b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.f45223c;
                if (!isEmpty) {
                    new lc(w2Var.F, this.d).f0(str, false);
                    return;
                } else {
                    w2Var.dismiss();
                    return;
                }
            default:
                this.f45222b.setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f45223c;
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
