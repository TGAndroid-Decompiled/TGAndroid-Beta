package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends e7 {
    public final ArrayList f37466f;
    public final r7 h;

    public f7(r7 r7Var, int i10) {
        super(i10);
        this.h = r7Var;
        this.f37466f = new ArrayList();
    }

    @Override
    public boolean D(s4.d1 d1Var) {
        return !(this instanceof n7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f37466f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f37173e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        zh.b bVar = this.h.f41290f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.f54701e;
            } else if (i10 == 3) {
                arrayList = bVar.f54702f;
            } else if (i10 == 5) {
                arrayList = bVar.f54703g;
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
