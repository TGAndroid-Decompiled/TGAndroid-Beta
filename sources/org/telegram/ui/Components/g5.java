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
public final class g5 {
    public HashMap f28651a;
    public HashMap f28652b;
    public HashSet f28653c;
    public fg d;
    public final int f28654e;

    public g5(int i9) {
        this.f28654e = i9;
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

    public final void b(long j10, h5 h5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f28651a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (h5Var != null) {
                            h5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f28652b == null) {
                            this.f28652b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f28652b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(h5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(h5Var);
                        this.f28652b.put(Long.valueOf(j10), arrayList2);
                        if (this.f28653c == null) {
                            this.f28653c = new HashSet();
                        }
                        this.f28653c.add(Long.valueOf(j10));
                        if (this.d != null) {
                            return;
                        }
                        fg fgVar = new fg(this, 5);
                        this.d = fgVar;
                        AndroidUtilities.runOnUIThread(fgVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j10) {
        synchronized (this) {
            try {
                HashMap hashMap = this.f28651a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j10));
                if (document == null) {
                    return null;
                }
                return MessageObject.getInputStickerSet(document);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            k5.x();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (arrayList.get(i9) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
                    e(document);
                    HashMap hashMap = this.f28652b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f22386id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            h5 h5Var = (h5) arrayList2.get(i10);
                            if (h5Var != null) {
                                h5Var.a(document);
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
                if (this.f28651a == null) {
                    this.f28651a = new HashMap();
                }
                this.f28651a.put(Long.valueOf(document.f22386id), document);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f28651a == null) {
                    this.f28651a = new HashMap();
                }
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f28651a.put(Long.valueOf(document.f22386id), document);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
