package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public HashMap f32887a;
    public HashMap f32888b;
    public HashSet f32889c;
    public wf d;
    public final int f32890e;

    public d5(int i7) {
        this.f32890e = i7;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            boolean z9 = org.telegram.messenger.r2.f25216a;
            org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }
        return true;
    }

    public final void b(long j3, e5 e5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f32887a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (e5Var != null) {
                            e5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f32888b == null) {
                            this.f32888b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f32888b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(e5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(e5Var);
                        this.f32888b.put(Long.valueOf(j3), arrayList2);
                        if (this.f32889c == null) {
                            this.f32889c = new HashSet();
                        }
                        this.f32889c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        wf wfVar = new wf(this, 5);
                        this.d = wfVar;
                        org.telegram.messenger.g0.h3(wfVar);
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
                HashMap hashMap = this.f32887a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.ij.i1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            h5.w();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    e(document);
                    HashMap hashMap = this.f32888b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f26966id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            e5 e5Var = (e5) arrayList2.get(i10);
                            if (e5Var != null) {
                                e5Var.a(document);
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
                if (this.f32887a == null) {
                    this.f32887a = new HashMap();
                }
                this.f32887a.put(Long.valueOf(document.f26966id), document);
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
                if (this.f32887a == null) {
                    this.f32887a = new HashMap();
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f32887a.put(Long.valueOf(document.f26966id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
