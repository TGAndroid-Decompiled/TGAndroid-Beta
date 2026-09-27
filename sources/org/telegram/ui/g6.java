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
    public final int f33721a;
    public final b7 f33722b;
    public final ArrayList f33723c;
    public final ArrayList d;
    public final ArrayList e;
    public final zh.b f33724f;

    public g6(b7 b7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f33721a = i10;
        this.f33722b = b7Var;
        this.f33723c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f33724f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f33721a) {
            case 0:
                b7 b7Var = this.f33722b;
                ArrayList<Long> arrayList = this.f33723c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                zh.b bVar = this.f33724f;
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((u6) arrayList3.get(i10)).f38130c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new g6(b7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                b7 b7Var2 = this.f33722b;
                ArrayList<TLRPC.User> arrayList6 = this.f33723c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                zh.b bVar2 = this.f33724f;
                b7Var2.getMessagesController().putUsers(arrayList6, true);
                b7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                u6 u6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    u6 u6Var2 = (u6) arrayList8.get(i11);
                    if (b7Var2.getMessagesController().getUserOrChat(u6Var2.f38128a) == null) {
                        u6Var2.f38128a = Long.MAX_VALUE;
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
                                    v6Var2.f38456a += v6Var.f38456a;
                                    u6Var3.f38130c += v6Var.f38456a;
                                    v6Var2.f38457b.addAll(v6Var.f38457b);
                                    i12++;
                                    u6Var = u6Var3;
                                    z12 = false;
                                } else {
                                    u6Var.f38129b += u6Var2.f38129b;
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
                bVar2.f49516b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f49517c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    u6 u6Var4 = (u6) obj;
                    longSparseArray.put(u6Var4.f38128a, u6Var4);
                }
                if (!b7.f32251l0) {
                    b7Var2.f32260c0 = bVar2;
                    y6 y6Var = b7Var2.M;
                    if (y6Var != null) {
                        y6Var.setCacheModel(bVar2);
                    }
                    b7Var2.y0(true);
                    b7Var2.w0();
                    if (b7Var2.V != null && !b7Var2.K && System.currentTimeMillis() - b7Var2.Y > 120) {
                        m6 m6Var = b7Var2.V;
                        long j3 = b7Var2.G;
                        if (j3 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j10 = b7Var2.H;
                        float f10 = 0.0f;
                        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j3) / ((float) j10);
                        }
                        long j11 = b7Var2.I;
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
