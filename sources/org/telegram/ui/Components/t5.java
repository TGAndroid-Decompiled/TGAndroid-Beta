package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class t5 {
    public ArrayList f39797a;
    public HashMap f39798b;
    public ArrayList f39799c;

    public final void a() {
        ArrayList arrayList = this.f39797a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((s5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        s5 s5Var = (s5) this.f39797a.remove(i7);
        HashMap hashMap = this.f39798b;
        v5 v5Var = (v5) hashMap.get(s5Var.f39493c);
        if (v5Var != null) {
            ArrayList arrayList = v5Var.f40562b;
            arrayList.remove(s5Var);
            v5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(s5Var.f39493c);
                this.f39799c.remove(v5Var);
            }
            o5 o5Var = s5Var.f39495f;
            if (o5Var != null) {
                o5Var.o(s5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
