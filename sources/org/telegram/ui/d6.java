package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
public final class d6 implements Runnable {
    public final int f46880a;
    public final x6 f46881b;
    public final ArrayList f46882c;
    public final ArrayList d;
    public final ArrayList f46883e;
    public final ei.c f46884f;

    public d6(x6 x6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ei.c cVar, int i7) {
        this.f46880a = i7;
        this.f46881b = x6Var;
        this.f46882c = arrayList;
        this.d = arrayList2;
        this.f46883e = arrayList3;
        this.f46884f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        switch (this.f46880a) {
            case 0:
                x6 x6Var = this.f46881b;
                ArrayList arrayList = this.f46882c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f46883e;
                ei.c cVar = this.f46884f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i7 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                while (i7 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i7)).f51466c <= 0) {
                        arrayList3.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.el(26));
                org.telegram.messenger.g0.g3(new d6(x6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                x6 x6Var2 = this.f46881b;
                ArrayList arrayList6 = this.f46882c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.f46883e;
                ei.c cVar2 = this.f46884f;
                boolean z13 = true;
                x6Var2.getMessagesController().f4(arrayList6, true);
                x6Var2.getMessagesController().Z3(arrayList7, true);
                boolean z14 = false;
                r6 r6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i10);
                    if (x6Var2.getMessagesController().g2(r6Var2.f51464a) == null) {
                        r6Var2.f51464a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i11);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z14);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.f51946a += s6Var.f51946a;
                                    r6Var3.f51466c += s6Var.f51946a;
                                    s6Var2.f51947b.addAll(s6Var.f51947b);
                                    i11++;
                                    r6Var = r6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    r6Var.f51465b += r6Var2.f51465b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            r6Var = r6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new org.telegram.messenger.el(26));
                        }
                    } else {
                        z11 = z13;
                    }
                    i10++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                cVar2.f11002b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f11003c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.f51464a, r6Var4);
                }
                if (!x6.f53644i0) {
                    x6Var2.f53656e0 = cVar2;
                    i6 i6Var = x6Var2.N;
                    if (i6Var != null) {
                        i6Var.setCacheModel(cVar2);
                    }
                    x6Var2.A0(z15);
                    x6Var2.y0();
                    if (x6Var2.Y != null && !x6Var2.L && System.currentTimeMillis() - x6Var2.f53651b0 > 120) {
                        k6 k6Var = x6Var2.Y;
                        long j3 = x6Var2.H;
                        if (j3 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j10 = x6Var2.I;
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        float f11 = 0.0f;
                        if (i13 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j3) / ((float) j10);
                        }
                        long j11 = x6Var2.J;
                        if (j11 > 0 && i13 > 0) {
                            f11 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        k6Var.b(f10, f11, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
