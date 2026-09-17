package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class v5 {
    public ArrayList f31094a;
    public HashMap f31095b;
    public ArrayList f31096c;

    public final void a() {
        ArrayList arrayList = this.f31094a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((u5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        u5 u5Var = (u5) this.f31094a.remove(i10);
        HashMap hashMap = this.f31095b;
        x5 x5Var = (x5) hashMap.get(u5Var.f30813c);
        if (x5Var != null) {
            ArrayList arrayList = x5Var.f32430b;
            arrayList.remove(u5Var);
            x5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(u5Var.f30813c);
                this.f31096c.remove(x5Var);
            }
            q5 q5Var = u5Var.f30815f;
            if (q5Var != null) {
                q5Var.p(u5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
