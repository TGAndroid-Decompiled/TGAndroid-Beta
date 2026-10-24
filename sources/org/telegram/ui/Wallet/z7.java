package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vc;
public final class z7 implements Utilities.Callback2 {
    public final int f35509a;
    public final i8 f35510b;
    public final pf.c f35511c;
    public final l0 d;

    public z7(i8 i8Var, pf.c cVar, l0 l0Var, int i10) {
        this.f35509a = i10;
        this.f35510b = i8Var;
        this.f35511c = cVar;
        this.d = l0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f35509a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.f35511c.c(false);
                i8 i8Var = this.f35510b;
                if (i0Var == null) {
                    vc a02 = vc.a0(i8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                q8 q8Var = new q8();
                q8Var.h = true;
                ArrayList arrayList = q8Var.f35081a;
                arrayList.clear();
                if (!i0Var.e()) {
                    arrayList.addAll(i0Var.g());
                }
                q8Var.V();
                q8Var.f35084f = new y3(14, i8Var, this.d);
                i8Var.presentFragment(q8Var);
                return;
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.f35511c.c(false);
                i8 i8Var2 = this.f35510b;
                if (g0Var == null) {
                    vc a03 = vc.a0(i8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (i8Var2.e) {
                    g0Var.close();
                    return;
                } else {
                    i8Var2.d.add(g0Var);
                    q8 q8Var2 = new q8();
                    i0 i0Var2 = g0Var.f34530b;
                    ArrayList arrayList2 = q8Var2.f35081a;
                    arrayList2.clear();
                    if (!i0Var2.e()) {
                        arrayList2.addAll(i0Var2.g());
                    }
                    q8Var2.V();
                    q8Var2.f35084f = new h(i8Var2, this.d, g0Var, 19);
                    i8Var2.presentFragment(q8Var2);
                    return;
                }
        }
    }
}
