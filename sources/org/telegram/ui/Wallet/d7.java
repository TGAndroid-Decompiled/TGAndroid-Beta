package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.wg1;
public final class d7 implements Utilities.Callback2 {
    public final int f32795a;
    public final l7 f32796b;
    public final pf.c f32797c;
    public final k0 d;

    public d7(l7 l7Var, pf.c cVar, k0 k0Var, int i10) {
        this.f32795a = i10;
        this.f32796b = l7Var;
        this.f32797c = cVar;
        this.d = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f32795a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f32797c.c(false);
                l7 l7Var = this.f32796b;
                if (h0Var == null) {
                    zc a02 = zc.a0(l7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                p7 p7Var = new p7();
                p7Var.h = true;
                ArrayList arrayList = p7Var.f33348a;
                arrayList.clear();
                if (!h0Var.e()) {
                    arrayList.addAll(h0Var.g());
                }
                p7Var.V();
                p7Var.f33351f = new wg1(23, l7Var, this.d);
                l7Var.presentFragment(p7Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f32797c.c(false);
                l7 l7Var2 = this.f32796b;
                if (f0Var == null) {
                    zc a03 = zc.a0(l7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (l7Var2.e) {
                    f0Var.close();
                    return;
                } else {
                    l7Var2.d.add(f0Var);
                    p7 p7Var2 = new p7();
                    h0 h0Var2 = f0Var.f32887b;
                    ArrayList arrayList2 = p7Var2.f33348a;
                    arrayList2.clear();
                    if (!h0Var2.e()) {
                        arrayList2.addAll(h0Var2.g());
                    }
                    p7Var2.V();
                    p7Var2.f33351f = new l(l7Var2, this.d, f0Var);
                    l7Var2.presentFragment(p7Var2);
                    return;
                }
        }
    }
}
