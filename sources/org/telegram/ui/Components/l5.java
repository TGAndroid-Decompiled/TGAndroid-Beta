package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class l5 {
    public ArrayList f35600a;
    public HashMap f35601b;
    public ArrayList f35602c;

    public final void a() {
        ArrayList arrayList = this.f35600a;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((k5) arrayList.get(i3)).d.spanDrawn = false;
        }
    }

    public final void b(int i3) {
        k5 k5Var = (k5) this.f35600a.remove(i3);
        HashMap hashMap = this.f35601b;
        n5 n5Var = (n5) hashMap.get(k5Var.f35310c);
        if (n5Var != null) {
            ArrayList arrayList = n5Var.f36377b;
            arrayList.remove(k5Var);
            n5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(k5Var.f35310c);
                this.f35602c.remove(n5Var);
            }
            g5 g5Var = k5Var.f35312f;
            if (g5Var != null) {
                g5Var.o(k5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
