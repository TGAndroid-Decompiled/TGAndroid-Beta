package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z5 {
    public View f33761a;
    public final Runnable f33762b;
    public float f33763c;
    public float d;
    public boolean f33764e;
    public long f33765f;
    public long f33766g;
    public TimeInterpolator h;
    public boolean f33767i;
    public long f33768j;
    public float f33769k;

    public z5(long j10, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33761a = null;
        this.f33766g = j10;
        this.h = timeInterpolator;
        this.f33764e = true;
    }

    public final void a(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d(f10, true);
    }

    public final float b() {
        if (!this.f33767i) {
            return 0.0f;
        }
        return k7.o.a(((float) ((SystemClock.elapsedRealtime() - this.f33768j) - this.f33765f)) / ((float) this.f33766g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f33767i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = k7.o.a(((float) ((elapsedRealtime - this.f33768j) - this.f33765f)) / ((float) this.f33766g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f33768j >= this.f33765f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f33763c = AndroidUtilities.lerp(this.f33769k, this.d, a2);
                } else {
                    this.f33763c = AndroidUtilities.lerp(this.f33769k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f33767i = false;
            } else {
                View view = this.f33761a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f33762b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f33763c;
    }

    public final float d(float f10, boolean z4) {
        if (!z4 && this.f33766g > 0 && !this.f33764e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f33767i = true;
                this.d = f10;
                this.f33769k = this.f33763c;
                this.f33768j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f33763c = f10;
            this.f33767i = false;
            this.f33764e = false;
        }
        return c();
    }

    public final float e(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return d(f10, false);
    }

    public final float f(boolean z4, boolean z10) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return d(f10, z10);
    }

    public z5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33761a = null;
        this.f33765f = j10;
        this.f33766g = j11;
        this.h = timeInterpolator;
        this.f33764e = true;
    }

    public z5(View view) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        this.h = pr.f30168f;
        this.f33761a = view;
        this.f33764e = true;
    }

    public z5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33761a = view;
        this.f33766g = j10;
        this.h = timeInterpolator;
        this.f33764e = true;
    }

    public z5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33761a = view;
        this.f33765f = j10;
        this.f33766g = j11;
        this.h = timeInterpolator;
        this.f33764e = true;
    }

    public z5(Runnable runnable) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        this.h = pr.f30168f;
        this.f33762b = runnable;
        this.f33764e = true;
    }

    public z5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33762b = runnable;
        this.f33766g = j10;
        this.h = timeInterpolator;
        this.f33764e = true;
    }

    public z5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33762b = runnable;
        this.f33765f = 0L;
        this.f33766g = j10;
        this.h = timeInterpolator;
        this.f33764e = true;
    }

    public z5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33761a = view;
        this.d = f10;
        this.f33763c = f10;
        this.f33765f = j10;
        this.f33766g = j11;
        this.h = timeInterpolator;
        this.f33764e = false;
    }

    public z5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33765f = 0L;
        this.f33766g = 200L;
        pr prVar = pr.f30168f;
        this.f33762b = runnable;
        this.d = f10;
        this.f33763c = f10;
        this.f33765f = j10;
        this.f33766g = j11;
        this.h = timeInterpolator;
        this.f33764e = false;
    }
}
