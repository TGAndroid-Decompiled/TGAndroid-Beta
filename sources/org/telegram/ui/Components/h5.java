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
    public HashMap f25314a;
    public HashMap f25315b;
    public HashSet f25316c;
    public fg d;
    public final int e;

    public h5(int i10) {
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

    public final void b(long j10, i5 i5Var) {
        TLRPC.Document document;
        if (j10 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f25314a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                        if (i5Var != null) {
                            i5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f25315b == null) {
                            this.f25315b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f25315b.get(Long.valueOf(j10));
                        if (arrayList != null) {
                            arrayList.add(i5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(i5Var);
                        this.f25315b.put(Long.valueOf(j10), arrayList2);
                        if (this.f25316c == null) {
                            this.f25316c = new HashSet();
                        }
                        this.f25316c.add(Long.valueOf(j10));
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
                HashMap hashMap = this.f25314a;
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
                    HashMap hashMap = this.f25315b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f19165id))) != null) {
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
                if (this.f25314a == null) {
                    this.f25314a = new HashMap();
                }
                this.f25314a.put(Long.valueOf(document.f19165id), document);
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
                if (this.f25314a == null) {
                    this.f25314a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f25314a.put(Long.valueOf(document.f19165id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
