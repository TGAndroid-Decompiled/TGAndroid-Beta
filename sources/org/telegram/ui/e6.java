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
    public final int f32065a;
    public final y6 f32066b;
    public final ArrayList f32067c;
    public final ArrayList d;
    public final ArrayList e;
    public final yh.b f32068f;

    public e6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, yh.b bVar, int i10) {
        this.f32065a = i10;
        this.f32066b = y6Var;
        this.f32067c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f32068f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f32065a) {
            case 0:
                y6 y6Var = this.f32066b;
                ArrayList<Long> arrayList = this.f32067c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                yh.b bVar = this.f32068f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i10)).f36240c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(20));
                AndroidUtilities.runOnUIThread(new e6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                y6 y6Var2 = this.f32066b;
                ArrayList<TLRPC.User> arrayList6 = this.f32067c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                yh.b bVar2 = this.f32068f;
                y6Var2.getMessagesController().putUsers(arrayList6, true);
                y6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                r6 r6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i11);
                    if (y6Var2.getMessagesController().getUserOrChat(r6Var2.f36238a) == null) {
                        r6Var2.f36238a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i12);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z12);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.f36559a += s6Var.f36559a;
                                    r6Var3.f36240c += s6Var.f36559a;
                                    s6Var2.f36560b.addAll(s6Var.f36560b);
                                    i12++;
                                    r6Var = r6Var3;
                                    z12 = false;
                                } else {
                                    r6Var.f36239b += r6Var2.f36239b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = true;
                                }
                            }
                        } else {
                            r6Var = r6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new a4.e(20));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                bVar2.f47173b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f47174c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.f36238a, r6Var4);
                }
                if (!y6.f38903k0) {
                    y6Var2.Y = bVar2;
                    v6 v6Var = y6Var2.N;
                    if (v6Var != null) {
                        v6Var.setCacheModel(bVar2);
                    }
                    y6Var2.w0(true);
                    y6Var2.v0();
                    if (y6Var2.R != null && !y6Var2.L && System.currentTimeMillis() - y6Var2.U > 120) {
                        k6 k6Var = y6Var2.R;
                        long j3 = y6Var2.H;
                        if (j3 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j10 = y6Var2.I;
                        float f10 = 0.0f;
                        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i14 <= 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = ((float) j3) / ((float) j10);
                        }
                        long j11 = y6Var2.J;
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
