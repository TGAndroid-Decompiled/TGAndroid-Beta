package org.telegram.ui;

import java.util.ArrayList;
public abstract class e7 extends d7 {
    public final ArrayList f37708f;
    public final q7 h;

    public e7(q7 q7Var, int i10) {
        super(i10);
        this.h = q7Var;
        this.f37708f = new ArrayList();
    }

    @Override
    public boolean D(f2.n1 n1Var) {
        return !(this instanceof m7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f37708f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f37378e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        kh.b bVar = this.h.f41551f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.f13898e;
            } else if (i10 == 3) {
                arrayList = bVar.f13899f;
            } else if (i10 == 5) {
                arrayList = bVar.f13900g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new zf.a(2, true);
                    aVar.d = (kh.a) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
