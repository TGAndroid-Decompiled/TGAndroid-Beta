package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class d6 implements Runnable {
    public final int f37310a;
    public final x6 f37311b;
    public final ArrayList f37312c;
    public final ArrayList d;
    public final ArrayList f37313e;
    public final kh.b f37314f;

    public d6(x6 x6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, kh.b bVar, int i10) {
        this.f37310a = i10;
        this.f37311b = x6Var;
        this.f37312c = arrayList;
        this.d = arrayList2;
        this.f37313e = arrayList3;
        this.f37314f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f9;
        boolean z11;
        switch (this.f37310a) {
            case 0:
                x6 x6Var = this.f37311b;
                ArrayList<Long> arrayList = this.f37312c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f37313e;
                kh.b bVar = this.f37314f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((q6) arrayList3.get(i10)).f41545c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new lh.e4(11));
                AndroidUtilities.runOnUIThread(new d6(x6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                x6 x6Var2 = this.f37311b;
                ArrayList<TLRPC.User> arrayList6 = this.f37312c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.f37313e;
                kh.b bVar2 = this.f37314f;
                x6Var2.getMessagesController().putUsers(arrayList6, true);
                x6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                q6 q6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    q6 q6Var2 = (q6) arrayList8.get(i11);
                    if (x6Var2.getMessagesController().getUserOrChat(q6Var2.f41543a) == null) {
                        q6Var2.f41543a = Long.MAX_VALUE;
                        if (q6Var != null) {
                            SparseArray sparseArray = q6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = q6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    r6 r6Var = (r6) sparseArray2.valueAt(i12);
                                    r6 r6Var2 = (r6) sparseArray.get(keyAt, z12);
                                    if (r6Var2 == null) {
                                        r6Var2 = new r6();
                                        sparseArray.put(keyAt, r6Var2);
                                    }
                                    r6Var.getClass();
                                    q6 q6Var3 = q6Var;
                                    r6Var2.f41978a += r6Var.f41978a;
                                    q6Var3.f41545c += r6Var.f41978a;
                                    r6Var2.f41979b.addAll(r6Var.f41979b);
                                    i12++;
                                    q6Var = q6Var3;
                                    z12 = false;
                                } else {
                                    q6Var.f41544b += q6Var2.f41544b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = true;
                                }
                            }
                        } else {
                            q6Var = q6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new lh.e4(11));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                bVar2.f13896b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f13897c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    q6 q6Var4 = (q6) obj;
                    longSparseArray.put(q6Var4.f41543a, q6Var4);
                }
                if (!x6.f44478g0) {
                    x6Var2.U = bVar2;
                    u6 u6Var = x6Var2.J;
                    if (u6Var != null) {
                        u6Var.setCacheModel(bVar2);
                    }
                    x6Var2.w0(true);
                    x6Var2.v0();
                    if (x6Var2.N != null && !x6Var2.H && System.currentTimeMillis() - x6Var2.Q > 120) {
                        j6 j6Var = x6Var2.N;
                        long j10 = x6Var2.D;
                        if (j10 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j11 = x6Var2.E;
                        float f10 = 0.0f;
                        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f9 = 0.0f;
                        } else {
                            f9 = ((float) j10) / ((float) j11);
                        }
                        long j12 = x6Var2.F;
                        if (j12 > 0 && i14 > 0) {
                            f10 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        j6Var.b(f9, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
