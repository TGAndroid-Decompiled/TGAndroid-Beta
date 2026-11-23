package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class d6 {
    public View f34384a;
    public final Runnable f34385b;
    public float f34386c;
    public float d;
    public boolean f34387e;
    public long f34388f;
    public long f34389g;
    public TimeInterpolator h;
    public boolean f34390i;
    public long f34391j;
    public float f34392k;

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34384a = null;
        this.f34389g = j3;
        this.h = timeInterpolator;
        this.f34387e = true;
    }

    public final void a(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(true, f10);
    }

    public final float b() {
        if (!this.f34390i) {
            return 0.0f;
        }
        return c8.l9.a(((float) ((SystemClock.elapsedRealtime() - this.f34391j) - this.f34388f)) / ((float) this.f34389g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f34390i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.l9.a(((float) ((elapsedRealtime - this.f34391j) - this.f34388f)) / ((float) this.f34389g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f34391j >= this.f34388f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f34386c = org.telegram.messenger.g0.T1(this.f34392k, this.d, a10);
                } else {
                    this.f34386c = org.telegram.messenger.g0.T1(this.f34392k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f34390i = false;
            } else {
                View view = this.f34384a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f34385b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f34386c;
    }

    public final float d(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return e(false, f10);
    }

    public final float e(boolean z10, float f10) {
        if (!z10 && this.f34389g > 0 && !this.f34387e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f34390i = true;
                this.d = f10;
                this.f34392k = this.f34386c;
                this.f34391j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f34386c = f10;
            this.f34390i = false;
            this.f34387e = false;
        }
        return c();
    }

    public final float f(boolean z10, boolean z11) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return e(z11, f10);
    }

    public d6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34384a = null;
        this.f34388f = j3;
        this.f34389g = j10;
        this.h = timeInterpolator;
        this.f34387e = true;
    }

    public d6(View view) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        this.h = nr.f37961f;
        this.f34384a = view;
        this.f34387e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34384a = view;
        this.f34389g = j3;
        this.h = timeInterpolator;
        this.f34387e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34384a = view;
        this.f34388f = j3;
        this.f34389g = j10;
        this.h = timeInterpolator;
        this.f34387e = true;
    }

    public d6(Runnable runnable) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        this.h = nr.f37961f;
        this.f34385b = runnable;
        this.f34387e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34385b = runnable;
        this.f34389g = j3;
        this.h = timeInterpolator;
        this.f34387e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34385b = runnable;
        this.f34388f = 0L;
        this.f34389g = j3;
        this.h = timeInterpolator;
        this.f34387e = true;
    }

    public d6(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34384a = view;
        this.d = f10;
        this.f34386c = f10;
        this.f34388f = j3;
        this.f34389g = j10;
        this.h = timeInterpolator;
        this.f34387e = false;
    }

    public d6(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34388f = 0L;
        this.f34389g = 200L;
        nr nrVar = nr.f37961f;
        this.f34385b = runnable;
        this.d = f10;
        this.f34386c = f10;
        this.f34388f = j3;
        this.f34389g = j10;
        this.h = timeInterpolator;
        this.f34387e = false;
    }
}
