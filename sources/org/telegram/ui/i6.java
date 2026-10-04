package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class i6 implements org.telegram.ui.Components.xv0, k7 {
    public final a7 f37293a;

    public i6(a7 a7Var) {
        this.f37293a = a7Var;
    }

    @Override
    public void E(boolean z10) {
        le.b bVar = this.f37293a.T;
        if (bVar != null && bVar.f15437f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public float Y0() {
        return org.telegram.messenger.q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + this.f37293a.P, 0);
    }

    @Override
    public void clear() {
        this.f37293a.j0();
    }

    @Override
    public int e1() {
        return this.f37293a.Q;
    }

    @Override
    public void f(u6 u6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        a7 a7Var = this.f37293a;
        if (u6Var != null) {
            if (a7Var.f34692e0.f53569j.size() <= 0 && !z10) {
                if (a7Var.G > 0 && a7Var.getParentActivity() != null) {
                    u6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = u6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((v6) sparseArray.get(0)).f41573b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((v6) sparseArray.get(1)).f41573b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f53565e;
                    if (obj2 != null) {
                        arrayList2.addAll(((v6) sparseArray.get(2)).f41573b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f53566f;
                    if (obj3 != null) {
                        arrayList3.addAll(((v6) sparseArray.get(3)).f41573b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f53567g;
                    if (obj4 != null) {
                        arrayList4.addAll(((v6) sparseArray.get(4)).f41573b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f53569j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f53577r += ((zh.a) arrayList.get(i10)).f53558c;
                        } else {
                            bVar.f53578s += ((zh.a) arrayList.get(i10)).f53558c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f53579t += ((zh.a) arrayList2.get(i11)).f53558c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f53580u += ((zh.a) arrayList3.get(i12)).f53558c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f53558c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f53572m = z11;
                    bVar.f53573n = z11;
                    bVar.f53574o = z11;
                    bVar.f53575p = z11;
                    bVar.f53576q = z11;
                    Collections.sort(arrayList, new gb1(25));
                    Collections.sort(arrayList2, new gb1(25));
                    Collections.sort(arrayList3, new gb1(25));
                    Collections.sort(arrayList4, new gb1(25));
                    Collections.sort(bVar.h, new gb1(25));
                    jv jvVar = new jv(a7Var, u6Var, bVar, new o0.a(a7Var, u6Var, false, 2));
                    a7Var.Z = jvVar;
                    a7Var.showDialog(jvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = a7Var.f34692e0;
            HashSet hashSet2 = bVar2.f53569j;
            HashSet hashSet3 = bVar2.f53571l;
            long j3 = u6Var.f41072a;
            SparseArray sparseArray2 = u6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((v6) sparseArray2.valueAt(i14)).f41573b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f53570k += aVar2.f53558c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((v6) sparseArray2.valueAt(i16)).f41573b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f53570k -= aVar3.f53558c;
                        }
                    }
                }
            }
            bVar2.c();
            a7Var.M.e();
            a7.d0(a7Var);
        } else if (aVar != null) {
            a7Var.f34692e0.i(aVar);
            a7Var.M.e();
            a7.d0(a7Var);
        }
    }

    @Override
    public void i() {
        a7 a7Var = this.f37293a;
        zh.b bVar = a7Var.f34692e0;
        if (bVar != null && bVar.f53569j.size() > 0) {
            a7Var.f34692e0.d();
            k6 k6Var = a7Var.M;
            if (k6Var != null) {
                k6Var.f(false);
                a7Var.M.e();
            }
        }
    }

    @Override
    public void dismiss() {
    }
}
