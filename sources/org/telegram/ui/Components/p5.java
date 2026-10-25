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
public final class p5 {
    public HashMap f31444a;
    public HashMap f31445b;
    public HashSet f31446c;
    public pg d;
    public final int e;

    public p5(int i10) {
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

    public final void b(long j10, q5 q5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f31444a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (q5Var != null) {
                            q5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f31445b == null) {
                            this.f31445b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f31445b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(q5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(q5Var);
                        this.f31445b.put(Long.valueOf(j10), arrayList2);
                        if (this.f31446c == null) {
                            this.f31446c = new HashSet();
                        }
                        this.f31446c.add(Long.valueOf(j10));
                        if (this.d != null) {
                            return;
                        }
                        pg pgVar = new pg(this, 6);
                        this.d = pgVar;
                        AndroidUtilities.runOnUIThread(pgVar);
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
                HashMap hashMap = this.f31444a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j10));
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
            t5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f31445b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f22033id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            q5 q5Var = (q5) arrayList2.get(i11);
                            if (q5Var != null) {
                                q5Var.a(document);
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
                if (this.f31444a == null) {
                    this.f31444a = new HashMap();
                }
                this.f31444a.put(Long.valueOf(document.f22033id), document);
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
                if (this.f31444a == null) {
                    this.f31444a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f31444a.put(Long.valueOf(document.f22033id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
