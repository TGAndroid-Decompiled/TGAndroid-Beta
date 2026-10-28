package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class k6 implements org.telegram.ui.Components.jw0, m7 {
    public final c7 f40666a;

    public k6(c7 c7Var) {
        this.f40666a = c7Var;
    }

    @Override
    public void B(boolean z10) {
        oe.b bVar = this.f40666a.T;
        if (bVar != null && bVar.f19326f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + this.f40666a.P, 0);
    }

    @Override
    public int b1() {
        return this.f40666a.Q;
    }

    @Override
    public void clear() {
        c7.g0(this.f40666a);
    }

    @Override
    public void p() {
        c7 c7Var = this.f40666a;
        ci.b bVar = c7Var.f38195e0;
        if (bVar != null && bVar.f6375j.size() > 0) {
            c7Var.f38195e0.d();
            m6 m6Var = c7Var.M;
            if (m6Var != null) {
                m6Var.f(false);
                c7Var.M.e();
            }
        }
    }

    @Override
    public void q(w6 w6Var, ci.a aVar, boolean z10) {
        HashSet hashSet;
        c7 c7Var = this.f40666a;
        if (w6Var != null) {
            if (c7Var.f38195e0.f6375j.size() <= 0 && !z10) {
                if (c7Var.G > 0 && c7Var.getParentActivity() != null) {
                    w6Var.getClass();
                    boolean z11 = true;
                    ci.b bVar = new ci.b(true);
                    SparseArray sparseArray = w6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((x6) sparseArray.get(0)).f45603b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((x6) sparseArray.get(1)).f45603b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((x6) sparseArray.get(2)).f45603b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f6372f;
                    if (obj3 != null) {
                        arrayList3.addAll(((x6) sparseArray.get(3)).f45603b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f6373g;
                    if (obj4 != null) {
                        arrayList4.addAll(((x6) sparseArray.get(4)).f45603b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f6375j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((ci.a) arrayList.get(i10));
                        if (((ci.a) arrayList.get(i10)).d == 0) {
                            bVar.f6383r += ((ci.a) arrayList.get(i10)).f6366c;
                        } else {
                            bVar.f6384s += ((ci.a) arrayList.get(i10)).f6366c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((ci.a) arrayList2.get(i11));
                        bVar.f6385t += ((ci.a) arrayList2.get(i11)).f6366c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((ci.a) arrayList3.get(i12));
                        bVar.f6386u += ((ci.a) arrayList3.get(i12)).f6366c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((ci.a) arrayList4.get(i13));
                        bVar.v += ((ci.a) arrayList4.get(i13)).f6366c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f6378m = z11;
                    bVar.f6379n = z11;
                    bVar.f6380o = z11;
                    bVar.f6381p = z11;
                    bVar.f6382q = z11;
                    Collections.sort(arrayList, new a4.d(6));
                    Collections.sort(arrayList2, new a4.d(6));
                    Collections.sort(arrayList3, new a4.d(6));
                    Collections.sort(arrayList4, new a4.d(6));
                    Collections.sort(bVar.h, new a4.d(6));
                    xu xuVar = new xu(c7Var, w6Var, bVar, new m4.c(c7Var, w6Var, false, 8));
                    c7Var.Z = xuVar;
                    c7Var.showDialog(xuVar);
                    return;
                }
                return;
            }
            ci.b bVar2 = c7Var.f38195e0;
            HashSet hashSet2 = bVar2.f6375j;
            HashSet hashSet3 = bVar2.f6377l;
            long j10 = w6Var.f44525a;
            SparseArray sparseArray2 = w6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((x6) sparseArray2.valueAt(i14)).f45603b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        ci.a aVar2 = (ci.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f6376k += aVar2.f6366c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((x6) sparseArray2.valueAt(i16)).f45603b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        ci.a aVar3 = (ci.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f6376k -= aVar3.f6366c;
                        }
                    }
                }
            }
            bVar2.c();
            c7Var.M.e();
            c7.e0(c7Var);
        } else if (aVar != null) {
            c7Var.f38195e0.i(aVar);
            c7Var.M.e();
            c7.e0(c7Var);
        }
    }

    @Override
    public void dismiss() {
    }
}
