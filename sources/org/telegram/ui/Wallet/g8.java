package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ma1;
public final class g8 implements n10 {
    public final int f42583a;
    public final n8 f42584b;
    public final sf.b f42585c;
    public final k0 d;

    public g8(n8 n8Var, sf.b bVar, k0 k0Var, int i3) {
        this.f42583a = i3;
        this.f42584b = n8Var;
        this.f42585c = bVar;
        this.d = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42583a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f42585c.c(false);
                n8 n8Var = this.f42584b;
                if (h0Var == null) {
                    fc a02 = fc.a0(n8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                u8 u8Var = new u8();
                u8Var.h = true;
                ArrayList arrayList = u8Var.f43269a;
                arrayList.clear();
                if (!h0Var.d()) {
                    arrayList.addAll(h0Var.f());
                }
                u8Var.a0();
                u8Var.f43273f = new ma1(27, n8Var, this.d);
                n8Var.presentFragment(u8Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f42585c.c(false);
                n8 n8Var2 = this.f42584b;
                if (f0Var == null) {
                    fc a03 = fc.a0(n8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (n8Var2.f42949f) {
                    f0Var.close();
                    return;
                } else {
                    n8Var2.f42948e.add(f0Var);
                    u8 u8Var2 = new u8();
                    h0 h0Var2 = f0Var.f42508b;
                    ArrayList arrayList2 = u8Var2.f43269a;
                    arrayList2.clear();
                    if (!h0Var2.d()) {
                        arrayList2.addAll(h0Var2.f());
                    }
                    u8Var2.a0();
                    u8Var2.f43273f = new g(n8Var2, this.d, f0Var, 21);
                    n8Var2.presentFragment(u8Var2);
                    return;
                }
        }
    }
}
