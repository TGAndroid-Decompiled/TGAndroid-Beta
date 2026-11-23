package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class c6 {
    public View f33929a;
    public final Runnable f33930b;
    public float f33931c;
    public float d;
    public boolean f33932e;
    public long f33933f;
    public long f33934g;
    public TimeInterpolator h;
    public boolean f33935i;
    public long f33936j;
    public float f33937k;

    public c6(long j3, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33929a = null;
        this.f33934g = j3;
        this.h = timeInterpolator;
        this.f33932e = true;
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
        if (!this.f33935i) {
            return 0.0f;
        }
        return c8.m9.a(((float) ((SystemClock.elapsedRealtime() - this.f33936j) - this.f33933f)) / ((float) this.f33934g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f33935i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.m9.a(((float) ((elapsedRealtime - this.f33936j) - this.f33933f)) / ((float) this.f33934g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f33936j >= this.f33933f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f33931c = org.telegram.messenger.g0.T1(this.f33937k, this.d, a10);
                } else {
                    this.f33931c = org.telegram.messenger.g0.T1(this.f33937k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f33935i = false;
            } else {
                View view = this.f33929a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f33930b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f33931c;
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
        if (!z10 && this.f33934g > 0 && !this.f33932e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f33935i = true;
                this.d = f10;
                this.f33937k = this.f33931c;
                this.f33936j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f33931c = f10;
            this.f33935i = false;
            this.f33932e = false;
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

    public c6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33929a = null;
        this.f33933f = j3;
        this.f33934g = j10;
        this.h = timeInterpolator;
        this.f33932e = true;
    }

    public c6(View view) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        this.h = kr.f36858f;
        this.f33929a = view;
        this.f33932e = true;
    }

    public c6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33929a = view;
        this.f33934g = j3;
        this.h = timeInterpolator;
        this.f33932e = true;
    }

    public c6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33929a = view;
        this.f33933f = j3;
        this.f33934g = j10;
        this.h = timeInterpolator;
        this.f33932e = true;
    }

    public c6(Runnable runnable) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        this.h = kr.f36858f;
        this.f33930b = runnable;
        this.f33932e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33930b = runnable;
        this.f33934g = j3;
        this.h = timeInterpolator;
        this.f33932e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33930b = runnable;
        this.f33933f = 0L;
        this.f33934g = j3;
        this.h = timeInterpolator;
        this.f33932e = true;
    }

    public c6(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33929a = view;
        this.d = f10;
        this.f33931c = f10;
        this.f33933f = j3;
        this.f33934g = j10;
        this.h = timeInterpolator;
        this.f33932e = false;
    }

    public c6(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33933f = 0L;
        this.f33934g = 200L;
        kr krVar = kr.f36858f;
        this.f33930b = runnable;
        this.d = f10;
        this.f33931c = f10;
        this.f33933f = j3;
        this.f33934g = j10;
        this.h = timeInterpolator;
        this.f33932e = false;
    }
}
