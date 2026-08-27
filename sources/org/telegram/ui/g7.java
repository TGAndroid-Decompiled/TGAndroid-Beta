package org.telegram.ui;

import java.util.ArrayList;

public abstract class g7 extends f7 {

    public final ArrayList f38328f;
    public final s7 h;

    public g7(s7 s7Var, int i10) {
        super(i10);
        this.h = s7Var;
        this.f38328f = new ArrayList();
    }

    @Override
    public boolean D(f2.o1 o1Var) {
        return !(this instanceof o7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f38328f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f37950e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ih.b bVar = this.h.f42534f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.f11485e;
            } else if (i10 == 3) {
                arrayList = bVar.f11486f;
            } else if (i10 == 5) {
                arrayList = bVar.f11487g;
            } else {
                arrayList = i10 == 4 ? bVar.h : null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ih.a aVar = (ih.a) arrayList.get(i11);
                    m7 m7Var = new m7(2, true);
                    m7Var.d = aVar;
                    arrayList3.add(m7Var);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
