package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wc;
public final class z7 implements Utilities.Callback2 {
    public final int f37591a;
    public final h8 f37592b;
    public final qf.c f37593c;
    public final l0 d;

    public z7(h8 h8Var, qf.c cVar, l0 l0Var, int i10) {
        this.f37591a = i10;
        this.f37592b = h8Var;
        this.f37593c = cVar;
        this.d = l0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f37591a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.f37593c.c(false);
                h8 h8Var = this.f37592b;
                if (i0Var == null) {
                    wc b02 = wc.b0(h8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    b02.f0(str, false);
                    return;
                }
                p8 p8Var = new p8();
                p8Var.h = true;
                ArrayList arrayList = p8Var.f37131a;
                arrayList.clear();
                if (!i0Var.e()) {
                    arrayList.addAll(i0Var.g());
                }
                p8Var.W();
                p8Var.f37134f = new a6(5, h8Var, this.d);
                h8Var.presentFragment(p8Var);
                return;
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.f37593c.c(false);
                h8 h8Var2 = this.f37592b;
                if (g0Var == null) {
                    wc b03 = wc.b0(h8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    b03.f0(str2, false);
                    return;
                } else if (h8Var2.f36665f) {
                    g0Var.close();
                    return;
                } else {
                    h8Var2.e.add(g0Var);
                    p8 p8Var2 = new p8();
                    i0 i0Var2 = g0Var.f36610b;
                    ArrayList arrayList2 = p8Var2.f37131a;
                    arrayList2.clear();
                    if (!i0Var2.e()) {
                        arrayList2.addAll(i0Var2.g());
                    }
                    p8Var2.W();
                    p8Var2.f37134f = new h(h8Var2, this.d, g0Var, 19);
                    h8Var2.presentFragment(p8Var2);
                    return;
                }
        }
    }
}
