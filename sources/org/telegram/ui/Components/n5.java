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
public final class n5 {
    public HashMap f28687a;
    public HashMap f28688b;
    public HashSet f28689c;
    public pg d;
    public final int e;

    public n5(int i10) {
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

    public final void b(long j10, o5 o5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f28687a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (o5Var != null) {
                            o5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f28688b == null) {
                            this.f28688b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f28688b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(o5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(o5Var);
                        this.f28688b.put(Long.valueOf(j10), arrayList2);
                        if (this.f28689c == null) {
                            this.f28689c = new HashSet();
                        }
                        this.f28689c.add(Long.valueOf(j10));
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

    public final TLRPC.InputStickerSet c(long j10) {
        synchronized (this) {
            try {
                HashMap hashMap = this.f28687a;
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
            r5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f28688b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f20282id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            o5 o5Var = (o5) arrayList2.get(i11);
                            if (o5Var != null) {
                                o5Var.a(document);
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
                if (this.f28687a == null) {
                    this.f28687a = new HashMap();
                }
                this.f28687a.put(Long.valueOf(document.f20282id), document);
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
                if (this.f28687a == null) {
                    this.f28687a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f28687a.put(Long.valueOf(document.f20282id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
