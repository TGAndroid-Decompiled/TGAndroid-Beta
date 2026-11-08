package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class w5 {
    public View f39803a;
    public final Runnable f39804b;
    public float f39805c;
    public float d;
    public boolean f39806e;
    public long f39807f;
    public long f39808g;
    public TimeInterpolator h;
    public boolean f39809i;
    public long f39810j;
    public float f39811k;

    public w5(long j3, TimeInterpolator timeInterpolator) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39803a = null;
        this.f39808g = j3;
        this.h = timeInterpolator;
        this.f39806e = true;
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
        if (!this.f39809i) {
            return 0.0f;
        }
        return c8.j9.a(((float) ((SystemClock.elapsedRealtime() - this.f39810j) - this.f39807f)) / ((float) this.f39808g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f39809i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.j9.a(((float) ((elapsedRealtime - this.f39810j) - this.f39807f)) / ((float) this.f39808g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f39810j >= this.f39807f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f39805c = org.telegram.messenger.g0.T1(this.f39811k, this.d, a10);
                } else {
                    this.f39805c = org.telegram.messenger.g0.T1(this.f39811k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f39809i = false;
            } else {
                View view = this.f39803a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f39804b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f39805c;
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
        if (!z9 && this.f39808g > 0 && !this.f39806e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f39809i = true;
                this.d = f10;
                this.f39811k = this.f39805c;
                this.f39810j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f39805c = f10;
            this.f39809i = false;
            this.f39806e = false;
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
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39803a = null;
        this.f39807f = j3;
        this.f39808g = j10;
        this.h = timeInterpolator;
        this.f39806e = true;
    }

    public w5(View view) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        this.h = xq.f40366f;
        this.f39803a = view;
        this.f39806e = true;
    }

    public w5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39803a = view;
        this.f39808g = j3;
        this.h = timeInterpolator;
        this.f39806e = true;
    }

    public w5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39803a = view;
        this.f39807f = j3;
        this.f39808g = j10;
        this.h = timeInterpolator;
        this.f39806e = true;
    }

    public w5(Runnable runnable) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        this.h = xq.f40366f;
        this.f39804b = runnable;
        this.f39806e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39804b = runnable;
        this.f39808g = j3;
        this.h = timeInterpolator;
        this.f39806e = true;
    }

    public w5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39804b = runnable;
        this.f39807f = 0L;
        this.f39808g = j3;
        this.h = timeInterpolator;
        this.f39806e = true;
    }

    public w5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39803a = view;
        this.d = f10;
        this.f39805c = f10;
        this.f39807f = j3;
        this.f39808g = j10;
        this.h = timeInterpolator;
        this.f39806e = false;
    }

    public w5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f39807f = 0L;
        this.f39808g = 200L;
        xq xqVar = xq.f40366f;
        this.f39804b = runnable;
        this.d = f10;
        this.f39805c = f10;
        this.f39807f = j3;
        this.f39808g = j10;
        this.h = timeInterpolator;
        this.f39806e = false;
    }
}
