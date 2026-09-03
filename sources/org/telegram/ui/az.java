package org.telegram.ui;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
public final class az implements Runnable {
    public final int f32674a;
    public Object f32675b;
    public final Object f32676c;

    public az(int i10, Object obj, Object obj2) {
        this.f32674a = i10;
        this.f32676c = obj;
        this.f32675b = obj2;
    }

    private final void a() {
        x5.i iVar = (x5.i) this.f32675b;
        IBinder iBinder = (IBinder) this.f32676c;
        synchronized (iVar) {
            if (iBinder == null) {
                iVar.a("Null service connection");
                return;
            }
            try {
                iVar.f46885c = new q5.c0(iBinder);
                iVar.f46883a = 2;
                ((ScheduledExecutorService) iVar.f46886f.f46892c).execute(new x5.g(iVar, 0));
            } catch (RemoteException e) {
                iVar.a(e.getMessage());
            }
        }
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = 0;
        switch (this.f32674a) {
            case 0:
                ((org.telegram.ui.Components.ic) this.f32675b).j();
                ((dz) this.f32676c).B = null;
                return;
            case 1:
                p2.b bVar = (p2.b) this.f32675b;
                p2.h hVar = (p2.h) this.f32676c;
                if (((p2.p) bVar.f40966f.f41010c) != null) {
                    ((p2.p) bVar.f40966f.f41010c).onPurchasesUpdated(hVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 2:
                Future future = (Future) this.f32675b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f32676c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                p2.h hVar2 = p2.b0.f40990i;
                ((p2.b) this.f32675b).y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f3555b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                ((org.telegram.messenger.d0) this.f32676c).a(hVar2, new p2.r(vVar, vVar));
                return;
            case 4:
                p2.h hVar3 = p2.b0.f40990i;
                ((p2.b) this.f32675b).y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f3555b;
                ((p2.o) this.f32676c).b(hVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 5:
                q5.f0 f0Var = ((q5.e0) this.f32675b).f42821b;
                u5.d dVar = (u5.d) this.f32676c;
                u5.b bVar2 = q5.f0.G;
                q5.d dVar2 = dVar.d;
                q5.x xVar = dVar.f45167f;
                q5.d dVar3 = f0Var.f42831t;
                r5.e0 e0Var = f0Var.D;
                if (!u5.a.d(dVar2, dVar3)) {
                    f0Var.f42831t = dVar2;
                    e0Var.c();
                }
                double d = dVar.f45164a;
                if (!Double.isNaN(d) && Math.abs(d - f0Var.v) > 1.0E-7d) {
                    f0Var.v = d;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z17 = dVar.f45165b;
                if (z17 != f0Var.f42833w) {
                    f0Var.f42833w = z17;
                    z4 = true;
                }
                u5.b bVar3 = q5.f0.G;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(f0Var.f42824m));
                if (e0Var != null && (z4 || f0Var.f42824m)) {
                    e0Var.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.f45166c;
                if (i11 != f0Var.f42834x) {
                    f0Var.f42834x = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(f0Var.f42824m));
                if (e0Var != null && (z10 || f0Var.f42824m)) {
                    e0Var.a();
                }
                int i12 = dVar.e;
                if (i12 != f0Var.f42835y) {
                    f0Var.f42835y = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(f0Var.f42824m));
                if (e0Var != null && (z11 || f0Var.f42824m)) {
                    e0Var.e();
                }
                if (!u5.a.d(f0Var.f42836z, xVar)) {
                    f0Var.f42836z = xVar;
                }
                f0Var.f42824m = false;
                return;
            case 6:
                q5.f0 f0Var2 = ((q5.e0) this.f32675b).f42821b;
                u5.b bVar4 = q5.f0.G;
                String str = ((u5.c) this.f32676c).f45163a;
                if (!u5.a.d(str, f0Var2.f42832u)) {
                    f0Var2.f42832u = str;
                    z12 = true;
                } else {
                    z12 = false;
                }
                q5.f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(f0Var2.f42825n));
                r5.e0 e0Var2 = f0Var2.D;
                if (e0Var2 != null && (z12 || f0Var2.f42825n)) {
                    e0Var2.d();
                }
                f0Var2.f42825n = false;
                return;
            case 7:
                qd.i iVar = (qd.i) this.f32676c;
                ld.a0 a0Var = iVar.f43057c;
                while (true) {
                    try {
                        ((Runnable) this.f32675b).run();
                    } catch (Throwable th2) {
                        ld.e0.m(th2, uc.i.f45281a);
                    }
                    Runnable f10 = iVar.f();
                    if (f10 != null) {
                        this.f32675b = f10;
                        i10++;
                        if (i10 >= 16 && a0Var.e()) {
                            a0Var.c(iVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 8:
                u5.w wVar = (u5.w) this.f32675b;
                u5.d dVar4 = (u5.d) this.f32676c;
                u5.b bVar5 = u5.w.f45204k0;
                q5.d dVar5 = dVar4.d;
                q5.x xVar2 = dVar4.f45167f;
                q5.d dVar6 = wVar.R;
                r5.e0 e0Var3 = wVar.T;
                if (!u5.a.d(dVar5, dVar6)) {
                    wVar.R = dVar5;
                    e0Var3.c();
                }
                double d10 = dVar4.f45164a;
                if (!Double.isNaN(d10) && Math.abs(d10 - wVar.f45208c0) > 1.0E-7d) {
                    wVar.f45208c0 = d10;
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = dVar4.f45165b;
                if (z18 != wVar.Z) {
                    wVar.Z = z18;
                    z13 = true;
                }
                Double.isNaN(dVar4.h);
                u5.b bVar6 = u5.w.f45204k0;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar.f45207b0));
                if (e0Var3 != null && (z13 || wVar.f45207b0)) {
                    e0Var3.f();
                }
                int i13 = dVar4.f45166c;
                if (i13 != wVar.f45210e0) {
                    wVar.f45210e0 = i13;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(wVar.f45207b0));
                if (e0Var3 != null && (z14 || wVar.f45207b0)) {
                    e0Var3.a();
                }
                int i14 = dVar4.e;
                if (i14 != wVar.f45211f0) {
                    wVar.f45211f0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(wVar.f45207b0));
                if (e0Var3 != null && (z15 || wVar.f45207b0)) {
                    e0Var3.e();
                }
                if (!u5.a.d(wVar.f45209d0, xVar2)) {
                    wVar.f45209d0 = xVar2;
                }
                wVar.f45207b0 = false;
                return;
            case 9:
                u5.w wVar2 = (u5.w) this.f32675b;
                u5.b bVar7 = u5.w.f45204k0;
                String str2 = ((u5.c) this.f32676c).f45163a;
                if (!u5.a.d(str2, wVar2.Y)) {
                    wVar2.Y = str2;
                    z16 = true;
                } else {
                    z16 = false;
                }
                u5.w.f45204k0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(wVar2.f45206a0));
                r5.e0 e0Var4 = wVar2.T;
                if (e0Var4 != null && (z16 || wVar2.f45206a0)) {
                    e0Var4.d();
                }
                wVar2.f45206a0 = false;
                return;
            case 10:
                wh.n nVar = (wh.n) this.f32676c;
                ArrayList arrayList = (ArrayList) this.f32675b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nVar.B((f2.j) obj);
                }
                arrayList.clear();
                nVar.v.remove(arrayList);
                return;
            case 11:
                x1.a aVar = (x1.a) this.f32676c;
                Object obj2 = this.f32675b;
                if (aVar.f46712c.get()) {
                    o5.d dVar7 = aVar.e;
                    if (dVar7.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar7.h = null;
                        dVar7.b();
                    }
                } else {
                    o5.d dVar8 = aVar.e;
                    if (dVar8.f16430g != aVar) {
                        if (dVar8.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar8.h = null;
                            dVar8.b();
                        }
                    } else if (!dVar8.f16428c) {
                        SystemClock.uptimeMillis();
                        dVar8.f16430g = null;
                        w1.a aVar2 = dVar8.f16426a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f46711b = 3;
                return;
            case 12:
                a();
                return;
            default:
                x5.i iVar2 = (x5.i) this.f32675b;
                int i15 = ((x5.j) this.f32676c).f46887a;
                synchronized (iVar2) {
                    x5.j jVar = (x5.j) iVar2.e.get(i15);
                    if (jVar != 0) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i15);
                        iVar2.e.remove(i15);
                        jVar.b(new Exception("Timed out waiting for response", null));
                        iVar2.c();
                    }
                }
                return;
        }
    }

    public az(Object obj, Object obj2, boolean z4, int i10) {
        this.f32674a = i10;
        this.f32675b = obj;
        this.f32676c = obj2;
    }
}
