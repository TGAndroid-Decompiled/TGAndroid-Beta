package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class x5 {
    public ArrayList f32748a;
    public HashMap f32749b;
    public ArrayList f32750c;

    public final void a() {
        ArrayList arrayList = this.f32748a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((w5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        w5 w5Var = (w5) this.f32748a.remove(i10);
        HashMap hashMap = this.f32749b;
        z5 z5Var = (z5) hashMap.get(w5Var.f32547c);
        if (z5Var != null) {
            ArrayList arrayList = z5Var.f33474b;
            arrayList.remove(w5Var);
            z5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(w5Var.f32547c);
                this.f32750c.remove(z5Var);
            }
            s5 s5Var = w5Var.f32549f;
            if (s5Var != null) {
                s5Var.p(w5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
