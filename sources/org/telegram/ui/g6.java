package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class g6 implements org.telegram.ui.Components.qt0, h7 {
    public final x6 f47982a;

    public g6(x6 x6Var) {
        this.f47982a = x6Var;
    }

    @Override
    public void G(boolean z10) {
        te.a aVar = this.f47982a.U;
        if (aVar != null && aVar.f57701f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(this.f47982a.Q), 0);
    }

    @Override
    public void clear() {
        x6.k0(this.f47982a);
    }

    @Override
    public int j1() {
        return this.f47982a.R;
    }

    @Override
    public void k() {
        x6 x6Var = this.f47982a;
        ei.c cVar = x6Var.f53656e0;
        if (cVar != null && cVar.f11008j.size() > 0) {
            x6Var.f53656e0.d();
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
        x6 x6Var = this.f47982a;
        if (r6Var != null) {
            if (x6Var.f53656e0.f11008j.size() <= 0 && !z10) {
                if (x6Var.H > 0 && x6Var.getParentActivity() != null) {
                    r6Var.getClass();
                    boolean z11 = true;
                    ei.c cVar = new ei.c(true);
                    SparseArray sparseArray = r6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((s6) sparseArray.get(0)).f51947b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((s6) sparseArray.get(1)).f51947b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.f11004e;
                    if (obj2 != null) {
                        arrayList2.addAll(((s6) sparseArray.get(2)).f51947b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f11005f;
                    if (obj3 != null) {
                        arrayList3.addAll(((s6) sparseArray.get(3)).f51947b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f11006g;
                    if (obj4 != null) {
                        arrayList4.addAll(((s6) sparseArray.get(4)).f51947b);
                    }
                    int i7 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f11008j;
                        if (i7 >= size) {
                            break;
                        }
                        hashSet.add((ei.b) arrayList.get(i7));
                        if (((ei.b) arrayList.get(i7)).d == 0) {
                            cVar.f11016r += ((ei.b) arrayList.get(i7)).f10997c;
                        } else {
                            cVar.f11017s += ((ei.b) arrayList.get(i7)).f10997c;
                        }
                        i7++;
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        hashSet.add((ei.b) arrayList2.get(i10));
                        cVar.f11018t += ((ei.b) arrayList2.get(i10)).f10997c;
                    }
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        hashSet.add((ei.b) arrayList3.get(i11));
                        cVar.f11019u += ((ei.b) arrayList3.get(i11)).f10997c;
                    }
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        hashSet.add((ei.b) arrayList4.get(i12));
                        cVar.v += ((ei.b) arrayList4.get(i12)).f10997c;
                        i12++;
                        z11 = true;
                    }
                    cVar.f11011m = z11;
                    cVar.f11012n = z11;
                    cVar.f11013o = z11;
                    cVar.f11014p = z11;
                    cVar.f11015q = z11;
                    Collections.sort(arrayList, new a3.c(18));
                    Collections.sort(arrayList2, new a3.c(18));
                    Collections.sort(arrayList3, new a3.c(18));
                    Collections.sort(arrayList4, new a3.c(18));
                    Collections.sort(cVar.h, new a3.c(18));
                    au auVar = new au(x6Var, r6Var, cVar, new k8.a(13, x6Var, r6Var));
                    x6Var.f53649a0 = auVar;
                    x6Var.showDialog(auVar);
                    return;
                }
                return;
            }
            ei.c cVar2 = x6Var.f53656e0;
            HashSet hashSet2 = cVar2.f11008j;
            HashSet hashSet3 = cVar2.f11010l;
            long j3 = r6Var.f51464a;
            SparseArray sparseArray2 = r6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                    ArrayList arrayList5 = ((s6) sparseArray2.valueAt(i13)).f51947b;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        ei.b bVar2 = (ei.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f11009k += bVar2.f10997c;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                    ArrayList arrayList6 = ((s6) sparseArray2.valueAt(i15)).f51947b;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        ei.b bVar3 = (ei.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f11009k -= bVar3.f10997c;
                        }
                    }
                }
            }
            cVar2.c();
            x6Var.N.e();
            x6.i0(x6Var);
        } else if (bVar != null) {
            x6Var.f53656e0.i(bVar);
            x6Var.N.e();
            x6.i0(x6Var);
        }
    }

    @Override
    public void dismiss() {
    }
}
