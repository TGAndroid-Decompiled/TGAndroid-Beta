package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class h6 implements Runnable {
    public final int f36616a;
    public final d7 f36617b;
    public final ArrayList f36618c;
    public final ArrayList d;
    public final ArrayList e;
    public final ai.c f36619f;

    public h6(d7 d7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ai.c cVar, int i10) {
        this.f36616a = i10;
        this.f36617b = d7Var;
        this.f36618c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f36619f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        switch (this.f36616a) {
            case 0:
                d7 d7Var = this.f36617b;
                ArrayList<Long> arrayList = this.f36618c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                ai.c cVar = this.f36619f;
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((w6) arrayList3.get(i10)).f41165c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.l5(1));
                AndroidUtilities.runOnUIThread(new h6(d7Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                d7 d7Var2 = this.f36617b;
                ArrayList<TLRPC.User> arrayList6 = this.f36618c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                ai.c cVar2 = this.f36619f;
                boolean z13 = true;
                d7Var2.getMessagesController().putUsers(arrayList6, true);
                d7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z14 = false;
                w6 w6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    w6 w6Var2 = (w6) arrayList8.get(i11);
                    if (d7Var2.getMessagesController().getUserOrChat(w6Var2.f41163a) == null) {
                        w6Var2.f41163a = Long.MAX_VALUE;
                        if (w6Var != null) {
                            SparseArray sparseArray = w6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = w6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    x6 x6Var = (x6) sparseArray2.valueAt(i12);
                                    x6 x6Var2 = (x6) sparseArray.get(keyAt, z14);
                                    if (x6Var2 == null) {
                                        x6Var2 = new x6();
                                        sparseArray.put(keyAt, x6Var2);
                                    }
                                    x6Var.getClass();
                                    w6 w6Var3 = w6Var;
                                    x6Var2.f41760a += x6Var.f41760a;
                                    w6Var3.f41165c += x6Var.f41760a;
                                    x6Var2.f41761b.addAll(x6Var.f41761b);
                                    i12++;
                                    w6Var = w6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    w6Var.f41164b += w6Var2.f41164b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            w6Var = w6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new org.telegram.ui.ActionBar.l5(1));
                        }
                    } else {
                        z11 = z13;
                    }
                    i11++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                cVar2.f921b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f922c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    w6 w6Var4 = (w6) obj;
                    longSparseArray.put(w6Var4.f41163a, w6Var4);
                }
                if (!d7.f35157k0) {
                    d7Var2.Y = cVar2;
                    a7 a7Var = d7Var2.N;
                    if (a7Var != null) {
                        a7Var.setCacheModel(cVar2);
                    }
                    d7Var2.w0(z15);
                    d7Var2.v0();
                    if (d7Var2.R != null && !d7Var2.L && System.currentTimeMillis() - d7Var2.U > 120) {
                        n6 n6Var = d7Var2.R;
                        long j10 = d7Var2.H;
                        if (j10 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j11 = d7Var2.I;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        float f10 = 0.0f;
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j10) / ((float) j11);
                        }
                        long j12 = d7Var2.J;
                        if (j12 > 0 && i14 > 0) {
                            f10 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        n6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
