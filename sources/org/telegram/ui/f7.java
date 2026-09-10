package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends e7 {
    public final ArrayList f32697f;
    public final r7 h;

    public f7(r7 r7Var, int i10) {
        super(i10);
        this.h = r7Var;
        this.f32697f = new ArrayList();
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof n7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f32697f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        yh.b bVar = this.h.f36246f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.e;
            } else if (i10 == 3) {
                arrayList = bVar.f47175f;
            } else if (i10 == 5) {
                arrayList = bVar.f47176g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new ng.a(2, true);
                    aVar.d = (yh.a) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
