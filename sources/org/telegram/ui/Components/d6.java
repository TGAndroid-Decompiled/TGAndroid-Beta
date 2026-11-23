package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class d6 {
    public View f34347a;
    public final Runnable f34348b;
    public float f34349c;
    public float d;
    public boolean f34350e;
    public long f34351f;
    public long f34352g;
    public TimeInterpolator h;
    public boolean f34353i;
    public long f34354j;
    public float f34355k;

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34347a = null;
        this.f34352g = j3;
        this.h = timeInterpolator;
        this.f34350e = true;
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
        if (!this.f34353i) {
            return 0.0f;
        }
        return c8.m9.a(((float) ((SystemClock.elapsedRealtime() - this.f34354j) - this.f34351f)) / ((float) this.f34352g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f34353i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.m9.a(((float) ((elapsedRealtime - this.f34354j) - this.f34351f)) / ((float) this.f34352g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f34354j >= this.f34351f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f34349c = org.telegram.messenger.g0.T1(this.f34355k, this.d, a10);
                } else {
                    this.f34349c = org.telegram.messenger.g0.T1(this.f34355k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f34353i = false;
            } else {
                View view = this.f34347a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f34348b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f34349c;
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
        if (!z10 && this.f34352g > 0 && !this.f34350e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f34353i = true;
                this.d = f10;
                this.f34355k = this.f34349c;
                this.f34354j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f34349c = f10;
            this.f34353i = false;
            this.f34350e = false;
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
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34347a = null;
        this.f34351f = j3;
        this.f34352g = j10;
        this.h = timeInterpolator;
        this.f34350e = true;
    }

    public d6(View view) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        this.h = nr.f37917f;
        this.f34347a = view;
        this.f34350e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34347a = view;
        this.f34352g = j3;
        this.h = timeInterpolator;
        this.f34350e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34347a = view;
        this.f34351f = j3;
        this.f34352g = j10;
        this.h = timeInterpolator;
        this.f34350e = true;
    }

    public d6(Runnable runnable) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        this.h = nr.f37917f;
        this.f34348b = runnable;
        this.f34350e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34348b = runnable;
        this.f34352g = j3;
        this.h = timeInterpolator;
        this.f34350e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34348b = runnable;
        this.f34351f = 0L;
        this.f34352g = j3;
        this.h = timeInterpolator;
        this.f34350e = true;
    }

    public d6(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34347a = view;
        this.d = f10;
        this.f34349c = f10;
        this.f34351f = j3;
        this.f34352g = j10;
        this.h = timeInterpolator;
        this.f34350e = false;
    }

    public d6(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34351f = 0L;
        this.f34352g = 200L;
        nr nrVar = nr.f37917f;
        this.f34348b = runnable;
        this.d = f10;
        this.f34349c = f10;
        this.f34351f = j3;
        this.f34352g = j10;
        this.h = timeInterpolator;
        this.f34350e = false;
    }
}
