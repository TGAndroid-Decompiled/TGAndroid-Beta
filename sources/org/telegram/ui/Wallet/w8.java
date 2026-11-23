package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
public final class w8 implements w10 {
    public final int f45344a;
    public final e9 f45345b;

    public w8(e9 e9Var, int i7) {
        this.f45344a = i7;
        this.f45345b = e9Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f45344a;
        e9 e9Var = this.f45345b;
        switch (i7) {
            case 0:
                e9.h0(e9Var, (w10) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    kc.b0(e9Var).f0(str, false);
                    return;
                }
                fc I = kc.b0(e9Var).I(2131623990, gd.N0(2131742937, null), gd.N0(2131742935, null));
                I.f35091j = 5000;
                I.j();
                e9Var.f34213a.f35323g3.O(true);
                return;
            default:
                e9.d0(e9Var, (Boolean) obj);
                return;
        }
    }
}
