package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class l5 {
    public ArrayList f36714a;
    public HashMap f36715b;
    public ArrayList f36716c;

    public final void a() {
        ArrayList arrayList = this.f36714a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((k5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        k5 k5Var = (k5) this.f36714a.remove(i7);
        HashMap hashMap = this.f36715b;
        n5 n5Var = (n5) hashMap.get(k5Var.f36271c);
        if (n5Var != null) {
            ArrayList arrayList = n5Var.f37453b;
            arrayList.remove(k5Var);
            n5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(k5Var.f36271c);
                this.f36716c.remove(n5Var);
            }
            g5 g5Var = k5Var.f36273f;
            if (g5Var != null) {
                g5Var.o(k5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
