package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class w5 {
    public ArrayList f32013a;
    public HashMap f32014b;
    public ArrayList f32015c;

    public final void a() {
        ArrayList arrayList = this.f32013a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        v5 v5Var = (v5) this.f32013a.remove(i10);
        HashMap hashMap = this.f32014b;
        y5 y5Var = (y5) hashMap.get(v5Var.f31157c);
        if (y5Var != null) {
            ArrayList arrayList = y5Var.f32555b;
            arrayList.remove(v5Var);
            y5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(v5Var.f31157c);
                this.f32015c.remove(y5Var);
            }
            r5 r5Var = v5Var.f31158f;
            if (r5Var != null) {
                r5Var.p(v5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
