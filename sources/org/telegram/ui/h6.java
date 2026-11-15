package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class h6 implements org.telegram.ui.Components.ft0, i7 {
    public final y6 f47619a;

    public h6(y6 y6Var) {
        this.f47619a = y6Var;
    }

    @Override
    public void F(boolean z10) {
        te.a aVar = this.f47619a.U;
        if (aVar != null && aVar.f57082f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public void N(s6 s6Var, ei.b bVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = this.f47619a;
        if (s6Var != null) {
            if (y6Var.f53442e0.f10659j.size() <= 0 && !z10) {
                if (y6Var.H > 0 && y6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    ei.c cVar = new ei.c(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f51389b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f51389b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.f10655e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f51389b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f10656f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f51389b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f10657g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f51389b);
                    }
                    int i7 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f10659j;
                        if (i7 >= size) {
                            break;
                        }
                        hashSet.add((ei.b) arrayList.get(i7));
                        if (((ei.b) arrayList.get(i7)).d == 0) {
                            cVar.f10667r += ((ei.b) arrayList.get(i7)).f10648c;
                        } else {
                            cVar.f10668s += ((ei.b) arrayList.get(i7)).f10648c;
                        }
                        i7++;
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        hashSet.add((ei.b) arrayList2.get(i10));
                        cVar.f10669t += ((ei.b) arrayList2.get(i10)).f10648c;
                    }
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        hashSet.add((ei.b) arrayList3.get(i11));
                        cVar.f10670u += ((ei.b) arrayList3.get(i11)).f10648c;
                    }
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        hashSet.add((ei.b) arrayList4.get(i12));
                        cVar.v += ((ei.b) arrayList4.get(i12)).f10648c;
                        i12++;
                        z11 = true;
                    }
                    cVar.f10662m = z11;
                    cVar.f10663n = z11;
                    cVar.f10664o = z11;
                    cVar.f10665p = z11;
                    cVar.f10666q = z11;
                    Collections.sort(arrayList, new a3.c(18));
                    Collections.sort(arrayList2, new a3.c(18));
                    Collections.sort(arrayList3, new a3.c(18));
                    Collections.sort(arrayList4, new a3.c(18));
                    Collections.sort(cVar.h, new a3.c(18));
                    yt ytVar = new yt(y6Var, s6Var, cVar, new k8.a(13, y6Var, s6Var));
                    y6Var.f53435a0 = ytVar;
                    y6Var.showDialog(ytVar);
                    return;
                }
                return;
            }
            ei.c cVar2 = y6Var.f53442e0;
            HashSet hashSet2 = cVar2.f10659j;
            HashSet hashSet3 = cVar2.f10661l;
            long j3 = s6Var.f51116a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i13)).f51389b;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        ei.b bVar2 = (ei.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f10660k += bVar2.f10648c;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i15)).f51389b;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        ei.b bVar3 = (ei.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f10660k -= bVar3.f10648c;
                        }
                    }
                }
            }
            cVar2.c();
            y6Var.N.e();
            y6.i0(y6Var);
        } else if (bVar != null) {
            y6Var.f53442e0.i(bVar);
            y6Var.N.e();
            y6.i0(y6Var);
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(this.f47619a.Q), 0);
    }

    @Override
    public int b1() {
        return this.f47619a.R;
    }

    @Override
    public void clear() {
        y6.k0(this.f47619a);
    }

    @Override
    public void y() {
        y6 y6Var = this.f47619a;
        ei.c cVar = y6Var.f53442e0;
        if (cVar != null && cVar.f10659j.size() > 0) {
            y6Var.f53442e0.d();
            j6 j6Var = y6Var.N;
            if (j6Var != null) {
                j6Var.f(false);
                y6Var.N.e();
            }
        }
    }

    @Override
    public void dismiss() {
    }
}
