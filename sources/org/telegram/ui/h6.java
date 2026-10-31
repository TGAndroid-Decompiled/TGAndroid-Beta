package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class h6 implements org.telegram.ui.Components.hu0, i7 {
    public final y6 f37761a;

    public h6(y6 y6Var) {
        this.f37761a = y6Var;
    }

    @Override
    public void F(boolean z10) {
        fe.b bVar = this.f37761a.T;
        if (bVar != null && bVar.f7021f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public void a(s6 s6Var, sh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = this.f37761a;
        if (s6Var != null) {
            if (y6Var.f43721d0.f48503j.size() <= 0 && !z10) {
                if (y6Var.G > 0 && y6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    sh.b bVar = new sh.b(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f41742b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f41742b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f41742b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f48500f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f41742b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f48501g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f41742b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f48503j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((sh.a) arrayList.get(i10));
                        if (((sh.a) arrayList.get(i10)).d == 0) {
                            bVar.f48511r += ((sh.a) arrayList.get(i10)).f48494c;
                        } else {
                            bVar.f48512s += ((sh.a) arrayList.get(i10)).f48494c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((sh.a) arrayList2.get(i11));
                        bVar.f48513t += ((sh.a) arrayList2.get(i11)).f48494c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((sh.a) arrayList3.get(i12));
                        bVar.f48514u += ((sh.a) arrayList3.get(i12)).f48494c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((sh.a) arrayList4.get(i13));
                        bVar.v += ((sh.a) arrayList4.get(i13)).f48494c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f48506m = z11;
                    bVar.f48507n = z11;
                    bVar.f48508o = z11;
                    bVar.f48509p = z11;
                    bVar.f48510q = z11;
                    Collections.sort(arrayList, new ex0(17));
                    Collections.sort(arrayList2, new ex0(17));
                    Collections.sort(arrayList3, new ex0(17));
                    Collections.sort(arrayList4, new ex0(17));
                    Collections.sort(bVar.h, new ex0(17));
                    zu zuVar = new zu(y6Var, s6Var, bVar, new m4.c(13, y6Var, s6Var));
                    y6Var.Z = zuVar;
                    y6Var.showDialog(zuVar);
                    return;
                }
                return;
            }
            sh.b bVar2 = y6Var.f43721d0;
            HashSet hashSet2 = bVar2.f48503j;
            HashSet hashSet3 = bVar2.f48505l;
            long j10 = s6Var.f41380a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i14)).f41742b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        sh.a aVar2 = (sh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f48504k += aVar2.f48494c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i16)).f41742b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        sh.a aVar3 = (sh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f48504k -= aVar3.f48494c;
                        }
                    }
                }
            }
            bVar2.c();
            y6Var.M.e();
            y6.h0(y6Var);
        } else if (aVar != null) {
            y6Var.f43721d0.i(aVar);
            y6Var.M.e();
            y6.h0(y6Var);
        }
    }

    @Override
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(this.f37761a.P), 0);
    }

    @Override
    public void clear() {
        y6.j0(this.f37761a);
    }

    @Override
    public void d() {
        y6 y6Var = this.f37761a;
        sh.b bVar = y6Var.f43721d0;
        if (bVar != null && bVar.f48503j.size() > 0) {
            y6Var.f43721d0.d();
            j6 j6Var = y6Var.M;
            if (j6Var != null) {
                j6Var.f(false);
                y6Var.M.e();
            }
        }
    }

    @Override
    public int g1() {
        return this.f37761a.Q;
    }

    @Override
    public void dismiss() {
    }
}
