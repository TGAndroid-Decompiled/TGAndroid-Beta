package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class c5 {
    public HashMap f32561a;
    public HashMap f32562b;
    public HashSet f32563c;
    public vf d;
    public final int f32564e;

    public c5(int i3) {
        this.f32564e = i3;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z10 = org.telegram.messenger.r2.f25040a;
            org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j10, d5 d5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f32561a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (d5Var != null) {
                            d5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f32562b == null) {
                            this.f32562b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f32562b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(d5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(d5Var);
                        this.f32562b.put(Long.valueOf(j10), arrayList2);
                        if (this.f32563c == null) {
                            this.f32563c = new HashSet();
                        }
                        this.f32563c.add(Long.valueOf(j10));
                        if (this.d != null) {
                            return;
                        }
                        vf vfVar = new vf(this, 5);
                        this.d = vfVar;
                        org.telegram.messenger.g0.h3(vfVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j10) {
        synchronized (this) {
            try {
                HashMap hashMap = this.f32561a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j10));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.zi.j1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            g5.w();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
                    e(document);
                    HashMap hashMap = this.f32562b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f27007id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            d5 d5Var = (d5) arrayList2.get(i10);
                            if (d5Var != null) {
                                d5Var.a(document);
                            }
                        }
                        arrayList2.clear();
                    }
                }
            }
        }
    }

    public final void e(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f32561a == null) {
                    this.f32561a = new HashMap();
                }
                this.f32561a.put(Long.valueOf(document.f27007id), document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f32561a == null) {
                    this.f32561a = new HashMap();
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f32561a.put(Long.valueOf(document.f27007id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
