package org.telegram.ui.Components;

import android.os.SystemClock;
public final class xa1 {
    public final yb1 f34679a;
    public final ya1 f34680b;
    public final c3.s f34681c = new Object();
    public boolean d;
    public final za1 e;

    public xa1(za1 za1Var, yb1 yb1Var, ya1 ya1Var) {
        this.e = za1Var;
        this.f34679a = yb1Var;
        this.f34680b = ya1Var;
    }

    public final void a(float f7, float f10, int i10) {
        if (i10 != -1 && (i10 & 32) != 0) {
            this.e.g(new wa1(this.f34679a, 3, f7, f10));
            this.d = true;
        }
    }

    public final void b(float f7, float f10) {
        boolean[] zArr;
        boolean z10;
        boolean z11;
        boolean z12;
        this.d = false;
        this.f34680b.f34995b = null;
        this.e.g(new wa1(this.f34679a, 0, f7, f10));
        ya1 ya1Var = this.f34680b;
        long uptimeMillis = SystemClock.uptimeMillis() + 150;
        synchronized (ya1Var.d) {
            while (ya1Var.f34995b == null) {
                try {
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        break;
                    }
                    ya1Var.d.wait(uptimeMillis2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zArr = ya1Var.f34995b;
        }
        c3.s sVar = this.f34681c;
        double uptimeMillis3 = SystemClock.uptimeMillis();
        double d = f7;
        double d10 = f10;
        if (zArr != null && zArr[0]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (zArr != null && zArr[1]) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zArr != null && zArr[2]) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.f6092a == 0) {
            sVar.f6092a = WidgetSandboxNative.arbiterCreate();
        }
        a(f7, f10, WidgetSandboxNative.arbiterDown(sVar.f6092a, uptimeMillis3, d, d10, z10, z11, z12, false, 0));
    }

    public final void c(float[] fArr, long j10) {
        boolean z10;
        long j11;
        int arbiterTick;
        b(fArr[0], fArr[1]);
        float f7 = fArr[0];
        float f10 = fArr[1];
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        while (true) {
            boolean z11 = this.d;
            double d = -1.0d;
            c3.s sVar = this.f34681c;
            if (!z11) {
                long j12 = sVar.f6092a;
                if (j12 != 0) {
                    d = WidgetSandboxNative.arbiterHoldDeadline(j12);
                }
            }
            if (d >= 0.0d && d <= uptimeMillis) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j11 = (long) Math.ceil(d);
            } else {
                j11 = uptimeMillis;
            }
            Thread.sleep(Math.max(0L, j11 - SystemClock.uptimeMillis()));
            if (!z10) {
                d(fArr[0], fArr[1]);
                return;
            }
            double uptimeMillis2 = SystemClock.uptimeMillis();
            long j13 = sVar.f6092a;
            if (j13 == 0) {
                arbiterTick = -1;
            } else {
                arbiterTick = WidgetSandboxNative.arbiterTick(j13, uptimeMillis2);
            }
            a(f7, f10, arbiterTick);
        }
    }

    public final void d(float f7, float f10) {
        int arbiterUp;
        int i10;
        if (this.d) {
            return;
        }
        double uptimeMillis = SystemClock.uptimeMillis();
        double d = f7;
        double d10 = f10;
        long j10 = this.f34681c.f6092a;
        if (j10 == 0) {
            arbiterUp = -1;
        } else {
            arbiterUp = WidgetSandboxNative.arbiterUp(j10, uptimeMillis, d, d10);
        }
        if (arbiterUp != -1 && (arbiterUp & 32) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.e.g(new wa1(this.f34679a, i10, f7, f10));
    }
}
