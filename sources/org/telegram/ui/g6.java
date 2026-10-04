package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class g6 implements Runnable {
    public final int f36503a;
    public final a7 f36504b;
    public final ArrayList f36505c;
    public final ArrayList d;
    public final ArrayList f36506e;
    public final zh.b f36507f;

    public g6(a7 a7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f36503a = i10;
        this.f36504b = a7Var;
        this.f36505c = arrayList;
        this.d = arrayList2;
        this.f36506e = arrayList3;
        this.f36507f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f36503a) {
            case 0:
                a7 a7Var = this.f36504b;
                ArrayList<Long> arrayList = this.f36505c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f36506e;
                zh.b bVar = this.f36507f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((u6) arrayList3.get(i10)).f41067c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new g6(a7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                a7 a7Var2 = this.f36504b;
                ArrayList<TLRPC.User> arrayList6 = this.f36505c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.f36506e;
                zh.b bVar2 = this.f36507f;
                a7Var2.getMessagesController().putUsers(arrayList6, true);
                a7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                u6 u6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    u6 u6Var2 = (u6) arrayList8.get(i11);
                    if (a7Var2.getMessagesController().getUserOrChat(u6Var2.f41065a) == null) {
                        u6Var2.f41065a = Long.MAX_VALUE;
                        if (u6Var != null) {
                            SparseArray sparseArray = u6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = u6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    v6 v6Var = (v6) sparseArray2.valueAt(i12);
                                    v6 v6Var2 = (v6) sparseArray.get(keyAt, z12);
                                    if (v6Var2 == null) {
                                        v6Var2 = new v6();
                                        sparseArray.put(keyAt, v6Var2);
                                    }
                                    v6Var.getClass();
                                    u6 u6Var3 = u6Var;
                                    v6Var2.f41564a += v6Var.f41564a;
                                    u6Var3.f41067c += v6Var.f41564a;
                                    v6Var2.f41565b.addAll(v6Var.f41565b);
                                    i12++;
                                    u6Var = u6Var3;
                                    z12 = false;
                                } else {
                                    u6Var.f41066b += u6Var2.f41066b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = true;
                                }
                            }
                        } else {
                            u6Var = u6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new a4.e(27));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                bVar2.f53557b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f53558c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    u6 u6Var4 = (u6) obj;
                    longSparseArray.put(u6Var4.f41065a, u6Var4);
                }
                if (!a7.m0) {
                    a7Var2.f34685e0 = bVar2;
                    k6 k6Var = a7Var2.M;
                    if (k6Var != null) {
                        k6Var.setCacheModel(bVar2);
                    }
                    a7Var2.v0(true);
                    a7Var2.t0();
                    if (a7Var2.X != null && !a7Var2.K && System.currentTimeMillis() - a7Var2.f34678a0 > 120) {
                        m6 m6Var = a7Var2.X;
                        long j3 = a7Var2.G;
                        if (j3 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j10 = a7Var2.H;
                        float f10 = 0.0f;
                        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j3) / ((float) j10);
                        }
                        long j11 = a7Var2.I;
                        if (j11 > 0 && i14 > 0) {
                            f10 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        m6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
