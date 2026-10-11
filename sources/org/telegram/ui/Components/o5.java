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
public final class o5 {
    public HashMap f29384a;
    public HashMap f29385b;
    public HashSet f29386c;
    public rg d;
    public final int f29387e;

    public o5(int i10) {
        this.f29387e = i10;
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

    public final void b(long j3, p5 p5Var) {
        TLRPC.Document document;
        if (j3 != 0) {
            synchronized (this) {
                try {
                    HashMap hashMap = this.f29384a;
                    if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                        if (p5Var != null) {
                            p5Var.a(document);
                        }
                    } else if (a()) {
                        if (this.f29385b == null) {
                            this.f29385b = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.f29385b.get(Long.valueOf(j3));
                        if (arrayList != null) {
                            arrayList.add(p5Var);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(p5Var);
                        this.f29385b.put(Long.valueOf(j3), arrayList2);
                        if (this.f29386c == null) {
                            this.f29386c = new HashSet();
                        }
                        this.f29386c.add(Long.valueOf(j3));
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
                HashMap hashMap = this.f29384a;
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
            s5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.f29385b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.f20074id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            p5 p5Var = (p5) arrayList2.get(i11);
                            if (p5Var != null) {
                                p5Var.a(document);
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
                if (this.f29384a == null) {
                    this.f29384a = new HashMap();
                }
                this.f29384a.put(Long.valueOf(document.f20074id), document);
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
                if (this.f29384a == null) {
                    this.f29384a = new HashMap();
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.f29384a.put(Long.valueOf(document.f20074id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
