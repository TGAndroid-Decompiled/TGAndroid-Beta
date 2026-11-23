package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class u5 {
    public ArrayList f40244a;
    public HashMap f40245b;
    public ArrayList f40246c;

    public final void a() {
        ArrayList arrayList = this.f40244a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((t5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        t5 t5Var = (t5) this.f40244a.remove(i7);
        HashMap hashMap = this.f40245b;
        w5 w5Var = (w5) hashMap.get(t5Var.f39721c);
        if (w5Var != null) {
            ArrayList arrayList = w5Var.f41622b;
            arrayList.remove(t5Var);
            w5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(t5Var.f39721c);
                this.f40246c.remove(w5Var);
            }
            p5 p5Var = t5Var.f39723f;
            if (p5Var != null) {
                p5Var.o(t5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
