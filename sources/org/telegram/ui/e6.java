package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
public final class e6 implements Runnable {
    public final int f46566a;
    public final y6 f46567b;
    public final ArrayList f46568c;
    public final ArrayList d;
    public final ArrayList f46569e;
    public final ei.c f46570f;

    public e6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ei.c cVar, int i7) {
        this.f46566a = i7;
        this.f46567b = y6Var;
        this.f46568c = arrayList;
        this.d = arrayList2;
        this.f46569e = arrayList3;
        this.f46570f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        switch (this.f46566a) {
            case 0:
                y6 y6Var = this.f46567b;
                ArrayList arrayList = this.f46568c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f46569e;
                ei.c cVar = this.f46570f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i7 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                while (i7 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i7)).f51114c <= 0) {
                        arrayList3.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.gl(26));
                org.telegram.messenger.g0.h3(new e6(y6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                y6 y6Var2 = this.f46567b;
                ArrayList arrayList6 = this.f46568c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.f46569e;
                ei.c cVar2 = this.f46570f;
                boolean z13 = true;
                y6Var2.getMessagesController().Y3(arrayList6, true);
                y6Var2.getMessagesController().S3(arrayList7, true);
                boolean z14 = false;
                s6 s6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i10);
                    if (y6Var2.getMessagesController().e2(s6Var2.f51112a) == null) {
                        s6Var2.f51112a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i11);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z14);
                                    if (t6Var2 == null) {
                                        t6Var2 = new t6();
                                        sparseArray.put(keyAt, t6Var2);
                                    }
                                    t6Var.getClass();
                                    s6 s6Var3 = s6Var;
                                    t6Var2.f51389a += t6Var.f51389a;
                                    s6Var3.f51114c += t6Var.f51389a;
                                    t6Var2.f51390b.addAll(t6Var.f51390b);
                                    i11++;
                                    s6Var = s6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    s6Var.f51113b += s6Var2.f51113b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            s6Var = s6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new org.telegram.messenger.gl(26));
                        }
                    } else {
                        z11 = z13;
                    }
                    i10++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                cVar2.f10653b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f10654c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.f51112a, s6Var4);
                }
                if (!y6.f53434i0) {
                    y6Var2.f53446e0 = cVar2;
                    j6 j6Var = y6Var2.N;
                    if (j6Var != null) {
                        j6Var.setCacheModel(cVar2);
                    }
                    y6Var2.A0(z15);
                    y6Var2.y0();
                    if (y6Var2.Y != null && !y6Var2.L && System.currentTimeMillis() - y6Var2.f53441b0 > 120) {
                        l6 l6Var = y6Var2.Y;
                        long j3 = y6Var2.H;
                        if (j3 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j10 = y6Var2.I;
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        float f11 = 0.0f;
                        if (i13 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j3) / ((float) j10);
                        }
                        long j11 = y6Var2.J;
                        if (j11 > 0 && i13 > 0) {
                            f11 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        l6Var.b(f10, f11, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
