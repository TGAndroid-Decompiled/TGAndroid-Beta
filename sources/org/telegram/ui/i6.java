package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class i6 implements Runnable {
    public final int f34804a;
    public final d7 f34805b;
    public final ArrayList f34806c;
    public final ArrayList d;
    public final ArrayList e;
    public final mh.b f34807f;

    public i6(d7 d7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, mh.b bVar, int i10) {
        this.f34804a = i10;
        this.f34805b = d7Var;
        this.f34806c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f34807f = bVar;
    }

    @Override
    public final void run() {
        boolean z4;
        float f10;
        boolean z10;
        switch (this.f34804a) {
            case 0:
                d7 d7Var = this.f34805b;
                ArrayList<Long> arrayList = this.f34806c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                mh.b bVar = this.f34807f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        d7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        d7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((w6) arrayList3.get(i10)).f39279c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new nh.e4(8));
                AndroidUtilities.runOnUIThread(new i6(d7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                d7 d7Var2 = this.f34805b;
                ArrayList<TLRPC.User> arrayList6 = this.f34806c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                mh.b bVar2 = this.f34807f;
                d7Var2.getMessagesController().putUsers(arrayList6, true);
                d7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                w6 w6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    w6 w6Var2 = (w6) arrayList8.get(i11);
                    if (d7Var2.getMessagesController().getUserOrChat(w6Var2.f39277a) == null) {
                        w6Var2.f39277a = Long.MAX_VALUE;
                        if (w6Var != null) {
                            SparseArray sparseArray = w6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = w6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    x6 x6Var = (x6) sparseArray2.valueAt(i12);
                                    x6 x6Var2 = (x6) sparseArray.get(keyAt, z11);
                                    if (x6Var2 == null) {
                                        x6Var2 = new x6();
                                        sparseArray.put(keyAt, x6Var2);
                                    }
                                    x6Var.getClass();
                                    w6 w6Var3 = w6Var;
                                    x6Var2.f39846a += x6Var.f39846a;
                                    w6Var3.f39279c += x6Var.f39846a;
                                    x6Var2.f39847b.addAll(x6Var.f39847b);
                                    i12++;
                                    w6Var = w6Var3;
                                    z11 = false;
                                } else {
                                    w6Var.f39278b += w6Var2.f39278b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            w6Var = w6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new nh.e4(8));
                        }
                    }
                    i11++;
                    z11 = false;
                }
                bVar2.f14163b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f14164c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    w6 w6Var4 = (w6) obj;
                    longSparseArray.put(w6Var4.f39277a, w6Var4);
                }
                if (!d7.f33342h0) {
                    d7Var2.V = bVar2;
                    a7 a7Var = d7Var2.K;
                    if (a7Var != null) {
                        a7Var.setCacheModel(bVar2);
                    }
                    d7Var2.w0(true);
                    d7Var2.v0();
                    if (d7Var2.O != null && !d7Var2.I && System.currentTimeMillis() - d7Var2.R > 120) {
                        p6 p6Var = d7Var2.O;
                        long j10 = d7Var2.E;
                        if (j10 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        long j11 = d7Var2.F;
                        float f11 = 0.0f;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j10) / ((float) j11);
                        }
                        long j12 = d7Var2.G;
                        if (j12 > 0 && i14 > 0) {
                            f11 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        p6Var.b(f10, f11, z4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
