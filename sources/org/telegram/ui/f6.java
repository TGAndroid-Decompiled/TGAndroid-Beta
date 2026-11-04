package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
public final class f6 implements Runnable {
    public final int f45158a;
    public final z6 f45159b;
    public final ArrayList f45160c;
    public final ArrayList d;
    public final ArrayList f45161e;
    public final di.c f45162f;

    public f6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, di.c cVar, int i3) {
        this.f45158a = i3;
        this.f45159b = z6Var;
        this.f45160c = arrayList;
        this.d = arrayList2;
        this.f45161e = arrayList3;
        this.f45162f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        switch (this.f45158a) {
            case 0:
                z6 z6Var = this.f45159b;
                ArrayList arrayList = this.f45160c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f45161e;
                di.c cVar = this.f45162f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                while (i3 < arrayList3.size()) {
                    if (((t6) arrayList3.get(i3)).f49715c <= 0) {
                        arrayList3.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.tq(17));
                org.telegram.messenger.g0.h3(new f6(z6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                z6 z6Var2 = this.f45159b;
                ArrayList arrayList6 = this.f45160c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.f45161e;
                di.c cVar2 = this.f45162f;
                boolean z13 = true;
                z6Var2.getMessagesController().Y3(arrayList6, true);
                z6Var2.getMessagesController().S3(arrayList7, true);
                boolean z14 = false;
                t6 t6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    t6 t6Var2 = (t6) arrayList8.get(i10);
                    if (z6Var2.getMessagesController().e2(t6Var2.f49713a) == null) {
                        t6Var2.f49713a = Long.MAX_VALUE;
                        if (t6Var != null) {
                            SparseArray sparseArray = t6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = t6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    u6 u6Var = (u6) sparseArray2.valueAt(i11);
                                    u6 u6Var2 = (u6) sparseArray.get(keyAt, z14);
                                    if (u6Var2 == null) {
                                        u6Var2 = new u6();
                                        sparseArray.put(keyAt, u6Var2);
                                    }
                                    u6Var.getClass();
                                    t6 t6Var3 = t6Var;
                                    u6Var2.f49985a += u6Var.f49985a;
                                    t6Var3.f49715c += u6Var.f49985a;
                                    u6Var2.f49986b.addAll(u6Var.f49986b);
                                    i11++;
                                    t6Var = t6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    t6Var.f49714b += t6Var2.f49714b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            t6Var = t6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new org.telegram.messenger.tq(17));
                        }
                    } else {
                        z11 = z13;
                    }
                    i10++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                cVar2.f9187b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f9188c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    t6 t6Var4 = (t6) obj;
                    longSparseArray.put(t6Var4.f49713a, t6Var4);
                }
                if (!z6.f52541i0) {
                    z6Var2.f52553e0 = cVar2;
                    k6 k6Var = z6Var2.N;
                    if (k6Var != null) {
                        k6Var.setCacheModel(cVar2);
                    }
                    z6Var2.A0(z15);
                    z6Var2.y0();
                    if (z6Var2.Y != null && !z6Var2.L && System.currentTimeMillis() - z6Var2.f52548b0 > 120) {
                        m6 m6Var = z6Var2.Y;
                        long j10 = z6Var2.H;
                        if (j10 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j11 = z6Var2.I;
                        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        float f11 = 0.0f;
                        if (i13 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j10) / ((float) j11);
                        }
                        long j12 = z6Var2.J;
                        if (j12 > 0 && i13 > 0) {
                            f11 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        m6Var.b(f10, f11, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
