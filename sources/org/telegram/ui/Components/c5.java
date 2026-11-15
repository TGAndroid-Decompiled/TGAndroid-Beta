package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class c5 {
    public HashMap f33502a;
    public HashMap f33503b;
    public HashSet f33504c;
    public dg d;
    public final int f33505e;

    public c5(int i7) {
        this.f33505e = i7;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z10 = org.telegram.messenger.r2.f26198a;
            org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j3, d5 d5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f33502a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (d5Var != null) {
                            d5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f33503b == null) {
                            this.f33503b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f33503b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(d5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(d5Var);
                        this.f33503b.put(Long.valueOf(j3), arrayList2);
                        if (this.f33504c == null) {
                            this.f33504c = new HashSet();
                        }
                        this.f33504c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        dg dgVar = new dg(this, 5);
                        this.d = dgVar;
                        org.telegram.messenger.g0.h3(dgVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j3) {
        synchronized (this) {
            try {
                HashMap hashMap = this.f33502a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.gj.i1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            g5.w();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    e(document);
                    HashMap hashMap = this.f33503b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f28057id))) != null) {
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
                if (this.f33502a == null) {
                    this.f33502a = new HashMap();
                }
                this.f33502a.put(Long.valueOf(document.f28057id), document);
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
                if (this.f33502a == null) {
                    this.f33502a = new HashMap();
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f33502a.put(Long.valueOf(document.f28057id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
