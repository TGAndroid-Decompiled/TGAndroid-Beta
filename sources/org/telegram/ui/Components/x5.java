package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class x5 {
    public ArrayList f32868a;
    public HashMap f32869b;
    public ArrayList f32870c;

    public final void a() {
        ArrayList arrayList = this.f32868a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((w5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        w5 w5Var = (w5) this.f32868a.remove(i10);
        HashMap hashMap = this.f32869b;
        z5 z5Var = (z5) hashMap.get(w5Var.f32632c);
        if (z5Var != null) {
            ArrayList arrayList = z5Var.f33559b;
            arrayList.remove(w5Var);
            z5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(w5Var.f32632c);
                this.f32870c.remove(z5Var);
            }
            s5 s5Var = w5Var.f32634f;
            if (s5Var != null) {
                s5Var.p(w5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
