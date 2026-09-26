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
    public HashMap f26314a;
    public HashMap f26315b;
    public HashSet f26316c;
    public pg d;
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
                    HashMap hashMap = this.f26314a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (n5Var != null) {
                            n5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f26315b == null) {
                            this.f26315b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f26315b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(n5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(n5Var);
                        this.f26315b.put(Long.valueOf(j3), arrayList2);
                        if (this.f26316c == null) {
                            this.f26316c = new HashSet();
                        }
                        this.f26316c.add(Long.valueOf(j3));
                        if (this.d != null) {
                            return;
                        }
                        pg pgVar = new pg(this, 5);
                        this.d = pgVar;
                        AndroidUtilities.runOnUIThread(pgVar);
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
                HashMap hashMap = this.f26314a;
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
                    HashMap hashMap = this.f26315b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f18341id))) != null) {
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
                if (this.f26314a == null) {
                    this.f26314a = new HashMap();
                }
                this.f26314a.put(Long.valueOf(document.f18341id), document);
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
                if (this.f26314a == null) {
                    this.f26314a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f26314a.put(Long.valueOf(document.f18341id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
