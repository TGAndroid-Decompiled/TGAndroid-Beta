package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public final class g6 implements org.telegram.ui.Components.et0, i7 {
    public final y6 f45842a;

    public g6(y6 y6Var) {
        this.f45842a = y6Var;
    }

    @Override
    public void F(boolean z9) {
        te.a aVar = this.f45842a.T;
        if (aVar != null && aVar.f55371f != z9) {
            aVar.a(z9, true);
        }
    }

    @Override
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(this.f45842a.P), 0);
    }

    @Override
    public void clear() {
        y6.k0(this.f45842a);
    }

    @Override
    public void d() {
        y6 y6Var = this.f45842a;
        ci.c cVar = y6Var.f52091d0;
        if (cVar != null && cVar.f6430j.size() > 0) {
            y6Var.f52091d0.d();
            i6 i6Var = y6Var.M;
            if (i6Var != null) {
                i6Var.f(false);
                y6Var.M.e();
            }
        }
    }

    @Override
    public int e1() {
        return this.f45842a.Q;
    }

    @Override
    public void o(s6 s6Var, ci.b bVar, boolean z9) {
        HashSet hashSet;
        y6 y6Var = this.f45842a;
        if (s6Var != null) {
            if (y6Var.f52091d0.f6430j.size() <= 0 && !z9) {
                if (y6Var.G > 0 && y6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z10 = true;
                    ci.c cVar = new ci.c(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f49926b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f49926b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.f6426e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f49926b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f6427f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f49926b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f6428g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f49926b);
                    }
                    int i7 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f6430j;
                        if (i7 >= size) {
                            break;
                        }
                        hashSet.add((ci.b) arrayList.get(i7));
                        if (((ci.b) arrayList.get(i7)).d == 0) {
                            cVar.f6438r += ((ci.b) arrayList.get(i7)).f6419c;
                        } else {
                            cVar.f6439s += ((ci.b) arrayList.get(i7)).f6419c;
                        }
                        i7++;
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        hashSet.add((ci.b) arrayList2.get(i10));
                        cVar.f6440t += ((ci.b) arrayList2.get(i10)).f6419c;
                    }
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        hashSet.add((ci.b) arrayList3.get(i11));
                        cVar.f6441u += ((ci.b) arrayList3.get(i11)).f6419c;
                    }
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        hashSet.add((ci.b) arrayList4.get(i12));
                        cVar.v += ((ci.b) arrayList4.get(i12)).f6419c;
                        i12++;
                        z10 = true;
                    }
                    cVar.f6433m = z10;
                    cVar.f6434n = z10;
                    cVar.f6435o = z10;
                    cVar.f6436p = z10;
                    cVar.f6437q = z10;
                    Collections.sort(arrayList, new a3.c(17));
                    Collections.sort(arrayList2, new a3.c(17));
                    Collections.sort(arrayList3, new a3.c(17));
                    Collections.sort(arrayList4, new a3.c(17));
                    Collections.sort(cVar.h, new a3.c(17));
                    wt wtVar = new wt(y6Var, s6Var, cVar, new m4.d0(y6Var, s6Var, false));
                    y6Var.Z = wtVar;
                    y6Var.showDialog(wtVar);
                    return;
                }
                return;
            }
            ci.c cVar2 = y6Var.f52091d0;
            HashSet hashSet2 = cVar2.f6430j;
            HashSet hashSet3 = cVar2.f6432l;
            long j3 = s6Var.f49640a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i13)).f49926b;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        ci.b bVar2 = (ci.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f6431k += bVar2.f6419c;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i15)).f49926b;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        ci.b bVar3 = (ci.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f6431k -= bVar3.f6419c;
                        }
                    }
                }
            }
            cVar2.c();
            y6Var.M.e();
            y6.i0(y6Var);
        } else if (bVar != null) {
            y6Var.f52091d0.i(bVar);
            y6Var.M.e();
            y6.i0(y6Var);
        }
    }

    @Override
    public void dismiss() {
    }
}
