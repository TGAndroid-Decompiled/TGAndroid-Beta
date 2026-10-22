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
    public final int f37505a;
    public final c7 f37506b;
    public final ArrayList f37507c;
    public final ArrayList d;
    public final ArrayList e;
    public final bi.c f37508f;

    public h6(c7 c7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, bi.c cVar, int i10) {
        this.f37505a = i10;
        this.f37506b = c7Var;
        this.f37507c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f37508f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        switch (this.f37505a) {
            case 0:
                c7 c7Var = this.f37506b;
                ArrayList<Long> arrayList = this.f37507c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                bi.c cVar = this.f37508f;
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((v6) arrayList3.get(i10)).f42119c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.i4(4));
                AndroidUtilities.runOnUIThread(new h6(c7Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                c7 c7Var2 = this.f37506b;
                ArrayList<TLRPC.User> arrayList6 = this.f37507c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                bi.c cVar2 = this.f37508f;
                boolean z13 = true;
                c7Var2.getMessagesController().putUsers(arrayList6, true);
                c7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z14 = false;
                v6 v6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    v6 v6Var2 = (v6) arrayList8.get(i11);
                    if (c7Var2.getMessagesController().getUserOrChat(v6Var2.f42117a) == null) {
                        v6Var2.f42117a = Long.MAX_VALUE;
                        if (v6Var != null) {
                            SparseArray sparseArray = v6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = v6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    w6 w6Var = (w6) sparseArray2.valueAt(i12);
                                    w6 w6Var2 = (w6) sparseArray.get(keyAt, z14);
                                    if (w6Var2 == null) {
                                        w6Var2 = new w6();
                                        sparseArray.put(keyAt, w6Var2);
                                    }
                                    w6Var.getClass();
                                    v6 v6Var3 = v6Var;
                                    w6Var2.f42480a += w6Var.f42480a;
                                    v6Var3.f42119c += w6Var.f42480a;
                                    w6Var2.f42481b.addAll(w6Var.f42481b);
                                    i12++;
                                    v6Var = v6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    v6Var.f42118b += v6Var2.f42118b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            v6Var = v6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new org.telegram.ui.ActionBar.i4(4));
                        }
                    } else {
                        z11 = z13;
                    }
                    i11++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                cVar2.f4430b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f4431c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    v6 v6Var4 = (v6) obj;
                    longSparseArray.put(v6Var4.f42117a, v6Var4);
                }
                if (!c7.f35831k0) {
                    c7Var2.Y = cVar2;
                    z6 z6Var = c7Var2.N;
                    if (z6Var != null) {
                        z6Var.setCacheModel(cVar2);
                    }
                    c7Var2.w0(z15);
                    c7Var2.v0();
                    if (c7Var2.R != null && !c7Var2.L && System.currentTimeMillis() - c7Var2.U > 120) {
                        n6 n6Var = c7Var2.R;
                        long j10 = c7Var2.H;
                        if (j10 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j11 = c7Var2.I;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        float f10 = 0.0f;
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j10) / ((float) j11);
                        }
                        long j12 = c7Var2.J;
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
