package org.telegram.ui;

import java.util.ArrayList;
public abstract class i7 extends h7 {
    public final ArrayList f37564f;
    public final u7 h;

    public i7(u7 u7Var, int i10) {
        super(i10);
        this.h = u7Var;
        this.f37564f = new ArrayList();
    }

    @Override
    public boolean D(f2.m1 m1Var) {
        return !(this instanceof q7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f37564f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f37232e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        nh.b bVar = this.h.f41734f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.f16254e;
            } else if (i10 == 3) {
                arrayList = bVar.f16255f;
            } else if (i10 == 5) {
                arrayList = bVar.f16256g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? bVar2 = new cg.b(2, true);
                    bVar2.d = (nh.a) arrayList.get(i11);
                    arrayList3.add(bVar2);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
