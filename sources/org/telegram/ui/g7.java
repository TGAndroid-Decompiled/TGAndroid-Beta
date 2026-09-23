package org.telegram.ui;

import java.util.ArrayList;
public abstract class g7 extends f7 {
    public final ArrayList f33475f;
    public final s7 h;

    public g7(s7 s7Var, int i10) {
        super(i10);
        this.h = s7Var;
        this.f33475f = new ArrayList();
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof o7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f33475f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        zh.b bVar = this.h.f37140f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.e;
            } else if (i10 == 3) {
                arrayList = bVar.f49146f;
            } else if (i10 == 5) {
                arrayList = bVar.f49147g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new og.a(2, true);
                    aVar.d = (zh.a) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
