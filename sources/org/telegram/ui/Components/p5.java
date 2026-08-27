package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

public final class p5 {

    public ArrayList f31503a;

    public HashMap f31504b;

    public ArrayList f31505c;

    public final void a() {
        ArrayList arrayList = this.f31503a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((o5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        o5 o5Var = (o5) this.f31503a.remove(i10);
        HashMap map = this.f31504b;
        r5 r5Var = (r5) map.get(o5Var.f31158c);
        if (r5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = r5Var.f32084b;
        arrayList.remove(o5Var);
        r5Var.a();
        if (arrayList.isEmpty()) {
            map.remove(o5Var.f31158c);
            this.f31505c.remove(r5Var);
        }
        k5 k5Var = o5Var.f31160f;
        if (k5Var != null) {
            k5Var.p(o5Var);
        }
    }
}
