package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class d6 {
    public View f34389a;
    public final Runnable f34390b;
    public float f34391c;
    public float d;
    public boolean f34392e;
    public long f34393f;
    public long f34394g;
    public TimeInterpolator h;
    public boolean f34395i;
    public long f34396j;
    public float f34397k;

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34389a = null;
        this.f34394g = j3;
        this.h = timeInterpolator;
        this.f34392e = true;
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
        if (!this.f34395i) {
            return 0.0f;
        }
        return c8.l9.a(((float) ((SystemClock.elapsedRealtime() - this.f34396j) - this.f34393f)) / ((float) this.f34394g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f34395i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a10 = c8.l9.a(((float) ((elapsedRealtime - this.f34396j) - this.f34393f)) / ((float) this.f34394g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f34396j >= this.f34393f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f34391c = org.telegram.messenger.g0.T1(this.f34397k, this.d, a10);
                } else {
                    this.f34391c = org.telegram.messenger.g0.T1(this.f34397k, this.d, timeInterpolator.getInterpolation(a10));
                }
            }
            if (a10 >= 1.0f) {
                this.f34395i = false;
            } else {
                View view = this.f34389a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f34390b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f34391c;
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
        if (!z10 && this.f34394g > 0 && !this.f34392e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f34395i = true;
                this.d = f10;
                this.f34397k = this.f34391c;
                this.f34396j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f34391c = f10;
            this.f34395i = false;
            this.f34392e = false;
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
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34389a = null;
        this.f34393f = j3;
        this.f34394g = j10;
        this.h = timeInterpolator;
        this.f34392e = true;
    }

    public d6(View view) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        this.h = nr.f37956f;
        this.f34389a = view;
        this.f34392e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34389a = view;
        this.f34394g = j3;
        this.h = timeInterpolator;
        this.f34392e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34389a = view;
        this.f34393f = j3;
        this.f34394g = j10;
        this.h = timeInterpolator;
        this.f34392e = true;
    }

    public d6(Runnable runnable) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        this.h = nr.f37956f;
        this.f34390b = runnable;
        this.f34392e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34390b = runnable;
        this.f34394g = j3;
        this.h = timeInterpolator;
        this.f34392e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34390b = runnable;
        this.f34393f = 0L;
        this.f34394g = j3;
        this.h = timeInterpolator;
        this.f34392e = true;
    }

    public d6(float f10, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34389a = view;
        this.d = f10;
        this.f34391c = f10;
        this.f34393f = j3;
        this.f34394g = j10;
        this.h = timeInterpolator;
        this.f34392e = false;
    }

    public d6(float f10, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f34393f = 0L;
        this.f34394g = 200L;
        nr nrVar = nr.f37956f;
        this.f34390b = runnable;
        this.d = f10;
        this.f34391c = f10;
        this.f34393f = j3;
        this.f34394g = j10;
        this.h = timeInterpolator;
        this.f34392e = false;
    }
}
