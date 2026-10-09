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
    public final int f36853a;
    public final y6 f36854b;
    public final ArrayList f36855c;
    public final ArrayList d;
    public final ArrayList f36856e;
    public final zh.b f36857f;

    public d6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f36853a = i10;
        this.f36854b = y6Var;
        this.f36855c = arrayList;
        this.d = arrayList2;
        this.f36856e = arrayList3;
        this.f36857f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        switch (this.f36853a) {
            case 0:
                y6 y6Var = this.f36854b;
                ArrayList<Long> arrayList = this.f36855c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f36856e;
                zh.b bVar = this.f36857f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i10)).f41281c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.d(27));
                AndroidUtilities.runOnUIThread(new d6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                y6 y6Var2 = this.f36854b;
                ArrayList<TLRPC.User> arrayList6 = this.f36855c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.f36856e;
                zh.b bVar2 = this.f36857f;
                boolean z13 = true;
                y6Var2.getMessagesController().putUsers(arrayList6, true);
                y6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z14 = false;
                r6 r6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i11);
                    if (y6Var2.getMessagesController().getUserOrChat(r6Var2.f41279a) == null) {
                        r6Var2.f41279a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i12);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z14);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.f41585a += s6Var.f41585a;
                                    r6Var3.f41281c += s6Var.f41585a;
                                    s6Var2.f41586b.addAll(s6Var.f41586b);
                                    i12++;
                                    r6Var = r6Var3;
                                    z13 = z13;
                                    z14 = false;
                                } else {
                                    z11 = z13;
                                    r6Var.f41280b += r6Var2.f41280b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z12 = z11;
                                }
                            }
                        } else {
                            z11 = z13;
                            r6Var = r6Var2;
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
                bVar2.f54699b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f54700c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.f41279a, r6Var4);
                }
                if (!y6.f44241k0) {
                    y6Var2.Y = bVar2;
                    v6 v6Var = y6Var2.N;
                    if (v6Var != null) {
                        v6Var.setCacheModel(bVar2);
                    }
                    y6Var2.w0(z15);
                    y6Var2.v0();
                    if (y6Var2.R != null && !y6Var2.L && System.currentTimeMillis() - y6Var2.U > 120) {
                        j6 j6Var = y6Var2.R;
                        long j3 = y6Var2.H;
                        if (j3 > 0) {
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        long j10 = y6Var2.I;
                        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        float f10 = 0.0f;
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j3) / ((float) j10);
                        }
                        long j11 = y6Var2.J;
                        if (j11 > 0 && i14 > 0) {
                            f10 = ((float) (j10 - j11)) / ((float) j10);
                        }
                        j6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
