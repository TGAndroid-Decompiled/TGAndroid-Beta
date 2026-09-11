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
    public final int f35672a;
    public final z6 f35673b;
    public final ArrayList f35674c;
    public final ArrayList d;
    public final ArrayList f35675e;
    public final ai.c f35676f;

    public d6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ai.c cVar, int i10) {
        this.f35672a = i10;
        this.f35673b = z6Var;
        this.f35674c = arrayList;
        this.d = arrayList2;
        this.f35675e = arrayList3;
        this.f35676f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f35672a) {
            case 0:
                z6 z6Var = this.f35673b;
                ArrayList<Long> arrayList = this.f35674c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.f35675e;
                ai.c cVar = this.f35676f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i10)).f40314c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(29));
                AndroidUtilities.runOnUIThread(new d6(z6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                return;
            default:
                z6 z6Var2 = this.f35673b;
                ArrayList<TLRPC.User> arrayList6 = this.f35674c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.f35675e;
                ai.c cVar2 = this.f35676f;
                z6Var2.getMessagesController().putUsers(arrayList6, true);
                z6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                s6 s6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i11);
                    if (z6Var2.getMessagesController().getUserOrChat(s6Var2.f40312a) == null) {
                        s6Var2.f40312a = Long.MAX_VALUE;
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
                                    t6Var2.f40632a += t6Var.f40632a;
                                    s6Var3.f40314c += t6Var.f40632a;
                                    t6Var2.f40633b.addAll(t6Var.f40633b);
                                    i12++;
                                    s6Var = s6Var3;
                                    z12 = false;
                                } else {
                                    s6Var.f40313b += s6Var2.f40313b;
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
                            Collections.sort(arrayList8, new a4.e(29));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                cVar2.f745b = arrayList8;
                LongSparseArray longSparseArray = cVar2.f746c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.f40312a, s6Var4);
                }
                if (!z6.f43299k0) {
                    z6Var2.Y = cVar2;
                    w6 w6Var = z6Var2.N;
                    if (w6Var != null) {
                        w6Var.setCacheModel(cVar2);
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
