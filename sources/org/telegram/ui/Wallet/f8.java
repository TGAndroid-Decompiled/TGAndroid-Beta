package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
public final class f8 implements u10 {
    public final int f42549a;
    public final n8 f42550b;

    public f8(n8 n8Var, int i3) {
        this.f42549a = i3;
        this.f42550b = n8Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f42549a;
        n8 n8Var = this.f42550b;
        switch (i3) {
            case 0:
                n8.h0(n8Var, (u10) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    fc.a0(n8Var).e0(str, false);
                    return;
                }
                ac I = fc.a0(n8Var).I(2131623989, bd.M0(2131743198, null), bd.M0(2131743196, null));
                I.f31792j = 5000;
                I.j();
                n8Var.f34298a.f35594g3.O(true);
                return;
            default:
                n8.f0(n8Var, (Boolean) obj);
                return;
        }
    }
}
