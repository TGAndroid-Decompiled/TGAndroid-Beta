package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class k5 {
    public HashMap f36678a;
    public HashMap f36679b;
    public HashSet f36680c;
    public lg d;
    public final int f36681e;

    public k5(int i7) {
        this.f36681e = i7;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z10 = org.telegram.messenger.s2.f26721a;
            org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j3, l5 l5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f36678a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (l5Var != null) {
                            l5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f36679b == null) {
                            this.f36679b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f36679b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(l5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(l5Var);
                        this.f36679b.put(Long.valueOf(j3), arrayList2);
                        if (this.f36680c == null) {
                            this.f36680c = new HashSet();
                        }
                        this.f36680c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        lg lgVar = new lg(this, 5);
                        this.d = lgVar;
                        org.telegram.messenger.g0.g3(lgVar);
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
                HashMap hashMap = this.f36678a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.fj.i1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            o5.w();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    e(document);
                    HashMap hashMap = this.f36679b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f28409id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            l5 l5Var = (l5) arrayList2.get(i10);
                            if (l5Var != null) {
                                l5Var.a(document);
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
                if (this.f36678a == null) {
                    this.f36678a = new HashMap();
                }
                this.f36678a.put(Long.valueOf(document.f28409id), document);
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
                if (this.f36678a == null) {
                    this.f36678a = new HashMap();
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f36678a.put(Long.valueOf(document.f28409id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
