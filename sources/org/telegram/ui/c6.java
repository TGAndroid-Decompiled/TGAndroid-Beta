package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class c6 implements Runnable {
    public final int f36569a;
    public final x6 f36570b;
    public final ArrayList f36571c;
    public final ArrayList d;
    public final ArrayList f36572e;
    public final zh.b f36573f;

    public c6(x6 x6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f36569a = i10;
        this.f36570b = x6Var;
        this.f36571c = arrayList;
        this.d = arrayList2;
        this.f36572e = arrayList3;
        this.f36573f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        switch (this.f36569a) {
            case 0:
                x6 x6Var = this.f36570b;
                ArrayList<Long> arrayList = this.f36571c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f36572e;
                zh.b bVar = this.f36573f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((q6) arrayList3.get(i10)).f41048c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.d(27));
                AndroidUtilities.runOnUIThread(new c6(x6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                x6 x6Var2 = this.f36570b;
                ArrayList<TLRPC.User> arrayList6 = this.f36571c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.f36572e;
                zh.b bVar2 = this.f36573f;
                boolean z13 = true;
                x6Var2.getMessagesController().putUsers(arrayList6, true);
                x6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z14 = false;
                q6 q6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    q6 q6Var2 = (q6) arrayList8.get(i11);
                    if (x6Var2.getMessagesController().getUserOrChat(q6Var2.f41046a) == null) {
                        q6Var2.f41046a = Long.MAX_VALUE;
                        if (q6Var != null) {
                            SparseArray sparseArray = q6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = q6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    r6 r6Var = (r6) sparseArray2.valueAt(i12);
                                    r6 r6Var2 = (r6) sparseArray.get(keyAt, z14);
                                    if (r6Var2 == null) {
                                        r6Var2 = new r6();
                                        sparseArray.put(keyAt, r6Var2);
                                    }
                                    r6Var.getClass();
                                    q6 q6Var3 = q6Var;
                                    r6Var2.f41336a += r6Var.f41336a;
                                    q6Var3.f41048c += r6Var.f41336a;
                                    r6Var2.f41337b.addAll(r6Var.f41337b);
                                    i12++;
                                    q6Var = q6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    q6Var.f41047b += q6Var2.f41047b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            q6Var = q6Var2;
                            z12 = false;
                        }
                        if (z12) {
                            Collections.sort(arrayList8, new a4.d(27));
                        }
                    } else {
                        z11 = z13;
                    }
                    i11++;
                    z13 = z11;
                    z14 = false;
                }
                boolean z15 = z13;
                bVar2.f54788b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f54789c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    q6 q6Var4 = (q6) obj;
                    longSparseArray.put(q6Var4.f41046a, q6Var4);
                }
                if (!x6.f43969k0) {
                    x6Var2.Y = bVar2;
                    u6 u6Var = x6Var2.N;
                    if (u6Var != null) {
                        u6Var.setCacheModel(bVar2);
                    }
                    x6Var2.w0(z15);
                    x6Var2.v0();
                    if (x6Var2.R != null && !x6Var2.L && System.currentTimeMillis() - x6Var2.U > 120) {
                        i6 i6Var = x6Var2.R;
                        long j3 = x6Var2.H;
                        if (j3 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j10 = x6Var2.I;
                        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        float f10 = 0.0f;
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j3) / ((float) j10);
                        }
                        long j11 = x6Var2.J;
                        if (j11 > 0 && i14 > 0) {
                            f10 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        i6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
