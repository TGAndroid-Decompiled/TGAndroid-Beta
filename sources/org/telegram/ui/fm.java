package org.telegram.ui;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fm implements Runnable {
    public final int f38312a;
    public Object f38313b;
    public final Object f38314c;

    public fm(int i9, Object obj, Object obj2) {
        this.f38312a = i9;
        this.f38314c = obj;
        this.f38313b = obj2;
    }

    private final void a() {
        t5.j jVar = (t5.j) this.f38313b;
        IBinder iBinder = (IBinder) this.f38314c;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.a("Null service connection");
                return;
            }
            try {
                jVar.f47691c = new org.telegram.ui.Cells.e3(iBinder);
                jVar.f47689a = 2;
                ((ScheduledExecutorService) jVar.f47693f.f47701c).execute(new t5.h(jVar, 0));
            } catch (RemoteException e10) {
                jVar.a(e10.getMessage());
            }
        }
    }

    private final void b() {
        t5.j jVar = (t5.j) this.f38313b;
        int i9 = ((t5.k) this.f38314c).f47694a;
        synchronized (jVar) {
            t5.k kVar = (t5.k) jVar.f47692e.get(i9);
            if (kVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i9);
                jVar.f47692e.remove(i9);
                kVar.b(new Exception("Timed out waiting for response", null));
                jVar.c();
            }
        }
    }

    public void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.c():void");
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9 = 0;
        boolean z14 = false;
        boolean z15 = true;
        switch (this.f38312a) {
            case 0:
                qn qnVar = ((gm) this.f38314c).f38568c;
                if (this == qnVar.F5) {
                    qnVar.Ya((CharSequence) this.f38313b, false);
                    qnVar.F5 = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.f38313b;
                boolean z16 = s8Var.d.h;
                s8Var.setChecked(!z16);
                jr jrVar = ((er) this.f38314c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = jrVar.A;
                tL_chatBannedRights.send_media = z16;
                tL_chatBannedRights.send_gifs = z16;
                tL_chatBannedRights.send_inline = z16;
                tL_chatBannedRights.send_games = z16;
                tL_chatBannedRights.send_photos = z16;
                tL_chatBannedRights.send_videos = z16;
                tL_chatBannedRights.send_stickers = z16;
                tL_chatBannedRights.send_audios = z16;
                tL_chatBannedRights.send_docs = z16;
                tL_chatBannedRights.send_voices = z16;
                tL_chatBannedRights.send_roundvideos = z16;
                tL_chatBannedRights.embed_links = z16;
                tL_chatBannedRights.send_polls = z16;
                tL_chatBannedRights.send_reactions = z16;
                AndroidUtilities.updateVisibleRows(jrVar.f39563c);
                cr v02 = jrVar.v0();
                jrVar.A0();
                jrVar.z0(v02);
                return;
            case 2:
                ((org.telegram.ui.Components.gc) this.f38313b).j();
                ((py) this.f38314c).A = null;
                return;
            case 3:
                q5.w wVar = (q5.w) this.f38313b;
                q5.d dVar = (q5.d) this.f38314c;
                q5.b bVar = q5.w.f46057j0;
                m5.d dVar2 = dVar.d;
                m5.x xVar = dVar.f46017f;
                m5.d dVar3 = wVar.Q;
                n5.f0 f0Var = wVar.S;
                if (!q5.a.d(dVar2, dVar3)) {
                    wVar.Q = dVar2;
                    f0Var.c();
                }
                double d = dVar.f46013a;
                if (!Double.isNaN(d) && Math.abs(d - wVar.f46061b0) > 1.0E-7d) {
                    wVar.f46061b0 = d;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z17 = dVar.f46014b;
                if (z17 != wVar.Y) {
                    wVar.Y = z17;
                    z10 = true;
                }
                Double.isNaN(dVar.h);
                q5.b bVar2 = q5.w.f46057j0;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(wVar.f46060a0));
                if (f0Var != null && (z10 || wVar.f46060a0)) {
                    f0Var.f();
                }
                int i10 = dVar.f46015c;
                if (i10 != wVar.f46063d0) {
                    wVar.f46063d0 = i10;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(wVar.f46060a0));
                if (f0Var != null && (z11 || wVar.f46060a0)) {
                    f0Var.a();
                }
                int i11 = dVar.f46016e;
                if (i11 != wVar.f46064e0) {
                    wVar.f46064e0 = i11;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(wVar.f46060a0));
                if (f0Var != null && (z12 || wVar.f46060a0)) {
                    f0Var.e();
                }
                if (!q5.a.d(wVar.f46062c0, xVar)) {
                    wVar.f46062c0 = xVar;
                }
                wVar.f46060a0 = false;
                return;
            case 4:
                q5.w wVar2 = (q5.w) this.f38313b;
                q5.b bVar3 = q5.w.f46057j0;
                String str = ((q5.c) this.f38314c).f46012a;
                if (!q5.a.d(str, wVar2.X)) {
                    wVar2.X = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                q5.w.f46057j0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar2.Z));
                n5.f0 f0Var2 = wVar2.S;
                if (f0Var2 != null && (z13 || wVar2.Z)) {
                    f0Var2.d();
                }
                wVar2.Z = false;
                return;
            case 5:
                rh.m mVar = (rh.m) this.f38314c;
                ArrayList arrayList = (ArrayList) this.f38313b;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    mVar.B((f2.l) obj);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            case 8:
                x1.a aVar = (x1.a) this.f38314c;
                Object obj2 = this.f38313b;
                if (aVar.f48847c.get()) {
                    k5.d dVar4 = aVar.f48848e;
                    if (dVar4.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar4.h = null;
                        dVar4.b();
                    }
                } else {
                    k5.d dVar5 = aVar.f48848e;
                    if (dVar5.f14650g != aVar) {
                        if (dVar5.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar5.h = null;
                            dVar5.b();
                        }
                    } else if (!dVar5.f14647c) {
                        SystemClock.uptimeMillis();
                        dVar5.f14650g = null;
                        w1.a aVar2 = dVar5.f14645a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f48846b = 3;
                return;
            case 9:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f38313b;
                while (!((Set) this.f38314c).isEmpty()) {
                    try {
                        ya.l lVar = (ya.l) referenceQueue.remove();
                        if (lVar.f49704a.remove(lVar)) {
                            lVar.clear();
                            lVar.f49705b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 10:
                Callable callable = (Callable) this.f38313b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f38314c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ua.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new ua.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 11:
                ya.i iVar = (ya.i) this.f38313b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f38314c;
                int decrementAndGet = iVar.f49697b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z15 = false;
                }
                x5.l.k(z15);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f49698c.set(false);
                }
                d7.n.f4440a.clear();
                d7.t.f4448a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 12:
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) this.f38313b;
                if (((Thread) ((AtomicReference) lVar2.d).getAndSet(Thread.currentThread())) == null) {
                    z14 = true;
                }
                x5.l.k(z14);
                try {
                    ((Runnable) this.f38314c).run();
                    ((AtomicReference) lVar2.d).set(null);
                    lVar2.v();
                    return;
                } catch (Throwable th) {
                    try {
                        ((AtomicReference) lVar2.d).set(null);
                        lVar2.v();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                try {
                    c();
                    return;
                } catch (Error e12) {
                    synchronized (((z8.i) this.f38314c).f50381b) {
                        ((z8.i) this.f38314c).f50382c = 1;
                        throw e12;
                    }
                }
        }
    }

    public String toString() {
        String str;
        switch (this.f38312a) {
            case 13:
                Runnable runnable = (Runnable) this.f38313b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i9 = ((z8.i) this.f38314c).f50382c;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
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

    public fm(Object obj, Object obj2, boolean z10, int i9) {
        this.f38312a = i9;
        this.f38313b = obj;
        this.f38314c = obj2;
    }

    public fm(z8.i iVar) {
        this.f38312a = 13;
        this.f38314c = iVar;
    }
}
