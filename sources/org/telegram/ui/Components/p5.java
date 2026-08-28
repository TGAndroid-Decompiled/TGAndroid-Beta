package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class p5 {
    public ArrayList f31544a;
    public HashMap f31545b;
    public ArrayList f31546c;

    public final void a() {
        ArrayList arrayList = this.f31544a;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((o5) arrayList.get(i9)).d.spanDrawn = false;
        }
    }

    public final void b(int i9) {
        o5 o5Var = (o5) this.f31544a.remove(i9);
        HashMap hashMap = this.f31545b;
        r5 r5Var = (r5) hashMap.get(o5Var.f31289c);
        if (r5Var != null) {
            ArrayList arrayList = r5Var.f32084b;
            arrayList.remove(o5Var);
            r5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(o5Var.f31289c);
                this.f31546c.remove(r5Var);
            }
            k5 k5Var = o5Var.f31291f;
            if (k5Var != null) {
                k5Var.p(o5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
