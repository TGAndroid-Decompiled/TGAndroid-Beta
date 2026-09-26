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
    public final int f32929a;
    public final z6 f32930b;
    public final ArrayList f32931c;
    public final ArrayList d;
    public final ArrayList e;
    public final zh.b f32932f;

    public d6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.f32929a = i10;
        this.f32930b = z6Var;
        this.f32931c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f32932f = bVar;
    }

    @Override
    public final void run() {
        boolean z10;
        float f7;
        boolean z11;
        switch (this.f32929a) {
            case 0:
                z6 z6Var = this.f32930b;
                ArrayList<Long> arrayList = this.f32931c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                zh.b bVar = this.f32932f;
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
                    if (((r6) arrayList3.get(i10)).f37187c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new d6(z6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                return;
            default:
                z6 z6Var2 = this.f32930b;
                ArrayList<TLRPC.User> arrayList6 = this.f32931c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                zh.b bVar2 = this.f32932f;
                z6Var2.getMessagesController().putUsers(arrayList6, true);
                z6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z12 = false;
                r6 r6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i11);
                    if (z6Var2.getMessagesController().getUserOrChat(r6Var2.f37185a) == null) {
                        r6Var2.f37185a = Long.MAX_VALUE;
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
                                    s6Var2.f37598a += s6Var.f37598a;
                                    r6Var3.f37187c += s6Var.f37598a;
                                    s6Var2.f37599b.addAll(s6Var.f37599b);
                                    i12++;
                                    r6Var = r6Var3;
                                    z12 = false;
                                } else {
                                    r6Var.f37186b += r6Var2.f37186b;
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
                            Collections.sort(arrayList8, new a4.e(27));
                        }
                    }
                    i11++;
                    z12 = false;
                }
                bVar2.f49469b = arrayList8;
                LongSparseArray longSparseArray = bVar2.f49470c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.f37185a, r6Var4);
                }
                if (!z6.f40341k0) {
                    z6Var2.Y = bVar2;
                    w6 w6Var = z6Var2.N;
                    if (w6Var != null) {
                        w6Var.setCacheModel(bVar2);
                    }
                    z6Var2.w0(true);
                    z6Var2.v0();
                    if (z6Var2.R != null && !z6Var2.L && System.currentTimeMillis() - z6Var2.U > 120) {
                        j6 j6Var = z6Var2.R;
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
                        j6Var.b(f7, f10, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
