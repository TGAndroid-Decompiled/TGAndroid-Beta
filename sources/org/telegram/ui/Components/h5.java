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
public final class h5 {
    public HashMap f27385a;
    public HashMap f27386b;
    public HashSet f27387c;
    public fg d;
    public final int f27388e;

    public h5(int i10) {
        this.f27388e = i10;
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

    public final void b(long j10, i5 i5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f27385a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (i5Var != null) {
                            i5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f27386b == null) {
                            this.f27386b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f27386b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(i5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(i5Var);
                        this.f27386b.put(Long.valueOf(j10), arrayList2);
                        if (this.f27387c == null) {
                            this.f27387c = new HashSet();
                        }
                        this.f27387c.add(Long.valueOf(j10));
                        if (this.d != null) {
                            return;
                        }
                        fg fgVar = new fg(this, 5);
                        this.d = fgVar;
                        AndroidUtilities.runOnUIThread(fgVar);
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
                HashMap hashMap = this.f27385a;
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
            l5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f27386b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f20849id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            i5 i5Var = (i5) arrayList2.get(i11);
                            if (i5Var != null) {
                                i5Var.a(document);
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
                if (this.f27385a == null) {
                    this.f27385a = new HashMap();
                }
                this.f27385a.put(Long.valueOf(document.f20849id), document);
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
                if (this.f27385a == null) {
                    this.f27385a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f27385a.put(Long.valueOf(document.f20849id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
