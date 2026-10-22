package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class w5 {
    public ArrayList f31972a;
    public HashMap f31973b;
    public ArrayList f31974c;

    public final void a() {
        ArrayList arrayList = this.f31972a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        v5 v5Var = (v5) this.f31972a.remove(i10);
        HashMap hashMap = this.f31973b;
        y5 y5Var = (y5) hashMap.get(v5Var.f31156c);
        if (y5Var != null) {
            ArrayList arrayList = y5Var.f32577b;
            arrayList.remove(v5Var);
            y5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(v5Var.f31156c);
                this.f31974c.remove(y5Var);
            }
            r5 r5Var = v5Var.f31157f;
            if (r5Var != null) {
                r5Var.p(v5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
