package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class v5 {
    public ArrayList f31564a;
    public HashMap f31565b;
    public ArrayList f31566c;

    public final void a() {
        ArrayList arrayList = this.f31564a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((u5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        u5 u5Var = (u5) this.f31564a.remove(i10);
        HashMap hashMap = this.f31565b;
        x5 x5Var = (x5) hashMap.get(u5Var.f31291c);
        if (x5Var != null) {
            ArrayList arrayList = x5Var.f32719b;
            arrayList.remove(u5Var);
            x5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(u5Var.f31291c);
                this.f31566c.remove(x5Var);
            }
            q5 q5Var = u5Var.f31293f;
            if (q5Var != null) {
                q5Var.p(u5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
