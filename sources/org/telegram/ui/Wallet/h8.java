package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.cc;
public final class h8 implements s10 {
    public final int f43943a;
    public final p8 f43944b;
    public final vf.b f43945c;
    public final l0 d;

    public h8(p8 p8Var, vf.b bVar, l0 l0Var, int i7) {
        this.f43943a = i7;
        this.f43944b = p8Var;
        this.f43945c = bVar;
        this.d = l0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f43943a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.f43945c.c(false);
                p8 p8Var = this.f43944b;
                if (i0Var == null) {
                    cc a02 = cc.a0(p8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                w8 w8Var = new w8();
                w8Var.h = true;
                ArrayList arrayList = w8Var.f44656a;
                arrayList.clear();
                if (!i0Var.d()) {
                    arrayList.addAll(i0Var.f());
                }
                w8Var.a0();
                w8Var.f44660f = new r(p8Var, this.d);
                p8Var.presentFragment(w8Var);
                return;
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.f43945c.c(false);
                p8 p8Var2 = this.f43944b;
                if (g0Var == null) {
                    cc a03 = cc.a0(p8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (p8Var2.f44332f) {
                    g0Var.close();
                    return;
                } else {
                    p8Var2.f44331e.add(g0Var);
                    w8 w8Var2 = new w8();
                    i0 i0Var2 = g0Var.f43856b;
                    ArrayList arrayList2 = w8Var2.f44656a;
                    arrayList2.clear();
                    if (!i0Var2.d()) {
                        arrayList2.addAll(i0Var2.f());
                    }
                    w8Var2.a0();
                    w8Var2.f44660f = new g(p8Var2, this.d, g0Var, 22);
                    p8Var2.presentFragment(w8Var2);
                    return;
                }
        }
    }
}
