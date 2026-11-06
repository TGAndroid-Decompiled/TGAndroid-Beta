package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class e5 {
    public HashMap f33139a;
    public HashMap f33140b;
    public HashSet f33141c;
    public xf d;
    public final int f33142e;

    public e5(int i7) {
        this.f33142e = i7;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z9 = org.telegram.messenger.r2.f25191a;
            org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j3, f5 f5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f33139a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (f5Var != null) {
                            f5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f33140b == null) {
                            this.f33140b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f33140b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(f5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(f5Var);
                        this.f33140b.put(Long.valueOf(j3), arrayList2);
                        if (this.f33141c == null) {
                            this.f33141c = new HashSet();
                        }
                        this.f33141c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        xf xfVar = new xf(this, 5);
                        this.d = xfVar;
                        org.telegram.messenger.g0.h3(xfVar);
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
                HashMap hashMap = this.f33139a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.ij.j1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            i5.w();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    e(document);
                    HashMap hashMap = this.f33140b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f26958id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            f5 f5Var = (f5) arrayList2.get(i10);
                            if (f5Var != null) {
                                f5Var.a(document);
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
                if (this.f33139a == null) {
                    this.f33139a = new HashMap();
                }
                this.f33139a.put(Long.valueOf(document.f26958id), document);
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
                if (this.f33139a == null) {
                    this.f33139a = new HashMap();
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f33139a.put(Long.valueOf(document.f26958id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
