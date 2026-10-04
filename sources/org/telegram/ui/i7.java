package org.telegram.ui;

import java.util.ArrayList;
public abstract class i7 extends h7 {
    public final ArrayList f37291f;
    public final v7 h;

    public i7(v7 v7Var, int i10) {
        super(i10);
        this.h = v7Var;
        this.f37291f = new ArrayList();
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof q7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f37291f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f36986e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        zh.b bVar = this.h.f41573f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.f53559e;
            } else if (i10 == 3) {
                arrayList = bVar.f53560f;
            } else if (i10 == 5) {
                arrayList = bVar.f53561g;
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
