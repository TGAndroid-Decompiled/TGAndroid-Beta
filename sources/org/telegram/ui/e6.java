package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class e6 implements Runnable {
    public final int f33221a;
    public final z6 f33222b;
    public final ArrayList f33223c;
    public final ArrayList d;
    public final ArrayList e;
    public final zh.b f33224f;

    public e6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f33221a = i10;
        this.f33222b = z6Var;
        this.f33223c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f33224f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f33221a) {
            case 0:
                z6 z6Var = this.f33222b;
                ArrayList<Long> arrayList = this.f33223c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                zh.b bVar = this.f33224f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i10)).f37259c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new e6(z6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                z6 z6Var2 = this.f33222b;
                ArrayList<TLRPC.User> arrayList6 = this.f33223c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                zh.b bVar2 = this.f33224f;
                z6Var2.getMessagesController().putUsers(arrayList6, true);
                z6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                s6 s6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i11);
                    if (z6Var2.getMessagesController().getUserOrChat(s6Var2.f37257a) == null) {
                        s6Var2.f37257a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i12);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z12);
                                    if (t6Var2 == null) {
                                        t6Var2 = new t6();
                                        sparseArray.put(keyAt, t6Var2);
                                    }
                                    t6Var.getClass();
                                    s6 s6Var3 = s6Var;
                                    t6Var2.f37563a += t6Var.f37563a;
                                    s6Var3.f37259c += t6Var.f37563a;
                                    t6Var2.f37564b.addAll(t6Var.f37564b);
                                    i12++;
                                    s6Var = s6Var3;
                                    z12 = false;
                                } else {
                                    s6Var.f37258b += s6Var2.f37258b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = true;
                                }
                            }
                        } else {
                            s6Var = s6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new a4.e(27));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                bVar2.f49200b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f49201c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.f37257a, s6Var4);
                }
                if (!z6.f40070k0) {
                    z6Var2.Y = bVar2;
                    w6 w6Var = z6Var2.N;
                    if (w6Var != null) {
                        w6Var.setCacheModel(bVar2);
                    }
                    z6Var2.w0(true);
                    z6Var2.v0();
                    if (z6Var2.R != null && !z6Var2.L && System.currentTimeMillis() - z6Var2.U > 120) {
                        k6 k6Var = z6Var2.R;
                        long j3 = z6Var2.H;
                        if (j3 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j10 = z6Var2.I;
                        float f10 = 0.0f;
                        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j3) / ((float) j10);
                        }
                        long j11 = z6Var2.J;
                        if (j11 > 0 && i14 > 0) {
                            f10 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        k6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
