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
    public final int f37070a;
    public final y6 f37071b;
    public final ArrayList f37072c;
    public final ArrayList d;
    public final ArrayList f37073e;
    public final hh.b f37074f;

    public c6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, hh.b bVar, int i9) {
        this.f37070a = i9;
        this.f37071b = y6Var;
        this.f37072c = arrayList;
        this.d = arrayList2;
        this.f37073e = arrayList3;
        this.f37074f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        boolean z11;
        switch (this.f37070a) {
            case 0:
                y6 y6Var = this.f37071b;
                ArrayList<Long> arrayList = this.f37072c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f37073e;
                hh.b bVar = this.f37074f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                int i9 = 0;
                while (i9 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i9)).f42276c <= 0) {
                        arrayList3.remove(i9);
                        i9--;
                    }
                    i9++;
                }
                Collections.sort(arrayList3, new j9.a(13));
                AndroidUtilities.runOnUIThread(new c6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                y6 y6Var2 = this.f37071b;
                ArrayList<TLRPC.User> arrayList6 = this.f37072c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.f37073e;
                hh.b bVar2 = this.f37074f;
                y6Var2.getMessagesController().putUsers(arrayList6, true);
                y6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                r6 r6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i10);
                    if (y6Var2.getMessagesController().getUserOrChat(r6Var2.f42274a) == null) {
                        r6Var2.f42274a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i11);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z12);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.f42566a += s6Var.f42566a;
                                    r6Var3.f42276c += s6Var.f42566a;
                                    s6Var2.f42567b.addAll(s6Var.f42567b);
                                    i11++;
                                    r6Var = r6Var3;
                                    z12 = false;
                                } else {
                                    r6Var.f42275b += r6Var2.f42275b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z11 = true;
                                }
                            }
                        } else {
                            r6Var = r6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new j9.a(13));
                        }
                    }
                    i10++;
                    z12 = false;
                }
                bVar2.f10787b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f10788c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.f42274a, r6Var4);
                }
                if (!y6.f44731g0) {
                    y6Var2.U = bVar2;
                    v6 v6Var = y6Var2.J;
                    if (v6Var != null) {
                        v6Var.setCacheModel(bVar2);
                    }
                    y6Var2.v0(true);
                    y6Var2.u0();
                    if (y6Var2.N != null && !y6Var2.H && System.currentTimeMillis() - y6Var2.Q > 120) {
                        i6 i6Var = y6Var2.N;
                        long j10 = y6Var2.D;
                        if (j10 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j11 = y6Var2.E;
                        float f11 = 0.0f;
                        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        if (i13 <= 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((float) j10) / ((float) j11);
                        }
                        long j12 = y6Var2.F;
                        if (j12 > 0 && i13 > 0) {
                            f11 = ((float) (j11 - j12)) / ((float) j11);
                        }
                        i6Var.b(f10, f11, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
