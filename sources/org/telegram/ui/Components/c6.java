package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class c6 {
    public View f33890a;
    public final Runnable f33891b;
    public float f33892c;
    public float d;
    public boolean f33893e;
    public long f33894f;
    public long f33895g;
    public TimeInterpolator h;
    public boolean f33896i;
    public long f33897j;
    public float f33898k;

    public c6(long j3, TimeInterpolator timeInterpolator) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33890a = null;
        this.f33895g = j3;
        this.h = timeInterpolator;
        this.f33893e = true;
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
        if (!this.f33896i) {
            return 0.0f;
        }
        return c8.l9.a(((float) ((SystemClock.elapsedRealtime() - this.f33897j) - this.f33894f)) / ((float) this.f33895g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f33896i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.l9.a(((float) ((elapsedRealtime - this.f33897j) - this.f33894f)) / ((float) this.f33895g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f33897j >= this.f33894f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f33892c = org.telegram.messenger.g0.T1(this.f33898k, this.d, a10);
                } else {
                    this.f33892c = org.telegram.messenger.g0.T1(this.f33898k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f33896i = false;
            } else {
                View view = this.f33890a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f33891b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f33892c;
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
        if (!z10 && this.f33895g > 0 && !this.f33893e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f33896i = true;
                this.d = f10;
                this.f33898k = this.f33892c;
                this.f33897j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f33892c = f10;
            this.f33896i = false;
            this.f33893e = false;
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
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33890a = null;
        this.f33894f = j3;
        this.f33895g = j10;
        this.h = timeInterpolator;
        this.f33893e = true;
    }

    public c6(View view) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        this.h = lr.f37208f;
        this.f33890a = view;
        this.f33893e = true;
    }

    public c6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33890a = view;
        this.f33895g = j3;
        this.h = timeInterpolator;
        this.f33893e = true;
    }

    public c6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33890a = view;
        this.f33894f = j3;
        this.f33895g = j10;
        this.h = timeInterpolator;
        this.f33893e = true;
    }

    public c6(Runnable runnable) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        this.h = lr.f37208f;
        this.f33891b = runnable;
        this.f33893e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33891b = runnable;
        this.f33895g = j3;
        this.h = timeInterpolator;
        this.f33893e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33891b = runnable;
        this.f33894f = 0L;
        this.f33895g = j3;
        this.h = timeInterpolator;
        this.f33893e = true;
    }

    public c6(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33890a = view;
        this.d = f10;
        this.f33892c = f10;
        this.f33894f = j3;
        this.f33895g = j10;
        this.h = timeInterpolator;
        this.f33893e = false;
    }

    public c6(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f33894f = 0L;
        this.f33895g = 200L;
        lr lrVar = lr.f37208f;
        this.f33891b = runnable;
        this.d = f10;
        this.f33892c = f10;
        this.f33894f = j3;
        this.f33895g = j10;
        this.h = timeInterpolator;
        this.f33893e = false;
    }
}
