package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.fc;
public final class i4 implements u10 {
    public final int f42650a;
    public final gi.d f42651b;
    public final org.telegram.ui.ActionBar.t2 f42652c;
    public final org.telegram.ui.ActionBar.e6 d;

    public i4(gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.f42650a = i3;
        this.f42651b = dVar;
        this.f42652c = t2Var;
        this.d = e6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f42650a) {
            case 0:
                this.f42651b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.t2 t2Var = this.f42652c;
                if (!isEmpty) {
                    new fc(t2Var.F, this.d).e0(str, false);
                    return;
                } else {
                    t2Var.dismiss();
                    return;
                }
            default:
                this.f42651b.setLoading(false);
                org.telegram.ui.ActionBar.t2 t2Var2 = this.f42652c;
                if (str != null) {
                    new fc(t2Var2.F, this.d).e0(str, false);
                    return;
                } else {
                    t2Var2.dismiss();
                    return;
                }
        }
    }
}
