package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f33558a;
    public final a7 f33559b;
    public final ArrayList f33560c;
    public final ArrayList d;
    public final ArrayList e;
    public final zh.b f33561f;

    public f6(a7 a7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f33558a = i10;
        this.f33559b = a7Var;
        this.f33560c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f33561f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f33558a) {
            case 0:
                a7 a7Var = this.f33559b;
                ArrayList<Long> arrayList = this.f33560c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                zh.b bVar = this.f33561f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((t6) arrayList3.get(i10)).f37674c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new f6(a7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                a7 a7Var2 = this.f33559b;
                ArrayList<TLRPC.User> arrayList6 = this.f33560c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                zh.b bVar2 = this.f33561f;
                a7Var2.getMessagesController().putUsers(arrayList6, true);
                a7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                t6 t6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    t6 t6Var2 = (t6) arrayList8.get(i11);
                    if (a7Var2.getMessagesController().getUserOrChat(t6Var2.f37672a) == null) {
                        t6Var2.f37672a = Long.MAX_VALUE;
                        if (t6Var != null) {
                            SparseArray sparseArray = t6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = t6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    u6 u6Var = (u6) sparseArray2.valueAt(i12);
                                    u6 u6Var2 = (u6) sparseArray.get(keyAt, z12);
                                    if (u6Var2 == null) {
                                        u6Var2 = new u6();
                                        sparseArray.put(keyAt, u6Var2);
                                    }
                                    u6Var.getClass();
                                    t6 t6Var3 = t6Var;
                                    u6Var2.f37948a += u6Var.f37948a;
                                    t6Var3.f37674c += u6Var.f37948a;
                                    u6Var2.f37949b.addAll(u6Var.f37949b);
                                    i12++;
                                    t6Var = t6Var3;
                                    z12 = false;
                                } else {
                                    t6Var.f37673b += t6Var2.f37673b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = true;
                                }
                            }
                        } else {
                            t6Var = t6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new a4.e(27));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                bVar2.f49228b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f49229c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    t6 t6Var4 = (t6) obj;
                    longSparseArray.put(t6Var4.f37672a, t6Var4);
                }
                if (!a7.f31732l0) {
                    a7Var2.f31741c0 = bVar2;
                    x6 x6Var = a7Var2.M;
                    if (x6Var != null) {
                        x6Var.setCacheModel(bVar2);
                    }
                    a7Var2.y0(true);
                    a7Var2.w0();
                    if (a7Var2.V != null && !a7Var2.K && System.currentTimeMillis() - a7Var2.Y > 120) {
                        l6 l6Var = a7Var2.V;
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
                        l6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
