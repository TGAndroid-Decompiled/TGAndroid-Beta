package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class w5 {
    public View f39847a;
    public final Runnable f39848b;
    public float f39849c;
    public float d;
    public boolean f39850e;
    public long f39851f;
    public long f39852g;
    public TimeInterpolator h;
    public boolean f39853i;
    public long f39854j;
    public float f39855k;

    public w5(long j3, TimeInterpolator timeInterpolator) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39847a = null;
        this.f39852g = j3;
        this.h = timeInterpolator;
        this.f39850e = true;
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
        if (!this.f39853i) {
            return 0.0f;
        }
        return c8.j9.a(((float) ((SystemClock.elapsedRealtime() - this.f39854j) - this.f39851f)) / ((float) this.f39852g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f39853i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.j9.a(((float) ((elapsedRealtime - this.f39854j) - this.f39851f)) / ((float) this.f39852g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f39854j >= this.f39851f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f39849c = org.telegram.messenger.g0.T1(this.f39855k, this.d, a10);
                } else {
                    this.f39849c = org.telegram.messenger.g0.T1(this.f39855k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f39853i = false;
            } else {
                View view = this.f39847a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f39848b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f39849c;
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
        if (!z9 && this.f39852g > 0 && !this.f39850e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f39853i = true;
                this.d = f10;
                this.f39855k = this.f39849c;
                this.f39854j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f39849c = f10;
            this.f39853i = false;
            this.f39850e = false;
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
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39847a = null;
        this.f39851f = j3;
        this.f39852g = j10;
        this.h = timeInterpolator;
        this.f39850e = true;
    }

    public w5(View view) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        this.h = xq.f40310f;
        this.f39847a = view;
        this.f39850e = true;
    }

    public w5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39847a = view;
        this.f39852g = j3;
        this.h = timeInterpolator;
        this.f39850e = true;
    }

    public w5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39847a = view;
        this.f39851f = j3;
        this.f39852g = j10;
        this.h = timeInterpolator;
        this.f39850e = true;
    }

    public w5(Runnable runnable) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        this.h = xq.f40310f;
        this.f39848b = runnable;
        this.f39850e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39848b = runnable;
        this.f39852g = j3;
        this.h = timeInterpolator;
        this.f39850e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39848b = runnable;
        this.f39851f = 0L;
        this.f39852g = j3;
        this.h = timeInterpolator;
        this.f39850e = true;
    }

    public w5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39847a = view;
        this.d = f10;
        this.f39849c = f10;
        this.f39851f = j3;
        this.f39852g = j10;
        this.h = timeInterpolator;
        this.f39850e = false;
    }

    public w5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39851f = 0L;
        this.f39852g = 200L;
        xq xqVar = xq.f40310f;
        this.f39848b = runnable;
        this.d = f10;
        this.f39849c = f10;
        this.f39851f = j3;
        this.f39852g = j10;
        this.h = timeInterpolator;
        this.f39850e = false;
    }
}
