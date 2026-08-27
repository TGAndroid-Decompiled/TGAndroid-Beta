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

    public HashMap f28531a;

    public HashMap f28532b;

    public HashSet f28533c;
    public bg d;

    public final int f28534e;

    public g5(int i10) {
        this.f28534e = i10;
    }

    public static boolean a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        if (!BuildVars.DEBUG_VERSION) {
            return false;
        }
        FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
        return false;
    }

    public final void b(long j10, h5 h5Var) {
        TLRPC.Document document;
        if (j10 == 0) {
            return;
        }
        synchronized (this) {
            try {
                HashMap map = this.f28531a;
                if (map != null && (document = (TLRPC.Document) map.get(Long.valueOf(j10))) != null) {
                    if (h5Var != null) {
                        h5Var.a(document);
                    }
                    return;
                }
                if (a()) {
                    if (this.f28532b == null) {
                        this.f28532b = new HashMap();
                    }
                    ArrayList arrayList = (ArrayList) this.f28532b.get(Long.valueOf(j10));
                    if (arrayList != null) {
                        arrayList.add(h5Var);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(h5Var);
                    this.f28532b.put(Long.valueOf(j10), arrayList2);
                    if (this.f28533c == null) {
                        this.f28533c = new HashSet();
                    }
                    this.f28533c.add(Long.valueOf(j10));
                    if (this.d != null) {
                        return;
                    }
                    bg bgVar = new bg(this, 5);
                    this.d = bgVar;
                    AndroidUtilities.runOnUIThread(bgVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j10) {
        synchronized (this) {
            try {
                HashMap map = this.f28531a;
                if (map == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) map.get(Long.valueOf(j10));
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap map = this.f28532b;
                    if (map != null && (arrayList2 = (ArrayList) map.remove(Long.valueOf(document.f22386id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            h5 h5Var = (h5) arrayList2.get(i11);
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
                if (this.f28531a == null) {
                    this.f28531a = new HashMap();
                }
                this.f28531a.put(Long.valueOf(document.f22386id), document);
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
                if (this.f28531a == null) {
                    this.f28531a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f28531a.put(Long.valueOf(document.f22386id), document);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
