package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class u5 {
    public View f39898a;
    public final Runnable f39899b;
    public float f39900c;
    public float d;
    public boolean f39901e;
    public long f39902f;
    public long f39903g;
    public TimeInterpolator h;
    public boolean f39904i;
    public long f39905j;
    public float f39906k;

    public u5(long j3, TimeInterpolator timeInterpolator) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39898a = null;
        this.f39903g = j3;
        this.h = timeInterpolator;
        this.f39901e = true;
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
        if (!this.f39904i) {
            return 0.0f;
        }
        return c8.i9.a(((float) ((SystemClock.elapsedRealtime() - this.f39905j) - this.f39902f)) / ((float) this.f39903g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f39904i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.i9.a(((float) ((elapsedRealtime - this.f39905j) - this.f39902f)) / ((float) this.f39903g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f39905j >= this.f39902f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f39900c = org.telegram.messenger.g0.T1(this.f39906k, this.d, a10);
                } else {
                    this.f39900c = org.telegram.messenger.g0.T1(this.f39906k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f39904i = false;
            } else {
                View view = this.f39898a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f39899b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f39900c;
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
        if (!z10 && this.f39903g > 0 && !this.f39901e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f39904i = true;
                this.d = f10;
                this.f39906k = this.f39900c;
                this.f39905j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f39900c = f10;
            this.f39904i = false;
            this.f39901e = false;
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
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39898a = null;
        this.f39902f = j3;
        this.f39903g = j10;
        this.h = timeInterpolator;
        this.f39901e = true;
    }

    public u5(View view) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        this.h = er.f34419f;
        this.f39898a = view;
        this.f39901e = true;
    }

    public u5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39898a = view;
        this.f39903g = j3;
        this.h = timeInterpolator;
        this.f39901e = true;
    }

    public u5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39898a = view;
        this.f39902f = j3;
        this.f39903g = j10;
        this.h = timeInterpolator;
        this.f39901e = true;
    }

    public u5(Runnable runnable) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        this.h = er.f34419f;
        this.f39899b = runnable;
        this.f39901e = true;
    }

    public u5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39899b = runnable;
        this.f39903g = j3;
        this.h = timeInterpolator;
        this.f39901e = true;
    }

    public u5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39899b = runnable;
        this.f39902f = 0L;
        this.f39903g = j3;
        this.h = timeInterpolator;
        this.f39901e = true;
    }

    public u5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39898a = view;
        this.d = f10;
        this.f39900c = f10;
        this.f39902f = j3;
        this.f39903g = j10;
        this.h = timeInterpolator;
        this.f39901e = false;
    }

    public u5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39902f = 0L;
        this.f39903g = 200L;
        er erVar = er.f34419f;
        this.f39899b = runnable;
        this.d = f10;
        this.f39900c = f10;
        this.f39902f = j3;
        this.f39903g = j10;
        this.h = timeInterpolator;
        this.f39901e = false;
    }
}
