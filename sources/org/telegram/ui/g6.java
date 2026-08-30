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
    public final int f34450a;
    public final b7 f34451b;
    public final ArrayList f34452c;
    public final ArrayList d;
    public final ArrayList e;
    public final mh.b f34453f;

    public g6(b7 b7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, mh.b bVar, int i10) {
        this.f34450a = i10;
        this.f34451b = b7Var;
        this.f34452c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f34453f = bVar;
    }

    @Override
    public final void run() {
        boolean z4;
        float f10;
        boolean z10;
        switch (this.f34450a) {
            case 0:
                b7 b7Var = this.f34451b;
                ArrayList<Long> arrayList = this.f34452c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                mh.b bVar = this.f34453f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        b7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        b7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((u6) arrayList3.get(i10)).f38851c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new nh.e4(8));
                AndroidUtilities.runOnUIThread(new g6(b7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                b7 b7Var2 = this.f34451b;
                ArrayList<TLRPC.User> arrayList6 = this.f34452c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                mh.b bVar2 = this.f34453f;
                b7Var2.getMessagesController().putUsers(arrayList6, true);
                b7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                u6 u6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    u6 u6Var2 = (u6) arrayList8.get(i11);
                    if (b7Var2.getMessagesController().getUserOrChat(u6Var2.f38849a) == null) {
                        u6Var2.f38849a = Long.MAX_VALUE;
                        if (u6Var != null) {
                            SparseArray sparseArray = u6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = u6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    v6 v6Var = (v6) sparseArray2.valueAt(i12);
                                    v6 v6Var2 = (v6) sparseArray.get(keyAt, z11);
                                    if (v6Var2 == null) {
                                        v6Var2 = new v6();
                                        sparseArray.put(keyAt, v6Var2);
                                    }
                                    v6Var.getClass();
                                    u6 u6Var3 = u6Var;
                                    v6Var2.f39085a += v6Var.f39085a;
                                    u6Var3.f38851c += v6Var.f39085a;
                                    v6Var2.f39086b.addAll(v6Var.f39086b);
                                    i12++;
                                    u6Var = u6Var3;
                                    z11 = false;
                                } else {
                                    u6Var.f38850b += u6Var2.f38850b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            u6Var = u6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new nh.e4(8));
                        }
                    }
                    i11++;
                    z11 = false;
                }
                bVar2.f14175b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f14176c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    u6 u6Var4 = (u6) obj;
                    longSparseArray.put(u6Var4.f38849a, u6Var4);
                }
                if (!b7.f32806h0) {
                    b7Var2.V = bVar2;
                    y6 y6Var = b7Var2.K;
                    if (y6Var != null) {
                        y6Var.setCacheModel(bVar2);
                    }
                    b7Var2.w0(true);
                    b7Var2.v0();
                    if (b7Var2.O != null && !b7Var2.I && System.currentTimeMillis() - b7Var2.R > 120) {
                        n6 n6Var = b7Var2.O;
                        long j10 = b7Var2.E;
                        if (j10 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        long j11 = b7Var2.F;
                        float f11 = 0.0f;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j10) / ((float) j11);
                        }
                        long j12 = b7Var2.G;
                        if (j12 > 0 && i14 > 0) {
                            f11 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        n6Var.b(f10, f11, z4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
