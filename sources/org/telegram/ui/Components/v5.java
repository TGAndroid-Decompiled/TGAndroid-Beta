package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class v5 {
    public ArrayList f28656a;
    public HashMap f28657b;
    public ArrayList f28658c;

    public final void a() {
        ArrayList arrayList = this.f28656a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((u5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        u5 u5Var = (u5) this.f28656a.remove(i10);
        HashMap hashMap = this.f28657b;
        x5 x5Var = (x5) hashMap.get(u5Var.f28412c);
        if (x5Var != null) {
            ArrayList arrayList = x5Var.f29886b;
            arrayList.remove(u5Var);
            x5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(u5Var.f28412c);
                this.f28658c.remove(x5Var);
            }
            q5 q5Var = u5Var.f28413f;
            if (q5Var != null) {
                q5Var.p(u5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
