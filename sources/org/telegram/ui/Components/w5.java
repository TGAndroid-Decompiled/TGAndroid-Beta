package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class w5 {
    public View f39908a;
    public final Runnable f39909b;
    public float f39910c;
    public float d;
    public boolean f39911e;
    public long f39912f;
    public long f39913g;
    public TimeInterpolator h;
    public boolean f39914i;
    public long f39915j;
    public float f39916k;

    public w5(long j3, TimeInterpolator timeInterpolator) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39908a = null;
        this.f39913g = j3;
        this.h = timeInterpolator;
        this.f39911e = true;
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
        if (!this.f39914i) {
            return 0.0f;
        }
        return c8.j9.a(((float) ((SystemClock.elapsedRealtime() - this.f39915j) - this.f39912f)) / ((float) this.f39913g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f39914i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.j9.a(((float) ((elapsedRealtime - this.f39915j) - this.f39912f)) / ((float) this.f39913g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f39915j >= this.f39912f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f39910c = org.telegram.messenger.g0.T1(this.f39916k, this.d, a10);
                } else {
                    this.f39910c = org.telegram.messenger.g0.T1(this.f39916k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f39914i = false;
            } else {
                View view = this.f39908a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f39909b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f39910c;
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
        if (!z9 && this.f39913g > 0 && !this.f39911e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f39914i = true;
                this.d = f10;
                this.f39916k = this.f39910c;
                this.f39915j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f39910c = f10;
            this.f39914i = false;
            this.f39911e = false;
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
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39908a = null;
        this.f39912f = j3;
        this.f39913g = j10;
        this.h = timeInterpolator;
        this.f39911e = true;
    }

    public w5(View view) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        this.h = xq.f40458f;
        this.f39908a = view;
        this.f39911e = true;
    }

    public w5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39908a = view;
        this.f39913g = j3;
        this.h = timeInterpolator;
        this.f39911e = true;
    }

    public w5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39908a = view;
        this.f39912f = j3;
        this.f39913g = j10;
        this.h = timeInterpolator;
        this.f39911e = true;
    }

    public w5(Runnable runnable) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        this.h = xq.f40458f;
        this.f39909b = runnable;
        this.f39911e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39909b = runnable;
        this.f39913g = j3;
        this.h = timeInterpolator;
        this.f39911e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39909b = runnable;
        this.f39912f = 0L;
        this.f39913g = j3;
        this.h = timeInterpolator;
        this.f39911e = true;
    }

    public w5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39908a = view;
        this.d = f10;
        this.f39910c = f10;
        this.f39912f = j3;
        this.f39913g = j10;
        this.h = timeInterpolator;
        this.f39911e = false;
    }

    public w5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39912f = 0L;
        this.f39913g = 200L;
        xq xqVar = xq.f40458f;
        this.f39909b = runnable;
        this.d = f10;
        this.f39910c = f10;
        this.f39912f = j3;
        this.f39913g = j10;
        this.h = timeInterpolator;
        this.f39911e = false;
    }
}
