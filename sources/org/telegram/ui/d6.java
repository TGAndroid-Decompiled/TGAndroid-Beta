package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
public final class d6 implements Runnable {
    public final int f36622a;
    public final y6 f36623b;
    public final ArrayList f36624c;
    public final ArrayList d;
    public final ArrayList e;
    public final sh.b f36625f;

    public d6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sh.b bVar, int i10) {
        this.f36622a = i10;
        this.f36623b = y6Var;
        this.f36624c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f36625f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        switch (this.f36622a) {
            case 0:
                y6 y6Var = this.f36623b;
                ArrayList arrayList = this.f36624c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                sh.b bVar = this.f36625f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i10 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                while (i10 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i10)).f41382c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.bk(29));
                org.telegram.messenger.i0.g3(new d6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                y6 y6Var2 = this.f36623b;
                ArrayList arrayList6 = this.f36624c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                sh.b bVar2 = this.f36625f;
                boolean z13 = true;
                y6Var2.getMessagesController().V3(arrayList6, true);
                y6Var2.getMessagesController().P3(arrayList7, true);
                boolean z14 = false;
                s6 s6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i11);
                    if (y6Var2.getMessagesController().d2(s6Var2.f41380a) == null) {
                        s6Var2.f41380a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i12);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z14);
                                    if (t6Var2 == null) {
                                        t6Var2 = new t6();
                                        sparseArray.put(keyAt, t6Var2);
                                    }
                                    t6Var.getClass();
                                    s6 s6Var3 = s6Var;
                                    t6Var2.f41741a += t6Var.f41741a;
                                    s6Var3.f41382c += t6Var.f41741a;
                                    t6Var2.f41742b.addAll(t6Var.f41742b);
                                    i12++;
                                    s6Var = s6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    s6Var.f41381b += s6Var2.f41381b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            s6Var = s6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new org.telegram.messenger.bk(29));
                        }
                    } else {
                        z11 = z13;
                    }
                    i11++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                bVar2.f48498b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f48499c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.f41380a, s6Var4);
                }
                if (!y6.f43710h0) {
                    y6Var2.f43721d0 = bVar2;
                    j6 j6Var = y6Var2.M;
                    if (j6Var != null) {
                        j6Var.setCacheModel(bVar2);
                    }
                    y6Var2.z0(z15);
                    y6Var2.x0();
                    if (y6Var2.X != null && !y6Var2.K && System.currentTimeMillis() - y6Var2.f43716a0 > 120) {
                        l6 l6Var = y6Var2.X;
                        long j10 = y6Var2.G;
                        if (j10 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j11 = y6Var2.H;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        float f10 = 0.0f;
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j10) / ((float) j11);
                        }
                        long j12 = y6Var2.I;
                        if (j12 > 0 && i14 > 0) {
                            f10 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        l6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
