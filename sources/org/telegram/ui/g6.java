package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class g6 implements org.telegram.ui.Components.qt0, h7 {
    public final x6 f47929a;

    public g6(x6 x6Var) {
        this.f47929a = x6Var;
    }

    @Override
    public void G(boolean z10) {
        te.a aVar = this.f47929a.U;
        if (aVar != null && aVar.f57666f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(this.f47929a.Q), 0);
    }

    @Override
    public void clear() {
        x6.k0(this.f47929a);
    }

    @Override
    public int j1() {
        return this.f47929a.R;
    }

    @Override
    public void k() {
        x6 x6Var = this.f47929a;
        ei.c cVar = x6Var.f53578e0;
        if (cVar != null && cVar.f10971j.size() > 0) {
            x6Var.f53578e0.d();
            i6 i6Var = x6Var.N;
            if (i6Var != null) {
                i6Var.f(false);
                x6Var.N.e();
            }
        }
    }

    @Override
    public void m(r6 r6Var, ei.b bVar, boolean z10) {
        HashSet hashSet;
        x6 x6Var = this.f47929a;
        if (r6Var != null) {
            if (x6Var.f53578e0.f10971j.size() <= 0 && !z10) {
                if (x6Var.H > 0 && x6Var.getParentActivity() != null) {
                    r6Var.getClass();
                    boolean z11 = true;
                    ei.c cVar = new ei.c(true);
                    SparseArray sparseArray = r6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((s6) sparseArray.get(0)).f51916b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((s6) sparseArray.get(1)).f51916b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.f10967e;
                    if (obj2 != null) {
                        arrayList2.addAll(((s6) sparseArray.get(2)).f51916b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f10968f;
                    if (obj3 != null) {
                        arrayList3.addAll(((s6) sparseArray.get(3)).f51916b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f10969g;
                    if (obj4 != null) {
                        arrayList4.addAll(((s6) sparseArray.get(4)).f51916b);
                    }
                    int i7 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f10971j;
                        if (i7 >= size) {
                            break;
                        }
                        hashSet.add((ei.b) arrayList.get(i7));
                        if (((ei.b) arrayList.get(i7)).d == 0) {
                            cVar.f10979r += ((ei.b) arrayList.get(i7)).f10960c;
                        } else {
                            cVar.f10980s += ((ei.b) arrayList.get(i7)).f10960c;
                        }
                        i7++;
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        hashSet.add((ei.b) arrayList2.get(i10));
                        cVar.f10981t += ((ei.b) arrayList2.get(i10)).f10960c;
                    }
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        hashSet.add((ei.b) arrayList3.get(i11));
                        cVar.f10982u += ((ei.b) arrayList3.get(i11)).f10960c;
                    }
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        hashSet.add((ei.b) arrayList4.get(i12));
                        cVar.v += ((ei.b) arrayList4.get(i12)).f10960c;
                        i12++;
                        z11 = true;
                    }
                    cVar.f10974m = z11;
                    cVar.f10975n = z11;
                    cVar.f10976o = z11;
                    cVar.f10977p = z11;
                    cVar.f10978q = z11;
                    Collections.sort(arrayList, new a3.c(18));
                    Collections.sort(arrayList2, new a3.c(18));
                    Collections.sort(arrayList3, new a3.c(18));
                    Collections.sort(arrayList4, new a3.c(18));
                    Collections.sort(cVar.h, new a3.c(18));
                    au auVar = new au(x6Var, r6Var, cVar, new k8.a(13, x6Var, r6Var));
                    x6Var.f53571a0 = auVar;
                    x6Var.showDialog(auVar);
                    return;
                }
                return;
            }
            ei.c cVar2 = x6Var.f53578e0;
            HashSet hashSet2 = cVar2.f10971j;
            HashSet hashSet3 = cVar2.f10973l;
            long j3 = r6Var.f51495a;
            SparseArray sparseArray2 = r6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                    ArrayList arrayList5 = ((s6) sparseArray2.valueAt(i13)).f51916b;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        ei.b bVar2 = (ei.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f10972k += bVar2.f10960c;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                    ArrayList arrayList6 = ((s6) sparseArray2.valueAt(i15)).f51916b;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        ei.b bVar3 = (ei.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f10972k -= bVar3.f10960c;
                        }
                    }
                }
            }
            cVar2.c();
            x6Var.N.e();
            x6.i0(x6Var);
        } else if (bVar != null) {
            x6Var.f53578e0.i(bVar);
            x6Var.N.e();
            x6.i0(x6Var);
        }
    }

    @Override
    public void dismiss() {
    }
}
