package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class b5 {
    public HashMap f24631a;
    public HashMap f24632b;
    public HashSet f24633c;
    public tf d;
    public final int e;

    public b5(int i10) {
        this.e = i10;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z10 = org.telegram.messenger.v2.f18578a;
            org.telegram.messenger.f8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j10, c5 c5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f24631a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (c5Var != null) {
                            c5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f24632b == null) {
                            this.f24632b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f24632b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(c5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(c5Var);
                        this.f24632b.put(Long.valueOf(j10), arrayList2);
                        if (this.f24633c == null) {
                            this.f24633c = new HashSet();
                        }
                        this.f24633c.add(Long.valueOf(j10));
                        if (this.d != null) {
                            return;
                        }
                        tf tfVar = new tf(this, 6);
                        this.d = tfVar;
                        org.telegram.messenger.i0.g3(tfVar);
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
                HashMap hashMap = this.f24631a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j10));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.kj.j1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            f5.w();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f24632b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f19800id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            c5 c5Var = (c5) arrayList2.get(i11);
                            if (c5Var != null) {
                                c5Var.a(document);
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
                if (this.f24631a == null) {
                    this.f24631a = new HashMap();
                }
                this.f24631a.put(Long.valueOf(document.f19800id), document);
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
                if (this.f24631a == null) {
                    this.f24631a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f24631a.put(Long.valueOf(document.f19800id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
