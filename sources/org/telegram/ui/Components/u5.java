package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class u5 {
    public ArrayList f33139a;
    public HashMap f33140b;
    public ArrayList f33141c;

    public final void a() {
        ArrayList arrayList = this.f33139a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        t5 t5Var = (t5) this.f33139a.remove(i10);
        HashMap hashMap = this.f33140b;
        w5 w5Var = (w5) hashMap.get(t5Var.f32871c);
        if (w5Var != null) {
            ArrayList arrayList = w5Var.f34315b;
            arrayList.remove(t5Var);
            w5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(t5Var.f32871c);
                this.f33141c.remove(w5Var);
            }
            p5 p5Var = t5Var.f32873f;
            if (p5Var != null) {
                p5Var.p(t5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
