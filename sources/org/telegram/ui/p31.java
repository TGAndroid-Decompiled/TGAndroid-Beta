package org.telegram.ui;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class p31 implements Runnable {
    public final int f48603a;
    public final long f48604b;
    public final Object f48605c;

    public p31(Object obj, long j3, int i7) {
        this.f48603a = i7;
        this.f48605c = obj;
        this.f48604b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48603a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.f48605c).a(Long.valueOf(this.f48604b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f48605c;
                long j3 = this.f48604b;
                b0Var.getClass();
                b0Var.presentFragment(an.ra(j3));
                return;
            case 2:
                org.telegram.utils.twidget.h1 h1Var = (org.telegram.utils.twidget.h1) this.f48605c;
                long j10 = this.f48604b;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    org.telegram.utils.twidget.r0 r0Var = h1Var.f52827c;
                    org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) r0Var.f52957e.remove(Long.valueOf(j10));
                    if (o0Var != null) {
                        org.telegram.utils.twidget.b h12 = o0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.J(o0Var.d);
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (r0Var.f52955b) {
                            r0Var.i(o0Var.f52928a);
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                long j11 = this.f48604b;
                vi.h hVar = (vi.h) ((ac.e) this.f48605c).f1025c;
                if (j11 == hVar.f57552o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.f57559w = false;
                    hVar.s(3);
                    hVar.f57546i.removeCallbacks(hVar.D);
                    vi.b bVar = hVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.h.r(hVar.f57553p));
                    return;
                }
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.f48605c;
                long j12 = this.f48604b;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(j12));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
