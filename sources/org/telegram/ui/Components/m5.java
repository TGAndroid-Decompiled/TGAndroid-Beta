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
    public HashMap f28608a;
    public HashMap f28609b;
    public HashSet f28610c;
    public qg d;
    public final int f28611e;

    public m5(int i10) {
        this.f28611e = i10;
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
                    HashMap hashMap = this.f28608a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (n5Var != null) {
                            n5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f28609b == null) {
                            this.f28609b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f28609b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(n5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(n5Var);
                        this.f28609b.put(Long.valueOf(j3), arrayList2);
                        if (this.f28610c == null) {
                            this.f28610c = new HashSet();
                        }
                        this.f28610c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        qg qgVar = new qg(this, 5);
                        this.d = qgVar;
                        AndroidUtilities.runOnUIThread(qgVar);
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
                HashMap hashMap = this.f28608a;
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
                    HashMap hashMap = this.f28609b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f20053id))) != null) {
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
                if (this.f28608a == null) {
                    this.f28608a = new HashMap();
                }
                this.f28608a.put(Long.valueOf(document.f20053id), document);
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
                if (this.f28608a == null) {
                    this.f28608a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f28608a.put(Long.valueOf(document.f20053id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
