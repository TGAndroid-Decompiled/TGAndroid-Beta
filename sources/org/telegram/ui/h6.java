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
    public final int f39906a;
    public final c7 f39907b;
    public final ArrayList f39908c;
    public final ArrayList d;
    public final ArrayList e;
    public final ci.b f39909f;

    public h6(c7 c7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ci.b bVar, int i10) {
        this.f39906a = i10;
        this.f39907b = c7Var;
        this.f39908c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f39909f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        switch (this.f39906a) {
            case 0:
                c7 c7Var = this.f39907b;
                ArrayList<Long> arrayList = this.f39908c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                ci.b bVar = this.f39909f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        c7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        c7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((w6) arrayList3.get(i10)).f44985c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.n4(4));
                AndroidUtilities.runOnUIThread(new h6(c7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                c7 c7Var2 = this.f39907b;
                ArrayList<TLRPC.User> arrayList6 = this.f39908c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                ci.b bVar2 = this.f39909f;
                boolean z13 = true;
                c7Var2.getMessagesController().putUsers(arrayList6, true);
                c7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z14 = false;
                w6 w6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    w6 w6Var2 = (w6) arrayList8.get(i11);
                    if (c7Var2.getMessagesController().getUserOrChat(w6Var2.f44983a) == null) {
                        w6Var2.f44983a = Long.MAX_VALUE;
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
                                    x6Var2.f45660a += x6Var.f45660a;
                                    w6Var3.f44985c += x6Var.f45660a;
                                    x6Var2.f45661b.addAll(x6Var.f45661b);
                                    i12++;
                                    w6Var = w6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    w6Var.f44984b += w6Var2.f44984b;
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
                            Collections.sort(arrayList8, new org.telegram.ui.ActionBar.n4(4));
                        }
                    } else {
                        z11 = z13;
                    }
                    i11++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                bVar2.f6370b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f6371c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    w6 w6Var4 = (w6) obj;
                    longSparseArray.put(w6Var4.f44983a, w6Var4);
                }
                if (!c7.f38338i0) {
                    c7Var2.f38349e0 = bVar2;
                    m6 m6Var = c7Var2.M;
                    if (m6Var != null) {
                        m6Var.setCacheModel(bVar2);
                    }
                    c7Var2.w0(z15);
                    c7Var2.u0();
                    if (c7Var2.X != null && !c7Var2.K && System.currentTimeMillis() - c7Var2.f38343a0 > 120) {
                        o6 o6Var = c7Var2.X;
                        long j10 = c7Var2.G;
                        if (j10 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j11 = c7Var2.H;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        float f10 = 0.0f;
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j10) / ((float) j11);
                        }
                        long j12 = c7Var2.I;
                        if (j12 > 0 && i14 > 0) {
                            f10 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        o6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
