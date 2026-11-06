package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
public final class k4 implements c20 {
    public final int f42704a;
    public final fi.d f42705b;
    public final org.telegram.ui.ActionBar.v2 f42706c;
    public final org.telegram.ui.ActionBar.f6 d;

    public k4(fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.f42704a = i7;
        this.f42705b = dVar;
        this.f42706c = v2Var;
        this.d = f6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f42704a) {
            case 0:
                this.f42705b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.v2 v2Var = this.f42706c;
                if (!isEmpty) {
                    new hc(v2Var.E, this.d).e0(str, false);
                    return;
                } else {
                    v2Var.dismiss();
                    return;
                }
            default:
                this.f42705b.setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var2 = this.f42706c;
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
