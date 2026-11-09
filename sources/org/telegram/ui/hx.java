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
public final class hx implements Runnable {
    public final int f46420a;
    public Object f46421b;
    public final Object f46422c;

    public hx(int i7, Object obj, Object obj2) {
        this.f46420a = i7;
        this.f46422c = obj;
        this.f46421b = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx.a():void");
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        Exception exc;
        FileOutputStream L;
        boolean z11;
        switch (this.f46420a) {
            case 0:
                ((org.telegram.ui.Components.cc) this.f46421b).j();
                ((kx) this.f46422c).E = null;
                return;
            case 1:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f46421b;
                while (!((Set) this.f46422c).isEmpty()) {
                    try {
                        pb.l lVar = (pb.l) referenceQueue.remove();
                        if (lVar.f53555a.remove(lVar)) {
                            lVar.clear();
                            lVar.f53556b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 2:
                Callable callable = (Callable) this.f46421b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f46422c;
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
                pb.i iVar = (pb.i) this.f46421b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f46422c;
                int decrementAndGet = iVar.f53548b.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q6.m.j(z9);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f53549c.set(false);
                }
                w7.n.f57617a.clear();
                w7.r.f57621a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 4:
                ab.q qVar = (ab.q) this.f46421b;
                if (((Thread) ((AtomicReference) qVar.d).getAndSet(Thread.currentThread())) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q6.m.j(z10);
                try {
                    ((Runnable) this.f46422c).run();
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
                v4.u uVar = (v4.u) this.f46421b;
                v4.d1 d1Var = uVar.f57176e;
                v4.y yVar = (v4.y) this.f46422c;
                RecyclerView recyclerView = yVar.H;
                if (recyclerView != null && recyclerView.G && !uVar.f57181w && d1Var.b() != -1) {
                    v4.l0 itemAnimator = yVar.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = yVar.F;
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            if (((v4.u) arrayList.get(i7)).f57182x) {
                            }
                        }
                        yVar.f57208y.q(d1Var);
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
                    synchronized (((v9.i) this.f46422c).f57289b) {
                        ((v9.i) this.f46422c).f57290c = 1;
                        throw e12;
                    }
                }
            case 7:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f46422c;
                ArrayList arrayList2 = (ArrayList) this.f46421b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f2882f;
                ky0 ky0Var = new ky0(file);
                File file2 = (File) ky0Var.f47423c;
                FileOutputStream fileOutputStream = null;
                try {
                    L = ky0Var.L();
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
                    ky0.I(file2, file);
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
                c0.m mVar = (c0.m) this.f46422c;
                try {
                    ((c0.m) this.f46421b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e17) {
                    mVar.l(e17);
                    return;
                }
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f46422c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2879b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f46421b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2883g);
                    fVar.putAll(x4.d.c(shortcutInfoCompatSaverImpl2.f2882f, shortcutInfoCompatSaverImpl2.f2878a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e18) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e18);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f46422c;
                shortcutInfoCompatSaverImpl3.f2879b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2880c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((m9.y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.m) this.f46421b);
                return;
            case 11:
                if (!(((c0.m) this.f46421b).f5235a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f46422c).run();
                        ((c0.m) this.f46421b).k(null);
                        return;
                    } catch (Exception e19) {
                        ((c0.m) this.f46421b).l(e19);
                        return;
                    }
                }
                return;
            default:
                ((zd.m) this.f46422c).D((zd.v0) this.f46421b);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f46420a) {
            case 6:
                Runnable runnable = (Runnable) this.f46421b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((v9.i) this.f46422c).f57290c;
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

    public hx(Object obj, Object obj2, boolean z9, int i7) {
        this.f46420a = i7;
        this.f46421b = obj;
        this.f46422c = obj2;
    }

    public hx(v9.i iVar) {
        this.f46420a = 6;
        this.f46422c = iVar;
    }

    public hx(v4.y yVar, v4.u uVar, int i7) {
        this.f46420a = 5;
        this.f46422c = yVar;
        this.f46421b = uVar;
    }
}
