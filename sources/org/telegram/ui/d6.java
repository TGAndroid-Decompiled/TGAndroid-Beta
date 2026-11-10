package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
public final class d6 implements Runnable {
    public final int f44903a;
    public final y6 f44904b;
    public final ArrayList f44905c;
    public final ArrayList d;
    public final ArrayList f44906e;
    public final ci.c f44907f;

    public d6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ci.c cVar, int i7) {
        this.f44903a = i7;
        this.f44904b = y6Var;
        this.f44905c = arrayList;
        this.d = arrayList2;
        this.f44906e = arrayList3;
        this.f44907f = cVar;
    }

    @Override
    public final void run() {
        boolean z9;
        float f10;
        boolean z10;
        boolean z11;
        switch (this.f44903a) {
            case 0:
                y6 y6Var = this.f44904b;
                ArrayList arrayList = this.f44905c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f44906e;
                ci.c cVar = this.f44907f;
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
                    if (((s6) arrayList3.get(i7)).f49686c <= 0) {
                        arrayList3.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.jl(27));
                org.telegram.messenger.g0.h3(new d6(y6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                y6 y6Var2 = this.f44904b;
                ArrayList arrayList6 = this.f44905c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.f44906e;
                ci.c cVar2 = this.f44907f;
                boolean z12 = true;
                y6Var2.getMessagesController().Y3(arrayList6, true);
                y6Var2.getMessagesController().S3(arrayList7, true);
                boolean z13 = false;
                s6 s6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i10);
                    if (y6Var2.getMessagesController().e2(s6Var2.f49684a) == null) {
                        s6Var2.f49684a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i11);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z13);
                                    if (t6Var2 == null) {
                                        t6Var2 = new t6();
                                        sparseArray.put(keyAt, t6Var2);
                                    }
                                    t6Var.getClass();
                                    s6 s6Var3 = s6Var;
                                    t6Var2.f50141a += t6Var.f50141a;
                                    s6Var3.f49686c += t6Var.f50141a;
                                    t6Var2.f50142b.addAll(t6Var.f50142b);
                                    i11++;
                                    s6Var = s6Var3;
                                    z12 = z12;
                                    z13 = false;
                                } else {
                                    z10 = z12;
                                    s6Var.f49685b += s6Var2.f49685b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z11 = z10;
                                }
                            }
                        } else {
                            z10 = z12;
                            s6Var = s6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new org.telegram.messenger.jl(27));
                        }
                    } else {
                        z10 = z12;
                    }
                    i10++;
                    z12 = z10;
                    z13 = false;
                }
                boolean z14 = z12;
                cVar2.f6427b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f6428c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.f49684a, s6Var4);
                }
                if (!y6.f51904h0) {
                    y6Var2.f51915d0 = cVar2;
                    i6 i6Var = y6Var2.M;
                    if (i6Var != null) {
                        i6Var.setCacheModel(cVar2);
                    }
                    y6Var2.A0(z14);
                    y6Var2.y0();
                    if (y6Var2.X != null && !y6Var2.K && System.currentTimeMillis() - y6Var2.f51910a0 > 120) {
                        k6 k6Var = y6Var2.X;
                        long j3 = y6Var2.G;
                        if (j3 > 0) {
                            z9 = z14;
                        } else {
                            z9 = false;
                        }
                        long j10 = y6Var2.H;
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        float f11 = 0.0f;
                        if (i13 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j3) / ((float) j10);
                        }
                        long j11 = y6Var2.I;
                        if (j11 > 0 && i13 > 0) {
                            f11 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        k6Var.b(f10, f11, z9);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
