package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class u5 {
    public View f38643a;
    public final Runnable f38644b;
    public float f38645c;
    public float d;
    public boolean f38646e;
    public long f38647f;
    public long f38648g;
    public TimeInterpolator h;
    public boolean f38649i;
    public long f38650j;
    public float f38651k;

    public u5(long j10, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38643a = null;
        this.f38648g = j10;
        this.h = timeInterpolator;
        this.f38646e = true;
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
        if (!this.f38649i) {
            return 0.0f;
        }
        return b8.be.a(((float) ((SystemClock.elapsedRealtime() - this.f38650j) - this.f38647f)) / ((float) this.f38648g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f38649i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = b8.be.a(((float) ((elapsedRealtime - this.f38650j) - this.f38647f)) / ((float) this.f38648g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f38650j >= this.f38647f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f38645c = org.telegram.messenger.g0.T1(this.f38651k, this.d, a10);
                } else {
                    this.f38645c = org.telegram.messenger.g0.T1(this.f38651k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f38649i = false;
            } else {
                View view = this.f38643a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f38644b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f38645c;
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
        if (!z10 && this.f38648g > 0 && !this.f38646e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f38649i = true;
                this.d = f10;
                this.f38651k = this.f38645c;
                this.f38650j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f38645c = f10;
            this.f38649i = false;
            this.f38646e = false;
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

    public u5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38643a = null;
        this.f38647f = j10;
        this.f38648g = j11;
        this.h = timeInterpolator;
        this.f38646e = true;
    }

    public u5(View view) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        this.h = xq.f40452f;
        this.f38643a = view;
        this.f38646e = true;
    }

    public u5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38643a = view;
        this.f38648g = j10;
        this.h = timeInterpolator;
        this.f38646e = true;
    }

    public u5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38643a = view;
        this.f38647f = j10;
        this.f38648g = j11;
        this.h = timeInterpolator;
        this.f38646e = true;
    }

    public u5(Runnable runnable) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        this.h = xq.f40452f;
        this.f38644b = runnable;
        this.f38646e = true;
    }

    public u5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38644b = runnable;
        this.f38648g = j10;
        this.h = timeInterpolator;
        this.f38646e = true;
    }

    public u5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i3) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38644b = runnable;
        this.f38647f = 0L;
        this.f38648g = j10;
        this.h = timeInterpolator;
        this.f38646e = true;
    }

    public u5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38643a = view;
        this.d = f10;
        this.f38645c = f10;
        this.f38647f = j10;
        this.f38648g = j11;
        this.h = timeInterpolator;
        this.f38646e = false;
    }

    public u5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f38647f = 0L;
        this.f38648g = 200L;
        xq xqVar = xq.f40452f;
        this.f38644b = runnable;
        this.d = f10;
        this.f38645c = f10;
        this.f38647f = j10;
        this.f38648g = j11;
        this.h = timeInterpolator;
        this.f38646e = false;
    }
}
