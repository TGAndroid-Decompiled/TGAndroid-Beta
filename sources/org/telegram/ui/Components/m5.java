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
public final class m5 {
    public HashMap f26095a;
    public HashMap f26096b;
    public HashSet f26097c;
    public og d;
    public final int e;

    public m5(int i10) {
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

    public final void b(long j3, n5 n5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f26095a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (n5Var != null) {
                            n5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f26096b == null) {
                            this.f26096b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f26096b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(n5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(n5Var);
                        this.f26096b.put(Long.valueOf(j3), arrayList2);
                        if (this.f26097c == null) {
                            this.f26097c = new HashSet();
                        }
                        this.f26097c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        og ogVar = new og(this, 5);
                        this.d = ogVar;
                        AndroidUtilities.runOnUIThread(ogVar);
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
                HashMap hashMap = this.f26095a;
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
            q5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f26096b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f18089id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            n5 n5Var = (n5) arrayList2.get(i11);
                            if (n5Var != null) {
                                n5Var.a(document);
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
                if (this.f26095a == null) {
                    this.f26095a = new HashMap();
                }
                this.f26095a.put(Long.valueOf(document.f18089id), document);
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
                if (this.f26095a == null) {
                    this.f26095a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f26095a.put(Long.valueOf(document.f18089id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
