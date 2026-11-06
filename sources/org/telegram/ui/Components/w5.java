package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class w5 {
    public View f39855a;
    public final Runnable f39856b;
    public float f39857c;
    public float d;
    public boolean f39858e;
    public long f39859f;
    public long f39860g;
    public TimeInterpolator h;
    public boolean f39861i;
    public long f39862j;
    public float f39863k;

    public w5(long j3, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39855a = null;
        this.f39860g = j3;
        this.h = timeInterpolator;
        this.f39858e = true;
    }

    public final void a(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(true, f10);
    }

    public final float b() {
        if (!this.f39861i) {
            return 0.0f;
        }
        return c8.j9.a(((float) ((SystemClock.elapsedRealtime() - this.f39862j) - this.f39859f)) / ((float) this.f39860g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f39861i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.j9.a(((float) ((elapsedRealtime - this.f39862j) - this.f39859f)) / ((float) this.f39860g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f39862j >= this.f39859f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f39857c = org.telegram.messenger.g0.T1(this.f39863k, this.d, a10);
                } else {
                    this.f39857c = org.telegram.messenger.g0.T1(this.f39863k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f39861i = false;
            } else {
                View view = this.f39855a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f39856b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f39857c;
    }

    public final float d(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return e(false, f10);
    }

    public final float e(boolean z9, float f10) {
        if (!z9 && this.f39860g > 0 && !this.f39858e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f39861i = true;
                this.d = f10;
                this.f39863k = this.f39857c;
                this.f39862j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f39857c = f10;
            this.f39861i = false;
            this.f39858e = false;
        }
        return c();
    }

    public final float f(boolean z9, boolean z10) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return e(z10, f10);
    }

    public w5(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39855a = null;
        this.f39859f = j3;
        this.f39860g = j10;
        this.h = timeInterpolator;
        this.f39858e = true;
    }

    public w5(View view) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        this.h = xq.f40329f;
        this.f39855a = view;
        this.f39858e = true;
    }

    public w5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39855a = view;
        this.f39860g = j3;
        this.h = timeInterpolator;
        this.f39858e = true;
    }

    public w5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39855a = view;
        this.f39859f = j3;
        this.f39860g = j10;
        this.h = timeInterpolator;
        this.f39858e = true;
    }

    public w5(Runnable runnable) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        this.h = xq.f40329f;
        this.f39856b = runnable;
        this.f39858e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39856b = runnable;
        this.f39860g = j3;
        this.h = timeInterpolator;
        this.f39858e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39856b = runnable;
        this.f39859f = 0L;
        this.f39860g = j3;
        this.h = timeInterpolator;
        this.f39858e = true;
    }

    public w5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39855a = view;
        this.d = f10;
        this.f39857c = f10;
        this.f39859f = j3;
        this.f39860g = j10;
        this.h = timeInterpolator;
        this.f39858e = false;
    }

    public w5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39859f = 0L;
        this.f39860g = 200L;
        xq xqVar = xq.f40329f;
        this.f39856b = runnable;
        this.d = f10;
        this.f39857c = f10;
        this.f39859f = j3;
        this.f39860g = j10;
        this.h = timeInterpolator;
        this.f39858e = false;
    }
}
