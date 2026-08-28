package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends e7 {
    public final ArrayList f38147f;
    public final r7 h;

    public f7(r7 r7Var, int i9) {
        super(i9);
        this.h = r7Var;
        this.f38147f = new ArrayList();
    }

    @Override
    public boolean D(f2.q1 q1Var) {
        return !(this instanceof n7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f38147f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f37834e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        hh.b bVar = this.h.f42294f;
        if (bVar != null) {
            int i9 = this.d;
            if (i9 == 1) {
                arrayList = bVar.d;
            } else if (i9 == 2) {
                arrayList = bVar.f10789e;
            } else if (i9 == 3) {
                arrayList = bVar.f10790f;
            } else if (i9 == 5) {
                arrayList = bVar.f10791g;
            } else if (i9 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ?? aVar = new wf.a(2, true);
                    aVar.d = (hh.a) arrayList.get(i10);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
