package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l5 {
    public HashMap f24876a;
    public HashMap f24877b;
    public HashSet f24878c;
    public rg d;
    public final int e;

    public l5(int i10) {
        this.e = i10;
    }

    public static boolean a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
                return false;
            }
            return false;
        }
        return true;
    }

    public final void b(long j3, m5 m5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f24876a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (m5Var != null) {
                            m5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f24877b == null) {
                            this.f24877b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f24877b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(m5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(m5Var);
                        this.f24877b.put(Long.valueOf(j3), arrayList2);
                        if (this.f24878c == null) {
                            this.f24878c = new HashSet();
                        }
                        this.f24878c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        rg rgVar = new rg(this, 5);
                        this.d = rgVar;
                        AndroidUtilities.runOnUIThread(rgVar);
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
                HashMap hashMap = this.f24876a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document == null) {
                    return null;
                }
                return MessageObject.getInputStickerSet(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            p5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f24877b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f17201id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            m5 m5Var = (m5) arrayList2.get(i11);
                            if (m5Var != null) {
                                m5Var.a(document);
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
                if (this.f24876a == null) {
                    this.f24876a = new HashMap();
                }
                this.f24876a.put(Long.valueOf(document.f17201id), document);
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
                if (this.f24876a == null) {
                    this.f24876a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f24876a.put(Long.valueOf(document.f17201id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
