package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.sb1;
public final class i8 implements v10 {
    public final int f42646a;
    public final p8 f42647b;
    public final vf.b f42648c;
    public final l0 d;

    public i8(p8 p8Var, vf.b bVar, l0 l0Var, int i7) {
        this.f42646a = i7;
        this.f42647b = p8Var;
        this.f42648c = bVar;
        this.d = l0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42646a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.f42648c.c(false);
                p8 p8Var = this.f42647b;
                if (i0Var == null) {
                    gc a02 = gc.a0(p8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                w8 w8Var = new w8();
                w8Var.h = true;
                ArrayList arrayList = w8Var.f43302a;
                arrayList.clear();
                if (!i0Var.d()) {
                    arrayList.addAll(i0Var.f());
                }
                w8Var.a0();
                w8Var.f43306f = new sb1(23, p8Var, this.d);
                p8Var.presentFragment(w8Var);
                return;
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.f42648c.c(false);
                p8 p8Var2 = this.f42647b;
                if (g0Var == null) {
                    gc a03 = gc.a0(p8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (p8Var2.f43013f) {
                    g0Var.close();
                    return;
                } else {
                    p8Var2.f43012e.add(g0Var);
                    w8 w8Var2 = new w8();
                    i0 i0Var2 = g0Var.f42518b;
                    ArrayList arrayList2 = w8Var2.f43302a;
                    arrayList2.clear();
                    if (!i0Var2.d()) {
                        arrayList2.addAll(i0Var2.f());
                    }
                    w8Var2.a0();
                    w8Var2.f43306f = new g(p8Var2, this.d, g0Var, 22);
                    p8Var2.presentFragment(w8Var2);
                    return;
                }
        }
    }
}
