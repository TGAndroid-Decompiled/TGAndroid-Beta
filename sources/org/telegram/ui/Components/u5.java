package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class u5 {
    public ArrayList f40269a;
    public HashMap f40270b;
    public ArrayList f40271c;

    public final void a() {
        ArrayList arrayList = this.f40269a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((t5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        t5 t5Var = (t5) this.f40269a.remove(i7);
        HashMap hashMap = this.f40270b;
        w5 w5Var = (w5) hashMap.get(t5Var.f39774c);
        if (w5Var != null) {
            ArrayList arrayList = w5Var.f41655b;
            arrayList.remove(t5Var);
            w5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(t5Var.f39774c);
                this.f40271c.remove(w5Var);
            }
            p5 p5Var = t5Var.f39776f;
            if (p5Var != null) {
                p5Var.o(t5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
