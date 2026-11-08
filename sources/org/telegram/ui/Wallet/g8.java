package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.hc;
public final class g8 implements v10 {
    public final int f42562a;
    public final n8 f42563b;
    public final vf.b f42564c;
    public final m0 d;

    public g8(n8 n8Var, vf.b bVar, m0 m0Var, int i7) {
        this.f42562a = i7;
        this.f42563b = n8Var;
        this.f42564c = bVar;
        this.d = m0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42562a) {
            case 0:
                j0 j0Var = (j0) obj;
                String str = (String) obj2;
                this.f42564c.c(false);
                n8 n8Var = this.f42563b;
                if (j0Var == null) {
                    hc a02 = hc.a0(n8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                u8 u8Var = new u8();
                u8Var.h = true;
                ArrayList arrayList = u8Var.f43204a;
                arrayList.clear();
                if (!j0Var.d()) {
                    arrayList.addAll(j0Var.f());
                }
                u8Var.a0();
                u8Var.f43208f = new n(n8Var, this.d);
                n8Var.presentFragment(u8Var);
                return;
            default:
                h0 h0Var = (h0) obj;
                String str2 = (String) obj2;
                this.f42564c.c(false);
                n8 n8Var2 = this.f42563b;
                if (h0Var == null) {
                    hc a03 = hc.a0(n8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (n8Var2.f42900f) {
                    h0Var.close();
                    return;
                } else {
                    n8Var2.f42899e.add(h0Var);
                    u8 u8Var2 = new u8();
                    j0 j0Var2 = h0Var.f42577b;
                    ArrayList arrayList2 = u8Var2.f43204a;
                    arrayList2.clear();
                    if (!j0Var2.d()) {
                        arrayList2.addAll(j0Var2.f());
                    }
                    u8Var2.a0();
                    u8Var2.f43208f = new g(n8Var2, this.d, h0Var, 21);
                    n8Var2.presentFragment(u8Var2);
                    return;
                }
        }
    }
}
