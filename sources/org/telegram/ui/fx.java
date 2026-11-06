package org.telegram.ui;

import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlSerializer;
public final class fx implements Runnable {
    public final int f45714a;
    public Object f45715b;
    public final Object f45716c;

    public fx(int i7, Object obj, Object obj2) {
        this.f45714a = i7;
        this.f45716c = obj;
        this.f45715b = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx.a():void");
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        Exception exc;
        FileOutputStream L;
        boolean z11;
        switch (this.f45714a) {
            case 0:
                ((org.telegram.ui.Components.cc) this.f45715b).j();
                ((ix) this.f45716c).E = null;
                return;
            case 1:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f45715b;
                while (!((Set) this.f45716c).isEmpty()) {
                    try {
                        pb.l lVar = (pb.l) referenceQueue.remove();
                        if (lVar.f53425a.remove(lVar)) {
                            lVar.clear();
                            lVar.f53426b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 2:
                Callable callable = (Callable) this.f45715b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f45716c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (lb.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new lb.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 3:
                pb.i iVar = (pb.i) this.f45715b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f45716c;
                int decrementAndGet = iVar.f53418b.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q6.m.j(z9);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f53419c.set(false);
                }
                w7.n.f57488a.clear();
                w7.r.f57492a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 4:
                ab.q qVar = (ab.q) this.f45715b;
                if (((Thread) ((AtomicReference) qVar.d).getAndSet(Thread.currentThread())) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q6.m.j(z10);
                try {
                    ((Runnable) this.f45716c).run();
                    ((AtomicReference) qVar.d).set(null);
                    qVar.F();
                    return;
                } catch (Throwable th2) {
                    try {
                        ((AtomicReference) qVar.d).set(null);
                        qVar.F();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 5:
                v4.u uVar = (v4.u) this.f45715b;
                v4.d1 d1Var = uVar.f57047e;
                v4.y yVar = (v4.y) this.f45716c;
                RecyclerView recyclerView = yVar.H;
                if (recyclerView != null && recyclerView.G && !uVar.f57052w && d1Var.b() != -1) {
                    v4.l0 itemAnimator = yVar.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = yVar.F;
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            if (((v4.u) arrayList.get(i7)).f57053x) {
                            }
                        }
                        yVar.f57079y.q(d1Var);
                        return;
                    }
                    yVar.H.post(this);
                    return;
                }
                return;
            case 6:
                try {
                    a();
                    return;
                } catch (Error e12) {
                    synchronized (((v9.i) this.f45716c).f57160b) {
                        ((v9.i) this.f45716c).f57161c = 1;
                        throw e12;
                    }
                }
            case 7:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f45716c;
                ArrayList arrayList2 = (ArrayList) this.f45715b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f2882f;
                hy0 hy0Var = new hy0(file);
                File file2 = (File) hy0Var.f46520c;
                FileOutputStream fileOutputStream = null;
                try {
                    L = hy0Var.L();
                } catch (Exception e13) {
                    exc = e13;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(L);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        x4.d.h(newSerializer, (x4.f) obj);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    L.flush();
                    try {
                        L.getFD().sync();
                        z11 = true;
                    } catch (IOException unused2) {
                        z11 = false;
                    }
                    if (!z11) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        L.close();
                    } catch (IOException e14) {
                        Log.e("AtomicFile", "Failed to close file output stream", e14);
                    }
                    hy0.I(file2, file);
                    return;
                } catch (Exception e15) {
                    exc = e15;
                    fileOutputStream = L;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e16) {
                            Log.e("AtomicFile", "Failed to close file output stream", e16);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 8:
                c0.m mVar = (c0.m) this.f45716c;
                try {
                    ((c0.m) this.f45715b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e17) {
                    mVar.l(e17);
                    return;
                }
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f45716c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2879b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f45715b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2883g);
                    fVar.putAll(x4.d.c(shortcutInfoCompatSaverImpl2.f2882f, shortcutInfoCompatSaverImpl2.f2878a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e18) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e18);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f45716c;
                shortcutInfoCompatSaverImpl3.f2879b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2880c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((m9.y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.m) this.f45715b);
                return;
            case 11:
                if (!(((c0.m) this.f45715b).f5237a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f45716c).run();
                        ((c0.m) this.f45715b).k(null);
                        return;
                    } catch (Exception e19) {
                        ((c0.m) this.f45715b).l(e19);
                        return;
                    }
                }
                return;
            default:
                ((zd.m) this.f45716c).D((zd.v0) this.f45715b);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f45714a) {
            case 6:
                Runnable runnable = (Runnable) this.f45715b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((v9.i) this.f45716c).f57161c;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public fx(Object obj, Object obj2, boolean z9, int i7) {
        this.f45714a = i7;
        this.f45715b = obj;
        this.f45716c = obj2;
    }

    public fx(v9.i iVar) {
        this.f45714a = 6;
        this.f45716c = iVar;
    }

    public fx(v4.y yVar, v4.u uVar, int i7) {
        this.f45714a = 5;
        this.f45716c = yVar;
        this.f45715b = uVar;
    }
}
