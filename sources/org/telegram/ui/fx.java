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
    public final int f45717a;
    public Object f45718b;
    public final Object f45719c;

    public fx(int i7, Object obj, Object obj2) {
        this.f45717a = i7;
        this.f45719c = obj;
        this.f45718b = obj2;
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
        switch (this.f45717a) {
            case 0:
                ((org.telegram.ui.Components.cc) this.f45718b).j();
                ((ix) this.f45719c).E = null;
                return;
            case 1:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f45718b;
                while (!((Set) this.f45719c).isEmpty()) {
                    try {
                        pb.l lVar = (pb.l) referenceQueue.remove();
                        if (lVar.f53543a.remove(lVar)) {
                            lVar.clear();
                            lVar.f53544b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 2:
                Callable callable = (Callable) this.f45718b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f45719c;
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
                pb.i iVar = (pb.i) this.f45718b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f45719c;
                int decrementAndGet = iVar.f53536b.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q6.m.j(z9);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f53537c.set(false);
                }
                w7.n.f57605a.clear();
                w7.r.f57609a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 4:
                ab.q qVar = (ab.q) this.f45718b;
                if (((Thread) ((AtomicReference) qVar.d).getAndSet(Thread.currentThread())) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q6.m.j(z10);
                try {
                    ((Runnable) this.f45719c).run();
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
                v4.u uVar = (v4.u) this.f45718b;
                v4.d1 d1Var = uVar.f57164e;
                v4.y yVar = (v4.y) this.f45719c;
                RecyclerView recyclerView = yVar.H;
                if (recyclerView != null && recyclerView.G && !uVar.f57169w && d1Var.b() != -1) {
                    v4.l0 itemAnimator = yVar.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = yVar.F;
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            if (((v4.u) arrayList.get(i7)).f57170x) {
                            }
                        }
                        yVar.f57196y.q(d1Var);
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
                    synchronized (((v9.i) this.f45719c).f57277b) {
                        ((v9.i) this.f45719c).f57278c = 1;
                        throw e12;
                    }
                }
            case 7:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f45719c;
                ArrayList arrayList2 = (ArrayList) this.f45718b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f2882f;
                hy0 hy0Var = new hy0(file);
                File file2 = (File) hy0Var.f46527c;
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
                c0.m mVar = (c0.m) this.f45719c;
                try {
                    ((c0.m) this.f45718b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e17) {
                    mVar.l(e17);
                    return;
                }
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f45719c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2879b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f45718b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2883g);
                    fVar.putAll(x4.d.c(shortcutInfoCompatSaverImpl2.f2882f, shortcutInfoCompatSaverImpl2.f2878a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e18) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e18);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f45719c;
                shortcutInfoCompatSaverImpl3.f2879b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2880c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((m9.y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.m) this.f45718b);
                return;
            case 11:
                if (!(((c0.m) this.f45718b).f5237a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f45719c).run();
                        ((c0.m) this.f45718b).k(null);
                        return;
                    } catch (Exception e19) {
                        ((c0.m) this.f45718b).l(e19);
                        return;
                    }
                }
                return;
            default:
                ((zd.m) this.f45719c).D((zd.v0) this.f45718b);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f45717a) {
            case 6:
                Runnable runnable = (Runnable) this.f45718b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((v9.i) this.f45719c).f57278c;
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
        this.f45717a = i7;
        this.f45718b = obj;
        this.f45719c = obj2;
    }

    public fx(v9.i iVar) {
        this.f45717a = 6;
        this.f45719c = iVar;
    }

    public fx(v4.y yVar, v4.u uVar, int i7) {
        this.f45717a = 5;
        this.f45719c = yVar;
        this.f45718b = uVar;
    }
}
