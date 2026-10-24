package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class u5 {
    public ArrayList f31019a;
    public HashMap f31020b;
    public ArrayList f31021c;

    public final void a() {
        ArrayList arrayList = this.f31019a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        t5 t5Var = (t5) this.f31019a.remove(i10);
        HashMap hashMap = this.f31020b;
        w5 w5Var = (w5) hashMap.get(t5Var.f30726c);
        if (w5Var != null) {
            ArrayList arrayList = w5Var.f32130b;
            arrayList.remove(t5Var);
            w5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(t5Var.f30726c);
                this.f31021c.remove(w5Var);
            }
            p5 p5Var = t5Var.f30727f;
            if (p5Var != null) {
                p5Var.p(t5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
