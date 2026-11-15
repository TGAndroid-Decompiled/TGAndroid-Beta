package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class u5 {
    public View f39901a;
    public final Runnable f39902b;
    public float f39903c;
    public float d;
    public boolean f39904e;
    public long f39905f;
    public long f39906g;
    public TimeInterpolator h;
    public boolean f39907i;
    public long f39908j;
    public float f39909k;

    public u5(long j3, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39901a = null;
        this.f39906g = j3;
        this.h = timeInterpolator;
        this.f39904e = true;
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
        if (!this.f39907i) {
            return 0.0f;
        }
        return c8.i9.a(((float) ((SystemClock.elapsedRealtime() - this.f39908j) - this.f39905f)) / ((float) this.f39906g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f39907i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.i9.a(((float) ((elapsedRealtime - this.f39908j) - this.f39905f)) / ((float) this.f39906g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f39908j >= this.f39905f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f39903c = org.telegram.messenger.g0.T1(this.f39909k, this.d, a10);
                } else {
                    this.f39903c = org.telegram.messenger.g0.T1(this.f39909k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f39907i = false;
            } else {
                View view = this.f39901a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f39902b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f39903c;
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
        if (!z10 && this.f39906g > 0 && !this.f39904e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f39907i = true;
                this.d = f10;
                this.f39909k = this.f39903c;
                this.f39908j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f39903c = f10;
            this.f39907i = false;
            this.f39904e = false;
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

    public u5(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39901a = null;
        this.f39905f = j3;
        this.f39906g = j10;
        this.h = timeInterpolator;
        this.f39904e = true;
    }

    public u5(View view) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        this.h = er.f34420f;
        this.f39901a = view;
        this.f39904e = true;
    }

    public u5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39901a = view;
        this.f39906g = j3;
        this.h = timeInterpolator;
        this.f39904e = true;
    }

    public u5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39901a = view;
        this.f39905f = j3;
        this.f39906g = j10;
        this.h = timeInterpolator;
        this.f39904e = true;
    }

    public u5(Runnable runnable) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        this.h = er.f34420f;
        this.f39902b = runnable;
        this.f39904e = true;
    }

    public u5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39902b = runnable;
        this.f39906g = j3;
        this.h = timeInterpolator;
        this.f39904e = true;
    }

    public u5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39902b = runnable;
        this.f39905f = 0L;
        this.f39906g = j3;
        this.h = timeInterpolator;
        this.f39904e = true;
    }

    public u5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39901a = view;
        this.d = f10;
        this.f39903c = f10;
        this.f39905f = j3;
        this.f39906g = j10;
        this.h = timeInterpolator;
        this.f39904e = false;
    }

    public u5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39905f = 0L;
        this.f39906g = 200L;
        er erVar = er.f34420f;
        this.f39902b = runnable;
        this.d = f10;
        this.f39903c = f10;
        this.f39905f = j3;
        this.f39906g = j10;
        this.h = timeInterpolator;
        this.f39904e = false;
    }
}
