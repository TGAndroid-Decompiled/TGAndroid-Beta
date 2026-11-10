package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class v5 {
    public View f38852a;
    public final Runnable f38853b;
    public float f38854c;
    public float d;
    public boolean f38855e;
    public long f38856f;
    public long f38857g;
    public TimeInterpolator h;
    public boolean f38858i;
    public long f38859j;
    public float f38860k;

    public v5(long j3, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38852a = null;
        this.f38857g = j3;
        this.h = timeInterpolator;
        this.f38855e = true;
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
        if (!this.f38858i) {
            return 0.0f;
        }
        return c8.j9.a(((float) ((SystemClock.elapsedRealtime() - this.f38859j) - this.f38856f)) / ((float) this.f38857g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f38858i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.j9.a(((float) ((elapsedRealtime - this.f38859j) - this.f38856f)) / ((float) this.f38857g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f38859j >= this.f38856f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f38854c = org.telegram.messenger.g0.T1(this.f38860k, this.d, a10);
                } else {
                    this.f38854c = org.telegram.messenger.g0.T1(this.f38860k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f38858i = false;
            } else {
                View view = this.f38852a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f38853b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f38854c;
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
        if (!z9 && this.f38857g > 0 && !this.f38855e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f38858i = true;
                this.d = f10;
                this.f38860k = this.f38854c;
                this.f38859j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f38854c = f10;
            this.f38858i = false;
            this.f38855e = false;
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

    public v5(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38852a = null;
        this.f38856f = j3;
        this.f38857g = j10;
        this.h = timeInterpolator;
        this.f38855e = true;
    }

    public v5(View view) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        this.h = wq.f40046f;
        this.f38852a = view;
        this.f38855e = true;
    }

    public v5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38852a = view;
        this.f38857g = j3;
        this.h = timeInterpolator;
        this.f38855e = true;
    }

    public v5(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38852a = view;
        this.f38856f = j3;
        this.f38857g = j10;
        this.h = timeInterpolator;
        this.f38855e = true;
    }

    public v5(Runnable runnable) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        this.h = wq.f40046f;
        this.f38853b = runnable;
        this.f38855e = true;
    }

    public v5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38853b = runnable;
        this.f38857g = j3;
        this.h = timeInterpolator;
        this.f38855e = true;
    }

    public v5(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38853b = runnable;
        this.f38856f = 0L;
        this.f38857g = j3;
        this.h = timeInterpolator;
        this.f38855e = true;
    }

    public v5(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38852a = view;
        this.d = f10;
        this.f38854c = f10;
        this.f38856f = j3;
        this.f38857g = j10;
        this.h = timeInterpolator;
        this.f38855e = false;
    }

    public v5(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f38856f = 0L;
        this.f38857g = 200L;
        wq wqVar = wq.f40046f;
        this.f38853b = runnable;
        this.d = f10;
        this.f38854c = f10;
        this.f38856f = j3;
        this.f38857g = j10;
        this.h = timeInterpolator;
        this.f38855e = false;
    }
}
