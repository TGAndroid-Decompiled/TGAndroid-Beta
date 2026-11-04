package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class i6 implements org.telegram.ui.Components.dt0, j7 {
    public final z6 f46124a;

    public i6(z6 z6Var) {
        this.f46124a = z6Var;
    }

    @Override
    public void F(boolean z10) {
        qe.a aVar = this.f46124a.U;
        if (aVar != null && aVar.f53841f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public void a(t6 t6Var, di.b bVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = this.f46124a;
        if (t6Var != null) {
            if (z6Var.f52553e0.f9193j.size() <= 0 && !z10) {
                if (z6Var.H > 0 && z6Var.getParentActivity() != null) {
                    t6Var.getClass();
                    boolean z11 = true;
                    di.c cVar = new di.c(true);
                    SparseArray sparseArray = t6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((u6) sparseArray.get(0)).f49986b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((u6) sparseArray.get(1)).f49986b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.f9189e;
                    if (obj2 != null) {
                        arrayList2.addAll(((u6) sparseArray.get(2)).f49986b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f9190f;
                    if (obj3 != null) {
                        arrayList3.addAll(((u6) sparseArray.get(3)).f49986b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f9191g;
                    if (obj4 != null) {
                        arrayList4.addAll(((u6) sparseArray.get(4)).f49986b);
                    }
                    int i3 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f9193j;
                        if (i3 >= size) {
                            break;
                        }
                        hashSet.add((di.b) arrayList.get(i3));
                        if (((di.b) arrayList.get(i3)).d == 0) {
                            cVar.f9201r += ((di.b) arrayList.get(i3)).f9182c;
                        } else {
                            cVar.f9202s += ((di.b) arrayList.get(i3)).f9182c;
                        }
                        i3++;
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        hashSet.add((di.b) arrayList2.get(i10));
                        cVar.f9203t += ((di.b) arrayList2.get(i10)).f9182c;
                    }
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        hashSet.add((di.b) arrayList3.get(i11));
                        cVar.f9204u += ((di.b) arrayList3.get(i11)).f9182c;
                    }
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        hashSet.add((di.b) arrayList4.get(i12));
                        cVar.v += ((di.b) arrayList4.get(i12)).f9182c;
                        i12++;
                        z11 = true;
                    }
                    cVar.f9196m = z11;
                    cVar.f9197n = z11;
                    cVar.f9198o = z11;
                    cVar.f9199p = z11;
                    cVar.f9200q = z11;
                    Collections.sort(arrayList, new a3.u(8));
                    Collections.sort(arrayList2, new a3.u(8));
                    Collections.sort(arrayList3, new a3.u(8));
                    Collections.sort(arrayList4, new a3.u(8));
                    Collections.sort(cVar.h, new a3.u(8));
                    ut utVar = new ut(z6Var, t6Var, cVar, new m2.t(10, z6Var, t6Var));
                    z6Var.f52546a0 = utVar;
                    z6Var.showDialog(utVar);
                    return;
                }
                return;
            }
            di.c cVar2 = z6Var.f52553e0;
            HashSet hashSet2 = cVar2.f9193j;
            HashSet hashSet3 = cVar2.f9195l;
            long j10 = t6Var.f49713a;
            SparseArray sparseArray2 = t6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                    ArrayList arrayList5 = ((u6) sparseArray2.valueAt(i13)).f49986b;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        di.b bVar2 = (di.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f9194k += bVar2.f9182c;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                    ArrayList arrayList6 = ((u6) sparseArray2.valueAt(i15)).f49986b;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        di.b bVar3 = (di.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f9194k -= bVar3.f9182c;
                        }
                    }
                }
            }
            cVar2.c();
            z6Var.N.e();
            z6.i0(z6Var);
        } else if (bVar != null) {
            z6Var.f52553e0.i(bVar);
            z6Var.N.e();
            z6.i0(z6Var);
        }
    }

    @Override
    public void clear() {
        z6.k0(this.f46124a);
    }

    @Override
    public void d() {
        z6 z6Var = this.f46124a;
        di.c cVar = z6Var.f52553e0;
        if (cVar != null && cVar.f9193j.size() > 0) {
            z6Var.f52553e0.d();
            k6 k6Var = z6Var.N;
            if (k6Var != null) {
                k6Var.f(false);
                z6Var.N.e();
            }
        }
    }

    @Override
    public float h1() {
        return k2.p1.d(9.66f, pi.a.d(this.f46124a.Q), 0);
    }

    @Override
    public int m1() {
        return this.f46124a.R;
    }

    @Override
    public void dismiss() {
    }
}
