package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.hc;
import org.telegram.ui.wb1;
public final class f8 implements v10 {
    public final int f42480a;
    public final m8 f42481b;
    public final vf.b f42482c;
    public final l0 d;

    public f8(m8 m8Var, vf.b bVar, l0 l0Var, int i7) {
        this.f42480a = i7;
        this.f42481b = m8Var;
        this.f42482c = bVar;
        this.d = l0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42480a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.f42482c.c(false);
                m8 m8Var = this.f42481b;
                if (i0Var == null) {
                    hc a02 = hc.a0(m8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                t8 t8Var = new t8();
                t8Var.h = true;
                ArrayList arrayList = t8Var.f43122a;
                arrayList.clear();
                if (!i0Var.d()) {
                    arrayList.addAll(i0Var.f());
                }
                t8Var.a0();
                t8Var.f43126f = new wb1(23, m8Var, this.d);
                m8Var.presentFragment(t8Var);
                return;
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.f42482c.c(false);
                m8 m8Var2 = this.f42481b;
                if (g0Var == null) {
                    hc a03 = hc.a0(m8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (m8Var2.f42818f) {
                    g0Var.close();
                    return;
                } else {
                    m8Var2.f42817e.add(g0Var);
                    t8 t8Var2 = new t8();
                    i0 i0Var2 = g0Var.f42496b;
                    ArrayList arrayList2 = t8Var2.f43122a;
                    arrayList2.clear();
                    if (!i0Var2.d()) {
                        arrayList2.addAll(i0Var2.f());
                    }
                    t8Var2.a0();
                    t8Var2.f43126f = new g(m8Var2, this.d, g0Var, 21);
                    m8Var2.presentFragment(t8Var2);
                    return;
                }
        }
    }
}
