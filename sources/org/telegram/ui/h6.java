package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class h6 implements org.telegram.ui.Components.iu0, i7 {
    public final y6 f37708a;

    public h6(y6 y6Var) {
        this.f37708a = y6Var;
    }

    @Override
    public void F(boolean z10) {
        fe.b bVar = this.f37708a.T;
        if (bVar != null && bVar.f7022f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public void a(s6 s6Var, sh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = this.f37708a;
        if (s6Var != null) {
            if (y6Var.f43577d0.f48514j.size() <= 0 && !z10) {
                if (y6Var.G > 0 && y6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    sh.b bVar = new sh.b(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f41550b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f41550b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f41550b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f48511f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f41550b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f48512g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f41550b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f48514j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((sh.a) arrayList.get(i10));
                        if (((sh.a) arrayList.get(i10)).d == 0) {
                            bVar.f48522r += ((sh.a) arrayList.get(i10)).f48505c;
                        } else {
                            bVar.f48523s += ((sh.a) arrayList.get(i10)).f48505c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((sh.a) arrayList2.get(i11));
                        bVar.f48524t += ((sh.a) arrayList2.get(i11)).f48505c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((sh.a) arrayList3.get(i12));
                        bVar.f48525u += ((sh.a) arrayList3.get(i12)).f48505c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((sh.a) arrayList4.get(i13));
                        bVar.v += ((sh.a) arrayList4.get(i13)).f48505c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f48517m = z11;
                    bVar.f48518n = z11;
                    bVar.f48519o = z11;
                    bVar.f48520p = z11;
                    bVar.f48521q = z11;
                    Collections.sort(arrayList, new dx0(17));
                    Collections.sort(arrayList2, new dx0(17));
                    Collections.sort(arrayList3, new dx0(17));
                    Collections.sort(arrayList4, new dx0(17));
                    Collections.sort(bVar.h, new dx0(17));
                    yu yuVar = new yu(y6Var, s6Var, bVar, new m4.c(13, y6Var, s6Var));
                    y6Var.Z = yuVar;
                    y6Var.showDialog(yuVar);
                    return;
                }
                return;
            }
            sh.b bVar2 = y6Var.f43577d0;
            HashSet hashSet2 = bVar2.f48514j;
            HashSet hashSet3 = bVar2.f48516l;
            long j10 = s6Var.f41231a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i14)).f41550b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        sh.a aVar2 = (sh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f48515k += aVar2.f48505c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i16)).f41550b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        sh.a aVar3 = (sh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f48515k -= aVar3.f48505c;
                        }
                    }
                }
            }
            bVar2.c();
            y6Var.M.e();
            y6.i0(y6Var);
        } else if (aVar != null) {
            y6Var.f43577d0.i(aVar);
            y6Var.M.e();
            y6.i0(y6Var);
        }
    }

    @Override
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(this.f37708a.P), 0);
    }

    @Override
    public void clear() {
        y6.k0(this.f37708a);
    }

    @Override
    public void d() {
        y6 y6Var = this.f37708a;
        sh.b bVar = y6Var.f43577d0;
        if (bVar != null && bVar.f48514j.size() > 0) {
            y6Var.f43577d0.d();
            j6 j6Var = y6Var.M;
            if (j6Var != null) {
                j6Var.f(false);
                y6Var.M.e();
            }
        }
    }

    @Override
    public int g1() {
        return this.f37708a.Q;
    }

    @Override
    public void dismiss() {
    }
}
